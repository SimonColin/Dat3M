package dartagnan.program;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.microsoft.z3.*;

import dartagnan.expression.AConst;
import dartagnan.utils.LastModMap;
import dartagnan.utils.MapSSA;
import dartagnan.utils.Pair;

public class Write extends MemEvent {

	protected AConst val;
	protected Register reg;
	
	public Write(Location loc, Register reg, String atomic) {
		type.add(EVENT_TYPE_WRITE);
		this.reg = reg;
		this.loc = loc;
		this.atomic = atomic;
		this.condLevel = 0;
		this.memId = hashCode();
	}

    public Write(Location loc, AConst val, String atomic) {
		type.add(EVENT_TYPE_WRITE);
        this.val = val;
        this.loc = loc;
        this.atomic = atomic;
        this.condLevel = 0;
        this.memId = hashCode();
    }
	
	public Register getReg() {
		return reg;
	}
	
	public String toString() {
	    if(reg != null){
            return String.format("%s%s.store(%s, %s)", String.join("", Collections.nCopies(condLevel, "  ")), loc, atomic, reg);
        }
        return String.format("%s%s.store(%s, %s)", String.join("", Collections.nCopies(condLevel, "  ")), loc, atomic, val);
	}

	public LastModMap setLastModMap(LastModMap map) {
		this.lastModMap = map;
		LastModMap retMap = map.clone();
		Set<Event> set = new HashSet<Event>();
		set.add(this);
		retMap.put(loc, set);
		return retMap;
	}
	
	public Write clone() {
        Write newWrite;
        if(reg != null){
            newWrite = new Write(loc, reg, atomic);
        } else {
            newWrite = new Write(loc, val, atomic);
        }
		newWrite.condLevel = condLevel;
		newWrite.memId = memId;
		newWrite.setUnfCopy(getUnfCopy());
		return newWrite;
	}

	public Pair<BoolExpr, MapSSA> encodeDF(MapSSA map, Context ctx) throws Z3Exception {
		System.out.println(String.format("Check encodeDF for %s", this));
		return null;
	}

	public Thread compile(String target, boolean ctrl, boolean leading) {
        Store st = createStoreEvent();
		st.setHLId(memId);
		st.setUnfCopy(getUnfCopy());
		st.condLevel = this.condLevel;

		if(!target.equals("power") && !target.equals("arm") && atomic.equals("_sc")) {
            Mfence mfence = new Mfence();
            mfence.condLevel = this.condLevel;
			return new Seq(st, mfence);
		}
		
		if(!target.equals("power") && !target.equals("arm")) {
			return st;
		}
		
		if(target.equals("power")) {
            if(atomic.equals("_rx") || atomic.equals("_na")) {
                return st;
            }

            Lwsync lwsync = new Lwsync();
            lwsync.condLevel = this.condLevel;

            if(atomic.equals("_rel")) {
                return new Seq(lwsync, st);
            }

            Sync sync = new Sync();
            sync.condLevel = this.condLevel;

            if(atomic.equals("_sc")) {
				if(leading) {
					return new Seq(sync, st);	
				}
				return new Seq(lwsync, new Seq(st, sync));
			}
		}

		if(target.equals("arm")) {
            if(atomic.equals("_rx") || atomic.equals("_na")) {
                return st;
            }

            Ish ish1 = new Ish();
            ish1.condLevel = this.condLevel;

            if(atomic.equals("_rel")) {
                return new Seq(ish1, st);
            }

            Ish ish2 = new Ish();
            ish2.condLevel = this.condLevel;

			if(atomic.equals("_sc")) {
				return new Seq(ish1, new Seq(st, ish2));
			}
		}

		else System.out.println(String.format("Error in the atomic operation type of", this));
		return null;
	}

	public Thread optCompile(String target, boolean ctrl, boolean leading) {
        Store st = createStoreEvent();
		st.setHLId(hashCode());
		st.condLevel = this.condLevel;

        if(atomic.equals("_rx") || atomic.equals("_na")) {
            return st;
        }

		Lwsync lwsync = new OptLwsync();
		lwsync.condLevel = this.condLevel;

        if(atomic.equals("_rel")) {
            return new Seq(lwsync, st);
        }

        Sync sync = new OptSync();
        sync.condLevel = this.condLevel;

		if(atomic.equals("_sc")) {
			if(leading) {
				return new Seq(sync, st);	
			}
			return new Seq(lwsync, new Seq(st, sync));
		}

		else System.out.println(String.format("Error in the atomic operation type of", this));
		return null;
	}
	
	public Thread allCompile() {
        Store st = createStoreEvent();
		st.setHLId(hashCode());
		st.condLevel = this.condLevel;
		OptSync os = new OptSync();
		os.condLevel = condLevel;
		OptLwsync olws = new OptLwsync();
		olws.condLevel = condLevel;
		return new Seq(os, new Seq(olws, st));
	}

	protected Store createStoreEvent(){
		if(reg != null){
			return new Store(loc, reg, atomic);
		}
		return new Store(loc, val, atomic);
	}

}
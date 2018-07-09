package dartagnan.program.event.atomic;

import dartagnan.expression.AConst;
import dartagnan.program.Location;
import dartagnan.program.Register;
import dartagnan.program.Store;
import dartagnan.program.Write;

public class RMWWrite extends Write {

    protected RMWRead readEvent;

    public RMWWrite(RMWRead readEvent, Location loc, Register reg, String atomic) {
        super(loc, reg, atomic);
        type.add(EVENT_TYPE_ATOMIC);
        type.add(EVENT_TYPE_READ_MODIFY_WRITE);
        this.readEvent = readEvent;
    }

    public RMWWrite(RMWRead readEvent, Location loc, AConst val, String atomic) {
        super(loc, val, atomic);
        type.add(EVENT_TYPE_ATOMIC);
        type.add(EVENT_TYPE_READ_MODIFY_WRITE);
        this.readEvent = readEvent;
    }

    public RMWRead getReadEvent(){
        return readEvent;
    }

    protected Store createStoreEvent(){
        if(reg != null){
            return new RMWStore(readEvent, loc, reg, atomic);
        }
        return new RMWStore(readEvent, loc, val, atomic);
    }
}

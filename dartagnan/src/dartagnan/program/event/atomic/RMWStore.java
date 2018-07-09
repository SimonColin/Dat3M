package dartagnan.program.event.atomic;

import dartagnan.expression.AConst;
import dartagnan.program.Location;
import dartagnan.program.Register;
import dartagnan.program.Store;

public class RMWStore extends Store {

    protected RMWRead readEvent;

    public RMWStore(RMWRead readEvent, Location loc, Register reg) {
        super(loc, reg);
        type.add(EVENT_TYPE_ATOMIC);
        type.add(EVENT_TYPE_READ_MODIFY_WRITE);
        this.readEvent = readEvent;
    }

    public RMWStore(RMWRead readEvent, Location loc, Register reg, String atomic) {
        super(loc, reg, atomic);
        type.add(EVENT_TYPE_ATOMIC);
        type.add(EVENT_TYPE_READ_MODIFY_WRITE);
        this.readEvent = readEvent;
    }

    public RMWStore(RMWRead readEvent, Location loc, AConst val) {
        super(loc, val);
        type.add(EVENT_TYPE_ATOMIC);
        type.add(EVENT_TYPE_READ_MODIFY_WRITE);
        this.readEvent = readEvent;
    }

    public RMWStore(RMWRead readEvent, Location loc, AConst val, String atomic){
        super(loc, val, atomic);
        type.add(EVENT_TYPE_ATOMIC);
        type.add(EVENT_TYPE_READ_MODIFY_WRITE);
        this.readEvent = readEvent;
    }

    public RMWRead getReadEvent(){
        return readEvent;
    }
}

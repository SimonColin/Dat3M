package dartagnan.program.event.atomic;

import dartagnan.program.Location;
import dartagnan.program.Load;
import dartagnan.program.Register;

public class RMWRead extends Load {

    public RMWRead(Register reg, Location loc, String atomic) {
        super(reg, loc, atomic);
        type.add(EVENT_TYPE_ATOMIC);
        type.add(EVENT_TYPE_READ_MODIFY_WRITE);
    }
}
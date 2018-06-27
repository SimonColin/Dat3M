package dartagnan.program.event.filter;

import dartagnan.program.Event;

public interface FilterInterface {

    boolean filter(Event e);

    String toString();
}

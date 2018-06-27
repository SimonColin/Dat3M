package dartagnan.program.event.filter;

import dartagnan.program.Event;

public interface FilterInterface {

    boolean filter(Event e);

    String toString();

    void setName(String name);

    String getName();
}

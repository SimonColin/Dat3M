package dartagnan.program.event.filter;

import dartagnan.program.Event;

public class FilterBasic implements FilterInterface {

    private String param;

    public FilterBasic(String param){
        this.param = param;
    }

    public boolean filter(Event e){
        return e.filter(param);
    }

    public String toString(){
        return param;
    }
}

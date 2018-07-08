package dartagnan.program.event.filter;

import dartagnan.program.Event;

public class FilterMinus extends FilterAbstract implements FilterInterface {

    private FilterInterface filterPresent;
    private FilterInterface filterAbsent;

    public FilterMinus(FilterInterface filterPresent, FilterInterface filterAbsent){
        this.filterPresent = filterPresent;
        this.filterAbsent = filterAbsent;
    }

    public boolean filter(Event e){
        return filterPresent.filter(e) && !filterAbsent.filter(e);
    }

    public String toString(){
        return ((filterPresent instanceof FilterBasic) ? filterPresent : "( " + filterPresent + " )")
                + " \\ "
                + ((filterAbsent instanceof FilterBasic) ? filterAbsent : "( " + filterAbsent + " )");
    }
}
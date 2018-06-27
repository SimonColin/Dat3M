package dartagnan.program.event.filter;

import dartagnan.program.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUnion extends FilterAbstract implements FilterInterface {

    private List<FilterInterface> filters = new ArrayList<FilterInterface>();

    public FilterUnion(){}

    public FilterUnion(FilterInterface filter1, FilterInterface filter2){
        filters.add(filter1);
        filters.add(filter2);
    }

    public void addFilter(FilterInterface filter){
        this.filters.add(filter);
    }

    public boolean filter(Event e){
        for(FilterInterface filter : filters){
            if(filter.filter(e)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return filters.stream()
                .map(f -> (f instanceof FilterBasic) ? f.toString() : "( " + f.toString() + " )")
                .collect(Collectors.joining(" | "));
    }
}

package dartagnan.program.event.filter;

import dartagnan.program.Event;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterIntersection implements FilterInterface{

    private List<FilterInterface> filters = new ArrayList<FilterInterface>();

    public FilterIntersection(){}

    public FilterIntersection(FilterInterface filter1, FilterInterface filter2){
        filters.add(filter1);
        filters.add(filter2);
    }

    public void addFilter(FilterInterface filter){
        this.filters.add(filter);
    }

    public boolean filter(Event e){
        for(FilterInterface filter : filters){
            if(!filter.filter(e)){
                return false;
            }
        }
        return true;
    }

    public String toString(){
        return filters.stream()
                .map(f -> (f instanceof FilterBasic) ? f.toString() : "[ " + f.toString() + " ]")
                .collect(Collectors.joining(" && "));
    }
}

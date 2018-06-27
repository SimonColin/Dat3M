package dartagnan.program.event.filter;

public abstract class FilterAbstract implements FilterInterface {

    protected String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

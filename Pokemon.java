abstract public class Pokemon{

    protected String name;
    protected int weight;
    
    public Pokemon(String name, int weight){
        this.name=name;
        this.weight=weight;
    }
    abstract public float getSpeed();
    abstract public String toString();
}
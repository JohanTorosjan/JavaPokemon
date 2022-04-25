public class StayAtHomePokemon extends Pokemon {
    
    private int numberofleg;
    private int size;
    private int HoursWatchingTv;

    public StayAtHomePokemon(String name, int weight, int numberofleg, int size, int HoursWatchingTv){
        super(name,weight);
        this.weight=weight;
        this.numberofleg=numberofleg;
        this.size=size;
        this.HoursWatchingTv=HoursWatchingTv;
    }

    public String toString(){
        return "I am the "+this.name+" pokemon, my weight is "+this.weight+" kg, my speed is "+this.getSpeed()+" /h, I have "+this.numberofleg+" legs, my height is "+this.size+" m, I watch TV "+this.HoursWatchingTv+" hours a day";
    }
    
    public float getSpeed(){
        return (float)(this.numberofleg*this.size*3);
    }
}

public class SeaPokemon extends Pokemon {

    public int numberoffins;

    public SeaPokemon(String name, int weight,int numberoffins){
        super(name,weight);
        this.numberoffins=numberoffins;
    }

    public String toString() {
        return "I am the "+this.name+" pokemon, my weight is "+this.weight+" kg, my speed is "+this.getSpeed()+" /h, I have "+this.numberoffins+" fins.";
    }
    public float getSpeed(){
        return (float)this.weight/25*numberoffins;
    }
    
}

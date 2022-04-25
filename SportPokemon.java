class SportPokemon extends Pokemon {

    private int numberofleg;
    private int size;
    private int beatsperminute;


    public SportPokemon(String name,int weight, int numberofleg, int size, int beatsperminute){
        super(name, weight);
        this.numberofleg=numberofleg;
        this.size=size;
        this.beatsperminute=beatsperminute;
    }
    public String toString(){
        return "I am the "+this.name+" pokemon, my weight is "+this.weight+" kg, my speed is "+this.getSpeed()+" km / h, I have "+this.numberofleg+" legs, my height is "+this.size+" m, my heart rate is "+this.beatsperminute+" beats per minute";
    }

    public float getSpeed(){
        return (float)this.numberofleg*this.size*3;
    }



    
}

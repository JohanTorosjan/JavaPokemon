public class CruisingPokemon extends SeaPokemon {

    

    public CruisingPokemon(String name,int weight, int numberoffins){
        super(name,weight,numberoffins);
    }

    public float getSpeed(){
        return (float)(this.weight/25*this.numberoffins)/2;
    }
    
}

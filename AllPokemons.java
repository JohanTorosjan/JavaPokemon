import java.util.ArrayList;

public class AllPokemons {

    private ArrayList<Pokemon> pokemons;

    public AllPokemons(){
        this.pokemons = new ArrayList<Pokemon>();
    }

    public ArrayList<Pokemon> getpokemons() {
        return pokemons;
    }
    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void toEmptyList(){
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon p){
        this.pokemons.add(p);
    }

    public void removePokemon(Pokemon p){
        this.pokemons.remove(p);
    }

    public double getAverageSpeed(){
        double sum = 0;
        int count = 0;
        for(Pokemon p : this.pokemons){
            sum+=p.getSpeed();
            count+=1;
        }
        return sum/count;
    }

    public double getAvgSpeedSportPoke(){
        double sum = 0;
        int count = 0;
        for(Pokemon p : this.pokemons){
            if(p instanceof SportPokemon) {
                sum += p.getSpeed();
                count += 1;
            }
        }
        return sum/count;
    }

    @Override
    public String toString(){
        String rep="";
        for(Pokemon p:this.pokemons){
            rep=rep+p.toString()+"\n";
        }
        return rep;
    }
}
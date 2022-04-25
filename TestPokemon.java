public class TestPokemon {
    public static void main(String[] args) {
        AllPokemons myPokemons=new AllPokemons();
        CruisingPokemon cp = new CruisingPokemon("Carapuce",15,4);
        SeaPokemon sp = new SeaPokemon("Phione",12,3);
        StayAtHomePokemon shp = new StayAtHomePokemon("Rondoudou",20,2,70,24);
        SportPokemon spp = new SportPokemon("Pikachu",18,2,40,2000);
        myPokemons.addPokemon(cp);
        myPokemons.addPokemon(sp);
        myPokemons.addPokemon(shp);
        myPokemons.addPokemon(spp);
        System.out.println(myPokemons.toString());
        System.out.println("Average speed of sport pokemon = "+myPokemons.getAvgSpeedSportPoke()+"\n Average spped of all pokemons = "+myPokemons.getAverageSpeed());
    }  
}


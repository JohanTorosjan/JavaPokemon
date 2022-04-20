import java.util.ArrayList;

public class TestPokemon {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokeliste=new ArrayList<Pokemon>();
        CruisingPokemon cp = new CruisingPokemon("Bulbizarre",15,3);
        SeaPokemon sp = new SeaPokemon("Rondoudou",12,2);
        StayAtHomePokemon shp = new StayAtHomePokemon("Salameche",100,100,100,100);
        SportPokemon spp = new SportPokemon("Pikachu",18,2,12,120);
        pokeliste.add(cp);
        pokeliste.add(sp);
        pokeliste.add(shp);
        pokeliste.add(spp);
        for(Pokemon p:pokeliste){
            System.out.println(p.toString());
        }
    }    
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Map<String, Integer> pokemonMap = new HashMap<>();
        Map<Integer, String> revPokemonMap = new HashMap<>();
        for(int i=0; i<n; i++) {
            int index = i+1;
            String pokemon = br.readLine();
            pokemonMap.put(pokemon, index);
            revPokemonMap.put(index, pokemon);
        }
        for(int i=0; i<m; i++) {
            String tmp = br.readLine();
            if(Character.isAlphabetic(tmp.charAt(0))) {
                sb.append(pokemonMap.get(tmp)).append("\n");
            } else {
                int num = Integer.parseInt(tmp);
                sb.append(revPokemonMap.get(num)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
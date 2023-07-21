import java.util.*;

public class Hash_test {

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> teamsBestPlayer = new HashMap<String, String>();

        // Add keys and values (Country, City)
        teamsBestPlayer.put("ManchesterUnited", "Rashford");
        teamsBestPlayer.put("RealMadrid", "Vinicius");
        teamsBestPlayer.put("PSG", "Mbappe");
        System.out.println(teamsBestPlayer);

        HashSet<String> teams = new HashSet<String>();
        teams.add("ManchesterUnited");
        teams.add("RealMadrid");
        teams.add("PSG");
        System.out.println(teams);
    }
}

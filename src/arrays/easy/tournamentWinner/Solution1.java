package arrays.easy.tournamentWinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    // O(N) Time
    // O(N) Space

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        int maxPoints = 0;
        String leader = "";
        Map<String, Integer> pointsTable = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            String homeTeam = competitions.get(i).get(0);
            String awayTeam = competitions.get(i).get(1);
            String winner = (results.get(i) == 0) ? awayTeam : homeTeam;
            int newPoints = (pointsTable.get(winner) == null) ? 3 : pointsTable.get(winner) + 3;
            pointsTable.put(winner, newPoints);

            if (newPoints > maxPoints) {
                maxPoints = newPoints;
                leader = winner;
            }
        }

        return leader;
    }

}

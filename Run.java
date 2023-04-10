
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Run {
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();

        IntStream.range(0, players.length).forEach(index -> {
            playerMap.put(players[index], index);
        });
        Arrays.stream(callings).forEach(calling -> {
            int prevRank = playerMap.get(calling);
            String target = players[prevRank-1];
            players[prevRank] = target;
            players[prevRank-1] = calling;

            playerMap.put(target, prevRank);
            playerMap.put(calling, prevRank-1);
        });

        return players;
    }
}

class Solution {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> yearningMap = new HashMap<>();
        for (int index = 0; index < name.length; index++) {
            yearningMap.put(name[index], yearning[index]);
        }
        for (int i = 0; i < photo.length; i++) {
            int result = 0;
            for (int j = 0; j < photo[i].length; j++) {
                Integer value = yearningMap.get(photo[i][j]);
                if(value != null) {
                    result += value;
                }
                answer[i] = result;
            }
        }
        return answer;
    }
}

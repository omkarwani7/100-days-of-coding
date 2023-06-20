//leetcode Q. 451

class SortCharByFreq {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((obj1,obj2) -> map.get(obj2) - map.get(obj1));
        for(char ch : list){
            for(int i=0; i<map.get(ch); i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
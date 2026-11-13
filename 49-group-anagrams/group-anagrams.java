class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            map.computeIfAbsent(toSort(strs[i]),k->new ArrayList<>()).add(strs[i]);
        }
       return new ArrayList<>(map.values());
    }
    public String toSort(String a){
        char[] ch = a.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
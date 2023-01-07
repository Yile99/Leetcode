class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        int len = s.length();
        int wordNum = words.length;
        int wordLength = words[0].length();
        Map<String,Integer> allWords = new HashMap<>();
        for(String word : words){
            allWords.put(word,allWords.getOrDefault(word,0)+1);
        } 
        for(int i = 0; i < wordLength; i++ ){
            int left = i;
            int right = i;
            int count = 0;
            Map<String,Integer> hasWords = new HashMap<>();
            while(right + wordLength <= len){
                String cur = s.substring(right,right+wordLength);
                right += wordLength;
                if(allWords.containsKey(cur)){
                    hasWords.put(cur,hasWords.getOrDefault(cur,0)+1);
                    count++;
                    while(hasWords.get(cur)>allWords.get(cur)){
                        String del = s.substring(left,left+wordLength);
                        hasWords.put(del,hasWords.get(del)-1);
                        left += wordLength;
                        count--;
                    }
                }
                else{
                    left = right;
                    hasWords.clear();
                    count = 0;
                }
                if(count == wordNum){
                res.add(left);
                }
            }
        }
    return res;
    }
}
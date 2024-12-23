TC - (Nlog N)
SC - O(N)

Problem - The below problem is about listing anagrams - the words with similar letters like - eat and tea are anagrams, we are given a list of strings and there will
          anagrams we need to make them as a list and return the list of list of strings.

Intuition :
    Declare a map the key is string and the values are list of strings that anagrams of the key.
    iterate through the list and take one string at a time we will take one string at time convert the string as character array and sort the array string again so 
    that whenever we come across same string after sorted we can add to the list of strings in the values of the map.
    if the map does not contains the same string then we add the key and wait and check if same string repeats we do the same defined in the above step.
    finally we return the list of values of the map which are the lists of anagrams.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(String i : strs) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String ans = new String(chars);

            if(!hm.containsKey(ans)) {
                hm.put(ans, new ArrayList<>());
            }
            hm.get(ans).add(i);
        }

        return new ArrayList<>(hm.values());

    }
}

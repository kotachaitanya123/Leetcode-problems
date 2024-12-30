TC - O(N ^ 2)
SC - O(N)

  Problem : In the below problem we are given an array of strings and we needx to find two strings from the array that does not have any common word in the two
            strings and we need to return the product of the two strings.
  Intuition : 
        Assign a list that stores characters of string in a set i.e., each list element has set of characters of each string, as set does not allow duplicates 
        we will make use this property.
        Iterate through the array and get one string at a time and declare a set in each iteration, and add that set to the list, now iterate through the string and
        add each character to the set.
        Now iterate through the array and get that particular position set(s in program) from the list by l.get(i), now iterate through from the next index of i to 
        the end of the array and get each set of characters(t in program) from the list i.e., l.get(j) and declare a boolean value flag to false to check if at any 
        position if the character in s is persent in t, then assign the flag to true and break from the j loop as the two strings are having common characters, now
        at end of the characters checking loop by using the flag variable we will update the max if flag is true then we update it with product of the strings lengths.
        return max which has the max product of two strings which does not have any common characters.

class Solution {
    public int maxProduct(String[] words) {
        int n = words.length, max = 0;
        List<Set<Character>> l = new ArrayList<>();

        for(String word : words) {
            int m = word.length();
            Set<Character> s = new HashSet();
            l.add(s);
            for(int j = 0; j < m; j++) {
                s.add(word.charAt(j));
            }
        }

        for(int i = 0; i < n; i++) {
            Set<Character> s = l.get(i);
            for(int j = i + 1; j < n; j++) {
                boolean flag = false;
                Set<Character> t = l.get(j);
                for(Character c : s) {
                    if(t.contains(c)) {
                        flag = true;
                        break;
                    }
                }
                if(!flag) max = Math.max(max, words[i].length() * words[j].length());
            }
        }

        return max;
        
    }
}

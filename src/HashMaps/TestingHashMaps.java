package HashMaps;

import java.util.HashMap;

public class TestingHashMaps {
    public static void main(String[] args) {
        //Use key value pairs and a hashing function to store and organize data
        //Hashing function maps a key or object to a specific hash
        //This hash determines where the object is stored

        HashMap<String, Integer> wordToNum = new HashMap();

        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);

        System.out.println(wordToNum.get("THREE"));
        System.out.println(wordToNum.keySet());
        System.out.println(wordToNum.values());

        System.out.println(wordToNum.remove("FOUR"));
        System.out.println(wordToNum.keySet());
        System.out.println(wordToNum.values());

        //Common use of Hashmaps: Which character is most repeated?
        String s = "ppppphonebook";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (hashMap.containsKey(currentChar)) {
                //if the hashmap has the character key, increment the value for that key character
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
            } else {
                hashMap.put(currentChar, 1);
            }
        }

        //finding the most repeated character
        Character mostRepeated = ' ';
        int max = 0;
        for (Character key : hashMap.keySet()) {
            int currentVal = hashMap.get(key);
            if (currentVal > max) {
                mostRepeated = key;
                max = currentVal;
            }
        }

        System.out.println("The max character is " + mostRepeated + " and the value is " + max);
    }
}

package ArraysAndStrings;

public class UniqueCharacters {

    public static void main(String[] args) {
        System.out.println("Hello World");
        boolean isUnique1 = isUniqueChars("ThisMySs");
        System.out.println(isUnique1);
    }

        public static boolean isUniqueChars(String myString) {
            boolean[] charSet = new boolean[128];
            for (int i = 0; i < myString.length(); i++) {
                int val = myString.charAt(i);
                boolean charSetVal = charSet[val];
                if (charSetVal) {
                    return false;
                }
                charSet[val] = true;
            }
            return true;
        }
    }

public class ArrayAlgorithms {
    /**
     * Prints each String in wordList, on its own line, followed by “!”.
     * Does NOT mutate (modify) wordList.
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList) {
        for (int i = 0; i <= wordList.length - 1; i++) {
            System.out.println(wordList[i] + "!");
        }
    }

    /**
     * Adds a “!” to the end of each String in wordList (does not print).
     * DOES mutate (modify) original wordList.
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList) {
        for (int i = 0; i <= wordList.length - 1; i++) {
            wordList[i] += "!";
        }
    }

    /**
     * Returns the sum of all values in numList.
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList array of integers to find sum
     * @return the sum of all numbers in the list
     */
    public static int sum(int[] numList) {
        int add = 0;
        for (int i = 0; i <= numList.length - 1; i++) {
            add += numList[i];
        }
        return add;
    }

    /**
     * Returns the average of all values in numList, as a double.
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList array of integers to find average
     * @return the average of all numbers in the list
     * <p>
     * Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList) {
        double newAdd = sum(numList);
        return newAdd / numList.length;
    }

    /**
     * Returns the value in numList that represents the minimum value in numList.
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList array of integers to find minimum
     * @return the minimum value in the array
     */
    public static int minimum(int[] numList) {
        int min = numList[0];
        {
            for (int i = 1; i <= numList.length - 1; i++) {
                if (numList[i] < min) {
                    min = numList[i];
                }
            }
        }
        return min;

    }

    /**
     * Returns the value in numList that represents the maximum value in numList.
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList array of integers to find maximum
     * @return the maximum value in the array
     */
    public static int maximum(int[] numList) {
        int max = numList[0];
        for (int i = 1; i <= numList.length - 1; i++) {
            if (numList[i] > max) {
                max = numList[i];
            }
        }
        return max;
    }

    /**
     * Multiplies each number in numList by multiplier.
     * DOES mutate (modify) original numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList    original array of integers, modified by method
     * @param multiplier number to multiply each element in numList
     */
    public static void multiplyBy(int[] numList, int multiplier) {
        for (int i = 0; i <= numList.length - 1; i++) {
            numList[i] = numList[i] * multiplier;

        }
    }


    /**
     * Returns a NEW array containing the squares of the elements in the original
     * numList array, in the same position.
     * Does NOT mutate (modify) original numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList original array of integers to be squared
     * @return new array containing squares of the values in numList
     */
    public static int[] squares(int[] numList) {
        int[] sub = new int[numList.length];
        for (int i = 0; i <= numList.length - 1; i++) {
            sub[i] = (int) Math.pow(numList[i], 2);
        }
        return sub;
    }


    /**
     * Switches each boolean value in boolList to its opposite value; true values
     * becomes false, and false values become true.
     * DOES mutate (modify) original boolList.
     * PRECONDITION: boolList.length > 0
     *
     * @param boolList original array of booleans, modified by method
     */
    public static void flipBool(boolean[] boolList) {
        for (int i = 0; i <= boolList.length - 1; i++) {
            boolList[i] = !(boolList[i]);
        }


    }

    /**
     * Returns a String representing the array of ints as a printable String,
     * including open and closing brackets, with values separated by commas.
     * This method should function identically to Arrays.toString()!
     * <p>
     * Does NOT mutate (modify) original numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList original array of ints to be represented in String form
     */
    public static String customToString(int[] numList) {
        String strList = "[";
        for (int i = 0; i <= numList.length - 1; i++) {
            if (i < numList.length - 1) {
                strList = (strList + numList[i] + ", ");
            } else if (i >= numList.length - 1) {
                strList = (strList + numList[i] + "]");
            }

        }
        return strList;
    }

    /**
     * Returns the length of the longest String(s) in an array of Strings.
     * Does NOT mutate (modify) stringList.
     * PRECONDITION: stringList.length > 0
     *
     * @param stringList original array of Strings; does not get modified
     * @return length of the longest String in the array
     */
    public static int longestString(String[] stringList) {
        int sub = 0;
        for (String str : stringList) {
            if (str.length() > sub) {
                sub = str.length();
            }
        }
        return sub;
    }

    /**
     * Changes all words in an array of words to uppercase.
     * DOES mutate (modify) original wordList.
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings, modified by method
     */
    public static void makeUppercase(String[] wordList) {
        for (int i = 0; i <= wordList.length - 1; i++) {
            wordList[i] = wordList[i].toUpperCase();


        }
    }

    /**
     * Returns true if ANY of the ints in numList are positive, otherwise,
     * returns false.
     * <p>
     * Does NOT mutate (modify) numList.
     * PRECONDITION: numList.length > 0
     *
     * @param numList original array of ints; does not get modified
     * @return true if any element of numList is positive, false otherwise
     */
    public static boolean containsPositive(int[] numList) {
        boolean positive = false;
        for (int sub : numList) {
            if (sub > 0) {
                positive = true;
                return positive;
            }
        }
        return positive;
    }

    /**
     * Returns true if ANY of the Strings in stringList contain searchStr,
     * otherwise, returns false. Your method should NOT be case sensitive, e.g.
     * searching for "ma" should be found in the String "Maddox" and searching
     * for "MA" should be found in String "mad"
     * <p>
     * Does NOT mutate (modify) stringList.
     * PRECONDITION: stringList.length > 0
     *
     * @param stringList original array of Strings; does not get modified
     * @param searchStr  the String to search each element of stringList
     * @return true if any element of stringList contains searchStr, otherwise
     * returns false
     */
    public static boolean containsString(String[] stringList, String searchStr) {
        String use;
        boolean contains = false;
        for (String sub : stringList) {
            use = sub.toLowerCase();
            if (use.indexOf(searchStr.toLowerCase()) != -1) {
                contains = true;
                return contains;
            }

        }
        return contains;

    }

    /**
     * Returns a NEW array of Strings that contains all words from the original
     * array of strings in lowercase.
     * <p>
     * Does NOT mutate (modify) original wordList
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings, not modified by method
     * @return new array of Strings in all lowercase
     */

    public static String[] makeLowercase(String[] wordList) {
        String[] lowerCase = new String[wordList.length];
        for (int i = 0; i <= wordList.length - 1; i++) {
            lowerCase[i] = wordList[i].toLowerCase();
        }
        return lowerCase;
    }

    /**
     * Returns a NEW array of ints that contains the higher value of each pair
     * of elements at the same index in two other equally-sized arrays of ints
     * For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8},
     * this method returns the array {2, 7, 6, 1, 8}, where each value is the
     * higher of the two at that respective index in the two original arrays
     * <p>
     * Does NOT mutate (modify) EITHER array
     * PRECONDITION: intArr1.length == intArr2.length
     *
     * @param intArr1 first array of ints
     * @param intArr2 second array of ints, having the same length as intArr1
     * @return new array of ints representing the higher values
     */

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] highest = new int[intArr2.length];
        for (int i = 0; i <= highest.length - 1; i++) {
            if (intArr1[i] >= intArr2[i]) {
                highest[i] = intArr1[i];
            } else if (intArr1[i] <= intArr2[i]) {
                highest[i] = intArr2[i];
            }
        }
        return highest;
    }

    /**
     * Returns the number of Strings in stringList that have an exclamation point
     * ("!") at the end.
     * <p>
     * Does NOT mutate (modify) stringList.
     * PRECONDITION: stringList.length > 0
     *
     * @param stringList original array of Strings; does not get modified
     * @return number of Strings in stringList that end in "!"
     */
    public static int endsInExclamations(String[] stringList) {
        int count = 0;
        for (String sub : stringList) {
            if (sub.substring(sub.length() - 1).equals("!")) {
                count++;
            }
        }
        return count;

    }

    /**
     * Returns the number of elements in the numList array that have the same
     * value as the element immediately adjacent to the right in the array.
     * (BE CAREFUL not to go out of bounds!)
     * For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     * this method would return 5, since there are five numbers in the array that
     * are equal to the number immediately to the right (shown below in blue):
     * {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     * <p>
     * Does NOT mutate (modify) numList
     * PRECONDITION: numList.length > 0
     *
     * @param numList original array of numbers; does not get modified
     * @return number of elements in numList that are equal to the element
     * adjacent to the right of the element in the array
     */
    public static int countConsecutiveDoubles(int[] numList) {
        int count = 0;
        for (int i = 0; i <= numList.length - 1; i++) {
            if (i < numList.length - 1) {
                if (numList[i] == numList[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Returns a NEW array that contains all elements of the original numList,
     * shifted to the left by one index; the first element of the array should
     * wrap around and appear at the end.
     * For example, given the array {5, 1, 3, 4, 7}, this method returns the
     * array {1, 3, 4, 7, 5}
     * <p>
     * Does NOT mutate (modify) numList
     * PRECONDITION: numList.length > 0
     *
     * @param numList original array of numbers; does not get modified
     * @return array with elements in numList shifted by one index left
     */
    public static int[] shiftLeft(int[] numList) {
        int[] shifted = new int[numList.length];
        for (int i = 0; i <= shifted.length - 1; i++) {
            if (numList[i] < numList.length - 1) {
                shifted[i] = numList[i + 1];

        }

    }return shifted;
}
}
import java.util.Arrays;

public class ArrayAlgorithmTester
{
    public static void main(String[] args)
    {
        String[] strings = {"hello", "hola", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings));

        // original array NOT modified
        System.out.println(Arrays.toString(strings));

        System.out.println("----");

        String[] strings2 = {"cut", "boy", "mom", "she"};
        System.out.println(ArrayAlgorithms.longestString(strings2));

        // original array NOT modified
        System.out.println(Arrays.toString(strings2));

        System.out.println("----");

        String[] strings3 = {"M", "DA", "B", "FAD"};
        System.out.println(ArrayAlgorithms.longestString(strings3));

        // original array NOT modified
        System.out.println(Arrays.toString(strings3));
        System.out.print("hi".toUpperCase());
    }
}

import java.util.Arrays;

public class ArrayAlgorithmTester
{
    public static void main(String[] args)
    {
        int[] nums = {5, -10, 8, 12, 2, -6, 0};
        System.out.println(ArrayAlgorithms.customToString(nums));
        int[] nums2 = {15};
        System.out.println(ArrayAlgorithms.customToString(nums2));

        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }
}

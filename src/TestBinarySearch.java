import java.util.Scanner;

public class TestBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        System.out.println(BinarySearch.BS(list,7));
        System.out.println(BinarySearch.BS(list,13));
        System.out.println(BinarySearch.BS(list,50));

    }
}

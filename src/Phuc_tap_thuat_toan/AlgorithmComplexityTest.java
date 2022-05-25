package Phuc_tap_thuat_toan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inputString = input.nextLine();



        int[] frequentChar = new int[255];                               // 1 lenh gan ==> O(1)
        for (int i = 0; i < inputString.length(); i++) {                 // 4n + 2 ==> O(n)
            int ascii = (int)inputString.charAt(i);
            frequentChar[ascii] += 1;
        }
        
        int max = 0;                                                     // 1 lenh gan ==> O(1)
        char character = (char) 255;                                     // 1 lenh gan ==> O(1)
        for (int i = 0; i < 255; i++) {                                  // 255 vong lap ==> O(255)
            if (frequentChar[i]>max){                                    // so sanh 1 lan ==> O(1)
                max = frequentChar[i];                                   // 1 lenh gan ==> O(1)
                character = (char) i;                                    // 1 lenh gan ==> O(1)
            }
        }

        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
            
        }
    }


// do phuc tap thuat toan la:
//Độ phức tạp của thuật toán được tính bằng thời gian thi hành lệnh lâu nhất trong chuỗi lệnh
// Có 2 trường hợp:
// n<= 255 ==> độ phức tạp thuật toán là O(255)
// n> 255 ==> độ phức tạp thuật toán là O(n)
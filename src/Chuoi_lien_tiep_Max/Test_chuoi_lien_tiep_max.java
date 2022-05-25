package Chuoi_lien_tiep_Max;

import java.util.LinkedList;
import java.util.Scanner;

public class Test_chuoi_lien_tiep_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String:");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            if (string.charAt(i) != ' ') {
                for (int j = i + 1; j < string.length(); j++) {
                    if (string.charAt(j) != ' ') {
                        list.add(string.charAt(j));
                    } else {
                        break;
                    }
                }
            }

                    if (list.size() > max.size()) {
                        max.clear();
                        max.addAll(list);
                    }
                    list.clear();
                }

        System.out.print("chuoi lien tiep max: ");
        for (int i = 0; i < max.size(); i++) {
            System.out.print(max.get(i));
        }
    }
}


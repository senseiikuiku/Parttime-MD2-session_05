package ra.demo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoList {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] nyc = new String[5];
        List<String> nyc = new ArrayList<>();

        nyc.add("NYC");
        nyc.add("D");
        nyc.add("NYC");

        for (String s : nyc) {
            System.out.println(s);
        }

    }
}

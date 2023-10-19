package BT7_Demo;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> soChan = new ArrayList<>();

        for (int a = 0; a <= 50; a++) {
            if (a % 2 == 0) {
                soChan.add(a);
            }
        }
        for (int number : soChan) {
            System.out.println(number);
        }

    }

}

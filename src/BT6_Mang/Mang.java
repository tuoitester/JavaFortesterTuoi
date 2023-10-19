package BT6_Mang;

public class Mang {
    public static void main(String[] args) {
        int[] sochan = new int[26];
        int index = 0;
        for (int i = 0; i <= 50; i++)
        {
            if (i % 2 == 0) {
                System.out.println(i);
                sochan[index] = i;
                index++;
            }
        }
        for (int i = 0; i < sochan.length; i++) {
            System.out.println(sochan[i]);
        }
    }
}
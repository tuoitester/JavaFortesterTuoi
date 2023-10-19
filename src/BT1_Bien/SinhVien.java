package BT1_Bien;

public class SinhVien {
    public static int a = 20; //Đây là biến toàn cục/instance

    public static void main(String[] args) {
        String Name = "Nguyen Thi Tuoi"; //đây là bến local
        int b = 27;
        String Email = "tuoi@gmail.com";
        System.out.println(Name);
        System.out.println(b);
        System.out.println(Email);
        System.out.println(a);
        System.out.println(ThongTin.address);
    }
}

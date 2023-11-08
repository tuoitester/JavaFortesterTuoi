package BT_JAVA_OPP2.company;
import BT_JAVA_OPP2.person.Person;
public class Company {
    public static void main(String[] args) {
        Person person = new Person("Nguyễn", 27, "Nam", "21 Lê Đức Thọ", "0974375403");
        System.out.println("Họ và tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());

    }
}

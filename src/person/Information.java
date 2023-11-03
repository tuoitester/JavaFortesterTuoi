package person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Nguyễn", 27, "Nam", "21 Lê Đức Thọ", "0974375403");
        System.out.println("Họ và tên" + person.getName());
        System.out.printf("Tuổi" + person.getAge());
        System.out.println("Giới tính" + person.getGender());
        System.out.printf("Địa chỉ" + person.getAddress());
        System.out.println("Số điện thoại" + person.getPhone());
}}

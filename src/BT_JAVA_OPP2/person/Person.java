package BT_JAVA_OPP2.person;
    public class Person{
        public String name;
        public int age;
        public String gender;
        public String address;
        public String phone;
        public Person(String name, int age, String gender, String address, String phone){
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.address = address;
            this.phone = phone;}
        public String getName(){
            return  name;}
        public int getAge(){
            return age;}
        public String getGender(){
            return gender;}
        public String getAddress(){
            return address;}
        public String getPhone(){
            return phone;
        }
    }

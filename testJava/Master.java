public class Master {
    public static void main(String[] args) {
        Person God = new Person();

        God.name = "god";
        God.birth = 000000;
        God.age = 999999999;
        God.height = 999999999;
        God.weight = 0;
        God.death = false;

        System.out.println("이름 : " + God.name);
        System.out.println("나이 : " + God.age);
        System.out.println("필멸자인가? : " + God.death);
    }
}

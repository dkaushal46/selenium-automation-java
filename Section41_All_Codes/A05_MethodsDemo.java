package demo;

public class A05_MethodsDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        A05_MethodsDemo d = new A05_MethodsDemo();
        String name = d.getData();
        System.out.println(name);

        A06_MethodsDemo2 d1 = new A06_MethodsDemo2();
        d1.getUserData();

        getData2();
    }

    public String getData() {
        System.out.println("hello world");
        return "rahul shetty";
    }

    public static String getData2() {
        System.out.println("hello world");
        return "rahul shetty";
    }
}

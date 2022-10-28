package ObjectClass;

public class Object {

    int id;
    String name;

    public static void main(String[] args) {
        Object o1 = new Object();
        o1.id = 100;
        o1.name = "abc";
        System.out.println(o1.id + " " + o1.name);
    }
}

package ObjectClass;

public class ObjectByRef {

    public static void main(String[] args) {
        Object o2 = new Object();
        Object o3 = new Object();

        o2.id=101;
        o2.name="xyz";
        o3.id=102;
        o3.name="mno";

        System.out.println(o2.id + " " + o2.name);
        System.out.println(o3.id + " " + o3.name);
    }
}

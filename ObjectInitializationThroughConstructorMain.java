package ObjectClass;

public class ObjectInitializationThroughConstructorMain {

    public static void main(String[] args) {
        ObjectInitializationThroughConstructor e1 = new ObjectInitializationThroughConstructor();
        ObjectInitializationThroughConstructor e2 = new ObjectInitializationThroughConstructor();
        ObjectInitializationThroughConstructor e3 = new ObjectInitializationThroughConstructor();

        e1.insert(100, "ABC", 100);
        e2.insert(101, "ABCD", 110);
        e3. insert(102, "XYZ", 120);

        e1.display();
        e2.display();
        e3.display();
    }
}

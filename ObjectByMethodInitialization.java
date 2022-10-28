package ObjectClass;

public class ObjectByMethodInitialization {

    public static void main(String[] args) {

        ObjectByMethod m1 = new ObjectByMethod();
        ObjectByMethod m2 = new ObjectByMethod();

        m1.insertRecord(101, "String1");
        m2.insertRecord(102, "String2");

        m1.displayInformation();
        m2.displayInformation();
    }
}

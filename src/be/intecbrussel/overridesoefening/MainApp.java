package be.intecbrussel.overridesoefening;

public class MainApp {
    public static void main(String[] args) {
        Shape shape = new Shape(1000);
        Shape workShape1 = new WorkShape(10);
        WorkShape workShape2 = new WorkShape(20);

        Shape schoolShape1 = new SchoolShape(2000);
        SchoolShape schoolShape2 = new SchoolShape(2000);



//
//        System.out.println("\tWork form1 has hashCode - " +workShape1.hashCode());
//        System.out.println("\tWork form2 has hashCode - " +workShape2.hashCode());

//        System.out.println(workShape1.equals(workShape2));
        System.out.println(schoolShape1.equals(schoolShape2));
        System.out.println("\tSchool form1 has hashCode - " +schoolShape1.hashCode());
        System.out.println("\tSchool form2 has hashCode - " +schoolShape2.hashCode());

//        shape.myShape();
//        schoolShape1.myShape();
//        workShape1.myShape();

    }
}

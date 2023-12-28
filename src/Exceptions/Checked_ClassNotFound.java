package Exceptions;

public class Checked_ClassNotFound {

    public static void main(String[] args) {

        try {
            Class c=Class.forName("ABC");
        } catch (ClassNotFoundException e) {

            System.out.println("ClassNotFoundExceByTryCatch");
        }
        System.out.println("This is Naresh");
    }

}

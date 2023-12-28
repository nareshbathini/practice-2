package Exceptions;

public class Unchecked_NullPointer {

        public static void main (String args[])
        {

            String a=null;
            System.out.println(a.charAt(1));


        /*    try {
                String a = null; //null value
                System.out.println(a.charAt(0));
            } catch(NullPointerException e) {
                System.out.println("NullPointerException..");
            }*/

    }
}

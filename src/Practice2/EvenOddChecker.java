package Practice2;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        scanner.close();
        if(num%2==0){
            System.out.println(num + ": It is an even number");
        }else{
            System.out.println(num+ ": It is an odd number");
        }

    }

    }


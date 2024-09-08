package oddevenchecker;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner side1 = new Scanner(System.in);
        System.out.println("add the first side:");
        int n=side1.nextInt();
        Scanner side2=new Scanner(System.in);
        System.out.println("add the second side:");
        int n1=side2.nextInt();
        int perimeter=(n+n1)*2;
        int area=n*n1;
        System.out.println("perimeter:"+perimeter);
        System.out.println("area:"+area);
    }
}

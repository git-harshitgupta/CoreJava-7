package tester;
import com.app.vehicle.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Object[] list = new Vehicle[2];
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the first vehical details");
            list[0] = new Vehicle(sc.next(), sc.next(), sc.nextDouble());
            System.out.println("Enter the second vehical details");
            list[1] = new Vehicle(sc.next(), sc.next(), sc.nextDouble());
            System.out.println(list[0].equals(list[1])?"SAME":"DIFFERENT");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

import classes.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String str = "Старший охранник";
        Jobtitle jt3 = new Jobtitle(str, 10);
        Employee emp3 = new Employee(100);
        Employee[] arr = new Employee[3];
        String jobt1 = "Охранник";
        String jobt2 = "Охранник воитель";
        String jobt3 = "Охранник командир";
        Jobtitle a1 = new Jobtitle(jobt1, 11);
        Jobtitle a2 = new Jobtitle(jobt2, 12);
        Jobtitle a3 = new Jobtitle(jobt3, 13);
        arr[0] = new Employee(101);
        arr[1] = new Employee(102);
        arr[2] = new Employee(103);
        for(int i = 0; i < 3; i++){
            arr[i].editjtitle("Охранник", "Старший");
        }
        for(int i = 0; i < 3; i++){
            arr[i].output();
            System.out.println();
        }
        emp3.output();
        Employee.printcounter();
        Employee.minuscounter();
        Employee.minuscounter(2);
    }
}
package classes;
import java.util.Scanner;

public class Equipment {

    //поля класса
    private String eqtitle; //наименование снаряжения
    private int eqcost; //стоимость снаряжения


    //конструктор со всеми параметрами
    public Equipment(String eqtitle, int eqcost){
        this.eqtitle = eqtitle;
        if(eqcost >= 0)
            this.eqcost = eqcost;
        else {
            System.out.println("Указано недопустимое значение eqcost (eqcost < 0).");
            this.eqcost = 0;
        }
    }

    //конструктор с одним параметром
    public Equipment(int allfields){
        if(allfields >= 0) {
            eqtitle = Integer.toString(allfields);
            eqcost = allfields;
        }
        else{
            System.out.println("Указано недопустимое значение allfields (allfields < 0).");
            eqcost = 0;
            eqtitle = "";
        }
    }

    //конструктор без параметров
    public Equipment(){
        eqtitle = "";
        eqcost = 0;
    }

    //метод ввода класса
    public void input(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите наименование снаряжения: ");
        eqtitle = inp.nextLine();
        System.out.println("Введите стоимость снаряжения: ");
        eqcost = inp.nextInt();
    }

    //метод вывода класса
    public void output(){
        System.out.println("Снаряжение: " + eqtitle);
        System.out.println("Стоимость снаряжения: " + eqcost);
    }

    //метод возвращающий значение eqcost
    public int geteqcost(){return eqcost;}
}
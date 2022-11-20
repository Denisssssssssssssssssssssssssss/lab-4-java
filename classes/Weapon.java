package classes;
import java.util.Scanner;

public class Weapon {

    //поля класса
    private String weptitle; //наименование вооружения
    private int wepcost; //стоимость вооружения


    //конструктор со всеми параметрами
    public Weapon(String weptitle, int wepcost){
        this.weptitle = weptitle;
        this.wepcost = wepcost;
    }

    //конструктор с одним параметром
    public Weapon(int allfields){
        if(allfields >= 0) {
            weptitle = Integer.toString(allfields);
            wepcost = allfields;
        }
        else{
            System.out.println("Указано недопустимое значение allfields (allfields < 0).");
            weptitle = "";
            wepcost = 0;
        }
    }

    //конструктор без параметров
    public Weapon(){
        weptitle = "";
        wepcost = 0;
    }

    //метод ввода класса
    public void input(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите тип вооружения: ");
        weptitle = inp.nextLine();
        System.out.println("Введите затраты на вооружение: ");
        wepcost = inp.nextInt();
    }

    //метод вывода класса
    public void output(){
        System.out.println("Вооружение: " + weptitle);
        System.out.println("Стоимость вооружения: " + wepcost);
    }
    public int getwepcost(){return wepcost;}
}
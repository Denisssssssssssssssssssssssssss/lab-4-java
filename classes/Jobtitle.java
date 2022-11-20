package classes;
import java.util.Scanner;

public class Jobtitle {

    //поля класса
    private String jtitle; //наименование должности
    private int monthlycost; //стоимость месяца работы


    //конструктор со всеми параметрами
    public Jobtitle(String jtitle, int monthlycost){
        this.jtitle = jtitle;
        if(monthlycost >= 0)
            this.monthlycost = monthlycost;
        else{
            System.out.println("Указано недопустимое значение monthlycost (monthlycost < 0).");
            this.monthlycost = 0;
        }
    }

    //конструктор с одним параметром
    public Jobtitle(int allfields){
        if(allfields >= 0) {
            jtitle = Integer.toString(allfields);
            monthlycost = allfields;
        }
        else{
            System.out.println("Указано недопустимое значение allfields (allfields < 0).");
            jtitle = "";
            monthlycost = 0;
        }
    }

    //конструктор без параметров
    public Jobtitle(){
        jtitle = "";
        monthlycost = 0;
    }

    //метод ввода класса
    public void input(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите должность: ");
        jtitle = inp.nextLine();
        System.out.println("Введите стоимость месяца работы: ");
        monthlycost = inp.nextInt();
    }

    //метод вывода класса
    public void output(){
        System.out.println("Должность: " + jtitle);
        System.out.println("Стоимость месяца работы: " + monthlycost);
    }

    public int getmonthlycost(){return monthlycost;}

    //метод для редактирования должности
    public void editjtitle(String jtitle, String add){
        StringBuilder sb = new StringBuilder();
        String[] words = this.jtitle.split(" ");
        this.jtitle = "";
        for(String word : words) {
            if(word.equals(jtitle)) {
                sb.append(add);
                sb.append(" ");
            }
            sb.append(word);
            sb.append(" ");
        }
        this.jtitle = sb.toString();
    }
}
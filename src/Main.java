//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        //2
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        //3
        for (int i = 1; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //4
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        //5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("високосный год" + i);
        }
        //6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(+i);
        }
        //7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(+i);
        }
        //8
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total;
            total = total + salary;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total, "рублей");
        }
        System.out.println("total");
    }

    //9
    int salary = 29000;
    int total = 0;
         for(int i = 0; i<12;i++) {
        total = total + total / 100;
        total = total + salary;
        System.out.println("Месяц" + i + "итого" + total);
    }
         System.out.println("total");
}
     //10
        for (int i = 2; i<=20;i=i*2){
        System.out.println(+i);



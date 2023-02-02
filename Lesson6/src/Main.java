// Дичь для вендинг оборудования

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int twixPrice = 77;
        int marsPrice = 78;
        int snikersPrice = 100;
        int bonAquaPrice = 50;


        boolean isCanBuy = false;

        System.out.println("Введите количество денег: ");
        int moneyAmount = new Scanner(System.in).nextInt();

        if (moneyAmount >= twixPrice) {
            System.out.println("Вы можете купить Твикс");
            isCanBuy = true;
            if(moneyAmount % 3 == 0 ) {
                System.out.println("Вы выиграли счастливый билет на 100 руб, обратитесь к администратору");
            }
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Вы можете купить Марс");
            isCanBuy = true;
        }
        if (moneyAmount >= snikersPrice) {
            System.out.println("Вы можете купить Снекерс");
            isCanBuy = true;
        }
        if (moneyAmount >= bonAquaPrice) {
            System.out.println("Вы можете купить Воду");
            isCanBuy = true;
        }
        if (isCanBuy == false) {
            System.out.println("У вас недостаточно средств!");
        }
    }
}

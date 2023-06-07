import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int totalToys = 0;
        List<Toy> toyList = new ArrayList<>();
        Shop shop = new Shop(toyList);
        Random random = new Random();
        Scanner scaner = new Scanner(System.in);


        System.out.println("Добро пожаловать в магазин!!!");
        shop.addToy(new Toy("Car", 3, random.nextInt(100)));
        shop.addToy(new Toy("Plane", 3, random.nextInt(100)));
        shop.addToy(new Toy("Train", 2, random.nextInt(100)));
        shop.addToy(new Toy("Doll", 5, random.nextInt(100)));
        shop.addToy(new Toy("Ball", 3, random.nextInt(100)));


        totalToys = shop.totalQuntity();
        System.out.println("В магазине в наличии следующие игрушки:");
        System.out.println(shop.toString());
        System.out.println("Всего игрушек в магазине: " + totalToys);
        System.out.println("Введите количество призов для розыгрыша");
        String str = scaner.next();
        try {
            count = Integer.parseInt(str);

        } catch (NumberFormatException nfe) {
            System.out.println("Вы ввели некорректное количество");
        }
        if (count > totalToys) {
            System.out.println("Вы ввели больше чем есть в магазине(" + totalToys + ")");
            str = "0";
        } else shop.lottery(count);

        while (!(str.equals("0")) & (count < totalToys) & count >= 1) {
            System.out.println("Введите + для получения приза \n" +
                    "Введите 0 для выхода из программы");
            str = scaner.next();

            if (!(str.equals("0"))) {
                System.out.println("Ура!!!Вы получили приз:");
                System.out.println(shop.getPrize().getName());
            }
            count--;
        }
        totalToys = shop.totalQuntity();
        System.out.println("В магазине осталось всего игрушек:"+totalToys);
        System.out.println("Досвидания!!!");
    }
}
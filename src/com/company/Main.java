package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner sc= new Scanner(System.in);
        String namePlayer = sc.nextLine();
        System.out.println("Здравствуй, " + namePlayer + " ,готов сыграть в мою игру?");
        System.out.println("Выбери во что играем? : угадайка, массив или собачки");
        Scanner cs = new Scanner(System.in);
        String question = cs.nextLine();
        if(question.equals("угадайка" )) {
            System.out.println("Я загадал число от 1 до 10, как думаешь какое?");
            int x = 11;
            while (Game(x) == false) {
                System.out.println("Давай))");
                Scanner ws = new Scanner(System.in);
                x = ws.nextInt();
                Game(x);
            }
        }
        if(question.equals("массив" )) {
            System.out.println("Напиши пять чисел в произвольном порядке от 1 до 10");
            int[] g = new int[5];
            for (int i = 0; i < 5; i++) {
                int k = i;
                k += 1;
                System.out.println(k + " число: ");
                Scanner n = new Scanner(System.in);
                g[i] = n.nextInt();
            }
            for (int i = 0; i < 5; i++) {
                System.out.print(g[i] + " ");
            }
            System.out.println(" - магия!");
        }
        if(question.equals("собачки" )) {
            Dog bob = new Dog();
            bob.name = "Bob";
            bob.weight = 12;
            Dog bil = new Dog();
            bil.name = "Bil";
            bil.weight = 5;
            System.out.println("Кличка: " + bob.name +" Вес :" + bob.weight);
            System.out.println(bob.feed());


        }
    }
    public static boolean Game(int x) {
        Boolean cool = false;
        int rand = (int) (Math.random() * 10);
        if(rand == x){
            cool = true;
        }
        return cool;
    }
}

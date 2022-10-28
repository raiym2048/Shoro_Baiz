package models;

import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Salesman {
    public static void salesmanLog(){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("a");
        loginArrayList.add("b");
        passwordArrayList.add("1");
        passwordArrayList.add("2");


        do {
            System.out.print("Введите логин: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Введите пароль: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("Salesman, вы успешно вошли!");
                salesmanActions();
                break;
            } else {
                System.out.println("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
            }
        } while (true);
    }
    public static void salesmanActions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("(1)Показать весь список товаров для продажи");
        System.out.println("(2)Искать товар");
        System.out.println("(3)Показать отчет по продаже");
        System.out.println("(4)Сделать заказ отсутствующего товара");
        System.out.println("(5)Удалить заказ");
        System.out.println("(0)Выход");
        do {
            System.out.print("Ваш выбор: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction) {
                case "action1":
                case "Action1":
                case "1":
                    System.out.println("Действие 1");
                    action1();
                    salesmanActions();
                    break;
                case "action2":
                case "Action2":
                case "2":
                    System.out.println("Действие 2");
                    action2();
                    salesmanActions();
                    break;
                case "action3":
                case "Action3":
                case "3":
                    System.out.println("Действие 3");
                    action3();
                    salesmanActions();
                    break;
                case "action4":
                case "Action4":
                case "4":
                    System.out.println("Действие 4");
                    action4();
                    salesmanActions();
                    break;
                case "action5":
                case "Action5":
                case "5":
                    System.out.println("Действие 5");
                    action5();
                    salesmanActions();
                    break;
                default:
                    System.out.println("Такого действия нет в программе!");
                    salesmanActions();
                    break;
                case "n":
                    try {
                        Run main1 = new Run();
                    main1.chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Выход");
                    break;
            }
            break;
        } while (true);
    }
    public static void action1() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\raiym\\IdeaProjects\\Shoro\\src\\dos.txt"));
            while (br.ready()) {
                System.out.print(br.readLine() + " ");
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action2() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\raiym\\IdeaProjects\\Shoro\\src\\dos.txt"));
            int count = 0;
            while (br.ready()) {
                br.readLine();
                count++;
            }
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\raiym\\IdeaProjects\\Shoro\\src\\dos.txt"));
            int count1 = 0;
            while (br1.ready()) {
                br1.readLine();
                count1++;
            }
            System.out.println("Всего товаров = " + (int) (count + count1));
            br1.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action3() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
            HashMap<String, Integer> d = new HashMap<>();
            while (br.ready()) {
                String line = br.readLine();
                if (d.containsKey(line)) {
                    d.put(line, (int) (d.get(line) + 1));
                } else {
                    d.put(line, 1);
                }
            }

            System.out.println(d);
            String s = "dsd";
            int m = 0;
            for (String i : d.keySet()) {
                if (d.get(i) > m) {
                    m = d.get(i);
                    s = i;
                }
            }
            System.out.println("" + s);
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action4() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
            HashMap<String, Integer> d = new HashMap<>();
            while (br.ready()) {
                String line = br.readLine();
                if (d.containsKey(line)) {
                    d.put(line, (int) (d.get(line) + 1));
                } else {
                    d.put(line, 1);
                }
            }
            System.out.println(d);
            String s = "dsd";
            int m = 100;
            for (String i : d.keySet()) {
                if (d.get(i) < m) {
                    m = d.get(i);
                    s = i;
                }
            }
            System.out.println(":"+ s);
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action5() {
        //
    }
}

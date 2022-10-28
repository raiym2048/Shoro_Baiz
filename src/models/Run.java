package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static models.Delivery.deliveryLog;
import static models.Provider.providerLog;
import static models.Salesman.salesmanActions;
import static models.Salesman.salesmanLog;

public class Run {
    public static void main(String[] args) {
        try {
            chooseUsers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static String chooseUsers() throws IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("Для запуска программы, пожалуйста введите тип аккаунта: >>>");
            System.out.println("1) salesman");
            System.out.println("2) delivery");
            System.out.println("3) provider");
            do {
                System.out.print("Ваш выбор: ");
                String choose = sc.nextLine();
                switch (choose) {
                    case "saleman":
                    case "salesman":
                    case "1":
                        System.out.println("WellCome salesman!");
                        System.out.println("Введите логин и пароль");
                        salesmanLog();
                        break;
                    case "delivery":
                    case "2":
                        System.out.println("WellCome delivery!");
                        System.out.println("Введите логин и пароль");
                        providerLog();
                        break;
                    case "provider":
                    case "3":
                        System.out.println("WellCome provider!");
                        System.out.println("Введите логин и пароль");
                        deliveryLog();
                        break;
                    default:
                        System.out.println("Hu ur u???");
                        System.out.print("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
                        System.out.println("0 reload \n 1 exit");
                        int ex = sc.nextInt();
                        if (ex == 0){
                            chooseUsers();
                        }
                        else if(ex == 1){
                            System.exit(0);
                        }
                }
                break;
            } while (true);
            return "";
    }






}
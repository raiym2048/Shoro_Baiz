package models;

import java.util.ArrayList;
import java.util.Scanner;

import static models.Salesman.salesmanActions;

public class Delivery {
    public static void deliveryLog(){
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
                System.out.println("Deliver, вы успешно вошли!");
                salesmanActions();
                break;
            } else {
                System.out.println("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
            }
        } while (true);
    }
}

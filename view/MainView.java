package view;

import java.util.Scanner;

import models.User;

public class MainView {

    public void Show() {
        authorize();
    }

    public int showAdminMenu() {
        System.out.println("1 - Добавить фильм");
        System.out.println("2 - Редактировать описание");
        System.out.println("3 - Удалить фильм");
        System.out.println("4 - Проверить заявки на аренду");

        Scanner sc = new Scanner(System.in, "ibm866");
        var num = sc.nextInt();
        // sc.close();
        return num;
    }

    public int showUserMenu() {
        System.out.println("1 - Подать заявку на фильм");
        System.out.println("2 - Вернуть фильм");
        
        Scanner sc = new Scanner(System.in, "ibm866");
        var num = sc.nextInt();
        // sc.close();
        return num;
    }
        
    public String authorize() {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in, "ibm866");
        var name = sc.nextLine();
        // sc.close();
        return name;
    }
}

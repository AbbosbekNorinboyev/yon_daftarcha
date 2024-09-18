package uz.pdp.java1;

import java.util.Scanner;

public class Main {
    private static String pinCode = "12345";

    public static void main(String[] args) {
        mainController();
    }

    public static void mainController() {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        System.out.print("Pin codeni kiriting: ");
        String pin = scanner.nextLine();
        if (pin.equals(pinCode)) {
            boolean b = true;
            while (b) {
                System.out.println("Amallardan birini tanlang: ");
                System.out.println("1 => Create");
                System.out.println("2 => Malumotlarni olish");
                System.out.println("3 => Malumotlarni yangilash");
                System.out.println("4 => O'chirish");
                System.out.println("5 => Chiqish");
                int a = scanner.nextInt();
                switch (a) {
                    case 1:
                        userService.create();
                        break;
                    case 2:
                        userService.get();
                        break;
                    case 3:
                        userService.update();
                        break;
                    case 4:
                        userService.delete();
                        break;
                    case 5:
                        b = false;
                        break;
                    default:
                        System.out.println("Mavjud amalni tanlang");
                }
            }
        } else {
            System.out.println("PinCode not found");
        }
    }
}

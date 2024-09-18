package uz.pdp.java1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    private List<User> users;
    private Integer index = 1;

    public UserService() {
        this.users = new ArrayList<>();
        this.index = 0;
    }

    public void create() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("Ism kiriting: ");
        String name = scanner.nextLine();
        System.out.print("Familiya kiriting: ");
        String surname = scanner.nextLine();
        System.out.print("Password kiriting: ");
        String password = scanner.nextLine();
        System.out.print("Tug'ilgan sanani kiriting: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Telefon raqamini kiriting: ");
        String phoneNumber = scanner.nextLine();
        user.setName(name);
        user.setSurname(surname);
        user.setPassword(password);
        user.setDateOfBirth(dateOfBirth);
        user.setPhoneNumber(phoneNumber);
        user.setId(++index);
        this.users.add(user);
        System.out.println("User created");
    }

    public void get() {
        for (User getUser : this.users) {
            System.out.println(getUser.toString());
        }
        System.out.println();
    }

    public void update() {
        Scanner scanner = new Scanner(System.in);
        get();
        System.out.print("Qaysi idli malumotni yangilamoqchisiz: ");
        int id = scanner.nextInt();
        for (User updateUser : this.users) {
            if (updateUser.getId().equals(id)) {
                scanner = new Scanner(System.in);
                System.out.print("Ism kiriting: ");
                updateUser.setName(scanner.nextLine());
                System.out.print("Familiya kiriting: ");
                updateUser.setSurname(scanner.nextLine());
                System.out.print("Password kiriting: ");
                updateUser.setPassword(scanner.nextLine());
                System.out.print("Tug'ilgan sanani kiriting: ");
                updateUser.setDateOfBirth(scanner.nextLine());
                System.out.print("Telefon raqamini kiriting: ");
                updateUser.setPhoneNumber(scanner.nextLine());
                System.out.println("========== Update dan keyingi holat ==========");
                System.out.println(updateUser.toString());
            }
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        get();
        System.out.print("Qaysi idli malumotni o'chirmoqchisiz: ");
        int id = scanner.nextInt();
        this.users.removeIf(deleteUser -> deleteUser.getId().equals(id));
        if (this.users.size() != 0) {
            System.out.println("User delete");
        } else {
            System.out.println("List bo'sh");
        }
    }
}

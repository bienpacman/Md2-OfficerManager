import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true) {
            System.out.println("_______APPLICATION MANAGER OFFICER__________");
            System.out.println("1. Insert Officer");
            System.out.println("2. Search officer by name :");
            System.out.println("3. Show information officers");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter a: Insert Engineer");
                    System.out.println("Enter b: Insert Worker");
                    System.out.println("Enter c: Insert Staff");
                    scanner.nextLine();
                    String type = scanner.nextLine();

                    switch (type) {
                        case "a": {
                            System.out.println("Enter name:");
                            String name = scanner.nextLine();
                            System.out.println("Enter age:");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter gender: ");
                            String gender = scanner.nextLine();
                            System.out.println("Enter address:");
                            String address = scanner.nextLine();
                            System.out.println("Nhập branch :");
                            String branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            managerOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;
                        }
                        case "b": {
                            System.out.println("Enter name:");
                            String name = scanner.nextLine();
                            System.out.println("Enter age:");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter gender: ");
                            String gender = scanner.nextLine();
                            System.out.println("Enter address:");
                            String address = scanner.nextLine();
                            System.out.println("Nhập level :");
                            int level = Integer.parseInt(scanner.nextLine());
                            Officer worker = new Worker(name, age, gender, address, level);
                            managerOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                            break;

                        }
                        case "c": {
                            System.out.println("Enter name:");
                            String name = scanner.nextLine();
                            System.out.println("Enter age:");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.println("Enter gender: ");
                            String gender = scanner.nextLine();
                            System.out.println("Enter address:");
                            String address = scanner.nextLine();
                            System.out.println("Enter task :");
                            String task = scanner.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            managerOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Search name :");
                    String name = scanner.nextLine();
                    managerOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case 3: {
                    managerOfficer.showListInFOrOfficer();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("Invalid");


            }

        }
    }
}

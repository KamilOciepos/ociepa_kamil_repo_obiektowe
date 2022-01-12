import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<UserData> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            Menu.menu();
            choice = sc.nextInt();
            if (choice == 1) {
                list.add(AddData.addData());
            } else if (choice == 2) {
                ShowData.show(list);
                SaveFile.saveData(list);
            } else if (choice == 3) {
                ModifyData.modifyData(list);
            } else if (choice == 4) {
                DeleteData.deleteData(list);
            }
        }
    }
}
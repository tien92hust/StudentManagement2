package Test;

import ConnData.ConnJDBC;
import View.LoginView;
import View.StudentManagementView;

public class Test {
    public static void main(String[] args) {
        try {
            new LoginView();
//            new StudentManagementView();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

package application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import account.app.Controller;

public class App {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("account")) {
            Controller controller = context.getBean("controller", Controller.class);
            System.out.println(controller.createNewAccount());
        }
    }

}

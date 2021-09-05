package application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import account.ContextConfig;
import account.app.Controller;

public class App {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class)) {
            Controller controller = context.getBean("controller", Controller.class);
            System.out.println(controller.createNewAccount());
        }
    }

}

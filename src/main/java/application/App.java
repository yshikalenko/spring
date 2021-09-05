package application;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import account.app.Controller;

public class App {

    public static void main(String[] args) {
        try (AbstractXmlApplicationContext context = new FileSystemXmlApplicationContext("context/applicationContext.xml")) {
            Controller controller = context.getBean("controller", Controller.class);
            System.out.println(controller.createNewAccount());
        }
    }

}

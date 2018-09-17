package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Shape shape1 = (Shape) context.getBean("square1");
        shape1.draw();

        Shape shape2 = (Shape) context.getBean("triangle1");
        shape2.draw();

        Shape shape3 = (Shape) context.getBean("square2");
        shape3.draw();

        Shape shape4 = (Shape) context.getBean("triangle2");
        shape4.draw();
    }
}

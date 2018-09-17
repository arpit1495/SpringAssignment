package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Square implements Shape {

    private Color color;

    @Autowired
    @Qualifier("green")
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Square drawn");
        System.out.println(color.fill() + " in square.");
    }
}

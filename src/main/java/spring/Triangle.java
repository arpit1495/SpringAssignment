package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle implements Shape {

    private Color color;

    @Autowired
    @Qualifier("red")
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Triangle Drawn");
        System.out.println(color.fill() + " in triangle.");
    }
}

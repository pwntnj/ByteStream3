/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;

/**
 *
 * @author Student
 */
public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator circledecorator = new RedShapeDecorator(circle);
        circledecorator.draw();
        
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator rectangleDecorator = new RedShapeDecorator(rectangle);
        rectangleDecorator.draw();
    }
}

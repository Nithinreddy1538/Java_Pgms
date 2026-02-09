import java.lang.Math;

abstract class Shape {
int dim1, dim2;
Shape(int a, int b)  //Constructor
{
dim1 = a;
dim2 = b;
}
abstract void printArea(); // abstract method
}
class Rectangle extends Shape {
Rectangle(int length, int breadth) {
super(length, breadth);
}
void printArea() {
int area = dim1 * dim2;
System.out.println("Area of Rectangle: " + area);
}
}

class Triangle extends Shape {
Triangle(int base, int height) {
super(base, height);
}
void printArea() {
double area = 0.5 * dim1 * dim2;
System.out.println("Area of Triangle: " + area);
}
}

class Circle extends Shape {
Circle(int radius) {
super(radius, 0); // dim2 not used
}
void printArea() {
double area = Math.PI * dim1 * dim1;
System.out.println("Area of Circle: " + area);
}
}
class ShapeTest {
public static void main(String[] args) {
Rectangle rect = new Rectangle(10, 5);
Triangle tri = new Triangle(8, 6);
Circle cir = new Circle(7);
rect.printArea();
tri.printArea();
cir.printArea();
}
}

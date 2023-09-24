package Project2;
/*
* Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
* */
public interface Shape {
        void calculateArea();
        void calculatePerimeter();
}
class Circle implements Shape{
        int r=0;
        double pi = 3.14, area, perimeter;
        @Override
        public void calculateArea() {
               area = pi*r*r;
                System.out.println(area);
        }
        @Override
        public void calculatePerimeter() {
                perimeter = 2*pi*r;
                System.out.println(perimeter);
        }
}
class Square implements Shape{
        double pi = 3.14, area, perimeter, a;
        int s;
        @Override
        public void calculateArea() {
                area = s*s;
                System.out.println(area);
        }
        @Override
        public void calculatePerimeter() {
            perimeter =4*a;
                System.out.println(perimeter);
        }
}
class ShapeTester{
        public static void main(String[] args) {
                Shape [] s = {new Circle(), new Square()};
                for(Shape arr:s){
                        arr.calculateArea();
                        arr.calculatePerimeter();
                }
        }
}
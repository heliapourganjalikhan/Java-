public class Circle extends Shape {
    Double radius;
    
    // following are two constructors 
    public Circle(){};
    public Circle(Color color, Pattern pattern, double radius){
        super(color, pattern);
        this.radius = radius;
    }

   
    @Override
    public String toString() {
        return "Circle[color:"+color+", pattern:"+pattern+", radius:"+radius+"]";

}
    // it is not an override of the equals() method in Object class!!!
    public boolean equals(Circle obj) {
    
       // if th object is compared with itself then compare true
        if (this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(color != obj.color){
            return false;
        }
        if(pattern != obj.pattern){
            return false;
        }

        /*if(this.radius != obj.radius){
            return false;
        }*/
        // Remember! we cannot compare two doubles like above!!!

        return Double.compare(this.radius, obj.radius) == 0;
    }

    public static void main(String[] args){
        Circle circle1 = new Circle(Color.Blue, Pattern.DOTTED, 10);
        Circle circle2 = new Circle(Color.Red, Pattern.DOTTED, 10);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle1.equals(circle2));
    }
}
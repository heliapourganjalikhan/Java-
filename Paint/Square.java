

public class Square extends Shape {
    Integer length;

    // following are two constructors 
    public Square(){};
    public Square(Color color, Pattern pattern, int length){
        super(color, pattern);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square[color:"+color+", pattern:"+pattern+", length:"+length+"]";

    }

    // it is not an override of the equals() method in Object class!!!
    public boolean equals(Square obj) {
    
       // if th object is compared with itself then compare true
       /* if (this == obj){
            return true;
        }*/
        if(obj == null){
            return false;
        }
        if(color != obj.color){
            return false;
        }
        if(pattern != obj.pattern){
            return false;
        }
        if(this.length != obj.length){
            return false;
        }


        return true;
    }

    public static void main(String[] args){
       Square square1 = new Square(Color.Blue, Pattern.DOTTED, 10);
       Square square2 = new Square(Color.Blue, Pattern.DOTTED, 10);
        System.out.println(square1);
        System.out.println(square1.equals(square2));
    }

   
}
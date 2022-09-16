public class Shape{ 
    Color color;
    Pattern pattern;

    //constructor
    public Shape(){};
    public Shape(Color color, Pattern pattern){
        this.color = color;
        this.pattern = pattern;
    }

enum Color{
    Blue, Green, Red
}

enum Pattern{
    DOTTED, STRIPED, ZIGZAG
}



}
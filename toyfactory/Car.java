public class Car extends Toy {

    //constructor 
    public Car(double basePrice, ToySize size){
        //invoking immediate parent constructor
        super(basePrice, size);
    }

    //overrding getPrice method for child class
    public double getPrice(){
        switch(size){
            case SMALL: 
                return (this.getBasePrice() * 2);
                

            case MEDIUM:
                return (this.getBasePrice() * 2.5);
                

            case LARGE:
                return (this.getBasePrice() * 3);
                
            default:
                System.out.println("invalide size!");
                return -1;

        }
    }

    public static void main(String[] args){
        Car car = new Car(20000, ToySize.MEDIUM);
        System.out.println(car.getPrice());
        System.out.println(car.getPrice(20));
    }
    
}
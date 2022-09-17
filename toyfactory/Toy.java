enum ToySize{
    SMALL, MEDIUM, LARGE
}

public class Toy{
    private  double basePrice;
    protected ToySize size;

    //constructor
    public Toy(double basePrice, ToySize size) {
        this.basePrice = basePrice;
        this.size = size;
    }

    
    public double getPrice(){
        switch(size){
            case SMALL: 
                return basePrice;
                

            case MEDIUM:
                return (basePrice * 1.5);
                

            case LARGE:
                return (basePrice * 2);
                
            default:
                System.out.println("invalide size!");
                return -1;

        }
    }

    public double getPrice(double discount){
        double dis = ((this.getPrice() * discount)/100);
        return (this.getPrice() - dis);
    }

    public double getBasePrice(){
        return basePrice;
    }
}
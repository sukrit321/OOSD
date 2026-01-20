public abstract class Coffee
{
    private String name;
    private double basePrice;
    
    public Coffee(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return basePrice;
    }
    
    public String toString(){
        return "ชื่อเมนู : " + name + " ราคา : " + basePrice; 
    }
}
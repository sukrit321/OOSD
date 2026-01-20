public class IcedCoffee extends Coffee implements Discountable
{
    public IcedCoffee(String name, double basePrice){
        super(name, basePrice);
    }
    
    @Override
    public double getPrice(){
        return calculateDiscount();
    }
    
    @Override
    public double calculateDiscount(){
        return (super.getPrice() + 10) * 0.90;
    }
    
    @Override
    public String toString(){
        // เพิ่มคำว่า (เมนูเย็น) เข้าไป เพื่อให้เห็นความต่าง
        return "ชื่อเมนู : " + getName() + " ราคา : " + calculateDiscount();
    }
}
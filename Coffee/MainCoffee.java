import java.util.ArrayList;

public class MainCoffee
{
    public static void main(String[] args){
        ArrayList<Coffee> coffees = new ArrayList<>();
        
        coffees.add(new HotCoffee("ลาเต้ร้อน", 50));
        coffees.add(new HotCoffee("อเมริกาโนร้อน", 55));
        coffees.add(new IcedCoffee("ลาเต้เย็น", 50));
        coffees.add(new IcedCoffee("อเมริกาโนเย็น", 50));
        
        double sumPrice = 0;
        
        
        for(Coffee c : coffees){
            System.out.println(c.toString());
            sumPrice += c.getPrice();
        }
        System.out.println("รวมรายการทั้งหมด : " + coffees.size() + " ราคาสุทธิ : " + sumPrice);
    }
}
import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Collections.sort;

public class Control1{
    public static void addProduct(ArrayList<Product> list, Product product){
        list.add(product);
    }
    public static void setProductById(ArrayList<Product> list,int id,String name,double price){
        for (Product p:list
             ) {
           if( p.getId()==id){
               p.setName(name);
               p.setPrice(price);
               break;
           }
        }
    }
    public static void removeProductById(ArrayList<Product> list,int id){
        for (Product p:list
        ) {
            if( p.getId()==id){
                list.remove(p);
                break;
            }
        }
    }
    public static void displayProducts(ArrayList<Product> list){
        for (Product p:list
        ) {
            System.out.println(p);
        }
    }
    public static Product getProductByName(ArrayList<Product> list,String name){
        for (Product p:list
        ) {
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
    public static void sortByPriceUp(ArrayList<Product> list){
        Comparator<Product> byPriceUp = new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrice()-o2.getPrice());
            }
        };
        sort(list,byPriceUp);
    }
    public static void sortByPriceDown(ArrayList<Product> list){
        Comparator<Product> byPriceUp = new Comparator<>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o2.getPrice()-o1.getPrice());
            }
        };
        sort(list,byPriceUp);
    }
}

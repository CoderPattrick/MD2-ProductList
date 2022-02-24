import java.util.Comparator;
import java.util.LinkedList;
import static java.util.Collections.sort;

public class Control2 {
    public static void addProduct(LinkedList<Product> list,Product product){
        list.add(product);
    }
    public static void setProductById(LinkedList<Product> list,int id,String name,double price){
        for (Product p:list
             ) {
            if(p.getId()==id){
                p.setPrice(price);
                p.setName(name);
                break;
            }
        }
    }
    public static void removeProductById(LinkedList<Product> list,int id) {
        for (Product p : list
        ) {
            if (p.getId() == id) {
                list.remove(p);
                break;
            }
        }
    }
    public static void displayProducts(LinkedList<Product> list){
        for (Product p : list
        ) {
            System.out.println(p);
        }
    }
    public static Product getProductByName(LinkedList<Product> list, String name){
        for (Product p:list
        ) {
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
    public static void sortByPriceUp(LinkedList<Product> list){
        Comparator<Product> byPriceUp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrice()-o2.getPrice());
            }
        };
        sort(list,byPriceUp);
    }
    public static void sortByPriceDown(LinkedList<Product> list){
        Comparator<Product> byPriceUp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o2.getPrice()-o1.getPrice());
            }
        };
        sort(list,byPriceUp);
    }
}

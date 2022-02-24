import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Product p1 = new Product("p1",1,300);
        Product p2 = new Product("p2",2,280);
        Product p3 = new Product("p3",3,150);
        Product p4 = new Product("p4",4,400);
        Control1.addProduct(list,p1);
        Control1.addProduct(list,p2);
        Control1.addProduct(list,p3);
        Control1.addProduct(list,p4);

        Control1.sortByPriceDown(list);
        Control1.displayProducts(list);

        System.out.println("\n");
        Control1.sortByPriceUp(list);
        Control1.displayProducts(list);

        System.out.println("\n");
        Control1.setProductById(list,1,"Product1",400);
        Control1.displayProducts(list);

        System.out.println("\n");
        Control1.removeProductById(list,1);
        Control1.displayProducts(list);

        System.out.println("\n");
        Product viewProduct = Control1.getProductByName(list,"p3");
        System.out.println(viewProduct);

    }
}

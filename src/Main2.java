import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Product> list = new LinkedList<>();
        Product p1 = new Product("p1",1,300);
        Product p2 = new Product("p2",2,280);
        Product p3 = new Product("p3",3,150);
        Product p4 = new Product("p4",4,400);
        Control2.addProduct(list,p1);
        Control2.addProduct(list,p2);
        Control2.addProduct(list,p3);
        Control2.addProduct(list,p4);

        Control2.sortByPriceDown(list);
        Control2.displayProducts(list);

        System.out.println("\n");
        Control2.sortByPriceUp(list);
        Control2.displayProducts(list);

        System.out.println("\n");
        Control2.setProductById(list,1,"Product1",400);
        Control2.displayProducts(list);

        System.out.println("\n");
        Control2.removeProductById(list,1);
        Control2.displayProducts(list);

        System.out.println("\n");
        Product viewProduct = Control2.getProductByName(list,"p3");
        System.out.println(viewProduct);

    }
}

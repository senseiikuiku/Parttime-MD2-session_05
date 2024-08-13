package ra.product;

import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        this.id = sc.nextLine();
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập giá: ");
        this.price = sc.nextDouble();
        System.out.print("Nhập sô lượng: ");
        this.quantity = sc.nextInt();
    }

    public void outputData() {
        System.out.print("Mã sản phẩm: " + this.id);
        System.out.println();
        System.out.print("Tên sản phẩm: " + this.name);
        System.out.println();
        System.out.print("Giá sản phẩm: " + this.price);
        System.out.println();
        System.out.print("Số lượng: " + this.quantity);
        System.out.println();


    }
}

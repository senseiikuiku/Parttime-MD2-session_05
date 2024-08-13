package ra.enity;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String name;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book() {

    }

    public Book(int bookId,String name, float importPrice, float exportPrice, String author, float interest, int year) {
        this.bookId = bookId;
        this.name = name;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        if (exportPrice >= this.importPrice * 1.3) {
            this.exportPrice = exportPrice;
        } else {
            System.out.println("Giá xuất phải lớn hơn ít nhất 30% so với giá nhập. Giá xuất sẽ được tự động đặt bằng giá nhập cộng 30%.");
            this.exportPrice = this.importPrice * 1.3f;
        }
    }


    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên sách: ");
        this.name = sc.nextLine();
        System.out.print("Giá nhập: ");
        this.importPrice = Float.parseFloat(sc.nextLine());
        System.out.print("Giá xuất: ");
        float exportPriceInput = Float.parseFloat(sc.nextLine());
        setExportPrice(exportPriceInput);
        System.out.print("Tác giả: ");
        this.author = sc.nextLine();
        System.out.print("Xuất bản: ");
        this.year = Integer.parseInt(sc.nextLine());
    }

    public void outputData() {
        System.out.print("Mã sách: " + this.bookId + "\n");
        System.out.print("Tên sách: " + this.name + "\n");
        System.out.print("Giá nhập: " + this.importPrice + "\n");
        System.out.print("Giá xuất: " + getExportPrice() + "\n");
        System.out.print("Tác giả: " + this.author + "\n");
        System.out.print("Xuất bản: " + this.year + "\n");
    }

    public void calculateInterest() {
        this.interest = this.exportPrice - this.importPrice;
        System.out.println("\nLợi nhuận sách " + this.author + " là: " + this.interest);
    }
}

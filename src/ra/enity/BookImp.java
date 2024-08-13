package ra.enity;

import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class BookImp {
    public static void main(String[] args) {
        List<Book> listBooks = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);
        int bookId = 1;
        boolean flag = false;
        do {
            System.out.println("\n========Menu=========");
            System.out.println("1. Nhập thông tin n sách");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp theo giá bán tăng dần");
            System.out.println("5. Sắp xếp theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên");
            System.out.println("7. Thống kê số lượng sách theo năm tác giả");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. Xóa sách theo Id");
            System.out.println("10. Thoát chương trình");
            System.out.print("\nNhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("\nNhập thông tin sách");
                    System.out.print("Nhập số lượng sách: " + "\n");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 1; i <= n; i++) {
                        Book book = new Book();
                        book.setBookId(bookId++);
                        book.inputData();
                        listBooks.add(book);
                        System.out.println(i < n ? "---------" : "");
                    }
                    break;
                case 2:
                    System.out.println("\n Lợi nhuận của các sách");
                    for (Book b : listBooks) {
                        b.calculateInterest();
                    }
                    break;
                case 3:
                    System.out.println("\n======Thông tin sách=======");
                    for (int i = 0; i < listBooks.size(); i++) {
                        listBooks.get(i).outputData();
                        System.out.println(i < listBooks.size() - 1 ? "-----------" : "");
                    }
                    break;
                case 4:
                    Collections.sort(listBooks, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return Float.compare(o1.getExportPrice(), o2.getExportPrice());
                        }
                    });
                    System.out.println("Danh sách sắp xếp giá bán tăng dần");
                    for (int i = 0; i < listBooks.size(); i++) {
                        listBooks.get(i).outputData();
                        System.out.println(i < listBooks.size() - 1 ? "----------" : "");
                    }
                    break;
                case 5:
                    Collections.sort(listBooks, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return Float.compare(o2.getInterest(), o1.getInterest());
                        }
                    });
                    System.out.println("Danh sách sắp xếp giá lợi thuận giảm dần");
                    for (int i = 0; i < listBooks.size(); i++) {
                        listBooks.get(i).outputData();
                        listBooks.get(i).calculateInterest();
                        System.out.println(i < listBooks.size() - 1 ? "----------" : "");
                    }
                    break;
                case 6:
                    System.out.print("\nNhập tên sách: ");
                    String name = sc.nextLine();
                    boolean check = false;
                    for (Book b : listBooks) {
                        if (name.equals(b.getName())) {
                            System.out.println("Đây là sách của " + b.getName());
                            b.outputData();
                            check = true;
                        }
                    }
                    if (!check) {
                        System.out.println("\nKhông có sách như vậy!");
                    }
                    break;
                case 7:
                    System.out.print("\nThống kê vào năm: ");
                    int year = Integer.parseInt(sc.nextLine());
                    int count1 = 0;
                    for (Book b : listBooks) {
                        if (year == b.getYear()) {
                            b.outputData();
                            count1++;
                        }
                    }
                    if (count1 > 0) {
                        System.out.println("\nTổng số sách là: " + count1);
                    } else {

                        System.out.println("\n Không có sách vào năm " + year);
                    }
                    break;
                case 8:
                    System.out.print("\nThống kê tên tác giả: ");
                    String author = sc.nextLine();
                    int count2 = 0;
                    for (Book b : listBooks) {
                        if (b.getAuthor().equals(author)) {
                            b.outputData();
                            count2++;
                        }
                    }
                    if (count2 > 0) {
                        System.out.println("\nTổng số sách là: " + count2);
                    } else {

                        System.out.println("\n Không có sách của tác giả " + author);
                    }
                    break;
                case 9:
                    System.out.print("\nNhập Id cần xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    boolean check2 = false;
                    for (Book b : listBooks) {
                        if (b.getBookId() == id) {
                            listBooks.remove(b);
                            check2 = true;
                            System.out.println("Đã xóa thành công");
                        }
                    }
                    if (!check2) {
                        System.out.println("\nKhông có Id sách đấy!");
                    }
                    break;
                case 10:
                    flag = true;
                    System.out.println("Đã thoát chương trình!");
                    break;
                default:
                    System.out.println("Nhập không hợp lệ. Vui lòng nhập lại!");
            }
        } while (!flag);

    }
}

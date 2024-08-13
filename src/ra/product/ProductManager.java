package ra.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<Product>();

        boolean flag = false;
        do {
            System.out.println("\n=============Menu=============");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Thoát chương trình");
            System.out.print("\nNhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Product product = new Product();
                    product.inputData();
                    listProduct.add(product);
                    break;
                case 2:
                    System.out.println("\n======Thông tin sản phẩm=======");
//                    for (Product p : listProduct) {
//                        p.outputData();
//                        System.out.println("-------");
//                    }
                    for (int i = 0; i < listProduct.size(); i++) {
                        listProduct.get(i).outputData();
                        System.out.println(i < listProduct.size() - 1 ? "-------" : "");
                    }
                    break;
                case 3:
                    System.out.print("Nhập id cần xóa: ");
                    String input = sc.nextLine();
                    boolean check = false;
                    for (Product p : listProduct) {
                        if (p.getId().equals(input)) {
                            System.out.println("\nĐã xóa thành công!");
                            listProduct.remove(p);
                            check = true;
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("\nThông tìm thấy id sản phẩm");
                    }
                    break;
                case 4:
                    flag = true;
                    System.out.println("Đã thoát chương trình!");
                    break;
                default:
                    System.out.println("Nhập không hợp lệ. Vui lòng nhập lại!");
            }

        } while (!flag);
    }
}

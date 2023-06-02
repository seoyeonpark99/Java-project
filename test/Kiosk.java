package Week03.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Kiosk {
    ArrayList<Product> productList = new ArrayList<>();
    ArrayList<Menu> menuList = new ArrayList<>();

    public void kiosk() {

        Menu burger = new Menu("Burger", "앵거스 비프 통상을 다져만든 버거");
        Menu ForzenCustard = new Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림");
        Menu Drinks = new Menu("Drinks", "매장에서 직접 만드는 음료");
        Menu Beer = new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");

        menuList.add(burger);
        menuList.add(ForzenCustard);
        menuList.add(Drinks);
        menuList.add(Beer);

        Product ShackBurger = new Product("ShackBurger", "토마토, 양상추, 쉐소스가 토핑된 치즈버거", 6.9);
        Product SmokeShack = new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        Product ShroomBurger = new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        Product Cheeseburger = new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        Product Hamburger = new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);

        productList.add(ShackBurger);
        productList.add(SmokeShack);
        productList.add(ShroomBurger);
        productList.add(Cheeseburger);
        productList.add(Hamburger);

    }


    public void setNumber() {
        System.out.println("[ SHAKESHACK MENU ]");
        int number = 1;
        for (Menu item : menuList) {
            System.out.print(number + ". ");
            item.output();
            number++;
        }

        System.out.println("\n[ ORDER MENU ]");
        System.out.printf(number + ".%-15s | %s\n", " Order", "장바구니를 확인 후 주문합니다.");
        System.out.printf(number + 1 + ".%-15s | %s\n", " Cancel", "진행중인 주문을 취소합니다.");

        for (int i = 0; i < number; i++) {
            if (i == number) {
                System.out.println(menuList);
            }
        }
    }


}






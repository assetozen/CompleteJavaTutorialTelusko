package com.assegd.demos.designpattern.prototype;

public class BookDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Novelity");
        bs.loadData();

        System.out.println(bs);


        // creating a second object of book
        //BookShop bs1 = (BookShop) bs.clone();//used when using default cloning // BookShop is implementing Cloneable marker interface(with no methods in it) in order to use this protected method
        BookShop bs1 = bs.clone(); // used when using our own cloning method (casting will be removed)
        bs.getBooks().remove(2);
        System.out.println("\nHere bs is updated after cloning its value to bs1 and it is not affecting the bs1 data (Deep cloning)");
        System.out.println(bs);
        bs1.setShopName("A1");
        System.out.println(bs1);

    }

}

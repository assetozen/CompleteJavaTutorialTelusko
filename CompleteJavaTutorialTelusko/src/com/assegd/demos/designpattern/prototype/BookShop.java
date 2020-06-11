package com.assegd.demos.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *  Cloneable: marker interface is implemented inorder to allow clone() to be used
 *      - to really implement the clone() method
 *              - we need to override the method here in our class
 *      - BUT WE NEED TO MAKE SURE THAT IT IS DEEP CLONING
 *              - SHALLOW :- any change (deletion or addition of data in the first object will affect the second one)
 *                      - can be implemented by simply overriding the default clone method
 *              - DEEP .-  both object 1 and 2 will have independent data even if there is a change in object 1 it will not affect object
 *                      - to achieve this, we have to override the clone method by our self
 */
public class BookShop implements Cloneable{
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for (int i = 1; i <= 10; i++) {
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book "+ i);
            getBooks().add(b);
        }
    }

    /** when overriding the default clone() method which uses shallow cloning*/
    /**
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    */

    /** when overriding our own way the clone() method which uses deep cloning*/
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book b : this.getBooks()){
            shop.getBooks().add(b);
        }
        return  shop;
    }


    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}

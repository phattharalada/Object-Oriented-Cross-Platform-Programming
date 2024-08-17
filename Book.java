/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6652300346
 */
public class Book {
// instant vari

    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String namebook, Author author, double price) {
        this.name = namebook;
        this.author = author;
        this.price = price;
    }

    public Book(String namebook, Author author, double price, int qty) {
        this.name = namebook;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return String.format("Book[name=%s,%s,  price=%.2f,qty=%d", name, author, price, qty);
    }
}

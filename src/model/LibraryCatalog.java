/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Farid
 */
public class LibraryCatalog {
    private int catalogId;
    private Book book;

    public LibraryCatalog(int catalogId, Book book) {
        this.catalogId = catalogId;
        this.book = book;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public Book getBook() {
        return book;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    
}

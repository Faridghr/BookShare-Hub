/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Farid
 */
public class User {
    private int userId;
    private String username;
    private String email;
    private String password;
    private List<Book> booksOwned;
    private List<Book> booksBorrowed;


    public User(int userId, String username, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    //booksOwned Add
    public void addBookToOwned(Book book) {
        if (booksOwned == null) {
            booksOwned = new ArrayList<>();
        }
        booksOwned.add(book);
    }
    //booksOwned Remove
    public void removeBookFromOwned(Book book) {
        if (booksOwned != null) {
            booksOwned.remove(book);
        }
    }
    //booksOwned View
    public List<Book> viewOwnedBooks() {
        return booksOwned;
    }
    
    //booksBorrowed Add
    public void addBookToBorrowed(Book book) {
        if (booksBorrowed == null) {
            booksBorrowed = new ArrayList<>();
        }
        booksBorrowed.add(book);
    }
    //booksBorrowed Remove
    public void removeBookFromBorrowed(Book book) {
        if (booksBorrowed != null) {
            booksBorrowed.remove(book);
        }
    }
    //booksBorrowed View
    public List<Book> viewBorrowedBooks() {
        return booksBorrowed;
    }
    
    //Getter and Setter
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Farid
 */
public class LoanRequest {
    private int requestId;
    private int borrowerId;
    private int lenderId;
    private int bookRequestedId;
    private String requestStatus; 
    
    public LoanRequest(int requestId, int borrowerId, int lenderId, int bookRequestedId, String requestStatus) {
        this.requestId = requestId;
        this.borrowerId = borrowerId;
        this.lenderId = lenderId;
        this.bookRequestedId = bookRequestedId;
        this.requestStatus = requestStatus;
    }

    public int getRequestId() {
        return requestId;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public int getLenderId() {
        return lenderId;
    }

    public int getBookRequestedId() {
        return bookRequestedId;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public void setLenderId(int lenderId) {
        this.lenderId = lenderId;
    }

    public void setBookRequestedId(int bookRequestedId) {
        this.bookRequestedId = bookRequestedId;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

}

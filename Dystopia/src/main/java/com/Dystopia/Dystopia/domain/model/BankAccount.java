package com.Dystopia.Dystopia.domain.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "bankAccounts")
public class BankAccount extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String bankName;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

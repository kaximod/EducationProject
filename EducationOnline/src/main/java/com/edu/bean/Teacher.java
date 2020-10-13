package com.edu.bean;

public class Teacher {
    private Long tAccount;
    private String tName;
    private char tSex;
    private int tAge;
    private String tPassword;
    private String tHeadpic;
    private boolean tDelete;

    public Teacher() {
    }

    public Teacher(Long tAccount, String tName, char tSex, int tAge, String tPassword, String tHeadpic, boolean tDelete) {
        this.tAccount = tAccount;
        this.tName = tName;
        this.tSex = tSex;
        this.tAge = tAge;
        this.tPassword = tPassword;
        this.tHeadpic = tHeadpic;
        this.tDelete = tDelete;
    }

    public Long gettAccount() {
        return tAccount;
    }

    public void settAccount(Long tAccount) {
        this.tAccount = tAccount;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public char gettSex() {
        return tSex;
    }

    public void settSex(char tSex) {
        this.tSex = tSex;
    }

    public int gettAge() {
        return tAge;
    }

    public void settAge(int tAge) {
        this.tAge = tAge;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public String gettHeadpic() {
        return tHeadpic;
    }

    public void settHeadpic(String tHeadpic) {
        this.tHeadpic = tHeadpic;
    }

    public boolean istDelete() {
        return tDelete;
    }

    public void settDelete(boolean tDelete) {
        this.tDelete = tDelete;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tAccount=" + tAccount +
                ", tName='" + tName + '\'' +
                ", tSex=" + tSex +
                ", tAge=" + tAge +
                ", tPassword='" + tPassword + '\'' +
                ", tHeadpic='" + tHeadpic + '\'' +
                ", tDelete=" + tDelete +
                '}';
    }
}

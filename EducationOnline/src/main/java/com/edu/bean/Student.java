package com.edu.bean;

public class Student {
    private Long sAccount;
    private String sHeadpic;
    private String sPassword;
    private String sName;
    private char sSex;
    private int sAge;
    private boolean sDelete;

    public Student() {
    }

    public Student(Long sAccount, String sHeadpic, String sPassword, String sName, char sSex, int sAge, boolean sDelete) {
        this.sAccount = sAccount;
        this.sHeadpic = sHeadpic;
        this.sPassword = sPassword;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sDelete = sDelete;
    }

    public Long getsAccount() {
        return sAccount;
    }

    public void setsAccount(Long sAccount) {
        this.sAccount = sAccount;
    }

    public String getsHeadpic() {
        return sHeadpic;
    }

    public void setsHeadpic(String sHeadpic) {
        this.sHeadpic = sHeadpic;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public char getsSex() {
        return sSex;
    }

    public void setsSex(char sSex) {
        this.sSex = sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public boolean issDelete() {
        return sDelete;
    }

    public void setsDelete(boolean sDelete) {
        this.sDelete = sDelete;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sAccount=" + sAccount +
                ", sHeadpic='" + sHeadpic + '\'' +
                ", sPassword='" + sPassword + '\'' +
                ", sName='" + sName + '\'' +
                ", sSex=" + sSex +
                ", sAge=" + sAge +
                ", sDelete=" + sDelete +
                '}';
    }
}

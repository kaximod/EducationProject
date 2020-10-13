package com.edu.bean;

public class Admin {
    private Long aAccount;
    private String aName;
    private String aheadpic;
    private String aPassword;
    private Boolean aDelete;

    public Admin() {
    }

    public Admin(Long aAccount, String aName, String aheadpic, String aPassword, Boolean aDelete) {
        this.aAccount = aAccount;
        this.aName = aName;
        this.aheadpic = aheadpic;
        this.aPassword = aPassword;
        this.aDelete = aDelete;
    }

    public Long getaAccount() {
        return aAccount;
    }

    public void setaAccount(Long aAccount) {
        this.aAccount = aAccount;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getAheadpic() {
        return aheadpic;
    }

    public void setAheadpic(String aheadpic) {
        this.aheadpic = aheadpic;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    public Boolean getaDelete() {
        return aDelete;
    }

    public void setaDelete(Boolean aDelete) {
        this.aDelete = aDelete;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aAccount=" + aAccount +
                ", aName='" + aName + '\'' +
                ", aheadpic='" + aheadpic + '\'' +
                ", aPassword='" + aPassword + '\'' +
                ", aDelete=" + aDelete +
                '}';
    }
}

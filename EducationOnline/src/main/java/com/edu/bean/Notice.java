package com.edu.bean;

public class Notice {
    private Long nId;
    private String nTitle;
    private String nContext;
    private Long nPublisher;
    private String nDate;
    private boolean nDelete;

    public Notice() {
    }

    public Notice(Long nId, String nTitle, String nContext, Long nPublisher, String nDate, boolean nDelete) {
        this.nId = nId;
        this.nTitle = nTitle;
        this.nContext = nContext;
        this.nPublisher = nPublisher;
        this.nDate = nDate;
        this.nDelete = nDelete;
    }

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }

    public String getnContext() {
        return nContext;
    }

    public void setnContext(String nContext) {
        this.nContext = nContext;
    }

    public Long getnPublisher() {
        return nPublisher;
    }

    public void setnPublisher(Long nPublisher) {
        this.nPublisher = nPublisher;
    }

    public String getnDate() {
        return nDate;
    }

    public void setnDate(String nDate) {
        this.nDate = nDate;
    }

    public boolean isnDelete() {
        return nDelete;
    }

    public void setnDelete(boolean nDelete) {
        this.nDelete = nDelete;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "nId=" + nId +
                ", nTitle='" + nTitle + '\'' +
                ", nContext='" + nContext + '\'' +
                ", nPublisher=" + nPublisher +
                ", nDate='" + nDate + '\'' +
                ", nDelete=" + nDelete +
                '}';
    }
}

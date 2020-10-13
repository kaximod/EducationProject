package com.edu.bean;

public class HwRelease {
    private  Long rId;
    private  String rName;
    private  String rAttachment;
    private  Long rPublisher;
    private  String rDeadline;
    private  boolean rDelete;

    public HwRelease() {
    }

    public HwRelease(Long rId, String rName, String rAttachment, Long rPublisher, String rDeadline, boolean rDelete) {
        this.rId = rId;
        this.rName = rName;
        this.rAttachment = rAttachment;
        this.rPublisher = rPublisher;
        this.rDeadline = rDeadline;
        this.rDelete = rDelete;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrAttachment() {
        return rAttachment;
    }

    public void setrAttachment(String rAttachment) {
        this.rAttachment = rAttachment;
    }

    public Long getrPublisher() {
        return rPublisher;
    }

    public void setrPublisher(Long rPublisher) {
        this.rPublisher = rPublisher;
    }

    public String getrDeadline() {
        return rDeadline;
    }

    public void setrDeadline(String rDeadline) {
        this.rDeadline = rDeadline;
    }

    public boolean isrDelete() {
        return rDelete;
    }

    public void setrDelete(boolean rDelete) {
        this.rDelete = rDelete;
    }

    @Override
    public String toString() {
        return "HwRelease{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", rAttachment='" + rAttachment + '\'' +
                ", rPublisher=" + rPublisher +
                ", rDeadline='" + rDeadline + '\'' +
                ", rDelete=" + rDelete +
                '}';
    }
}

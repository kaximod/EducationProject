package com.edu.bean;

public class HwSubmit {
    private  Long id;
    private  String sNo;
    private  String sName;
    private  String hwName;
    private  String hwAttachment;
    private  String deadline;
    private  String review;
    private  int score;
    private  String hwState;
    private  boolean Delete;

    public HwSubmit() {
    }

    public HwSubmit(Long id, String sNo, String sName, String hwName, String hwAttachment, String deadline, String review, int score, String hwState, boolean delete) {
        this.id = id;
        this.sNo = sNo;
        this.sName = sName;
        this.hwName = hwName;
        this.hwAttachment = hwAttachment;
        this.deadline = deadline;
        this.review = review;
        this.score = score;
        this.hwState = hwState;
        Delete = delete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getHwName() {
        return hwName;
    }

    public void setHwName(String hwName) {
        this.hwName = hwName;
    }

    public String getHwAttachment() {
        return hwAttachment;
    }

    public void setHwAttachment(String hwAttachment) {
        this.hwAttachment = hwAttachment;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getHwState() {
        return hwState;
    }

    public void setHwState(String hwState) {
        this.hwState = hwState;
    }

    public boolean isDelete() {
        return Delete;
    }

    public void setDelete(boolean delete) {
        Delete = delete;
    }

    @Override
    public String toString() {
        return "HwSubmit{" +
                "id=" + id +
                ", sNo='" + sNo + '\'' +
                ", sName='" + sName + '\'' +
                ", hwName='" + hwName + '\'' +
                ", hwAttachment='" + hwAttachment + '\'' +
                ", deadline='" + deadline + '\'' +
                ", review='" + review + '\'' +
                ", score=" + score +
                ", hwState='" + hwState + '\'' +
                ", Delete=" + Delete +
                '}';
    }
}

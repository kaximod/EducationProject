package com.edu.bean;

public class Material {
    private Long mId;
    private String mName;
    private String mAttachment;
    private String mIntroduce;
    private String mDate;
    private Long mPublisher;
    private boolean mDelete;

    public Material() {
    }

    public Material(Long mId, String mName, String mAttachment, String mIntroduce, String mDate, Long mPublisher, boolean mDelete) {
        this.mId = mId;
        this.mName = mName;
        this.mAttachment = mAttachment;
        this.mIntroduce = mIntroduce;
        this.mDate = mDate;
        this.mPublisher = mPublisher;
        this.mDelete = mDelete;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAttachment() {
        return mAttachment;
    }

    public void setmAttachment(String mAttachment) {
        this.mAttachment = mAttachment;
    }

    public String getmIntroduce() {
        return mIntroduce;
    }

    public void setmIntroduce(String mIntroduce) {
        this.mIntroduce = mIntroduce;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public Long getmPublisher() {
        return mPublisher;
    }

    public void setmPublisher(Long mPublisher) {
        this.mPublisher = mPublisher;
    }

    public boolean ismDelete() {
        return mDelete;
    }

    public void setmDelete(boolean mDelete) {
        this.mDelete = mDelete;
    }

    @Override
    public String toString() {
        return "Material{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mAttachment='" + mAttachment + '\'' +
                ", mIntroduce='" + mIntroduce + '\'' +
                ", mDate='" + mDate + '\'' +
                ", mPublisher=" + mPublisher +
                ", mDelete=" + mDelete +
                '}';
    }
}

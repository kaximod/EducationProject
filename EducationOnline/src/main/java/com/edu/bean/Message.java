package com.edu.bean;

public class Message {
    private Long mesId;
    private String mesTitle;
    private String mesQuestion;
    private Long mesPublisher;
    private String mesDate;
    private boolean mesDelete;

    public Message() {
    }

    public Message(Long mesId, String mesTitle, String mesQuestion, Long mesPublisher, String mesDate, boolean mesDelete) {
        this.mesId = mesId;
        this.mesTitle = mesTitle;
        this.mesQuestion = mesQuestion;
        this.mesPublisher = mesPublisher;
        this.mesDate = mesDate;
        this.mesDelete = mesDelete;
    }

    public Long getMesId() {
        return mesId;
    }

    public void setMesId(Long mesId) {
        this.mesId = mesId;
    }

    public String getMesTitle() {
        return mesTitle;
    }

    public void setMesTitle(String mesTitle) {
        this.mesTitle = mesTitle;
    }

    public String getMesQuestion() {
        return mesQuestion;
    }

    public void setMesQuestion(String mesQuestion) {
        this.mesQuestion = mesQuestion;
    }

    public Long getMesPublisher() {
        return mesPublisher;
    }

    public void setMesPublisher(Long mesPublisher) {
        this.mesPublisher = mesPublisher;
    }

    public String getMesDate() {
        return mesDate;
    }

    public void setMesDate(String mesDate) {
        this.mesDate = mesDate;
    }

    public boolean isMesDelete() {
        return mesDelete;
    }

    public void setMesDelete(boolean mesDelete) {
        this.mesDelete = mesDelete;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mesId=" + mesId +
                ", mesTitle='" + mesTitle + '\'' +
                ", mesQuestion='" + mesQuestion + '\'' +
                ", mesPublisher=" + mesPublisher +
                ", mesDate='" + mesDate + '\'' +
                ", mesDelete=" + mesDelete +
                '}';
    }
}

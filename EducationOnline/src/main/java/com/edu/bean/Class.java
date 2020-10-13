package com.edu.bean;

public class Class {
    private Long classId;
    private String className;
    private boolean classDelete;

    public Class() {
    }

    public Class(Long classId, String className, boolean classDelete) {
        this.classId = classId;
        this.className = className;
        this.classDelete = classDelete;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean isClassDelete() {
        return classDelete;
    }

    public void setClassDelete(boolean classDelete) {
        this.classDelete = classDelete;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", classDelete=" + classDelete +
                '}';
    }
}

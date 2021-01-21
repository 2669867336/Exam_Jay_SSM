package com.tledu.cn.pojo;

public class Examination {
    private String examinationId;
    private String examinationTitle;
    private String examinationA;
    private String examinationB;
    private String examinationC;
    private String examinationD;
    private String examinationType;//试题类型
    private String examinationAnswer;//试题标准答案
    private String examinationDegree;//试题难度系数
    private String examinationScore;//试题分数
    private String isDelete;
    private String createtime;

    public String getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(String examinationId) {
        this.examinationId = examinationId;
    }

    public String getExaminationTitle() {
        return examinationTitle;
    }

    public void setExaminationTitle(String examinationTitle) {
        this.examinationTitle = examinationTitle;
    }

    public String getExaminationA() {
        return examinationA;
    }

    public void setExaminationA(String examinationA) {
        this.examinationA = examinationA;
    }

    public String getExaminationB() {
        return examinationB;
    }

    public void setExaminationB(String examinationB) {
        this.examinationB = examinationB;
    }

    public String getExaminationC() {
        return examinationC;
    }

    public void setExaminationC(String examinationC) {
        this.examinationC = examinationC;
    }

    public String getExaminationD() {
        return examinationD;
    }

    public void setExaminationD(String examinationD) {
        this.examinationD = examinationD;
    }

    public String getExaminationType() {
        return examinationType;
    }

    public void setExaminationType(String examinationType) {
        this.examinationType = examinationType;
    }

    public String getExaminationAnswer() {
        return examinationAnswer;
    }

    public void setExaminationAnswer(String examinationAnswer) {
        this.examinationAnswer = examinationAnswer;
    }

    public String getExaminationDegree() {
        return examinationDegree;
    }

    public void setExaminationDegree(String examinationDegree) {
        this.examinationDegree = examinationDegree;
    }

    public String getExaminationScore() {
        return examinationScore;
    }

    public void setExaminationScore(String examinationScore) {
        this.examinationScore = examinationScore;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "examinationId='" + examinationId + '\'' +
                ", examinationTitle='" + examinationTitle + '\'' +
                ", examinationA='" + examinationA + '\'' +
                ", examinationB='" + examinationB + '\'' +
                ", examinationC='" + examinationC + '\'' +
                ", examinationD='" + examinationD + '\'' +
                ", examinationType='" + examinationType + '\'' +
                ", examinationAnswer='" + examinationAnswer + '\'' +
                ", examinationDegree='" + examinationDegree + '\'' +
                ", examinationScore='" + examinationScore + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }

    public Examination(String examinationId, String examinationTitle, String examinationA, String examinationB, String examinationC, String examinationD, String examinationType, String examinationAnswer, String examinationDegree, String examinationScore, String isDelete, String createtime) {
        this.examinationId = examinationId;
        this.examinationTitle = examinationTitle;
        this.examinationA = examinationA;
        this.examinationB = examinationB;
        this.examinationC = examinationC;
        this.examinationD = examinationD;
        this.examinationType = examinationType;
        this.examinationAnswer = examinationAnswer;
        this.examinationDegree = examinationDegree;
        this.examinationScore = examinationScore;
        this.isDelete = isDelete;
        this.createtime = createtime;
    }

    public Examination() {
    }
}

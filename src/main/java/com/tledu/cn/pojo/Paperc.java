package com.tledu.cn.pojo;

/**
 * @author sxwstart
 * @create 2021-01-25-11:27:55
 */
public class Paperc {
    private String papercId;
    private String papercTitle;
    private String papercA;
    private String papercB;
    private String papercC;
    private String papercD;
    private String papercType;//试题类型
    private String papercRightanswer;//试题标准答案
    private String papercDegree;//试题难度系数
    private String papercScore;//试题分数
    private String isDelete;
    private String createtime;
    private String paperId;

    @Override
    public String toString() {
        return "Paperc{" +
                "papercId='" + papercId + '\'' +
                ", papercTitle='" + papercTitle + '\'' +
                ", papercA='" + papercA + '\'' +
                ", papercB='" + papercB + '\'' +
                ", papercC='" + papercC + '\'' +
                ", papercD='" + papercD + '\'' +
                ", papercType='" + papercType + '\'' +
                ", papercRightanswer='" + papercRightanswer + '\'' +
                ", papercDegree='" + papercDegree + '\'' +
                ", papercScore='" + papercScore + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", createtime='" + createtime + '\'' +
                ", paperId='" + paperId + '\'' +
                '}';
    }

    public String getPapercId() {
        return papercId;
    }

    public void setPapercId(String papercId) {
        this.papercId = papercId;
    }

    public String getPapercTitle() {
        return papercTitle;
    }

    public void setPapercTitle(String papercTitle) {
        this.papercTitle = papercTitle;
    }

    public String getPapercA() {
        return papercA;
    }

    public void setPapercA(String papercA) {
        this.papercA = papercA;
    }

    public String getPapercB() {
        return papercB;
    }

    public void setPapercB(String papercB) {
        this.papercB = papercB;
    }

    public String getPapercC() {
        return papercC;
    }

    public void setPapercC(String papercC) {
        this.papercC = papercC;
    }

    public String getPapercD() {
        return papercD;
    }

    public void setPapercD(String papercD) {
        this.papercD = papercD;
    }

    public String getPapercType() {
        return papercType;
    }

    public void setPapercType(String papercType) {
        this.papercType = papercType;
    }

    public String getPapercRightanswer() {
        return papercRightanswer;
    }

    public void setPapercRightanswer(String papercRightanswer) {
        this.papercRightanswer = papercRightanswer;
    }

    public String getPapercDegree() {
        return papercDegree;
    }

    public void setPapercDegree(String papercDegree) {
        this.papercDegree = papercDegree;
    }

    public String getPapercScore() {
        return papercScore;
    }

    public void setPapercScore(String papercScore) {
        this.papercScore = papercScore;
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

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public Paperc(String papercId, String papercTitle, String papercA, String papercB, String papercC, String papercD, String papercType, String papercRightanswer, String papercDegree, String papercScore, String isDelete, String createtime, String paperId) {
        this.papercId = papercId;
        this.papercTitle = papercTitle;
        this.papercA = papercA;
        this.papercB = papercB;
        this.papercC = papercC;
        this.papercD = papercD;
        this.papercType = papercType;
        this.papercRightanswer = papercRightanswer;
        this.papercDegree = papercDegree;
        this.papercScore = papercScore;
        this.isDelete = isDelete;
        this.createtime = createtime;
        this.paperId = paperId;
    }

    public Paperc() {
    }
}

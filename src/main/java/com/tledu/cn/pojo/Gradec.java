package com.tledu.cn.pojo;


public class Gradec {
    private String gradecId;
    private String gradecLoginid;
    private String gradecName;
    private String gradecScore;
    private String paperId;
    private String isDelete;
    private String gradecAnswer;
    private String gradecTitle;
    private String gradecOnescore;
    private String gradecAccuracy;
    private String gradecType;
    private String gradecA;
    private String gradecB;
    private String gradecC;
    private String gradecD;
    private String gradecRightanswer;
    private String logincTime;
    private String finishcTime;
    private int currentPage;

    public String getGradecId() {
        return gradecId;
    }

    public void setGradecId(String gradecId) {
        this.gradecId = gradecId;
    }

    public String getGradecLoginid() {
        return gradecLoginid;
    }

    public void setGradecLoginid(String gradecLoginid) {
        this.gradecLoginid = gradecLoginid;
    }

    public String getGradecName() {
        return gradecName;
    }

    public void setGradecName(String gradecName) {
        this.gradecName = gradecName;
    }

    public String getGradecScore() {
        return gradecScore;
    }

    public void setGradecScore(String gradecScore) {
        this.gradecScore = gradecScore;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getGradecAnswer() {
        return gradecAnswer;
    }

    public void setGradecAnswer(String gradecAnswer) {
        this.gradecAnswer = gradecAnswer;
    }

    public String getGradecTitle() {
        return gradecTitle;
    }

    public void setGradecTitle(String gradecTitle) {
        this.gradecTitle = gradecTitle;
    }

    public String getGradecOnescore() {
        return gradecOnescore;
    }

    public void setGradecOnescore(String gradecOnescore) {
        this.gradecOnescore = gradecOnescore;
    }

    public String getGradecAccuracy() {
        return gradecAccuracy;
    }

    public void setGradecAccuracy(String gradecAccuracy) {
        this.gradecAccuracy = gradecAccuracy;
    }

    public String getGradecType() {
        return gradecType;
    }

    public void setGradecType(String gradecType) {
        this.gradecType = gradecType;
    }

    public String getGradecA() {
        return gradecA;
    }

    public void setGradecA(String gradecA) {
        this.gradecA = gradecA;
    }

    public String getGradecB() {
        return gradecB;
    }

    public void setGradecB(String gradecB) {
        this.gradecB = gradecB;
    }

    public String getGradecC() {
        return gradecC;
    }

    public void setGradecC(String gradecC) {
        this.gradecC = gradecC;
    }

    public String getGradecD() {
        return gradecD;
    }

    public void setGradecD(String gradecD) {
        this.gradecD = gradecD;
    }

    public String getGradecRightanswer() {
        return gradecRightanswer;
    }

    public void setGradecRightanswer(String gradecRightanswer) {
        this.gradecRightanswer = gradecRightanswer;
    }

    public String getLogincTime() {
        return logincTime;
    }

    public void setLogincTime(String logincTime) {
        this.logincTime = logincTime;
    }

    public String getFinishcTime() {
        return finishcTime;
    }

    public void setFinishcTime(String finishcTime) {
        this.finishcTime = finishcTime;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "Gradec{" +
                "gradecId='" + gradecId + '\'' +
                ", gradecLoginid='" + gradecLoginid + '\'' +
                ", gradecName='" + gradecName + '\'' +
                ", gradecScore='" + gradecScore + '\'' +
                ", paperId='" + paperId + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", gradecAnswer='" + gradecAnswer + '\'' +
                ", gradecTitle='" + gradecTitle + '\'' +
                ", gradecOnescore='" + gradecOnescore + '\'' +
                ", gradecAccuracy='" + gradecAccuracy + '\'' +
                ", gradecType='" + gradecType + '\'' +
                ", gradecA='" + gradecA + '\'' +
                ", gradecB='" + gradecB + '\'' +
                ", gradecC='" + gradecC + '\'' +
                ", gradecD='" + gradecD + '\'' +
                ", gradecRightanswer='" + gradecRightanswer + '\'' +
                ", logincTime='" + logincTime + '\'' +
                ", finishcTime='" + finishcTime + '\'' +
                ", currentPage=" + currentPage +
                '}';
    }

    public Gradec(String gradecId, String gradecLoginid, String gradecName, String gradecScore, String paperId, String isDelete, String gradecAnswer, String gradecTitle, String gradecOnescore, String gradecAccuracy, String gradecType, String gradecA, String gradecB, String gradecC, String gradecD, String gradecRightanswer, String logincTime, String finishcTime, int currentPage) {
        this.gradecId = gradecId;
        this.gradecLoginid = gradecLoginid;
        this.gradecName = gradecName;
        this.gradecScore = gradecScore;
        this.paperId = paperId;
        this.isDelete = isDelete;
        this.gradecAnswer = gradecAnswer;
        this.gradecTitle = gradecTitle;
        this.gradecOnescore = gradecOnescore;
        this.gradecAccuracy = gradecAccuracy;
        this.gradecType = gradecType;
        this.gradecA = gradecA;
        this.gradecB = gradecB;
        this.gradecC = gradecC;
        this.gradecD = gradecD;
        this.gradecRightanswer = gradecRightanswer;
        this.logincTime = logincTime;
        this.finishcTime = finishcTime;
        this.currentPage = currentPage;
    }

    public Gradec() {
    }
}

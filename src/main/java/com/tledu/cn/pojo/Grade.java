package com.tledu.cn.pojo;

public class Grade {
    private String gradeId;
    private String gradeLoginid;
    private String gradeName;
    private String gradeScore;
    private String gradeAccuracy;
    private String loginTime;
    private String finishTime;
    private String paperId;
    private String isDelete;

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeLoginid() {
        return gradeLoginid;
    }

    public void setGradeLoginid(String gradeLoginid) {
        this.gradeLoginid = gradeLoginid;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeScore() {
        return gradeScore;
    }

    public void setGradeScore(String gradeScore) {
        this.gradeScore = gradeScore;
    }

    public String getGradeAccuracy() {
        return gradeAccuracy;
    }

    public void setGradeAccuracy(String gradeAccuracy) {
        this.gradeAccuracy = gradeAccuracy;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId='" + gradeId + '\'' +
                ", gradeLoginId='" + gradeLoginid + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", gradeScore='" + gradeScore + '\'' +
                ", gradeAccuracy='" + gradeAccuracy + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", finishTime='" + finishTime + '\'' +
                ", paperId='" + paperId + '\'' +
                '}';
    }

    public Grade(String gradeId, String gradeLoginId, String gradeName, String gradeScore, String gradeAccuracy, String loginTime, String finishTime, String paperId) {
        this.gradeId = gradeId;
        this.gradeLoginid = gradeLoginId;
        this.gradeName = gradeName;
        this.gradeScore = gradeScore;
        this.gradeAccuracy = gradeAccuracy;
        this.loginTime = loginTime;
        this.finishTime = finishTime;
        this.paperId = paperId;
    }

    public Grade() {
    }
}

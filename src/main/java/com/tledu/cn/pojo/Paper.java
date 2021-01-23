package com.tledu.cn.pojo;

/**
 * @author sxwstart
 * @create 2021-01-23-10:01:28
 */
public class Paper {
    private String paperId;
    private String paperType;
    private String paperClassify;//试卷分组
    private String paperName;
    private String questionMethod;
    private String paperStatus;
    private String createtime;
    private String isDelete;
    private String url;
    private String paperTime;//考试时长
    private String startTime;//开考时间

    @Override
    public String toString() {
        return "Paper{" +
                "paperId='" + paperId + '\'' +
                ", paperType='" + paperType + '\'' +
                ", paperClassify='" + paperClassify + '\'' +
                ", paperName='" + paperName + '\'' +
                ", questionMethod='" + questionMethod + '\'' +
                ", paperStatus='" + paperStatus + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", url='" + url + '\'' +
                ", paperTime='" + paperTime + '\'' +
                ", startTime='" + startTime + '\'' +
                '}';
    }

    public String getPaperTime() {
        return paperTime;
    }

    public void setPaperTime(String paperTime) {
        this.paperTime = paperTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Paper(String paperId, String paperType, String paperClassify, String paperName, String questionMethod, String paperStatus, String createtime, String isDelete, String url, String paperTime, String startTime) {
        this.paperId = paperId;
        this.paperType = paperType;
        this.paperClassify = paperClassify;
        this.paperName = paperName;
        this.questionMethod = questionMethod;
        this.paperStatus = paperStatus;
        this.createtime = createtime;
        this.isDelete = isDelete;
        this.url = url;
        this.paperTime = paperTime;
        this.startTime = startTime;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getPaperClassify() {
        return paperClassify;
    }

    public void setPaperClassify(String paperClassify) {
        this.paperClassify = paperClassify;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getQuestionMethod() {
        return questionMethod;
    }

    public void setQuestionMethod(String questionMethod) {
        this.questionMethod = questionMethod;
    }

    public String getPaperStatus() {
        return paperStatus;
    }

    public void setPaperStatus(String paperStatus) {
        this.paperStatus = paperStatus;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Paper(String paperId, String paperType, String paperClassify, String paperName, String questionMethod, String paperStatus, String createtime, String isDelete, String url) {
        this.paperId = paperId;
        this.paperType = paperType;
        this.paperClassify = paperClassify;
        this.paperName = paperName;
        this.questionMethod = questionMethod;
        this.paperStatus = paperStatus;
        this.createtime = createtime;
        this.isDelete = isDelete;
        this.url = url;
    }

    public Paper() {
    }
}

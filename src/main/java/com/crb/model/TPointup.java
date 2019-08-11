package com.crb.model;

import java.util.Date;

public class TPointup {
    private Integer pointupId;

    private Integer articleId;

    private String articleType;

    private String pointupType;

    private Long commentUserId;

    private Date commentTime;

    public Integer getPointupId() {
        return pointupId;
    }

    public void setPointupId(Integer pointupId) {
        this.pointupId = pointupId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType == null ? null : articleType.trim();
    }

    public String getPointupType() {
        return pointupType;
    }

    public void setPointupType(String pointupType) {
        this.pointupType = pointupType == null ? null : pointupType.trim();
    }

    public Long getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Long commentUserId) {
        this.commentUserId = commentUserId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
package com.yuzhouwan.log.elastic.analyzer;

import java.util.Date;

/**
 * Copyright @ 2016 zhong-ying Co.Ltd
 * All right reserved.
 * Function：Attack Report
 *
 * @author Benedict Jin
 * @since 2016/3/31 0002
 */
public class AttackReport {

    private String title;
    private String content;
    private Date date;

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
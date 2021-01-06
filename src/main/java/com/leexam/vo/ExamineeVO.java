package com.leexam.vo;

import java.util.Date;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
public class ExamineeVO {

    private Integer start;
    private Integer limit;
    private Date loginTimeStart;
    private Date loginTimeEnd;
    private Date createTimeStart;
    private Date createTimeEnd;
    private Date finishTimeStart;
    private Date finishTimeEnd;

    @Override
    public String toString() {
        return "ExamineeVO{" +
                "start=" + start +
                ", limit=" + limit +
                ", loginTimeStart=" + loginTimeStart +
                ", loginTimeEnd=" + loginTimeEnd +
                ", createTimeStart=" + createTimeStart +
                ", createTimeEnd=" + createTimeEnd +
                ", finishTimeStart=" + finishTimeStart +
                ", finishTimeEnd=" + finishTimeEnd +
                '}';
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Date getLoginTimeStart() {
        return loginTimeStart;
    }

    public void setLoginTimeStart(Date loginTimeStart) {
        this.loginTimeStart = loginTimeStart;
    }

    public Date getLoginTimeEnd() {
        return loginTimeEnd;
    }

    public void setLoginTimeEnd(Date loginTimeEnd) {
        this.loginTimeEnd = loginTimeEnd;
    }

    public Date getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Date createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Date getFinishTimeStart() {
        return finishTimeStart;
    }

    public void setFinishTimeStart(Date finishTimeStart) {
        this.finishTimeStart = finishTimeStart;
    }

    public Date getFinishTimeEnd() {
        return finishTimeEnd;
    }

    public void setFinishTimeEnd(Date finishTimeEnd) {
        this.finishTimeEnd = finishTimeEnd;
    }
}

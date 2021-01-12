package com.leexam.vo;

import java.util.Arrays;

/**
 * @author 窦康泰
 * @date 2021/01/12
 */
public class ExamineeVO2 {

    private Integer[] eeids;
    private Integer status;

    @Override
    public String toString() {
        return "ExamineeVO2{" +
                "eeids=" + Arrays.toString(eeids) +
                ", status=" + status +
                '}';
    }

    public Integer[] getEeids() {
        return eeids;
    }

    public void setEeids(Integer[] eeids) {
        this.eeids = eeids;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

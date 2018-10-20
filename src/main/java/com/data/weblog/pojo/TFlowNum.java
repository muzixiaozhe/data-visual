package com.data.weblog.pojo;

public class TFlowNum {
    private Integer id;

    private String datestr;

    private Integer pvnum;

    private Integer uvnum;

    private Integer ipnum;

    private Integer newuvnum;

    private Integer visitnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatestr() {
        return datestr;
    }

    public void setDatestr(String datestr) {
        this.datestr = datestr == null ? null : datestr.trim();
    }

    public Integer getPvnum() {
        return pvnum;
    }

    public void setPvnum(Integer pvnum) {
        this.pvnum = pvnum;
    }

    public Integer getUvnum() {
        return uvnum;
    }

    public void setUvnum(Integer uvnum) {
        this.uvnum = uvnum;
    }

    public Integer getIpnum() {
        return ipnum;
    }

    public void setIpnum(Integer ipnum) {
        this.ipnum = ipnum;
    }

    public Integer getNewuvnum() {
        return newuvnum;
    }

    public void setNewuvnum(Integer newuvnum) {
        this.newuvnum = newuvnum;
    }

    public Integer getVisitnum() {
        return visitnum;
    }

    public void setVisitnum(Integer visitnum) {
        this.visitnum = visitnum;
    }
}
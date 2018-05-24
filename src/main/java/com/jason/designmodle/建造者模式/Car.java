package com.jason.designmodle.建造者模式;

public class Car {

    private String tair;
    private String fxp;
    private String cd;
    private String chair;

    public String getTair() {
        return tair;
    }

    public void setTair(String tair) {
        this.tair = tair;
    }

    public String getFxp() {
        return fxp;
    }

    public void setFxp(String fxp) {
        this.fxp = fxp;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tair='" + tair + '\'' +
                ", fxp='" + fxp + '\'' +
                ", cd='" + cd + '\'' +
                ", chair='" + chair + '\'' +
                '}';
    }
}

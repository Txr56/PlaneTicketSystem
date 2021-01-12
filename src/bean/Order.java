package bean;

public class Order {
    private String id;
    private float jpJg;//机票价格
    private float airportTax;//机场税
    private float ryf;//燃油费
    private float hkZhx;//航空综合险
    private float jpGqx;//机票改签险
    private float yhq;//优惠券

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getJpJg() {
        return jpJg;
    }

    public void setJpJg(float jpJg) {
        this.jpJg = jpJg;
    }

    public float getAirportTax() {
        return airportTax;
    }

    public void setAirportTax(float airportTax) {
        this.airportTax = airportTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkZhx() {
        return hkZhx;
    }

    public void setHkZhx(float hkZhx) {
        this.hkZhx = hkZhx;
    }

    public float getJpGqx() {
        return jpGqx;
    }

    public void setJpGqx(float jpGqx) {
        this.jpGqx = jpGqx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }
}

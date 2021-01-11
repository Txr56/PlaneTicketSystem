import java.sql.Date;

public class Customer {
    private String id;
    private String name;//乘客姓名
    private String phone;//联系方式
    private String customerType;//乘客类型
    private String carId;//身份证号
    private Date barthDate;//出生日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}

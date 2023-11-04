package nuc_zhy0340_id;


import java.time.LocalDate;


public class IdentityCard {
    private String name;
    private String sex;
    private String ethnicity;
    private LocalDate birthDay;
    private String address;
    private IdentityCardNumber identityCardNumber;

    public IdentityCard(){
        identityCardNumber = IdentityCardNumber.getInstance();
    }
    public IdentityCard(String name, String sex, String ethnicity, LocalDate birthDay, String address) {
        this.name = name;
        this.sex = sex;
        this.ethnicity = ethnicity;
        this.birthDay = birthDay;
        this.address = address;
        identityCardNumber = IdentityCardNumber.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IdentityCardNumber getInstance() {
        return identityCardNumber;
    }

    @Override
    public String toString() {
        return
                "姓名：" + name +
                ", 性别：" + sex +
                ", 民族：" + ethnicity +
                ", 出生：" + birthDay +
                ", 住址" + address +
                ", 公民身份证号：" + identityCardNumber.getNumber()
                ;
    }
}

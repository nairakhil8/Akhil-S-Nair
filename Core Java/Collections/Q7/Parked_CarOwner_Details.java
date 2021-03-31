public class Parked_CarOwner_Details {
    private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;

    public Parked_CarOwner_Details(String name, String carModel, int carNo, int mobileNumber, String address) {
        this.name = name;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

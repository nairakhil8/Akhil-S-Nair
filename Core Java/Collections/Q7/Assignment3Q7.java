public class Assignment3Q7 {
    private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;

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

    public Assignment3Q7(String name, String carModel, int carNo, int mobileNumber, String address) {
        this.name = name;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public static void main(String[] args) {
        Assignment3Q7 car1 = new Assignment3Q7("amit","sports",5253,9876,"xyz street");
        Parked_CarOwnerList list = new Parked_CarOwnerList();
        list.add_new_car(car1);
        System.out.println(list.get_parked_car_location(2));
        System.out.println(23%10);


    }
}

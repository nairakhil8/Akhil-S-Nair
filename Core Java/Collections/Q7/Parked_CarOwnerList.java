import java.util.HashMap;

public class Parked_CarOwnerList {
    int levels = 3;
    int sections = 4;
    int slots = 20;
    int token = 1;

    int presentLevel = 1;
    int presentSection = 1;
    int presentSlot = 1;

    HashMap<Integer,ParkingSlot> parkedMap = new HashMap<>();


    public void add_new_car(Assignment3Q7 car){
        ParkingSlot parkingSlot = new ParkingSlot(car.getName(),car.getCarNo(),this.token,presentLevel,presentSection,presentSlot);

        parkedMap.put(this.token,parkingSlot);

        this.token += 1;
        if(presentSlot < 20){
            presentSlot +=1;
        }else{
            presentSlot = 1;
            if(presentSection <4){
                presentSection +=1;
            }else{
                presentLevel +=1;
                presentSection = 1;
            }
        }

    }


    public void remove_car(String name,int carNo){}

    public String get_parked_car_location(int token){
        System.out.println(this.token);
        if(token<this.token){
            int tempLevel = parkedMap.get(token).getLevel();
            int tempSection = parkedMap.get(token).getSection();
            int tempSlot = parkedMap.get(token).getSlot();

            return "level : "+tempLevel+",section : "+tempSection+",slot: "+tempSlot+".";
        }
        return "not found";

    }
}

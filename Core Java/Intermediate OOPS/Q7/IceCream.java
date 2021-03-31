public class IceCream extends DesertItem{
    private int iceCreams=0;

    public int addIceCreams(int candies){
        this.iceCreams += candies;
        return iceCreams;
    }

    @Override
    public int getCost() {
        return iceCreams;
    }
}

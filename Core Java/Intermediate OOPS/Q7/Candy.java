public class Candy extends DesertItem{
    private int candies = 0;
    public int addCandies(int candies){
        this.candies +=candies;
        return this.candies;
    }

    @Override
    public int getCost() {
        return candies*60;
    }
}

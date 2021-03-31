public class Cookie extends DesertItem{
    private int cookies=0;

    public int addCookies(int candies){
        this.cookies += candies;
        return cookies;
    }

    @Override
    public int getCost() {
        return cookies*70;
    }
}

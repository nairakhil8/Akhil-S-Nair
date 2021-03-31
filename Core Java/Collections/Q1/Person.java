public class Person implements Comparable<Person>{
    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if(this.weight == person.getWeight()){

            if(this.height == person.getHeight()){
                return 0;
            }else if(this.height > person.getHeight()){
                return 1;
            }else{
                return -1;
            }

        }else if(this.weight >person.getWeight()){

            return 1;
        }else{

            return -1;
        }
    }
}

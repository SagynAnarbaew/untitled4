import java.util.Random;

public class Pet {
    private Integer age = generateDefaultAge();
    EnumColor color;
    Shelter shelter;


    public Pet(EnumColor color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public Pet(Shelter shelter) {
        this.shelter = shelter;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public EnumColor getColor() {
        return color;
    }

    public void setColor(EnumColor color) {
        this.color = color;
    }


    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private Integer generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(25) +1;
    }

    public final String getInfo() {
        return "Age: " + age +
                "\n Color: "  + color +
                "\n Shelter name: " + shelter.getName() +
                "\n Shelter address: " + shelter.getAddress();


    }
}
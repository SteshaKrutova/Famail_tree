package family_free;

public class Human {
    private static int idCounter = 0; // Статический счетчик id, общий для всех объектов класса
    private int id;
    String name;
    Gender gender;
    private int mother;
    private int father;
    private int children;


    public Human(String name,Gender gender) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
        this.gender=gender;
//        this.mother = mother;
//        this.father = father;
//        this.children = children;
    }


    @Override
    public String toString() {
        return "id "+id +", имя: " + name + ", пол: "+ gender;
    }
}

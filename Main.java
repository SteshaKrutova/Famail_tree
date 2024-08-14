package family_free;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Human human1 = new Human("Sara",Gender.Female);
        Human human2 = new Human("Mike",Gender.Male);

        familyTree.addHuman(human1);
        familyTree.addHuman(human2);

        System.out.println(familyTree);
    }
}
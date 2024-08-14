package family_free;

import VendingMachine.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class FamilyTree {
    ArrayList<Human> family_tree;


    public FamilyTree(){
        this.family_tree= new ArrayList<>();
    }

    public void addHuman(Human human){
        family_tree.add(human);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Дерево:\n");
        for (Human human : family_tree) {
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

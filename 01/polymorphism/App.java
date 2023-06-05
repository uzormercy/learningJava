package polymorphism;

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        Tree tree = new Tree();

        Plant plant2 =  tree;

        plant2.grow();
        tree.shedLeaves();

        // Can't access the shedleave method in tree because the variable type is Plant and not Tree which does not have access to its child class methods.
        // how ever plant2 is pointing to the tree object as a value, but its type is a type of Plant.
        // plant2.shedLeaves();

    }
    

    public static void doGrow (Plant plant){
        plant.grow();
    }
}

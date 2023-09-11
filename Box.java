import java.util.ArrayList;

public class Box<E extends Fruct> {

    private ArrayList<E> fructs;

    private float summWeight = 0f;
    public Box(){
        this.fructs = new ArrayList<>();
    }

    public float getWeight(){
        for(E fruct: fructs){
            summWeight = summWeight + fruct.getWeight();
        }
        return summWeight;
    }

    public void addFructInBox(E fruct){
        fructs.add(fruct);
    }

    public void clearBox(){
        fructs.clear();
    }

    public boolean compare(Box<?> box){
        return Double.compare(this.getWeight(), box.getWeight()) == 0;
    }

    public void pourTo(Box<E> box){
        for(E fruct: fructs){
            box.addFructInBox(fruct);
            summWeight = summWeight - fruct.getWeight();
        }
        fructs.clear();

    }
}

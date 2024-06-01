package EyalClass.Spring2021.Q7;

public class Memory {

    private Node<Data> start;
    public Memory(int totalSize) {
        this.start = new Node<Data>(new Data(totalSize));
    }

    boolean isDangerousState(){
        int sumSpaceFree = 0;
        int sumSize = 0;
        Node<Data> start = this.start;
        while (start.getNext() != null){
            sumSize += start.getValue().getSize();
            if (start.getValue().isFree()){
                sumSpaceFree += start.getValue().getSize();
            }
            start = start.getNext();
        }
        if (sumSize / 10 < sumSpaceFree) return false;

        return true;
    }

    boolean firstFit(int num){


        return false;
    }
}
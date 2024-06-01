package binNodePack;

public class intBinTree {
    private intBinNode root;
    public  intBinTree(){
        this.root=null;
    }
    public intBinTree(intBinNode root){
        this.root=root;
    }
    public void printTree(){
        printTree(this.root);

    }

    private void goInTree(intBinNode root , int printOrder){

  /*
        if (root==null)return;//אם ריק

        if (root.getLeft()==null&&root.getRight()==null){
            System.out.println(root);
            return;//אם זה עלה
        }
        if (root.getLeft()!=null&&root.getRight()==null) {
            goInTree(root.getLeft());
        }
        if (root.getRight()!=null&&root.getLeft()==null) {
            goInTree(root.getRight());

        }
*/
        switch (printOrder){
            case -1:
                System.out.println(root);
                goInTree(root.getLeft(),printOrder);
                goInTree(root.getRight(),printOrder);
            case 0:
                goInTree(root.getLeft(),printOrder);
                System.out.println(root);
                goInTree(root.getRight(),printOrder);

            case 1:
                goInTree(root.getLeft(),printOrder);
                goInTree(root.getRight(),printOrder);
                System.out.println(root);

        }

    }

    public static void main(String[] args) {


}
    private void printTree(intBinNode root) {

       /*
       3 way to traverse

              1      2      3
       1 >> root - left - right
       2 >> left - root - right
       3 >> left - right- root
        */







        if (root==null)return;//אם ריק

        if (root.getLeft()==null&&root.getRight()==null){


            return;//אם זה עלה
        }

        if (root.getLeft()==null&&root.getRight()!=null||
                root.getLeft()!=null&&root.getRight()==null){

            return;//אחד מהילדים
        }

        if (root.getLeft()!=null&&root.getRight()!=null){
            return;//אם יש שתי ילדים
        }
        printTree(root.getLeft());
        printTree(root.getRight());
    }

}

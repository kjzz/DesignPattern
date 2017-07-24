package CompositeMethod;

/**
 * Created by Jeremy on 2017/7/21.
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name){
        this.root = new TreeNode(name);
    }

    public static void main(String []args){

        Tree tree = new Tree("Root");
        tree.root.addNode(new TreeNode("Sub"));
        System.out.println("Finish Build Tree!");
    }

}

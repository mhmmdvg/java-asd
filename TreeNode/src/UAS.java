import java.util.*;
public class UAS {
    // head start
    abstract class TreeNode {}

    class TreeNodeLeaf extends TreeNode {

        private String value;

        public TreeNodeLeaf(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

    }

    class MiddleTreeNode extends TreeNode {

        private int value;
        private TreeNode[] child = new TreeNode[3];

        public MiddleTreeNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public void setLessThanValue(TreeNodeLeaf treeNode) {
            this.child[0] = treeNode;
        }

        public void setEqualValue(TreeNodeLeaf treeNode) {
            this.child[1] = treeNode;
        }

        public void setEqualTreeNode(MiddleTreeNode treeNode) {
            this.child[1] = treeNode;
        }

        public void setMoreThanValue(TreeNodeLeaf treeNode) {
            this.child[2] = treeNode;
        }

        public TreeNodeLeaf getLessThanNode() {
            return (TreeNodeLeaf) this.child[0];
        }

        public TreeNode getMiddleNode() {
            return this.child[1];
        }

        public TreeNodeLeaf getMoreThanNode() {
            return (TreeNodeLeaf) this.child[2];
        }

    }

    static class DecisionTree {

        private MiddleTreeNode root;

        public DecisionTree(ArrayList<String> listClass, ArrayList<String> listFeatureValue) {
            initializeTree(listClass, listFeatureValue);
        }

        // head stop

        // body start
        private void initializeTree(ArrayList<String> listClass, ArrayList<String> listFeatureValue) {
            // parsing data in ArrayList to TreeNode
            TreeNode temp = root;

            listFeatureValue.forEach(feature -> {
                //1 node hanya memiliki 3 anak
                //anaktengah sama dengan input (sedang)
                //anakkiri kurang dari induk (miskin)
               }else {
                   //anakkanan lebih dari induk (kaya)

               }
                // creating nodes rules
                // your code goes here

            });
        }
// body stop

// tail start

        public String getDecision(String values) {
            MiddleTreeNode temp = (MiddleTreeNode) root;
            String[] splittedValues = values.split(" ");

            for (String value : splittedValues) {
                if (Integer.parseInt(value) < temp.getValue()) {
                    return ((TreeNodeLeaf) temp.getLessThanNode()).toString();
                } else if (Integer.parseInt(value) > temp.getValue()) {
                    return ((TreeNodeLeaf) temp.getMoreThanNode()).toString();
                } else if (Integer.parseInt(value) == temp.getValue()) {
                    TreeNode returnNode = temp.getMiddleNode();

                    if (returnNode instanceof TreeNodeLeaf) {
                        return ((TreeNodeLeaf) returnNode).toString();
                    } else if (returnNode instanceof MiddleTreeNode) {
                        temp = (MiddleTreeNode) returnNode;
                    }
                }
            }

            return "NOT FOUND";
        }

    }

    public static class MainDecisionTree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> listClass = new ArrayList<String>();
            ArrayList<String> listFeatureValue = new ArrayList<String>();
            String inputValue = null;

            while (true) {
                String line = scanner.nextLine();

                if (line.equals("EXIT")) {
                    break;
                } else {
                    String command = line.split(" -> ")[0];
                    String param = line.split(" -> ")[1];

                    switch (command) {
                        case "CLASS":
                            listClass.add(param);
                        case "RULES":
                            listFeatureValue.add(param);
                            break;
                        case "QUERY":
                            inputValue = param;
                            break;
                    }
                }
            }

            DecisionTree decisionTree = new DecisionTree(listClass, listFeatureValue);
            System.out.println(decisionTree.getDecision(inputValue));
        }

    }
// tail stop
}

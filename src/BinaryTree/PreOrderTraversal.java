package BinaryTree;

public class PreOrderTraversal {

    public void preorderTraversal(TreeNode treeNode){

        if(treeNode == null){
            return;
        }
        System.out.print(treeNode.key + " ");
        preorderTraversal(treeNode.left);
        preorderTraversal(treeNode.right);
    }

    public void SetupBinaryTree(){
        TreeNode firstTreeNode = new TreeNode(10);
        TreeNode secondTreeNode = new TreeNode(20);
        TreeNode thirdTreeNode = new TreeNode(30);
        TreeNode forthTreeNode = new TreeNode(40);
        TreeNode fifthTreeNode = new TreeNode(50);

        firstTreeNode.left = secondTreeNode;
        firstTreeNode.right = thirdTreeNode;
        secondTreeNode.left = forthTreeNode;
        secondTreeNode.right = fifthTreeNode;

        preorderTraversal(firstTreeNode);
    }
}

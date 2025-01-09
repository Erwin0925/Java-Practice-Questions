package BinaryTree;

public class PostOderTraversal {

        public void postorderTraversal(TreeNode treeNode){

            if(treeNode == null){
                return;
            }
            postorderTraversal(treeNode.left);
            postorderTraversal(treeNode.right);
            System.out.print(treeNode.key + " ");
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

            postorderTraversal(firstTreeNode);
        }
}

package BinaryTree;

public class InOrderTraversal {

        public void inorderTraversal(TreeNode treeNode){

            if(treeNode == null){
                return;
            }
            inorderTraversal(treeNode.left);
            System.out.print(treeNode.key + " ");
            inorderTraversal(treeNode.right);
        }

        public void SetupBinaryTree() {
            TreeNode firstTreeNode = new TreeNode(10);
            TreeNode secondTreeNode = new TreeNode(20);
            TreeNode thirdTreeNode = new TreeNode(30);
            TreeNode forthTreeNode = new TreeNode(40);
            TreeNode fifthTreeNode = new TreeNode(50);

            firstTreeNode.left = secondTreeNode;
            firstTreeNode.right = thirdTreeNode;
            secondTreeNode.left = forthTreeNode;
            secondTreeNode.right = fifthTreeNode;

            inorderTraversal(firstTreeNode);
        }
}

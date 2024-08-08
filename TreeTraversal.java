// 2)DSA Question..

class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class TreeTraversal{
    public void inOrder(TreeNode root){
        if(root==null)
          return;

        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }
    public void preOrder(TreeNode root){
        if(root==null)
        return;
        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(TreeNode root){
        if(root==null)
        return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(6);
        root.left.left.right=new TreeNode(9);
        root.left.left.right.left=new TreeNode(1);
        root.right.right.left=new TreeNode(8);
        TreeTraversal tree=new TreeTraversal();
        System.out.println("Inorder traversal: ");
        tree.inOrder(root);
        System.out.println("Postorder traversal: ");
        tree.postOrder(root);
        System.out.println("Preorder traversal: ");
        tree.preOrder(root);
    }
} 

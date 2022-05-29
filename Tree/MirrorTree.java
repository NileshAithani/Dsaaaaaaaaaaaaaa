package Tree;

public class MirrorTree {
    Node root;
    static class Node{
        int data;
        Node right,left;

        Node (int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static Node CreateNode(int data){
        Node newNode=new Node(data);
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;

        return newNode;
    }

    public Node mirrorify(Node root){
        if(root==null){
            return null;
        }
        Node mirror =CreateNode(root.data);
        mirror.left=mirrorify(root.right);
        mirror.right=mirrorify(root.left);


        return mirror;
    }


}

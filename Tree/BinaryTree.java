package Tree;
import java.sql.SQLOutput;
import java.util.*;

import java.util.LinkedList;

public class BinaryTree {
    Node root;

    class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }





    //TREE WITHOUT USER INPUT
    public void createBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third= new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
        forth.left = sixth;
    }






    //CREATE TREE THROUGH USER INPUT
/*    public int createTree(Node head){
        if(root==null){
            return -1;
        }

    }*/







     //PREORDER
    public void preOrder(Node root){
        // base Case
        if(root==null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }



      //INORDER
    public void inOrder(Node root){
        //base case
        if(root== null ) return ;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }





   //POSTORDER
    public void postOrder(Node root){
        //Base case
        if(root==null) return ;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }





    //LEVEL ORDER TRAVERASAL

    public void levelOrderTraversal(Node root){
        //base case
        if(root == null) return ;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp==null){
                System.out.println();
                if(!queue.isEmpty()){
                    queue.offer(null);
                }
            }else{
            System.out.print(temp.data + " ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }}
    }





    //LEVEL ORDER TRAVERASAL WITH ARRAYLIST
    static ArrayList <Integer> levelOrder(Node root) {
        ArrayList<Integer> arrayL = new ArrayList<>();
        Queue<Node>queue = new LinkedList<>();

        //offer use to enqueue the element in the Queue
        queue.offer(root);

        while(!queue.isEmpty()){
            Node temp = queue.poll(); //poll is used for dequeue

            arrayL.add(temp.data);

            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
        return arrayL;
    }






   //MAXIMUM NODE VALUE IN A BINARY TREE
    public static int FindMax(Node root){
        //base case
        if(root==null) return Integer.MIN_VALUE;

        int result = root.data;
        int left = FindMax(root.left);
        int right = FindMax(root.right);

        if(left>result){
         result=left;
         }
        if(right>result){
         result=right;
       }

        return result;
    }





    //Total no. of leaf Node present in a binary tree
    public void inOrder(Node root , int count){
        //base case
        if(root== null ) return ;

        inOrder(root.left,count);

        if(root.left==null && root.right==null){
            count++;
        }

        inOrder(root.right,count);
    }


    public int NoOfLeafNode(Node root){
        int count = 0;
        inOrder(root,count);

        return count;
    }



    


    //HEIGHT OF A BINARY TREE
    public int height(Node root){
        if(root==null)return 0;

        return Math.max(height(root.left),height(root.right))+1;
    }




    //SIZE OF A BINARY TREE
    public int size(Node root){
        if(root==null) return 0;

        return size(root.left)+size(root.right)+1;
    }




    //Left View of a binary tree

    public void PrintLeftViewUtil(Node root ,ArrayList ArrayL , int level){
        if(root==null){
            return;
        }
        if(ArrayL.size()==level) {
            ArrayL.add(root);
        }
        PrintLeftViewUtil(root.left,ArrayL,level+1);
        PrintLeftViewUtil(root.right,ArrayL,level+1);

    }
    public void PrintLeftView(Node root){
        ArrayList<Node>arrayL = new ArrayList<>();

        PrintLeftViewUtil(root,arrayL,0);

        for(Node Current:arrayL){
            System.out.print(Current.data + " ");
        }

    }





    //Right View of a binary tree

    public void PrintRightViewUtil(Node root ,ArrayList ArrayL , int level){
        if(root==null){
            return;
        }
        if(ArrayL.size()==level) {
            ArrayL.add(root);
        }
        PrintRightViewUtil(root.right,ArrayL,level+1);
        PrintRightViewUtil(root.left,ArrayL,level+1);


    }
    public void PrintRightView(Node root){
        ArrayList<Node>arrayL = new ArrayList<>();

        PrintRightViewUtil(root,arrayL,0);

        for(Node Current:arrayL){
            System.out.print(Current.data + " ");
        }

    }



// Convert a Binary tree in Doubly LinkedList / flatter

    void convertDLL(Node root){
        Node prev = null;
        Node head = null;
        if(root==null){
            return ;
            }
        convertDLL(root.left);

        if(prev==null){
            head=root;
        }
        else{
            root.left =prev;
            prev.right =root;
        }

        prev = root;

        convertDLL(root.right);
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        // tree.preOrder(tree.root);
         //tree.inOrder(tree.root);
       // tree.postOrder(tree.root);
       // tree.levelOrderTraversal(tree.root);
       // System.out.println(FindMax(tree.root));
        //System.out.println(levelOrder(tree.root));

        //System.out.println(tree.NoOfLeafNode(tree.root));

       //tree.PrintLeftView(tree.root);
        //System.out.println();
        //tree.PrintRightView(tree.root);

    }

}

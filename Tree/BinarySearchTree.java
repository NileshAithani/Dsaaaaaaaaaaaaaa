package Tree;

public class BinarySearchTree {

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




    // preOrder
    public void preOrder(){
        preOrder(root);
    }

    public void preOrder(Node root){
        // base Case
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }





    //Insertion in a Biinary Search tree
    public void insert(int data){
        root=insert(root , data);
    }
    public Node insert(Node root ,int data){
        //base case
        if(root==null){
            root =new Node(data);
            return root;
        }
        if(data<root.data){
            root.left = insert(root.left , data);
        }
        else
            root.right = insert(root.right,data);

        return root;

    }




     //Search a given key in a BST
    public Node search(int data){
        return search(root , data);
    }
    public Node search(Node root , int data){
        //base case
        if(root==null){
            return root;
        }
        if(data>root.data){
        return search(root.right,data);
        }
        else{
      return search(root.left,data);
        }
    }


    //Delete a Given key in BST

    public Node delete(Node root, int key){
   if(root.data>key){
       root.left = delete(root.left,key);
   }
   else if(root.data<key){
       root.right = delete(root.right , key);
   }
   else{
       //case 1
       if(root.left==null && root.right==null){
           return null;
       }

       //case 2
       if(root.right==null){
           return root.left;
       }
       else if(root.left==null){
           return root.right;
       }

       Node IS = inOrderSuccessor(root.right ,key);
       root.data  = IS.data ;
       root.right = delete(root.right , IS.data);

   }
   return root;
    }

public Node inOrderSuccessor(Node root , int data){
        while(root.left!=null){
       root=root.left;
        }
    return root;
}


            //Given tree is valid Binary search tree or not

            public boolean isValid(Node root,long max , long min){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        boolean left = isValid(root.left,min, root.data);

        if(left){
            boolean right = isValid(root.right,root.data,max);
            return right;

        }
        return false;
            }




    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        tree.preOrder();
        System.out.println();
        System.out.println(tree.isValid(tree.root, Long.MAX_VALUE,Long.MIN_VALUE));


        //System.out.println(tree.root);
    }


}

import java.util.*;
public class BSTNoOfPaths{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left,val);
        }

        else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data > key){  // left subtree
            return search(root.left,key);
        }
        else if(root.data==key){
            return true;
        }
        else{  // right subtree
            return search(root.right,key);
        }
    }

    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left = delete(root.left,val);
        }
        else if(root.data < val){
            root.right = delete(root.right,val);
        }
        else{  // root.data == val
            if(root.left == null && root.right == null){  // case 1 (no child-leaf node)
                return null;
            }

            if(root.left == null){   // case 2 (one child)
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3 (two children - find right subtree ka leftmost element)
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root,int x,int y){
            if(root==null){
                return;
            }
            if(root.data >=x && root.data <=y){
                printInRange(root.left,x,y);
                System.out.print(root.data+" ");
                printInRange(root.right,x,y);
            }
            else if(root.data >= y){
                printInRange(root.left,x,y);
            }
            else{   // root.data <= x
                printInRange(root.right,x,y);
            }
    }
    public static void printPaths(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void getPaths(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPaths(path);
        }else{
            getPaths(root.left,path);
            getPaths(root.right,path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args){
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        getPaths(root,new ArrayList<>());
    }
}
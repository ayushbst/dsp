public class MyClass {
    
    static class Node
    {
        int data;
        Node left,right;
        Node(int x)
        {
            data=x;
            left=right=null;
        }
    }
    static Node root;
    Node insert(Node pointer,int data)
    {
        if(pointer==null)
        {
             return new Node(data);
        }
        else
        {
            if(pointer.data>data)
            {
                pointer.left=insert(pointer.left,data);
            }
            else
            {
                pointer.right=insert(pointer.right,data);
            }
        }
        return pointer;
    }
    
    static boolean find(Node pointer, int data)
    {
        if(pointer==null)
            return false;
        if(pointer.data==data)
            return true;
        if(pointer.data>data)
            return find(pointer.left,data);
        else
            return find(pointer.right,data);
    }
    
    void traverse(Node pointer)
    {
        if(pointer==null)
            return;
        System.out.println(pointer.data);
        traverse(pointer.left);
        traverse(pointer.right);
        
    }
    public static void main(String args[]) {
        
        MyClass ob=new MyClass();
        root=new Node(0);
        root=ob.insert(root,1);
        root=ob.insert(root,2);
        root=ob.insert(root,3);
        root=ob.insert(root,4);
        root=ob.insert(root,5);
        root=ob.insert(root,6);
        root=ob.insert(root,7);
        root=ob.insert(root,8);
        ob.traverse(root);
        System.out.println(ob.find(root,3));
        System.out.println(ob.find(root,9));
    }
}

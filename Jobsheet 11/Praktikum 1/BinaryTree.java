public class BinaryTree {
    Node root;
    int size;

    public BinaryTree(){
        root=null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if(isEmpty()){
            root = new Node(data);
        } else {
            Node current = root;
            while(true){
                if (data < current.data) {
                    if (current.left!=null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right!=null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    System.out.println("Terjadi DUplikasi Data !");
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current!=null){
            if (data == current.data) {
                hasil=true;
                break;
            } else if (data > current.data){
                current=current.right;
            } else {
                current=current.left;
            }
        }
        return hasil;
    }

    void tranversePreOrder(Node node){
        if(node!=null){
            System.out.print("\n " +node.data);
            tranversePreOrder(node.left);
            tranversePreOrder(node.right);
        }
    }

    void tranversePostOrder(Node node){
        if(node!=null){
            tranversePostOrder(node.left);
            tranversePostOrder(node.right);
            System.out.print("\n " +node.data);
        }
    }

    void tranverseInOrder(Node node){
        if(node!=null){
            tranverseInOrder(node.left);
            System.out.print("\n " +node.data);
            tranverseInOrder(node.right);
        }
    }
}

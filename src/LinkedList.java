public class LinkedList {
    private Node head;
    private int linkedListLength;

    public void insert(int data){
        Node node=new Node(data);
        //System.out.println("data"+node);
        if(head==null){
            head=node;

        }else{
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=node;
        }

    }


    public void insertAtStart(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }

    public void show(){
        Node currentNode=head;
        while(currentNode!=null){

            System.out.println(currentNode.data);
            currentNode= currentNode.next;
        }
    }
      public void insertAt(int index,int data){
            Node node=new Node(data);
            Node currentNode=null;
            if(index==0){
                insertAtStart(data);
            }
            for(int i=0;i<index-1;i++){
                currentNode=currentNode.next;

            }

            node.next=currentNode.next;
            currentNode.next=node;



    }
}

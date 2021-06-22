package list;

 class List5 {
    Node head;
    int count=0;

    static class Node
    {
        int data;
        Node next;
        Node head=null;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void insert(int new_data)
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node new_node=new Node(new_data);
            new_node.next=head;
            head=new_node;
            count++;
        }


    }
    public void insertmiddle(Node pre_node,int new_data) {
        if (head == null) {
            System.out.println("empty");
        }
        Node new_node=new Node(new_data);
        new_node.next=pre_node.next;
        pre_node.next=new_node;
        count++;

    }
    public void insertlast(int new_data)
    {  Node new_node=new Node(new_data);
        if(head==null)
       {
           head=new_node;
           count++;
           return;
       }else {
            Node last = head;
            while (last.next != null) {
                last = last.next;

                return;
            }last.next = new_node;
            count++;
        }
    }
    public void firstdelet(int position)
    {   Node temp=head;
        head=temp.next;
        Node next = temp.next.next;
        temp.next = next;
        count--;
    }
    public void deltposs(int poss){
       if(head==null)
           return;
       Node temp =head;
       if(poss==0){
           head=temp.next;
           count--;
           return;
       }
       for(int i =0;temp != null && i<poss -1;i++)
           temp=temp.next;
       if(temp==null || temp.next ==null)
           return;
       Node next=temp.next.next;
       temp.next=next;
        count--;
    }
    public void merge(List5 l2){
        Node temp=head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=l2.head;
        count=count+l2.count;
    }
    public void display()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;

        }System.out.println("count"+count);
    }
    public static void main(String args[])
    {
        List5 l1=new List5();
//        l1.head= new Node(11);
//        Node second=new Node(22);
//        Node third=new Node(33);
        l1.insertlast(11);
        l1.insertlast(12);
        l1.insertlast(13);

//        l1.head.next=second;
//        second.next=third;

        l1.insert(10);
       // l1.insertmiddle(l1.head.next.next,);
        l1.insertlast(44);
       // l1.display();
        l1.insertlast(55);
       // l1.firstdelet(45);
      // l1.deltposs(3);
        l1.display();
        System.out.println();
        List5 l2=new List5();


        l2.insertlast(66);
        l2.insertlast(77);
        l2.insert(88);
        l2.insertlast(99);
        l2.display();
        System.out.println();
        l2.merge(l1);

        l2.display();
    }
}
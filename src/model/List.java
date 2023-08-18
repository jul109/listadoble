package model;
public class List{
    private Node head;
    private Node tail;
    private int size;
    public List(){

    }

    public String print(){
        String msg="";
        if(head!=null){
           msg+=print(head);
        }
        
        
        return msg;
    }
    
    public String print(Node current){
        if(current.getNext()==null){
            return current.getId();
        }
        return current.getId()+"-"+print(current.getNext());
    }



    public void addFirstPos(String id){
        Node newNode=new Node(id);
        if(head==null &&tail==null){
            
            head=newNode;
            tail=newNode;
            
        }else{ //añadir  a la cabeza
            newNode.setNext(head);
            head.setPrevious(newNode);
            head=newNode;
        }
        size++;
        System.out.println("SIZE:"+size);
    }

    public void addLastPos(String id){
        Node newNode=new Node(id);
        if(head==null &&tail==null){
            
            head=newNode;
            tail=newNode;  
        }else{ //añadir  a la cola
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail=newNode;
        }
    }
    public String delete(int target){
        String msg="No se elimino";
        Node nodeToDelete=searchNode(target);
        if(nodeToDelete!=null){
            msg="si se elimino";
            delete(nodeToDelete);
        }
        return msg;

    }
    public Node searchNode(int target){
        return searchNode(target,head,0);
    }

    public Node searchNode(int target, Node node, int index){
        if(target==index){
            return node;
        }
        index++;
        if(node.getNext()!=null){
            return searchNode(target,node.getNext(),index);
        }
        return null;
    }

    public void delete(Node node){
        if(node==head&&node==tail){
            head=null;
            tail=null;
        }else if(node==head){
            head=node.getNext();
            head.setPrevious(null);
            node.setNext(null);
        }else if(node==tail){
            tail=node.getPrevious();
            tail.setNext(null);
            node.setPrevious(null);
        }else{
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
            node.setNext(null);
            node.setPrevious(null);
        }
    }

    public void init(){
        for(int i=0;i<10;i++){
            addFirstPos(i+"");
        }
    }


}
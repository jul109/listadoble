package model;
public class Node{
    private Node next;
    private Node previous;
    private String id;
    public Node(String id){
        this.id=id;
    }
    public Node getPrevious(){
        return this.previous;
    }
    public Node getNext(){
        return this.next;
    }
    public String getId(){
        return this.id;
    }

    public void setPrevious(Node node){
        this.previous=node;
    }

    public void setNext(Node node){
        this.next=node;
    }






}
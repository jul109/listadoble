package ui;
import model.List;
import java.util.Scanner;
public class Main{
    private List list;
    private Scanner reader;
    Main(){
        list=new List();
        reader=new Scanner(System.in);
    }
    public static void main(String args[]){
        System.out.println("Hola");
        Main m= new Main();
        m.list.init();
        m.menu();       
        
    }
    public void print(){
        System.out.println(list.print());
    }
    public void menu(){
        boolean execute=true;
        String str;
        while(execute){
            System.out.println("1 para añadir a la primea");
            System.out.println("2 para añadir a la ultima");
            System.out.println("3 imprimit");
            System.out.println("4 eliminar");
            System.out.println("5 salir");
            int option=reader.nextInt();
            switch (option) {
                case 1:
                    str=reader.next();
                    list.addFirstPos(str);
                    System.out.println("añadido");
                    
                    break;
                case 2:
                    str=reader.next();
                    list.addLastPos(str);
                    System.out.println("añadido");
                    break;
                case 3:
                    System.out.println(list.print());
                    break;
                case 4:
                    int index=reader.nextInt();
                    System.out.println(list.delete(index));
                    
                    break;
                case 5:
                    execute=false;
                    break;
                default:


                    break;
            }
        }
    }


    

}
import java.util.*;
import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.string;



class PrintAndScan{
    public static void printmenu(){
        System.out.print("Enter one of the following options: " +
                "\n1. Start game" +
                "\n2. Leave Game" +
                "\n3. Load Save" +
                "\n4. Manage Team" +
                "\n5. Create Team" +
                "\n6. Create Player" +
                "\n7. Credits\n");
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        printmenu();
        //string name é a capturada
        char name = in.next().charAt(0);
        if (name >= '1' && name <= '7'){
            System.out.println("no erro");
            //carrega classe Iniciar Jogo
        }
        else{
            System.out.println("ERROR");
        }
        /*
        switch(name){
            case 1:
                //code to see members
                break;
            case 2:
                //code to add members
                break;
            case 3:
                //code to delete members
                break;
            case 4:
                //it will end the program
                run=false;
                break;
            default:
                System.out.println("Invalid option");
        }
        */
        
    }
}


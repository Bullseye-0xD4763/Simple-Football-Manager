package proj;

import java.util;
import java.util.stream.Collectors;

class PrintAndScan{
    //criar variavel vazia
    private String option;
    public PrintAndScan(){
        this.option = ' ';
    }
    //recebe argumento e copia o seu valor para a 'option'
    public PrintAndScan(String option){
        this.option = option;
    }
    //copia PrintAndScan para outro PrintAndScan
    public PrintAndScan(PrintAndScan var) {
        this.option = var.getOption();
    }

    // getter
    public String getOption() {
        return this.option;
    }

    // setter
    public void setOption(String var2) {
        this.option = var2;
    }
    




    public static void menuPrint(String option) {
        System.out.println("Enter one of the following options: "+"\n1. Start game"+"\n2. Leave Game"+"\n3. Load Save"+"\n4. Manage Team"+"\n5. Create Team"+"\n6. Create Player"+"\n7. Credits\n");
        boolean startLoop = false;
        while (startLoop == false) {
            // string name é a capturada
            //char name = in.next().charAt(0);
            switch (option) {
                case '1':
                    System.out.println("Start");
                    // Start game
                    startLoop = true;
                case '2':
                    // Leave Game
                    startLoop = true;
                case '3':
                    // load save
                    startLoop = true;
                case '4':
                    // Manage Team
                    startLoop = true;
                default:
                    // it will end the program
                    System.out.println("Invalid option");
                    in.close();
            }
        }
    }
}

public class Main {
    
    PrintAndScan printfunction = new PrintAndScan();

    Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Parser.parse();
    }
        String stdName = input.nextLine();
        printfunction.menuPrint(stdName);
}

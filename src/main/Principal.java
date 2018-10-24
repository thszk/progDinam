/*
 *
 * 
 */

package main;
import impressao.ImpressaoNitida;
import entradaSaidaDados.LE;

public class Principal {
    
    public static void main(String[] args) {
        int op = -1;
        ImpressaoNitida obj = new ImpressaoNitida();
        LE le = new LE();
        
        while(op != 0) {
            op = le.readIntPane("---------- MENU ----------\n"+
                                "|1 - Impressao            \n"+
                                "|2 - Festa                \n"+
                                "|3 - Lucro                \n"+
                                "|0 - Sair                 \n"+
                                "--------------------------");
            
            switch (op) {
                case 1:
                    obj.imprime();
                break;
                
                case 2:
                break;
                
                case 3:
                break;
                
                case 0:
                    le.show("Finalizando execução");
                break;
                
                default:
                    le.show("Opção inválida!");
                break;
            }
        }
    }   
}
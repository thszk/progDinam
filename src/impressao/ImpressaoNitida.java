/*
 * 
 * 
 * 
 */

package impressao;
import entradaSaidaDados.LE;

public class ImpressaoNitida {
    
    public void imprime() {
        LE le = new LE();

        //armazena o paragrafo
        //String paragrafo = "Lorem ipsum dapibus quis vehicula rhoncus etiam quam pulvinar, aenean per neque lobortis nostra ullamcorper dapibus quam, morbi quisque arcu himenaeos nulla pharetra aptent. auctor potenti platea varius inceptos ligula suscipit leo proin donec, tincidunt neque potenti porttitor suspendisse porttitor auctor eleifend consectetur, nostra lectus duis iaculis donec fermentum nulla mattis. varius nisl euismod mi nam bibendum dictum ut habitant facilisis, neque pretium varius ultrices consectetur felis facilisis odio, varius pretium ultrices erat proin maecenas eget ac. dapibus ut consequat nibh curae morbi nibh fames, sapien aenean nisl feugiat hendrerit sit pulvinar, dictumst faucibus massa tristique primis pharetra."; 
        // Lorem ipsum dapibus quis vehicula rhoncus etiam quam pulvinar, aenean per neque lobortis nostra ullamcorper dapibus quam, morbi quisque arcu himenaeos nulla pharetra aptent. auctor potenti platea varius inceptos ligula suscipit leo proin donec, tincidunt neque potenti porttitor suspendisse porttitor auctor eleifend consectetur, nostra lectus duis iaculis donec fermentum nulla mattis. varius nisl euismod mi nam bibendum dictum ut habitant facilisis, neque pretium varius ultrices consectetur felis facilisis odio, varius pretium ultrices erat proin maecenas eget ac. dapibus ut consequat nibh curae morbi nibh fames, sapien aenean nisl feugiat hendrerit sit pulvinar, dictumst faucibus massa tristique primis pharetra.
        String paragrafo;
        paragrafo = le.readStringPane("Parágrafo a ser impresso:");

        //coloca as palavras do paragrafo num vetor
        String[] palavra = paragrafo.split(" ");

        //quantidade de palavras
        int qtdPalavras = palavra.length;

        //maximo de caractere por linha
        int m;
        //m = 100;
        m = le.readIntPane("Máximo de caractere por linha:");

        //conta os caracteres ja impressos por linha
        int contador = 0;

        //gera a saida
        String saida = "";
        //delimitador de impressao
        for(int i=0; i<m; i++) {
            System.out.print("-");
            saida = saida + "-";
        }
        System.out.println("");
        saida = saida + "\n";

        for(int i=0; i<qtdPalavras; i++){
            if((contador+palavra[i].length()) <= m) {
                System.out.print(palavra[i]);
                saida = saida + palavra[i];
                contador = contador + palavra[i].length();

                if(contador < m) {
                    System.out.print(" ");
                    saida = saida + " ";
                    contador = contador + 1;
                }
            }else {
                while(contador < m) {                       //preenche ate o final da linha com simbolo
                    System.out.print(" ");
                    saida = saida + " ";
                    //System.out.print("$");
                    contador = contador + 1;
                }

                contador = palavra[i].length() + 1;         //reinicia o contador
                System.out.print("\n");                     //escreve na proxima linha
                saida = saida + "\n";

                System.out.print(palavra[i] + " ");
                saida = saida + palavra[i] + " ";
            }
        }
        System.out.print("\n");
        saida = saida + "\n";
        //delimitador de impressao
        for(int i=0; i<m; i++) {
            System.out.print("-");
            saida = saida + "-";
        }

        //printa a saida obs.: nao fica identado como no prompt
        //le.show(saida);
        le.show("Pagina impressa no prompt.");
         
        System.out.print("\n\n\n");
    }
    
}

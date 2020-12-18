import java.util.Scanner;

public class main {
   
    public static void main(String args[]) {
        //Dados
        String nome = "unifap";
        String senha = "unifap123";
        // Tentei armazenar em uma "private string" mas não soube fazer funcionar
           int caneta_cx = 10;
           int caneta_uni = 12;
           int caneta_total = (caneta_uni*caneta_cx);
           
           int lapis_uni = 12;
           int lapis_cx = 2;
           int lapis_total = (lapis_uni*lapis_cx);
           
           int resma_papel = 5;
           
           int borracha_uni = 6;
           int borracha_cx = 1;
           int borracha_total = (borracha_uni*borracha_cx);
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem vindo. Login necessário para acesso:\n");
        
        System.out.println("Usuário: ");
        String user = input.next();
        
        System.out.println("Senha: ");
        String passworld = input.next();
         
        if(nome.equals(user) && senha.equals(passworld)){                           
            System.out.println("Usuário e senha aceitos...");
            //------- Construção do menu ----------
            
            int opt; //variável que armazena a opção dada pelo usuário
            
            do {
                System.out.println("Controle de estoque");
                System.out.print("|-----------------------------|\n");
                System.out.print("| 1 - Entrada de estoque      |\n");
                System.out.print("| 2 - Saída de estoque        |\n");
                System.out.print("| 3 - Quantidade em estoque   |\n");
                System.out.print("| 4 - Sair                    |\n");
                System.out.print("|-----------------------------|\n");
                System.out.println("Digite a opção:");
                
                Scanner op = new Scanner(System.in);
                opt = op.nextInt();
                for (int i = 0; i < 50; ++i) System.out.println ();
                
                switch (opt){
                    case 1:
                        int in;
                        int entrada;
                        System.out.println ("Entrada de estoque: ");
                        System.out.print("|------------------------------------|\n");
                        System.out.print("| 1 - Entrada caixas de caneta       |\n");
                        System.out.print("| 2 - Entrada caixas de lápis        |\n");
                        System.out.print("| 3 - Entrada resma de papel         |\n");
                        System.out.print("| 4 - Entrada caixas de borracha     |\n");
                        System.out.print("| 5 - voltar ao menu                 |\n");
                        System.out.print("|------------------------------------|\n");
                        System.out.println("Digite a opção");

                        Scanner opt1 = new Scanner(System.in);
                        in = opt1.nextInt();

                        for (int i = 0; i < 50; ++i) System.out.println ();
                        switch(in){
                        case 1:
                                                                                              
                            System.out.println("Digite quantas caixas entraram: ");
                            Scanner caneta = new Scanner(System.in);
                            entrada = caneta.nextInt() + caneta_cx;
                            for (int i = 0; i < 50; ++i) System.out.println ();
                            System.out.println("Número de caixas atualizado.");
                            caneta_cx = caneta_cx+entrada;
                            System.out.println("Seu estoque contam com "+caneta_cx+" caixas agora");
                            break;
                                  
                        case 2:
                            System.out.println("Digite quantas caixas entraram: ");
                            Scanner lapis = new Scanner(System.in);
                            entrada = lapis.nextInt();
                                
                            for (int i = 0; i < 50; ++i) System.out.println ();
                            System.out.println("Número de caixas atualizado.");
                            lapis_cx = lapis_cx+entrada;
                            System.out.println("Seu estoque contam com "+lapis_cx+" caixas agora");
                            break;

                        case 3:
                            System.out.println("Digite quantas resmas entraram: ");
                            Scanner resma = new Scanner(System.in);
                            entrada = resma.nextInt();

                            for (int i = 0; i < 50; ++i) System.out.println ();
                            System.out.println("Número de resmas atualizado.");
                            resma_papel = resma_papel+entrada;
                            System.out.println("Seu estoque contam com "+resma_papel+" caixas agora");
                            break;


                        case 4:
                            System.out.println("Digite quantas caixas de borrachas entraram: ");
                            Scanner borracha = new Scanner(System.in);
                            entrada = borracha.nextInt() + caneta_cx;
                            for (int i = 0; i < 50; ++i) System.out.println ();
                            System.out.println("Número de caixas atualizado.");
                            borracha_cx = entrada+borracha_cx;
                            System.out.println("Seu estoque contam com "+borracha_cx+" caixas agora");
                            break;
                        }
                    break;
                       
                    case 2:
                    int in_2;
                    int saida;
                        System.out.println ("Saída de estoque: ");
                        System.out.print("|------------------------------------|\n");
                        System.out.print("| 1 - Saída caixas de caneta         |\n");
                        System.out.print("| 2 - Saída caixas de lápis          |\n");
                        System.out.print("| 3 - Saída resma de papel           |\n");
                        System.out.print("| 4 - Saída caixas de borracha       |\n");
                        System.out.print("| 5 - voltar ao menu                 |\n");
                        System.out.print("|------------------------------------|\n");
                        System.out.println("Digite a opção");

                        Scanner opt2 = new Scanner(System.in);
                        in_2 = opt2.nextInt();
                        for (int i = 0; i < 50; ++i) System.out.println ();
                        
                        switch(in_2){
                            case 1:                                                             
                            System.out.println("Digite quantas caixas saíram: ");
                            Scanner caneta = new Scanner(System.in);
                            saida = caneta.nextInt();
                            for (int i = 0; i < 50; ++i) System.out.println ();

                            System.out.println("Número de caixas atualizado.");
                            caneta_cx=caneta_cx-saida;
                            System.out.println("Seu estoque contam com "+caneta_cx+" caixas agora");
                            break;
                                    
                            case 2:
                            System.out.println("Digite quantas caixas saíram: ");
                            Scanner lapis = new Scanner(System.in);
                            saida = lapis.nextInt();

                            for (int i = 0; i < 50; ++i) System.out.println ();
                            System.out.println("Número de caixas atualizado.");
                            lapis_cx = lapis_cx-saida;
                            System.out.println("Seu estoque contam com "+lapis_cx+" caixas agora");
                            break;

                            case 3:
                            System.out.println("Digite quantas resmas saíram: ");
                            Scanner resma = new Scanner(System.in);
                            saida = resma.nextInt();

                            for (int i = 0; i < 50; ++i) System.out.println ();
                            System.out.println("Número de caixas atualizado.");
                            resma_papel = resma_papel-saida;
                            System.out.println("Seu estoque contam com "+resma_papel+" caixas agora");
                            break;
                                
                            case 4:
                            System.out.println("Digite quantas caixas de borrachas saíram: ");
                            Scanner borracha = new Scanner(System.in);
                            saida = borracha.nextInt();
                            for (int i = 0; i < 50; ++i) System.out.println ();
                            System.out.println("Número de caixas atualizado.");
                            borracha_cx = borracha_cx - saida;
                            System.out.println("Seu estoque contam com "+borracha_cx+" caixas agora");
                            break;
                        }
                    break;

                    case 3:
                    for (int i = 0; i < 50; ++i) System.out.println ();
                    System.out.println("Quantidade em estoque: ");
                    System.out.println("Atualmente, contamos com: ");
                    System.out.println(caneta_cx + " caixas de canetas com " + caneta_uni +" canetas cada, totalizado " + caneta_total+ " canetas." );
                    System.out.println(lapis_cx + " caixas de lápis, com " + lapis_uni + " lápis cada, totalizando "+lapis_total+" lápis.");
                    System.out.println(resma_papel + " resmas de papel");
                    System.out.println(borracha_cx + " caixas de borracha, com "+borracha_uni+" borrachas cada, totalizando "+borracha_total+" borrachas.");
                    break;
                    
                }
                
            } while (opt != 4); 
    
            
        }else{
            System.out.println("Acesso negado.\nUsuário ou senha foi digitado incorretamente ou você não tem permissão para\nacessar o sistema");
        } 
        
    }
        
}


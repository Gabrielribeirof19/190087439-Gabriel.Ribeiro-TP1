import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    menu();
  }
  
  public static void menu(){
    int menu;
    String cliente[][] = new String[40][3];
    String produto[][] = new String[40][2];
    double quantidade_produto[][] = new double[40][3];
    int cont[] = new int [1];//contador que controla a matriz dos clientes
    cont[0] = 10;
    int cont_prod[] = new int[1];//contador que controla a matriz dos produtos
    cont_prod[0] = 10;
      
      cliente[0]= new String[] {"Gabriel", "shis", "1298731979"};
      cliente[1]= new String[] {"Fernanda", "qsf", "123456789"};
      cliente[2]= new String[] {"Juliana", "aguas claras", "956412345"};
      cliente[3]= new String[] {"Lucas", "taguatinga", "963214567"};
      cliente[4]= new String[] {"Bernardo", "ceilandia", "9523132587"};
      cliente[5]= new String[] {"Thiago", "guariroba", "9453315483"};
      cliente[6]= new String[] {"Rosilene", "asa sul", "96656552"};
      cliente[7]= new String[] {"Domingas", "asa norte", "963115487"};
      cliente[8]= new String[] {"Bruno", "chaparral", "931325648"};
      cliente[9]= new String[] {"Pedro", "sol nascente", "9132543545"};
      
      
      produto[0]= new String[] {"balinha", "doce"};
      produto[1]= new String[] {"pao de queijo", "salgado"};
      produto[2]= new String[] {"biscoito", "recheado"};
      produto[3]= new String[] {"maça", "do amor"};
      produto[4]= new String[] {"suco", "de uva"};
      produto[5]= new String[] {"suco", "goiaba"};
      produto[6]= new String[] {"suco", "manga"};
      produto[7]= new String[] {"misto", "quente"};
      produto[8]= new String[] {"hamburguer", "artesanal"};
      produto[9]= new String[] {"pizza", "quadrada"};
      
      
      quantidade_produto[0]= new double[] {5,5,5};
      quantidade_produto[1]= new double[] {4,4,4};
      quantidade_produto[2]= new double[] {6,6,6};
      quantidade_produto[3]= new double[] {2,2,2};
      quantidade_produto[4]= new double[] {3,3,3};
      quantidade_produto[5]= new double[] {1,1,1};
      quantidade_produto[6]= new double[] {7,7,7};
      quantidade_produto[7]= new double[] {8,8,8,};
      quantidade_produto[8]= new double[] {9,9,9};
      quantidade_produto[9]= new double[] {10,10,10};
    
                
                
    Scanner ler = new Scanner(System.in);
    while (true){
    System.out.print("1-Cadastre um novo cliente\n2-Busca cliente\n3-Cadastro de novo produto\n4-Busca por produto\n5-Cadastro de venda\n6-Estoque\n7-Sair\n");
     menu = ler.nextInt();
     ler.nextLine();
      switch (menu){
        case 1:
          cadastro(cliente, cont);
        break;
        case 2:
          busca(cliente, cont);
        break;
        case 3:
          cadastro_produto(produto, quantidade_produto, cont_prod);
        break;
        case 4:
          busca_produto(produto, quantidade_produto, cont_prod);
        break;
        case 5:
          venda(cliente, quantidade_produto, cont_prod, cont, produto);
        break;
        case 6:
          estoque(produto, quantidade_produto, cont_prod);
        break;
        case 7:
          System.out.println("Você saiu do nosso sistema de cadastro, volte sempre!");
          return;
        default:
          System.out.println("Entrada Inválida"); 
      }
    }
    
  }
     public static void cadastro(String cliente[][], int cont[]){
      Scanner ler = new Scanner(System.in);
      int num;
      System.out.println("Digite a quantidade de clientes a ser registrado");
      num = ler.nextInt();
      ler.nextLine();
      for(int i=0; i<num;i++){
        System.out.println("Digite o nome do cliente a ser cadastrado");
        cliente[cont[0]][0] = ler.nextLine();
        System.out.println("Digite o nome do endereço a ser cadastrado");
        cliente[cont[0]][1] = ler.nextLine();
        System.out.println("Digite o número do cliente a ser cadastrado");
        cliente[cont[0]][2] = ler.nextLine();
        cont[0]++;
      }
       
    }
    public static void busca(String cliente[][], int cont[]){
      Scanner ler = new Scanner(System.in);
      String nome;
      char mudanca;
      System.out.println("Digite o nome do cliente a ser buscasdo: ");
      nome = ler.nextLine();
      
      for(int i=0; i<cont[0]; i++){
          if(nome.equals(cliente[i][0])){
            System.out.println(cliente[i][0]);
            System.out.println(cliente[i][1]);
            System.out.println(cliente[i][2]);
            System.out.println("Deseja mudar algum dado do cliente?");
            mudanca = ler.next().charAt(0);
            ler.nextLine();
            switch (mudanca){
              case 's':
              case 'S':
              System.out.println("Digite o outro nome desejado:");
              cliente[i][0] = ler.nextLine();
              System.out.println("Digite o outro endereço desejado:");
              cliente[i][1] = ler.nextLine();
              System.out.println("Digite o outro número desejado");
              cliente[i][2] = ler.nextLine();
              System.out.println("Dados do cliente alterados!");
              return;
            default:
              return;
            }
           
          }
      
      }
      System.out.println("Cliente não encontrado!!");
    }
    public static void cadastro_produto(String produto[][], double quantidade_produto[][], int cont_prod[]){
      Scanner ler = new Scanner(System.in);
      int num;

      System.out.println("Digite a quantidade de produtos a serem cadastrados");
      num = ler.nextInt();
      ler.nextLine();
      for(int i = 0; i < num; i++){
        System.out.println("Digite o nome do produto");
        produto[cont_prod[0]][0] = ler.nextLine();
        System.out.println("Digite a descricao do produto");
        produto[cont_prod[0]][1] = ler.nextLine();
        System.out.println("Digite o valor de compra do produto");
        quantidade_produto[cont_prod[0]][0] = ler.nextDouble();
        ler.nextLine();
        System.out.println("Digite a porcentagem de lucro");
        quantidade_produto[cont_prod[0]][1] = ler.nextDouble();
        ler.nextLine();
        System.out.println("Digite a quantidade em estoque");
        quantidade_produto[cont_prod[0]][2] = ler.nextDouble();
        ler.nextLine(); 
        cont_prod[0]++;
      }
    }
    public static void busca_produto(String produto[][], double quantidade_produto[][], int cont_prod[]){
        char mudanca;
        Scanner ler = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do produto a ser buscado");
        nome = ler.nextLine();
        for(int i = 0; i < cont_prod[0]; i++){
          if(nome.equals(produto[i][0])){
            System.out.println("-------------------");
            System.out.println(produto[i][0]);
            System.out.println(produto[i][1]);
            System.out.println(quantidade_produto[i][0]);
            System.out.println(quantidade_produto[i][1]);
            System.out.println(quantidade_produto[i][2]);
            System.out.println("-------------------");
            System.out.println("Deseja mudar algum dado do produto?");
            mudanca = ler.next().charAt(0);
            ler.nextLine();
            switch (mudanca){
              case 's':
              case 'S':
              System.out.println("Digite o outro nome desejado:");
              produto[i][0] = ler.nextLine();
              System.out.println("Digite a outra descrição desejada:");
              produto[i][1] = ler.nextLine();
              System.out.println("Digite o outro valor da compra desejado: ");
              quantidade_produto[i][0] = ler.nextDouble();
              ler.nextLine();
              System.out.println("Digite o outro valor da porcentagem de lucro: ");
              quantidade_produto[i][1] = ler.nextDouble();
              ler.nextLine();
              System.out.println("Digite a outra quantidade no estoque: ");
              quantidade_produto[i][2] = ler.nextDouble();
              ler.nextLine();
              System.out.println("Dados do produto alterados!");
              return;
            default:
              return;
            }
          }
        }
      System.out.println("produto não encontrado!");
    }  
    public static void estoque(String produto[][], double quantidade_produto[][], int cont_prod[]){
      Scanner ler = new Scanner(System.in);
      for(int i = 0; i <cont_prod[0] ; i++){
          System.out.println("-------------------");
          System.out.println(produto[i][0]);
          System.out.println(produto[i][1]);
          System.out.println(quantidade_produto[i][0]);
          System.out.println(quantidade_produto[i][1]);
          System.out.println(quantidade_produto[i][2]);
           System.out.println("-------------------");
         
      }
       return;  

    } 
    public static void venda(String cliente[][], double quantidade_produto[][], int cont[], int cont_prod[], String produto[][]){
      String nome;
      String produto_venda;
      char mudanca;
      int nova_posicao = 0;
      int quantidade;
      Scanner ler = new Scanner(System.in);
      System.out.print("Lista de clintes: ");
      for(int i = 0; i<cont[0]; i++){
        System.out.println(cliente[i][0]);
      }
    
        System.out.println("Digite o nome do cliente que deseja realizar a venda: ");
        nome = ler.nextLine();
        do{
          for(int i = 0; i < cont[0]; i++){
          if(nome.equals(cliente[i][0])){
            System.out.println("Cliente encontrado!!");
          }
        }
        
        System.out.println("------------------------");
         for(int i = 0; i<cont_prod[0]; i++){
            System.out.println(produto[i][0]);
          }
        System.out.println("------------------------");
        System.out.println("Digite o nome do produto que deseja realizar a venda: ");  
        produto_venda = ler.nextLine();
          for(int i = 0; i < cont_prod[0]; i++){
            if(produto_venda.equals(produto[i][0])){
              System.out.println("Produto encontrado!!");
              nova_posicao = i;
            }
          }
        
        System.out.println("------------------------");
        System.out.println("Digite a quantidade do produto que deseja comprar: ");
        quantidade = ler.nextInt();
        ler.nextLine();
        if(quantidade_produto[nova_posicao][2] - quantidade >= 0){
          quantidade_produto[nova_posicao][2] = quantidade_produto[nova_posicao][2] - quantidade;
        }
        System.out.println("Venda concluida!");
        System.out.println("--------------------------------");        
        System.out.println("Deseja cadastrar mais vendas?(s/n) ou (S/N)");
        mudanca = ler.next().charAt(0);
        ler.nextLine();
        }while(mudanca == 's'|| mudanca == 'S');
        
    }
}  

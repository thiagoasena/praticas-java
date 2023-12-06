package PraticaOrientada03;

/*
 1.O que é uma exceção em Java e qual é o propósito de usá-las em programas?

 Uma exceção em Java é um evento anormal que ocorre durante a execução de um programa, que interrompe o fluxo normal de execução.
 Quando uma situação excepcional ocorre, um objeto de uma classe de exceção é lançado. Isso cria uma interrupção no fluxo normal 
 do programa, procurando um bloco de código que trata a exceção.

 O propósito de usar exceções em programas Java é lidar com situações imprevistas ou excepcionais que podem ocorrer durante a execução
 do programa. Exceções fornecem um mecanismo para capturar, sinalizar e tratar erros de forma estruturada. Algumas razões para usar
 exceções incluem:

 Tratamento de Erros:
 As exceções ajudam a separar o código de tratamento de erros do código principal, melhorando a legibilidade e a manutenção do código.
 
 Manuseio de Condições Excepcionais:
 Em vez de simplesmente terminar abruptamente quando ocorre um erro, as exceções permitem que o programa lide com a condição excepcional
 de uma maneira controlada e, potencialmente, recupere ou forneça informações significativas sobre o problema. 
 etc.

*/


 /*
  2.Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma. 

  Exceções Verificadas (Checked Exceptions):
  As exceções verificadas são aquelas que o compilador Java obriga você a lidar explicitamente ou declarar que seu método pode
  lançar essas exceções. Isso significa que, ao lidar com exceções verificadas, você é obrigado a utilizar try-catch ou propagar
  a exceção na assinatura do método. Exceções verificadas são geralmente usadas para lidar com condições que o programa pode prever
  e tratar, como falhas de leitura/gravação de arquivos ou problemas de conexão de rede.

  Exemplo de exceção verificada:
  import java.io.FileReader;
  import java.io.IOException;

  public class ExcecaoVerificada {
    public static void main(String[] args) {
        try {
            lerArquivo("arquivo.txt");
        } catch (IOException e) {
            System.out.println("Erro de leitura/gravação: " + e.getMessage());
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException {
        FileReader fileReader = new FileReader(nomeArquivo);
        // Lógica para ler o arquivo
        fileReader.close();
    }
 }

 Exceções Não Verificadas (Unchecked Exceptions):
 As exceções não verificadas são aquelas que o compilador Java não obriga você a lidar explicitamente. Normalmente,
 são erros que ocorrem durante a execução e que podem ser difíceis ou impossíveis de prever. As exceções não verificadas 
 são subclasses de RuntimeException ou Error. Por exemplo, NullPointerException, ArrayIndexOutOfBoundsException e ArithmeticException
 são exceções não verificadas.

 Exemplo de exceção não verificada:
 public class ExcecaoNaoVerificada {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int resultado = dividir(10, array[0]); // Possível ArrayIndexOutOfBoundsException
        System.out.println("Resultado: " + resultado);
    }

    public static int dividir(int a, int b) {
        return a / b; // Possível ArithmeticException se b for 0
    }
 }
*/


/*
   3.Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções? 

 Lidar com exceções em Java envolve o uso de palavras-chave específicas e práticas que ajudam a tratar e gerenciar situações
 excepcionais. Aqui estão as principais palavras-chave e práticas comuns para o tratamento de exceções em Java:

 Palavras-chave:
 try:
  O bloco try é usado para envolver o código que pode gerar uma exceção.

 catch:
  O bloco catch é usado para capturar e tratar exceções. Ele segue imediatamente o bloco try.

 finally:
  O bloco finally é opcional e é usado para definir código que sempre será executado, independentemente de ocorrer ou não uma exceção
  no bloco try.

 throw:
  A palavra-chave throw é usada para explicitamente lançar uma exceção manualmente em qualquer parte do código.

 throws:
  A palavra-chave throws é usada na assinatura do método para declarar que um método pode lançar exceções específicas,
  mas não as trata localmente.

  Utilizar Try-Catch:
  Envolver código suscetível a exceções em blocos try e tratar as exceções correspondentes em blocos catch.

  try {
    // Código que pode gerar uma exceção
 } catch (TipoDeExcecao1 e1) {
    // Tratar exceção TipoDeExcecao1
 } catch (TipoDeExcecao2 e2) {
    // Tratar exceção TipoDeExcecao2
 } finally {
    // Código a ser executado sempre, independentemente de exceções
 }

 Usar Múltiplos Catch:
 Capturar diferentes tipos de exceções em blocos catch separados para fornecer tratamento específico para cada tipo.

 try {
    // Código que pode gerar exceções
 } catch (Excecao1 e1) {
    // Tratar exceção Excecao1
 } catch (Excecao2 e2) {
    // Tratar exceção Excecao2
 } catch (Exception e) {
    // Tratar exceções genéricas (último bloco catch para exceções não tratadas anteriormente)
 }

*/

/*
 4.O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

 O bloco try-catch em Java é utilizado para lidar com exceções, oferecendo um mecanismo para capturar e tratar erros durante a execução
 do programa. A estrutura básica consiste em um bloco try que contém o código propenso a exceções, seguido por blocos catch que tratam
 exceções específicas e, opcionalmente, um bloco finally que contém código a ser executado independentemente de ocorrer ou não uma 
 exceção.

 Funcionamento:

 1. O código dentro do bloco try é executado normalmente.

 2.Se uma exceção ocorrer, a execução do bloco try é interrompida, e o controle é transferido para o bloco catch correspondente (se houver).

 3.O bloco catch trata a exceção capturada, executando código específico para esse tipo de exceção.

 4.O bloco finally (se presente) é executado após o bloco try (se não houver exceção) ou após o bloco catch (se houver exceção).

 */

/*
 5.Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria 
 uma exceção personalizada.

 Criar suas próprias exceções personalizadas em Java é apropriado quando você precisa sinalizar e tratar situações específicas que
 não podem ser adequadamente representadas por exceções existentes. Geralmente, isso ocorre quando você está desenvolvendo uma 
 biblioteca, framework ou aplicativo em que certas condições excepcionais específicas para o seu domínio precisam ser comunicadas
 de maneira clara e eficaz.

 Como Criar uma Exceção Personalizada em Java:

 Estenda a classe Exception ou suas subclasses:
 Para criar uma exceção personalizada, você deve estender a classe Exception ou uma de suas subclasses, como RuntimeException
 ou qualquer outra classe de exceção existente, dependendo das características do seu caso.

 public class MinhaExcecao extends Exception {
    // Construtores, métodos adicionais e personalizações, se necessário
 }

 Construtores Personalizados (Opcional):
 Adicione construtores personalizados à sua exceção para permitir a passagem de informações adicionais, mensagens de erro ou causas.

 public class MinhaExcecao extends Exception {
    public MinhaExcecao() {
        super("Mensagem padrão da exceção");
    }

    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }

    // Outros construtores e métodos, se necessário
 }

 Quando Criar Exceções Personalizadas:

 Situações de Domínio Específicas:
 Quando você precisa representar condições excepcionais específicas para o domínio da aplicação.

 Comunicação Clara de Erros:
 Para fornecer mensagens de erro mais significativas e melhorar a comunicação sobre o que deu errado.

 Tratamento Diferenciado:
 Quando você deseja que o código cliente possa tratar exceções personalizadas de maneira diferente das exceções Java padrão.

 Por que Criar Exceções Personalizadas:

 Melhor Expressividade:
 Permite expressar intenções claras e específicas sobre o motivo da exceção.

 Melhora a Legibilidade:
 Facilita a leitura do código e o entendimento de situações excepcionais específicas.

 Manutenção Facilitada:
 Facilita a manutenção do código, pois as exceções personalizadas encapsulam detalhes específicos de implementação.
 */
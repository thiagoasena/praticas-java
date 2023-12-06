/*O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os
 em C++ e em Java
 */

/*
 * Em programação orientada a objetos, uma classe é uma estrutura que define um tipo de objeto. 
   Ela encapsula dados e comportamentos que podem ser associados a esses objetos. 
   Uma classe é como um plano ou um modelo para criar objetos. Em Java, por exemplo, 
   a estrutura básica de uma classe seria algo assim:
 */

/*public class MinhaClasse {
    // Variáveis de instância (dados)
    private int numero;
    private String texto;

    // Construtor
    public MinhaClasse(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    // Métodos (comportamentos)
    public void exibirInformacoes() {
        System.out.println("Número: " + numero);
        System.out.println("Texto: " + texto);
    }
}
*/

/*Agora, a diferença entre uma classe e um objeto é que uma classe é apenas uma estrutura ou um modelo, 
enquanto um objeto é uma instância específica dessa estrutura. Você cria objetos com base em uma classe. 
No exemplo acima, um objeto da classe MinhaClasse teria um número e um texto associado a ele.
*/

/*
 * Exemplos C++
 * 
 * #include <iostream>
  #include <string>

 class MinhaClasse {
 private:
    int numero;
    std::string texto;

 public:
    MinhaClasse(int numero, std::string texto) : numero(numero), texto(texto) {}

    void exibirInformacoes() {
        std::cout << "Número: " << numero << std::endl;
        std::cout << "Texto: " << texto << std::endl;
    }
 };

 int main() {
    // Criando um objeto da classe MinhaClasse em C++
    MinhaClasse objetoCplusplus(42, "Olá, C++!");
    objetoCplusplus.exibirInformacoes();

    return 0;
 }
 */

/*
 * Exemplo Java
   public class MinhaClasse {
   private int numero;
   private String texto;

   public MinhaClasse(int numero, String texto) {
       this.numero = numero;
       this.texto = texto;
   }

   public void exibirInformacoes() {
       System.out.println("Número: " + numero);
       System.out.println("Texto: " + texto);
   }

   public static void main(String[] args) {
       // Criando um objeto da classe MinhaClasse em Java
       MinhaClasse objetoJava = new MinhaClasse(42, "Olá, Java!");
       objetoJava.exibirInformacoes();
   }
}

 */

/*
 * Como você declara uma variável em Java e quais são os tipos de dados 
   primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na 
   linguagem C++ 
 */

/*
 * Em Java, você declara uma variável da seguinte maneira:
   tipoDaVariavel nomeDaVariavel;

   Aqui estão alguns exemplos de declaração de variáveis em Java:
   int numeroInteiro;
   double numeroDecimal;
   boolean condicao;
   char caractere;
   String texto;
   
   Agora, em C++, a declaração de variáveis segue uma sintaxe ligeiramente diferente:
   tipoDaVariavel nomeDaVariavel;

   Mesmos exemplos em c++:
   int numeroInteiro;
   double numeroDecimal;
   bool condicao;
   char caractere;
   std::string texto; // Em C++, você usa std::string para representar uma cadeia de caracteres

   Ambas as linguagens possuem tipos de dados primitivos para representar números inteiros,
   números de ponto flutuante, valores booleanos, caracteres e cadeias de texto. No entanto,
   há algumas diferenças sutis, como o uso de String em Java e std::string em C++ para representar
   cadeias de texto. Além disso, os tipos primitivos em Java são sempre inicializados automaticamente
   com valores padrão, enquanto em C++, a inicialização pode depender do contexto em que as variáveis 
   são declaradas.
 */

/*
 * A herança é um conceito fundamental na programação orientada a objetos que permite criar
 *  uma nova classe (subclasse) baseada em uma classe já existente (superclasse). A subclasse
 *  herda características (membros e métodos) da superclasse e pode adicionar ou modificar essas
 *  características conforme necessário. Em Java, a herança é implementada usando a palavra-chave
 *  extends. Em C++, é usada a palavra-chave : public para alcançar o mesmo objetivo.
 * 
 * Exemplo em Java:
 * 
   Considere uma classe Animal:  
   public class Animal {
   protected String nome;

  public Animal(String nome) {
    this.nome = nome;
 }

  public void fazerSom() {
    System.out.println("Fazendo som genérico");
 }

}

 Agora, vamos criar uma subclasse Cachorro que herda de Animal:

 public class Cachorro extends Animal {
 public Cachorro(String nome) {
    super(nome);
}

 Adicionando um comportamento específico para Cachorro
 public void latir() {
 System.out.println("Au au!");
}
}

 Exemplo em C++:
 A mesma hierarquia de classes em C++:

 #include <iostream>
 #include <string>

 class Animal {
 protected:
 std::string nome;

 public:
 Animal(std::string nome) : nome(nome) {}

 void fazerSom() {
    std::cout << "Fazendo som genérico" << std::endl;
  }
 };

 class Cachorro : public Animal {
 public:
 Cachorro(std::string nome) : Animal(nome) {}

 // Adicionando um comportamento específico para Cachorro
 void latir() {
    std::cout << "Au au!" << std::endl;
 }
 };
 */

/*
    Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente.
    Discorra sobre esse aspecto.

    Em Java, as variáveis de tipos primitivos armazenam diretamente os valores, enquanto as variáveis 
    de objetos armazenam referências (ou ponteiros) para os objetos. Em outras palavras, em Java, as
    variáveis de tipos de objeto contêm uma referência à área de memória onde o objeto está localizado.
    O gerenciamento de memória em Java é automatizado, e os objetos são alocados no heap e coletados 
    automaticamente pelo garbage collector quando não são mais referenciados.
 */

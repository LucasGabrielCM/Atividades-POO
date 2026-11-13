import java.util.Scanner;

class Fatura {
    private int numeroItem;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(int numeroItem, String descricao, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public int getNumeroItem() { return numeroItem; }
    public void setNumeroItem(int numeroItem) { this.numeroItem = numeroItem; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade > 0 ? quantidade : 0;
    }

    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    public double calcular_valor_fatura() {
        return quantidade * precoUnitario;
    }
}

class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public int getAndarAtual() { return andarAtual; }
    public void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0 && andarAtual <= totalAndares) this.andarAtual = andarAtual;
    }

    public int getTotalAndares() { return totalAndares; }
    public void setTotalAndares(int totalAndares) {
        if (totalAndares >= 0) this.totalAndares = totalAndares;
    }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) {
        if (capacidade >= 0) this.capacidade = capacidade;
    }

    public int getPessoasPresentes() { return pessoasPresentes; }
    public void setPessoasPresentes(int pessoasPresentes) {
        if (pessoasPresentes >= 0 && pessoasPresentes <= capacidade) this.pessoasPresentes = pessoasPresentes;
    }

    public boolean entrar() {
        if (pessoasPresentes < capacidade) { pessoasPresentes++; return true; }
        return false;
    }

    public boolean sair() {
        if (pessoasPresentes > 0) { pessoasPresentes--; return true; }
        return false;
    }

    public boolean subir() {
        if (andarAtual < totalAndares) { andarAtual++; return true; }
        return false;
    }

    public boolean descer() {
        if (andarAtual > 0) { andarAtual--; return true; }
        return false;
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) this.nome = nome;
        else if (this.nome == null) this.nome = "Não informado";
    }

    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        if (idade >= 0) this.idade = idade;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) {
        if (cpf != null && cpf.replaceAll("\\D", "").length() == 11) this.cpf = cpf;
        else if (this.cpf == null) this.cpf = "CPF inválido";
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | CPF: " + cpf;
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco >= 0 ? preco : 0.0; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade >= 0 ? quantidade : 0; }

    public double calcularValorTotal() {
        return preco * quantidade;
    }
}

class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumero() { return numero; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }

    public boolean depositar(double valor) {
        if (valor > 0) { saldo += valor; return true; }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) { saldo -= valor; return true; }
        return false;
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public int getVelocidadeAtual() { return velocidadeAtual; }

    public void acelerar(int incremento) {
        if (incremento > 0) velocidadeAtual += incremento;
    }

    public void frear(int decremento) {
        if (decremento > 0) velocidadeAtual = Math.max(0, velocidadeAtual - decremento);
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public boolean isDisponivel() { return disponivel; }

    public boolean emprestar() {
        if (disponivel) { disponivel = false; return true; }
        return false;
    }

    public boolean devolver() {
        if (!disponivel) { disponivel = true; return true; }
        return false;
    }
}

class Funcionario {
    private String nome;
    private double salarioBase;
    private String cargo;

    public Funcionario(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        setSalarioBase(salarioBase);
        this.cargo = cargo;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase >= 0 ? salarioBase : 0.0;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double calcularSalarioLiquido() {
        return salarioBase * 0.90;
    }
}

class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() { return largura; }
    public void setLargura(double largura) {
        if (largura > 0) this.largura = largura;
        else if (this.largura <= 0) this.largura = 1.0;
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        if (altura > 0) this.altura = altura;
        else if (this.altura <= 0) this.altura = 1.0;
    }

    public double calcularArea() { return largura * altura; }

    public double calcularPerimetro() { return 2 * (largura + altura); }
}

class Aluno {
    private int matricula;
    private String nome;
    private double mediaFinal;

    public Aluno(int matricula, String nome, double mediaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        setMediaFinal(mediaFinal);
    }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getMediaFinal() { return mediaFinal; }
    public void setMediaFinal(double mediaFinal) {
        if (mediaFinal >= 0 && mediaFinal <= 10) this.mediaFinal = mediaFinal;
    }

    public boolean verificarAprovacao() {
        return mediaFinal >= 6;
    }
}

class Filme {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private int duracao;

    public Filme(String titulo, String diretor, int anoLancamento, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }

    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { if (duracao > 0) this.duracao = duracao; }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Duração: " + duracao + " min");
    }
}

class Celular {
    private String marca;
    private String modelo;
    private double preco;
    private int armazenamento;

    public Celular(String marca, String modelo, double preco, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        setPreco(preco);
        setArmazenamento(armazenamento);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco >= 0 ? preco : 0.0; }

    public int getArmazenamento() { return armazenamento; }
    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento > 0 ? armazenamento : 0;
    }

    public void exibirResumo() {
        System.out.printf("%s %s | R$ %.2f | %d GB%n", marca, modelo, preco, armazenamento);
    }
}

public class Atividade_POO {

    static Scanner entrada = new Scanner(System.in);

    static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextLine();
    }

    static int lerInt(String mensagem) {
        System.out.print(mensagem);
        return Integer.parseInt(entrada.nextLine().trim());
    }

    static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        return Double.parseDouble(entrada.nextLine().trim().replace(",", "."));
    }

    static void atividade1() {
        int numero = lerInt("Número do item: ");
        String descricao = lerTexto("Descrição do item: ");
        int quantidade = lerInt("Quantidade comprada: ");
        double preco = lerDouble("Preço unitário: ");

        Fatura fatura = new Fatura(numero, descricao, quantidade, preco);

        System.out.println("Item " + fatura.getNumeroItem() + " - " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.printf("Preço unitário: R$ %.2f%n", fatura.getPrecoUnitario());
        System.out.printf("Valor da fatura: R$ %.2f%n", fatura.calcular_valor_fatura());
    }

    static void atividade2() {
        int capacidade = lerInt("Capacidade do elevador: ");
        int andares = lerInt("Total de andares do prédio (sem o térreo): ");
        Elevador elevador = new Elevador(capacidade, andares);

        int opcao;
        do {
            System.out.println("\nAndar atual: " + elevador.getAndarAtual()
                    + " | Pessoas: " + elevador.getPessoasPresentes() + "/" + elevador.getCapacidade());
            System.out.println("1 - Entrar | 2 - Sair | 3 - Subir | 4 - Descer | 0 - Voltar");
            opcao = lerInt("Escolha: ");
            switch (opcao) {
                case 1 -> System.out.println(elevador.entrar() ? "Uma pessoa entrou." : "Elevador lotado!");
                case 2 -> System.out.println(elevador.sair() ? "Uma pessoa saiu." : "O elevador está vazio!");
                case 3 -> System.out.println(elevador.subir() ? "Subiu um andar." : "Já está no último andar!");
                case 4 -> System.out.println(elevador.descer() ? "Desceu um andar." : "Já está no térreo!");
                case 0 -> System.out.println("Voltando ao menu...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    static void questao1() {
        String nome = lerTexto("Nome: ");
        int idade = lerInt("Idade: ");
        String cpf = lerTexto("CPF: ");

        Pessoa pessoa = new Pessoa(nome, idade, cpf);
        System.out.println("Pessoa cadastrada:");
        System.out.println(pessoa);

        int nova = lerInt("Digite uma nova idade para alterar: ");
        pessoa.setIdade(nova);
        System.out.println("Dados atualizados:");
        System.out.println(pessoa);
    }

    static void questao2() {
        String nome = lerTexto("Nome do produto: ");
        double preco = lerDouble("Preço: ");
        int quantidade = lerInt("Quantidade em estoque: ");

        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.printf("Valor total em estoque: R$ %.2f%n", produto.calcularValorTotal());
    }

    static void questao3() {
        int numero = lerInt("Número da conta: ");
        String titular = lerTexto("Titular: ");
        ContaBancaria conta = new ContaBancaria(numero, titular);

        int opcao;
        do {
            System.out.printf("%nSaldo atual: R$ %.2f%n", conta.getSaldo());
            System.out.println("1 - Depositar | 2 - Sacar | 0 - Voltar");
            opcao = lerInt("Escolha: ");
            switch (opcao) {
                case 1 -> {
                    double valor = lerDouble("Valor do depósito: ");
                    System.out.println(conta.depositar(valor) ? "Depósito realizado." : "Valor inválido!");
                }
                case 2 -> {
                    double valor = lerDouble("Valor do saque: ");
                    System.out.println(conta.sacar(valor) ? "Saque realizado." : "Saque inválido ou saldo insuficiente!");
                }
                case 0 -> System.out.println("Voltando ao menu...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    static void questao4() {
        String marca = lerTexto("Marca: ");
        String modelo = lerTexto("Modelo: ");
        int ano = lerInt("Ano: ");
        Carro carro = new Carro(marca, modelo, ano);

        int opcao;
        do {
            System.out.println("\n" + carro.getMarca() + " " + carro.getModelo() + " (" + carro.getAno() + ")"
                    + " | Velocidade: " + carro.getVelocidadeAtual() + " km/h");
            System.out.println("1 - Acelerar | 2 - Frear | 0 - Voltar");
            opcao = lerInt("Escolha: ");
            switch (opcao) {
                case 1 -> carro.acelerar(lerInt("Quanto deseja acelerar (km/h)? "));
                case 2 -> carro.frear(lerInt("Quanto deseja frear (km/h)? "));
                case 0 -> System.out.println("Voltando ao menu...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    static void questao5() {
        String titulo = lerTexto("Título: ");
        String autor = lerTexto("Autor: ");
        int ano = lerInt("Ano de publicação: ");
        Livro livro = new Livro(titulo, autor, ano);

        int opcao;
        do {
            System.out.println("\n" + livro.getTitulo() + " - " + livro.getAutor() + " (" + livro.getAnoPublicacao() + ")");
            System.out.println("Status: " + (livro.isDisponivel() ? "Disponível" : "Emprestado"));
            System.out.println("1 - Emprestar | 2 - Devolver | 0 - Voltar");
            opcao = lerInt("Escolha: ");
            switch (opcao) {
                case 1 -> System.out.println(livro.emprestar() ? "Livro emprestado." : "O livro já está emprestado!");
                case 2 -> System.out.println(livro.devolver() ? "Livro devolvido." : "O livro já está disponível!");
                case 0 -> System.out.println("Voltando ao menu...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    static void questao6() {
        String nome = lerTexto("Nome do funcionário: ");
        double salario = lerDouble("Salário base: ");
        String cargo = lerTexto("Cargo: ");

        Funcionario funcionario = new Funcionario(nome, salario, cargo);
        System.out.println(funcionario.getNome() + " - " + funcionario.getCargo());
        System.out.printf("Salário base: R$ %.2f%n", funcionario.getSalarioBase());
        System.out.printf("Salário líquido (desconto de 10%%): R$ %.2f%n", funcionario.calcularSalarioLiquido());
    }

    static void questao7() {
        double largura = lerDouble("Largura: ");
        double altura = lerDouble("Altura: ");

        Retangulo retangulo = new Retangulo(largura, altura);
        System.out.println("Largura: " + retangulo.getLargura() + " | Altura: " + retangulo.getAltura());
        System.out.printf("Área: %.2f%n", retangulo.calcularArea());
        System.out.printf("Perímetro: %.2f%n", retangulo.calcularPerimetro());
    }

    static void questao8() {
        int matricula = lerInt("Matrícula: ");
        String nome = lerTexto("Nome: ");
        double media = lerDouble("Média final (0 a 10): ");

        Aluno aluno = new Aluno(matricula, nome, media);
        System.out.println("Aluno: " + aluno.getNome() + " (matrícula " + aluno.getMatricula() + ")");
        System.out.println("Média final: " + aluno.getMediaFinal());
        if (aluno.verificarAprovacao()) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }

    static void questao9() {
        String titulo = lerTexto("Título do filme: ");
        String diretor = lerTexto("Diretor: ");
        int ano = lerInt("Ano de lançamento: ");
        int duracao = lerInt("Duração (minutos): ");

        Filme filme = new Filme(titulo, diretor, ano, duracao);
        System.out.println();
        filme.exibirInformacoes();
    }

    static void questao10() {
        String marca = lerTexto("Marca: ");
        String modelo = lerTexto("Modelo: ");
        double preco = lerDouble("Preço: ");
        int armazenamento = lerInt("Armazenamento interno (GB): ");

        Celular celular = new Celular(marca, modelo, preco, armazenamento);
        System.out.println();
        celular.exibirResumo();
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1  - Atividade 1 (Fatura)");
            System.out.println("2  - Atividade 2 (Elevador)");
            System.out.println("3  - Questão 1 (Pessoa)");
            System.out.println("4  - Questão 2 (Produto)");
            System.out.println("5  - Questão 3 (Conta Bancária)");
            System.out.println("6  - Questão 4 (Carro)");
            System.out.println("7  - Questão 5 (Livro)");
            System.out.println("8  - Questão 6 (Funcionário)");
            System.out.println("9  - Questão 7 (Retângulo)");
            System.out.println("10 - Questão 8 (Aluno)");
            System.out.println("11 - Questão 9 (Filme)");
            System.out.println("12 - Questão 10 (Celular)");
            System.out.println("0  - Sair");
            opcao = lerInt("Escolha: ");
            switch (opcao) {
                case 1 -> atividade1();
                case 2 -> atividade2();
                case 3 -> questao1();
                case 4 -> questao2();
                case 5 -> questao3();
                case 6 -> questao4();
                case 7 -> questao5();
                case 8 -> questao6();
                case 9 -> questao7();
                case 10 -> questao8();
                case 11 -> questao9();
                case 12 -> questao10();
                case 0 -> System.out.println("Código encerrado!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}

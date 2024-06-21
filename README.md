# 📋Cadastro e Listagem de Produtos
Este projeto é um simples programa em Java para cadastro e listagem de produtos. Ele permite ao usuário cadastrar novos produtos e listar todos os produtos cadastrados ordenados pelo valor.

## ✅Requisitos
- JDK (Java Development Kit) 8 ou superior
- IDE ou editor de texto de sua escolha (recomendado: IntelliJ IDEA, Eclipse, VSCode)

## 🚀Como executar o projeto
- Passo 1: Clonar o repositório
Clone o repositório ou copie os arquivos ProdutosMain.java e Produto.java para um diretório de sua escolha.

- Passo 2: Abrir na IDE
Abra o diretório na IDE de sua preferência e execute ProdutosMain.java

## 🔧Funcionalidades do programa
Menu de opções
O programa apresenta um menu com as seguintes opções:

- Cadastrar produto
- Listar produtos
- Sair
  
## 📝Cadastro de produto

### Para cadastrar um novo produto, o usuário deve fornecer as seguintes informações:

Nome do produto
Descrição do produto
Valor do produto
Disponibilidade do produto (sim ou não)
Listagem de produtos
A listagem de produtos exibe todos os produtos cadastrados, ordenados pelo valor em ordem crescente. Se não houver produtos cadastrados, o programa informará que a lista está vazia.

## 🛠️Estrutura do código
### Classe ProdutosMain
Esta classe contém o método main e gerencia o fluxo do programa. Ela é responsável por apresentar o menu de opções, capturar as entradas do usuário e chamar os métodos apropriados para cadastrar e listar produtos.

### Classe Produto
Esta classe representa um produto e contém os seguintes atributos:

- nome: Nome do produto
- descricao: Descrição do produto
- valor: Valor do produto
- disponivel: Disponibilidade do produto
- A classe também inclui getters e setters para cada atributo e um método toString para formatar a exibição do produto.

## ⚙️Ajustes e melhorias
O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas nas seguintes tarefas:

- [ ] Melhorar o tratamento de erros
- [ ] Salvar dados em um arquivo
- [ ] Validar entrada de dados



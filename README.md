# PizzariaMania

Este é um sistema completo para gerenciar uma pizzaria, incluindo tanto o back-end quanto o front-end. Ele permite que os usuários visualizem pizzas disponíveis, façam pedidos e gerenciem o sistema de forma simples e eficiente. Foi desenvolvido utilizando Java com o Spring Boot para o back-end e tecnologias como HTML, CSS e JavaScript no front-end. 

**Créditos**: Agradecimentos especiais à [Sophia Alexandra](https://github.com/sophi-hub) por ter contribuído significativamente na melhoria do front-end originalmente desenvolvido por mim.
<img src="https://i.imgur.com/ouvDO9Q.png">
## Funcionalidades
1. **Back-End**:
   - Listar todos os pedidos.
   - Registrar um novo pedido.
   - Listar todas as pizzas disponíveis.
   - Adicionar uma nova pizza ao cardápio.
   - Remoder uma pizza do cardápio.

2. **Front-End**:
   - Página inicial com o cardápio de pizzas, incluindo imagens, descrições e preços.
   - Botão de compra integrado para selecionar e registrar pedidos.
   - Formulário de entrega com dados para realizar pedidos e enviar ao backend via API REST.

## Estrutura do Projeto
- **Tecnologias Utilizadas**:
  - **BackEnd**: Java com Spring Boot
  - **Frontend**: HTML,CSS E JAVASCRIPT
  - **BANCO DE DADOS**: MySQL
  - **ORM**: Hibernate (via Spring Data JPA)
  - **Modelo RESTful**: Implementação via controller
  - **Estilo Visual**: Personalizado com CSS
    
- **Back-End**:
  - Código fonte localizado na pasta `src/main/java/com/sistema/pizzariamania/`.
  - Configuração de banco de dados no arquivo `application.properties`.

- **Front-End**:
  - Arquivos HTML, CSS e JS localizados na pasta `src/main/resources/static/`.
  - Imagens das pizzas na subpasta `img/`.

### Páginas Front-End
1. `index.html`: Página inicial com o cardápio de pizzas.
2. `formvenda.html`: Formulário para coletar dados de entrega e finalizar pedidos.
3. `styles.css`: Arquivo de estilos com design responsivo e moderno.
4. `script.js`: Inclui lógica para interatividade, como salvar o valor da pizza selecionada e enviar pedidos ao back-end.

---

## Instalação

### Pré-requisitos
Certifique-se de que as seguintes dependências estão instaladas:
- **Java** (versão 17 ou superior).
- **Maven**.
- **MySQL**.
- **Um editor de texto/IDE** (recomendado: IntelliJ IDEA para o backend e Visual Studio Code para o frontend).
- **Um navegador web** (Chrome, Firefox, etc.).

### Passo a Passo
1. **Clone o Repositório**: Abra o terminal e execulte:
```
git clone https://github.com/seu-usuario/pizzaria-mania.git
cd pizzaria-mania
```
2. **Confirguração do Banco de Dados**:
   
   - Abra o MySQL Workbench ou qualquer ferramenta de gerenciamento de banco de dados e crie um banco chamado (``db_pizzaria``).
   - Atualize o arquivo (``src/main/resources/application.properties``) com as suas credenciais:
```
spring.datasource.url=jdbc:mysql://localhost:3306/db_pizzaria
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha //Se não tiver senha, deixe em branco.
```

3. **Execultando o Backend**:
   - importe o projeto para sua IDE favorita
   - Execute a aplicação backend via sua IDE (``src/main/java/com.sistema.pizzariamania/PizzariaMania.Java``) ou Utilizando esse comando: (``mvn spring-boot:run``)

4. **Execultando o Frontend**:
   - Acesse o arquivo (``index.html``) diretamente em um navegador ou digite a URL abaixo no navegador: (``http://localhost:8080/index.html``)
   - Isso abrirá a página inicial com o cardápio de pizzas, permitindo que os usuários visualizem as opções disponíveis e iniciem pedidos.

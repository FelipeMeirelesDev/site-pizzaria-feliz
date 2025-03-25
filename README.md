# PizzariaMania

Este é um sistema completo para gerenciar uma pizzaria, incluindo tanto o **back-end** quanto o **front-end**. Ele permite que os usuários visualizem pizzas disponíveis, façam pedidos e gerenciem o sistema de forma simples e eficiente. Foi desenvolvido utilizando **Java** com o **Spring Boot** para o back-end, e tecnologias como **HTML**, **CSS** e **JavaScript** no front-end.
<img src="https://i.imgur.com/jvvyOON.png">
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
- **Um editor de texto/IDE** (recomendado: IntelliJ IDEA ou Eclipse para o backend e Visual Studio Code para o frontend).
- Um navegador web (Chrome, Firefox, etc.).

### Passo a Passo
1. **Clone o Repositório**: Abra o terminal e execulte:
```
git clone https://github.com/seu-usuario/pizzaria-mania.git
cd pizzaria-mania
```
2. **Confirguração do Banco de Dados**: Abra o terminal e execulte:
   
   - Abra o MySQL Workbench ou qualquer ferramenta de gerenciamento de banco de dados e crie um banco chamado .
   - Atualize o arquivo (``src/main/resources/application.properties``) com as suas credenciais:
```
spring.datasource.url=jdbc:mysql://localhost:3306/db_pizzaria
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

3. **Execultando o Backend**:
   - Clone esse repositório
   - importe o projeto para sua IDE favorita
   - Execute a aplicação backend via sua IDE (``src/main/java/com.sistema.pizzariamania/PizzariaMania.Java``) ou Utilizando esse comando: (``mvn spring-boot:run``)

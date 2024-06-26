##Landing Page papelmache

#Contextualização:
A experiência de desenvolver uma landing page para a gráfica Papel Machê foi um processo de aprendizado profundo, onde teorias e práticas da disciplina de desenvolvimento web em Java foram aplicadas. Utilizando a IDE IntelliJ, o projeto focou na criação de uma landing page moderna e funcional para aumentar a presença online da gráfica e melhorar sua visibilidade no mercado. As ferramentas principais utilizadas incluíram Spring Boot, Thymeleaf, Maven, HTML, CSS, e JavaScript.

O projeto teve início com um levantamento de requisitos junto aos colaboradores da gráfica para entender suas necessidades e expectativas. Isso foi seguido por uma fase de design para estruturação do layout adequado. A implementação envolveu o desenvolvimento de uma aplicação Spring Boot, a criação de templates Thymeleaf para a interface do usuário, e a integração de CSS e JavaScript para um design responsivo e interativo. Todo o desenvolvimento foi feito no IntelliJ, com o uso de Git para controle de versão.

#Metodologia:
O desenvolvimento da landing page seguiu uma metodologia ágil, com várias iterações para garantir que os requisitos dos stakeholders fossem atendidos de maneira eficaz. Os métodos e processos adotados foram:

Levantamento de requisitos: Realizado através de entrevistas e questionários com os colaboradores da gráfica. Este processo ajudou a identificar as funcionalidades essenciais e o conteúdo que deveria ser destacado na landing page.

Planejamento e design: Utilizando um template disponibilizado pela empresa Solid, a estrutura e o layout da landing page foram definidos. Esta etapa foi crucial para alinhar as expectativas e garantir que o design fosse intuitivo e atraente.

#Desenvolvimento: O desenvolvimento foi realizado utilizando:

- Spring Boot: Framework principal para a criação da aplicação.
- Thymeleaf: Motor de templates utilizado para renderizar a interface do usuário.
- Maven: Ferramenta de gerenciamento de dependências.
- HTML, CSS, JavaScript: Tecnologias para a criação e estilização das páginas web.
- IntelliJ IDEA: IDE utilizada para o desenvolvimento do projeto.
A estrutura básica do projeto foi a seguinte:
```
papelmache-landingpage/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── papelmache/
│   │   │           ├── PapelmacheApplication.java
│   │   │           └── controller/
│   │   │               └── HomeController.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   │   ├── css/
│   │   │   │   │   └── style.css
│   │   │   │   └── js/
│   │   │   │       └── script.js
│   │   │   ├── templates/
│   │   │   │   └── index.html
│   │   │   └── application.properties
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── papelmache/
│   │               └── PapelmacheApplicationTests.java
├── pom.xml
└── README.md ```

PapelmacheApplication.java: Classe principal da aplicação Spring Boot.
HomeController.java: Controlador principal mapeando a URL raiz para a página index.html.
index.html: Template Thymeleaf da landing page.
style.css: Arquivo de estilo CSS.
script.js: Arquivo de script JavaScript.
application.properties: Arquivo de configuração da aplicação.
PapelmacheApplicationTests.java: Classe para testes unitários.
Testes e ajustes: Realizei testes em diferentes navegadores e dispositivos para garantir a responsividade e a funcionalidade da landing page. Feedback contínuo dos colaboradores foi utilizado para realizar ajustes e melhorias na aplicação.

- Treinamento: Realizei sessões de treinamento com os colaboradores da gráfica para ensinar como utilizar e instruir o usuário sob qualquer dúvida. Documentação técnica foi fornecida para suportar o processo de treinamento.

- Integração com WhatsApp: Uma das funcionalidades implementadas foi a inserção de links nos botões do site que redirecionam os usuários para uma conversa no WhatsApp. Esta funcionalidade permite que os clientes entrem em contato diretamente com um atendente da gráfica, facilitando a comunicação e o atendimento. A integração foi realizada utilizando links diretos para o WhatsApp Web.

- A aplicação foi hospedada no Google Cloud e pode ser acessada pelo link: https://papelmache.uc.r.appspot.com/
Os códigos segue no repositório do github: https://github.com/ArgusPortal/papelmache
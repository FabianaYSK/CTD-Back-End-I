# CTD-Back-End-I

# Aula 22 - Padrão MVC
- Criar um projeto em https://start.spring.io.
- Realizar o download do projeto e descompactá-lo para abrir no IntelliJ IDEA.
- No IntelliJ, acesse o menu “File” > “New” > “Project from Existing Sources”.
- Criar um modelo, ou seja, uma classe de negócio Trainer.
- Criar um package service dentro do projeto. Adicionar a interface TrainerService e sua implementação na classe TrainerServiceImpl.
- A anotação @Service sinaliza ao Spring que é um serviço. Podemos ver em listTrainer que estamos adicionando os dados manualmente. Em uma aplicação, devemos ir para nossa camada DAO para obtermos os dados de um banco.
- Criar um controller no package controller.
- Como pudemos observar, a classe Controller se refere ao serviço (a model) e será transformado automaticamente em JSON, que será nossa visão. Isso acontece dentro da anotação @GetMapping. Dentro do Controller, devemos adicionar o @Controller para informar ao Spring que esse é o nosso controller e @RequestMapping para adicionar nossa URL, neste caso “/trainer”.
- Veremos nas próximas aulas a anotação @Autowired, mas podemos mencionar que trata-se da conexão entre a model e o controller.
- Agora podemos executar nosso servidor a partir do método main da classe TrainerApplication e acessar no navegador, por exemplo no Chrome, o endereço http://localhost:8080/trainer, devendo ser exibido nossa view, que neste caso é a resposta de uma API Rest.

# Mesa 22 - Padrão MVC
- Criar um projeto em https://start.spring.io.
- Realizar o download do projeto e descompactá-lo para abrir no IntelliJ IDEA. 
- No IntelliJ, acesse o menu “File” > “New” > “Project from Existing Sources”.
- Recrie o mesma estrutura do exemplo do Professor com o padrão MVC.
- Trabalhe com uma classe chamada Veiculo e os seguintes atributos: Marca e cor. Logo, execute o projeto chamando a rota http://localhost:8080/listaveiculos.


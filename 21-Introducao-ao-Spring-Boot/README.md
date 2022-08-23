# CTD-Back-End-I

# Aula 21 - Introdução ao Spring Boot
- Primeiro, acesse o seguinte link: https://start.spring.io.
- Ao visualizar a seguinte tela, preencha os campos “Artifact” (artefato) “Name” (nome). Ao informar primeiramente o campo “Artifact”, o campo “Name” será preenchido automaticamente com o mesmo valor. Os demais campos devem permanecer com os valores que já estão preenchidos.
- Após informar o campos mencionados no passo anterior, pressione o botão “ADD DEPENDENCIES” (adicionar dependências).
- Então será exibida a seguinte tela, onde deverá escolher a opção “Spring Web”.
- Em seguida, pressione em “Generate” (gerar). E será realizado o download do arquivo .zip, o qual você terá que descompactá-lo e abrir o projeto no Intellij IDEA. 
- No Intellij IDEA, você deve ir para  “File -> New -> Project from Existing Source”. Localize a pasta Animal que você descompactou com o projeto e  abra o arquivo pom.xml.
- Encontre a classe Application e execute o método main.
- Em seguida, você deve ir para o navegador e acessar localhost:8080.
- Criar um index.html na pasta /src/main/resources/static/.
- Execute o método main novamente.
- Por fim, você deve ir para o navegador e acessar localhost:8080.
- Você receberá a mensagem criada no index.html na tela.

# Mesa 21 - Introdução ao Spring Boot
- Primeiro, devemos acessar o seguinte link: https://start.spring.io.
- Ao visualizar a seguinte tela, preencha os campos “Artifact” (artefato) “Name” (nome) com a palavra “paciente”. Ao informar primeiramente o campo “Artifact”, o campo “Name” será preenchido automaticamente com o mesmo valor. Os demais campos devem permanecer com o valores que já estão preenchidos.
- Após informar o campos mencionados no passo anterior, pressione o botão “ADD DEPENDENCIES” (adicionar dependências).
- Em seguida, pressione em “Generate” (gerar). E será realizado o download do arquivo “paciente.zip”, o qual você terá que descompactá-lo e abrir o projeto no Intellij IDEA. 
- No Intellij IDEA, você deve ir para  “File -> New -> Project from Existing Source”. Localize a pasta Animal que você descompactou com o projeto e  abra o arquivo pom.xml.
- Encontre a classe PacienteApplication e execute o método main.
- Agora, copie e cole o código abaixo para poder criar o Controller: 

  ```java
  package com.example.paciente;
  
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RestController;
  
  @SpringBootApplication
  @RestController
  public class PacienteApplication {
    public static void main(String[] args) {
      SpringApplication.run(MiProyectoApplication.class, args);
    }
 
    @GetMapping
    public String Hello(){
      return "Hello";
    }
    
  }
   ```
- Em seguida, você deve ir para o navegador e acessar localhost:8080.
- Você receberá a mensagem ‘’Hello’’ na tela.




# CTD-Back-End-I

# Aula 15 e Mesa 15 - Integradora V
📝 Uma clínica odontológica precisa informatizar suas operações. Por isso, nos pedem um sistema para gerenciamento de seus pacientes, onde possam cadastrá-los, buscá-los, excluí-los e modificá-los. Ao cadastrar um paciente, os seguintes dados serão solicitados:
- Nome
- Sobrenome
- RG
- Data de cadastro
- Endereço:
    - Rua
    - Número
    - Cidade
    - Bairro

Além disso, adicionaremos um ID com auto-incremento para pacientes e endereços.

Utilize o H2 como banco de dados, aplicando o padrão DAO e testes com o JUnit. Lembre que a modelagem dos dados deve ter no mínimo 2 classes, **Paciente** e **Endereço**.

**Testes unitários**

Antes de iniciar os testes, salve no banco de dados 2 ou mais pacientes com seus respectivos endereços.

Utilizando a camada de serviço:

- Adicione um paciente com endereço e pesquise no banco de dados pelo ID;
- Exclua o paciente criado anteriormente e procure-o;
- Pesquise e imprima no console todos os pacientes com seus endereços, serão listados todos os pacientes que incluímos antes de realizar o primeiro teste.


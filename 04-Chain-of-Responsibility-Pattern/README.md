# CTD-Back-End-I

# Aula 04 - Chain of Responsibility Pattern
📝 Na empresa Colmeia existem três departamentos: gerencial, comercial e técnico. Ao receberem um e-mail (**no domínio colmeia.com**), desejam que seja controlado de acordo com as regras de inteligência artificial da empresa e enviá-lo ao departamento correspondente. Vamos simular esse controle, presumindo que:

----------------------------------------------
Se algum dos seguintes critérios for atendido: 
- Assunto (subject): Gerência 
- E-mail de destino: gerencia@colmeia.com

Deve ser enviado para:
- Departamento: Gerencial
----------------------------------------------
Se algum dos seguintes critérios for atendido: 
- Assunto (subject): Comercial 
- E-mail de destino: comercial@colmeia.com

Deve ser enviado para:
- Departamento: Comercial
----------------------------------------------
Se algum dos seguintes critérios for atendido: 
- Assunto (subject): Técnico 
- E-mail de destino: tecnica@colmeia.com

Deve ser enviado para: 
- Departamento: Técnico
----------------------------------------------
Se algum dos seguintes critérios for atendido: 
- Assunto (subject): Qualquer outro 
- E-mail de destino: Qualquer outro

Deve ser enviado para: 
- Departamento: Marcado como SPAM
----------------------------------------------

Para isso, iremos mostrar na tela onde o pedido é recebido em cada caso. O e-mail pertence a uma classe de **Mail** que possui três dados tipo string: a origem, o destino e o assunto (ou assunto).

Você deseja fazer uma classe **CheckMail** que crie uma corrente de responsabilidades.

Esta classe funcionará verificando cada elemento (parte da corrente). Se o e-mail for para a Gerência, irá informá-lo, caso contrário, continua com a próxima verificação, que testa se é para Técnico, e continuará até saber a quem corresponde. Se não for de ninguém, será marcado como SPAM.

Por fim, a partir de uma classe **ProcessaMail**, é criado um e-mail e o **CheckMail** é solicitado a processá-lo e informar para onde deve ir.

# Mesa 04 - Chain of Responsibility Pattern
📝 Em uma empresa, você deseja controlar a qualidade de um produto. Desta forma, são considerados três controles diferentes e em cada um é verificado se o produto está de acordo com os padrões de qualidade. De acordo com os controles:
- Lote: deve estar entre 1000 e 2000.
- Peso: deve estar entre 1200 e 1300.
- Embalagem: deve ser igual a “saudável” ou “quase saudável”.

Se não atender a nenhum dos critérios, deve ser informado que foi **rejeitado** ou, se atender a todos os requisitos, deve ser relatado que foi **aceito**.

O artigo pertence a uma classe de **artigo** que possui quatro informações:
- Nome: String;
- Lote: int;
- Peso: int;
- Embalagem: String (“saudável”, “quase saudável”).

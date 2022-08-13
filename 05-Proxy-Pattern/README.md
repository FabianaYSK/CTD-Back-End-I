# CTD-Back-End-I

# Aula 05 - Proxy Pattern
📝 Em um posto de vacinação, as pessoas são cadastradas e devem informar os seguintes dados: nome, sobrenome e RG. Além disso, quando marcarem uma vacinação, uma data lhes é atribuída, bem como o nome da vacina que lhes será aplicada.

Ao se vacinar, o método **vacinar()** deve ser informado de que a vacina foi aplicada. No momento da vacinação, a confirmação deve ser registrada com o RG, data e vacina.

Para evitar que as informações sejam inconsistentes, deve-se controlar se a data da aplicação da vacina é igual ou posterior à data marcada. Um proxy deve ser usado para executar esse controle.

Para simplificar o exercício, caso o registro esteja correto, é emitida uma mensagem com a informação registrada.

# Mesa 05 - Proxy Pattern
📝 No serviço Spotify pago, você pode baixar músicas para ouvir offline. Quando um usuário solicita o download de uma música, o serviço Spotify verifica se ele é um usuário premium para dar acesso a essa funcionalidade. Os usuários possuem um identificador e uma string com o tipo de usuário ("Free", "Premium").

Implementar uma classe **servicoDownload** que permita **baixar uma música** e mediante o Proxy pattern comprovar se é possível fazê-lo. 




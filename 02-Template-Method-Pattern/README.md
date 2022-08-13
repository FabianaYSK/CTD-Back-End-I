# CTD-Back-End-I

# Aula 02 - Template Method Pattern
📝 Para efetuar o pagamento dos salários é necessário realizar três etapas: calcular o salário correspondente, imprimir ou gerar recibos de salário e depositar o valor correspondente. 

Existem diferentes tipos de funcionários. No caso de empregados efetivos ou em “relação de dependência”, o cálculo é feito de acordo com o salário-base e acrescido de descontos e bonificações. Os funcionários contratados trabalham uma quantidade de horas, cada uma com um determinado valor. Com essa informação, é feito o cálculo do salário a ser pago e depois se imprime o recibo e, por fim, se deposita o valor. 

O processo que realizamos é **pagamentoSalario**, que leva três etapas: cálculo, impressão e depósito. Já o cálculo é feito de acordo com o tipo de funcionário. A impressão pode ser digital, no caso do contratado, ou em recibo em papel, no caso do efetivo, e por último o depósito é em conta bancária.

Os funcionários efetivos têm como informação um salário-base e um valor fixo de descontos e outro de bonificações. Os empregados contratados possuem número de horas trabalhadas e valor por hora. Ambos devem ter nome, sobrenome e número da conta onde o salário é depositado.

Para simplificar, vamos emitir uma mensagem na parte de impressão do comprovante que informa se é um documento digital ou impresso.


# Mesa 02 - Template Method Pattern
📝 Em uma empresa de fast food que vende apenas cardápios prontos para levar, eles classificam os produtos como **cardápio adulto, cardápio infantil ou cardápio vegetariano**. Todos os menus têm um preço base, ou seja, pode ser aumentado se houver acréscimos ao pedido.

Quando um cliente compra os produtos, os funcionários devem montar a embalagem de cada cardápio e calcular seu custo. O processo de preparação de um menu envolve **montar** e **calcular o preço de venda**.

Os menus para adultos trazem apenas o que diz na sua oferta e o seu valor não é acrescido. Os menus infantis têm um presente surpresa, que deve ser adicionado e tem um custo adicional.

Os cardápios vegetarianos têm uma embalagem especial já que são acrescentados temperos. O custo aumenta com o valor do contêiner e sobretaxa de 1% para os condimentos.

Precisamos de um sistema que exiba uma mensagem aos funcionários com os itens adicionais, se aplicável, para que não se esqueçam de fazer isso na hora da montagem. Em seguida, você precisará relatar o custo do menu vendido.

Tanto a montagem, quanto o cálculo do custo são processos que sempre se fazem com todos os produtos vendidos.

Devemos desenvolver as classes necessárias para realizar o processo de preparação explicado.



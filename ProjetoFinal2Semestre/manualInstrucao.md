Tela do Caixa
Componentes:

Painel de Entrada de Dados:
Campos para inserir código do produto e quantidade.
Botões para adicionar e remover itens da tabela.
Tabela de Produtos:
Exibe os produtos adicionados, incluindo informações como nome, código, valor unitário e quantidade.
Painel de Cliente VIP:
Campo para inserir CPF do cliente VIP.
Botão para validar o CPF e verificar se o cliente é VIP.
Botões de Ação:
Botão para avançar com a compra e finalizá-la.
Funcionalidades:

Adicionar e Remover Produtos:
Ao inserir o código do produto e a quantidade e clicar no botão "Adicionar", o produto é adicionado à tabela.
O botão "Remover" exclui o produto selecionado da tabela.
Cliente VIP:
O sistema verifica se o cliente é VIP com base no CPF inserido.
Se o cliente for VIP, um desconto de 15% é aplicado aos produtos na tabela.
Cálculo do Valor Total:
O sistema calcula o valor total da compra com base nos produtos adicionados à tabela, considerando o desconto VIP se aplicável.
Finalização da Compra:
Ao clicar no botão "Avançar Compra", é exibido um diálogo com o total da compra, opções de pagamento e um botão para finalizar a compra.
Ao finalizar a compra, os dados da tabela são enviados para o banco de dados.
Observações:

A tela utiliza classes e métodos de controle (como VendasControl, EstoqueDAO, ClientesDAO, etc.) para operações no banco de dados e controle de vendas.
Este código implementa um painel funcional para um sistema de caixa, permitindo a interação com produtos, cálculo de valores e finalização de compras, integrando-se com funcionalidades do banco de dados para registro de vendas e clientes.

--------------------------------------------------------------------------------------------

Manual de Instruções - EstoquePainel

1. Cadastro de Produtos:
   Entrada de Dados:
   Insira os detalhes do produto nos campos fornecidos:
   Produto: Nome do produto.
   Código: Código identificador do produto.
   Valor Unitário: Valor individual do produto.
   Quantidade: Número de unidades do produto.
   Ações Disponíveis:
   Cadastrar: Adiciona um novo produto com os detalhes fornecidos à tabela de estoque.
   Editar: Salva as alterações realizadas em um produto existente selecionado na tabela.
   Apagar: Remove um produto existente com base no código fornecido.
   Atualizar: Atualiza os dados de um produto existente com base no código fornecido.
2. Tabela de Estoque:
   Visualização de Produtos:
   A tabela exibe os produtos cadastrados com as seguintes colunas:
   Produto: Nome do produto.
   Código: Código identificador do produto.
   Valor Unitário: Valor individual do produto.
   Quantidade: Número de unidades do produto.
   Interatividade com a Tabela:
   Seleção de Linhas: Clicar em uma linha da tabela seleciona o produto correspondente, exibindo seus detalhes nos campos de entrada acima da tabela.
3. Funcionalidades Adicionais:
   Atualização da Tabela:
   A tabela é atualizada automaticamente ao abrir o painel, mostrando os produtos existentes no banco de dados.
4. Utilização dos Botões:
   Cadastrar:
   Insere um novo produto com os detalhes fornecidos na tabela.
   Editar:
   Salva as alterações realizadas em um produto existente selecionado na tabela.
   Apagar:
   Remove um produto existente com base no código fornecido.
   Atualizar:
   Atualiza os dados de um produto existente com base no código fornecido.
5. Observações:
   Atualização da Tabela: Ao realizar qualquer ação (cadastrar, editar, apagar, atualizar), a tabela é atualizada automaticamente para refletir as mudanças no banco de dados.
   Esse manual orienta o uso das funcionalidades fornecidas pela tela EstoquePainel para gerenciamento de estoque de produtos, possibilitando adicionar, editar, apagar e atualizar informações na tabela de produtos cadastrados.

--------------------------------------------------------------------------------------------

Manual de Instruções - CadastroVipPainel

1. Cadastro de Cliente:
   Entrada de Dados:

Insira os detalhes do cliente nos campos fornecidos:
Nome: Nome do cliente a ser cadastrado.
CPF: Número de CPF do cliente (formato: XXX.XXX.XXX-XX).
Ações Disponíveis:

Cadastrar: Registra um novo cliente com os detalhes fornecidos no banco de dados. 2. Componentes da Tela:
Título do Cadastro:

Indica o propósito da tela, destacando a funcionalidade de cadastro de clientes.
Campos de Entrada:

Nome: Campo para inserir o nome do cliente.
CPF: Campo formatado para inserção do número do CPF do cliente.
Botão de Cadastro:

Cadastrar: Ao clicar neste botão, o cliente é registrado no banco de dados com os dados fornecidos nos campos de entrada. 3. Personalização Visual:
Tamanho dos Campos:
Os campos de inserção de nome e CPF têm tamanhos definidos para facilitar a entrada de dados.
Estilo do Botão:
O botão de cadastro possui cor de fundo azul e texto em branco para destaque visual. 4. Observações:
Formato do CPF:
O campo de CPF é formatado automaticamente para o padrão XXX.XXX.XXX-XX, facilitando a entrada correta do número do CPF.
Operações no Banco de Dados:
Ao clicar em "Cadastrar", os dados do novo cliente são enviados para o banco de dados por meio do controlador ClientesControl.
Limpeza de Campos:
Após cadastrar um cliente, os campos de nome e CPF são automaticamente limpos, prontos para um novo cadastro.
Esse manual fornece orientações sobre como utilizar a tela de CadastroVipPainel para inserir novos clientes no sistema, permitindo o registro de nome e CPF, e realizando as operações necessárias para armazenar esses dados no banco de dados.

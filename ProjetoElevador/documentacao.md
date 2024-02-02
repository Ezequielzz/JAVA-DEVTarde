**Documentação - Controle de Elevador em Java**

Este código Java implementa uma aplicação gráfica simples de um sistema de controle de elevadores com uma interface de usuário usando a biblioteca Swing. A seguir, apresento uma explicação detalhada sobre as escolhas de design e a estrutura do código.

### Estrutura do Código:

1. **Extensão de JFrame:**
   - A classe `Elevador` estende `JFrame`, o que significa que é uma janela gráfica.

2. **Atributos da Classe:**
   - Variáveis para rastrear o andar atual de cada elevador (`andarAtualE1` e `andarAtualE2`).
   - Labels para representar os andares à esquerda e à direita.
   - ImageIcon para os ícones do elevador (original e aberto).

3. **Método para Redimensionar Imagem:**
   - O método `redimensionarImagem` é utilizado para redimensionar a imagem do ícone do elevador.

4. **Construtor da Classe:**
   - Configuração do layout e criação de três painéis principais: `painelGeral`, `painelAndaresEsquerda`, e `painelAndaresDireita`.
   - Labels são adicionadas a esses painéis para representar os andares à esquerda e à direita.
   - Botões são criados para cada andar, e associados a cada botão há um evento que calcula a distância entre os elevadores e o andar chamado, atualizando os andares conforme necessário.

5. **Método `calcularDistancia`:**
   - Este método simplesmente calcula a distância entre o andar atual de um elevador e o andar chamado.

6. **Método `run`:**
   - Define o tamanho da janela e torna-a visível.

### Escolhas de Design:

1. **Layouts:**
   - `BorderLayout` para o painel geral.
   - `GridLayout` para os painéis de andares à esquerda e à direita, bem como para o conjunto de botões e ícones de elevadores.

2. **Labels e Botões:**
   - Cada andar tem uma JLabel associada para exibir o status do elevador.
   - Botões são usados para chamar os elevadores.

3. **Tratamento de Eventos:**
   - Cada botão é associado a um ouvinte de evento que calcula as distâncias e atualiza os andares e labels correspondentes.

4. **Imagens dos Elevadores:**
   - Ícones originais e abertos são usados para representar os elevadores.

5. **Distância entre Elevadores:**
   - A distância entre os elevadores é calculada para decidir qual elevador atenderá a chamada.

### Utilização de Recursos Externos:
   - Ícones de elevadores são carregados a partir de recursos externos usando `getResource`.

### Sugestões para Melhorias:
   - O código poderia ser modularizado em métodos adicionais para melhor clareza.
   - Comentários adicionais podem ser úteis para explicar partes específicas do código.
   - O código poderia fazer a mudança de imagem quando um elevador é aberto.

### Considerações Finais:
O código fornece uma representação visual simples de dois elevadores respondendo a chamadas de diferentes andares. A estrutura modular facilita a compreensão, e as escolhas de design visam uma experiência de usuário intuitiva.
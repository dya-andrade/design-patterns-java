<h1>Design de Projetos</h1>

<p>Padrões de projetos com SOLID e Design Patterns.</p>

<h1>SOLID</h1>

- Coesão:
<p>Uma classe coesa faz bem uma única coisa.
Classes coesas não devem ter várias responsabilidades.</p>

- Encapsulamento:
<p>Getters e setters não são formas eficientes de aplicar encapsulamento.
É interessante fornecer acesso apenas ao que é necessário em nossas classes.
O encapsulamento torna o uso das nossas classes mais fácil e intuitivo.<p>

- Acoplamento:
<p>Acoplamento é a dependência entre classes.
Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento.
Devemos controlar o nível de acoplamento na nossa aplicação.</p>

</br>

<h3>#Single Responsibility Principle</h3> 

- Uma classe deve ter um e apenas um motivo para ser alterada.

- Que classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida.

<h3>#Open Closed</h3> 

- Um sistema deve ser aberto para a extensão, mas fechado para a modificação.

- Que cada classe deve conhecer e ser responsável por suas próprias regras de negócio.

<h3>#Liskov Substitution Principle</h3> 

- Devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema (composição e herança).

- Que, embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta.

<h3>#Interface Segregation Principle</h3> 

- Diz que implementações devem depender de abstrações e abstrações não devem depender de implementações. 

- Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento. 

<h3>#Dependency Inversion Principle</h3> 

- Que as interfaces devem definir apenas os métodos que fazem sentido para seu contexto. 

- Diz que uma classe não deve ser obrigada a implementar um método que ela não precisa

</br>

</hr>

<h1>DESIGN PATTERNS I (Comportamentais)</h1>

 <p>Gang of Four (GoF)<p>

<h3>#Strategy</h3> 

- Diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes. 

- É um padrão de design comportamental que permite definir uma família de algoritmos, colocar cada um deles em uma classe separada e tornar seus objetos intercambiáveis.

<h3>#Chain of Responsibility</h3> 

- Use o padrão quando for essencial executar vários manipuladores em uma ordem específica, e a diferenciar casos onde padrões semelhantes podem ser aplicados. 

- É um padrão de design comportamental que permite passar solicitações ao longo de uma cadeia de manipuladores. 

- Ao receber uma solicitação, cada manipulador decide processar a solicitação ou passá-la para o próximo manipulador da cadeia.

<h3>#Template Method</h3> 

- Criação de um método concreto na classe “mãe”, que chama métodos abstratos implementados nas classes “filhas”. 

- É um padrão de design comportamental que define o esqueleto de um algoritmo na superclasse, mas permite que as subclasses substituam etapas específicas do algoritmo sem alterar sua estrutura.

<h3>#State</h3> 

- Se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual. 

- É um padrão de design comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. 

- "Parece que o objeto mudou de classe".

<h3>#Command e Command Handler</h3> 

- Que um caso de uso em nossa aplicação pode ter várias ações (salvar no banco, enviar e-mail, etc). 

- Que um caso de uso deve ser extraído para uma classe específica, ao invés de estar no arquivo da CLI, controller ou algo do tipo.

- É um padrão de design comportamental que transforma uma solicitação em um objeto autônomo que contém todas as informações sobre a solicitação.

<h3>#Observer</h3> 

- Que é mais interessante separar cada ação em uma classe separada. 

- Definir um mecanismo de assinatura para notificar vários objetos sobre quaisquer eventos que ocorram com o objeto que estão observando.

</br>

</hr>

<h1>DESIGN PATTERNS II (Estruturais)</h1>

 <p>Gang of Four (GoF)<p>


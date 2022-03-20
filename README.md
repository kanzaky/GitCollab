# GitCollab
# Exercícios de Programação II / Programação Orientada por Objetos

1 - Considere que se pretende desenvolver uma aplicação para registo de navios num porto de
mar. Um navio é genericamente caracterizado pela seguinte informação: Matrícula do Navio
(String), nome (String) e comprimento (float). Um navio porta contentores é um navio com
atributo adicional numero máximo de contentores (int). Um navio petroleiro é um navio
com atributo adicional capacidade de carga (float), em toneladas. Codifique as classes Navio,
PortaContentores e Petroleiro, que representam respetivamente um navio qualquer, um
navio porta contentores e um navio petroleiro, incluindo construtores, métodos de acesso
(getters) e mutação (setters) (não implementar um método de mutação para a Matricula do
Navio, devendo esta ser atribuído apenas no construtor da classe).


2 - Implemente uma classe Porto (apenas os atributos e construtor) para armazenar a informação
sobre a atracagem de navios (use o tipo de coleção que considerar mais apropriado). A classe
deve incluir métodos para (nota: pode adicionar métodos às classes anteriores se necessário):

• Adicionar um novo navio sem permitir a duplicação da Matricula do Navio;

• Devolver a quantidade máxima total de contentores de todos os navios porta contentores
atracados no porto;

• Devolver a capacidade total de carga de todos os navios porta contentores e petroleiros
atracados no porto, sabendo que um contentor tem capacidade para 10 toneladas;


3 - Escreva as instruções necessárias, no método main(…), para criar um Porto com um navio
petroleiro e um navio porta contentores (utilize qualquer valor para os parâmetros com um
tipo de dados válido). Utilize o método para adicionar um novo navio. Valide que não é
possível repetir a matrícula de navio, num mesmo porto.


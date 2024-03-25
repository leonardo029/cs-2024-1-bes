# :books: Estudo sobre Rest API
## :question: O que é uma API?
*  É uma interface que permite a comunicação entre duas aplicações (microsserviços) distintas, ou seja, faz o intermédio entre o requerente (cliente) e o requisitado (servidor), fazendo com que os dados sejam filtrados, seja na entrada ou na saída, servindo como uma barreria defensiva e consumindo apenas os recursos necessários para que a funcionalidade seja executada e devolve apenas os dados que satisfaçam a necessidade do requerente, seja ele uma funcionalidade ou o próprio usuário;
*  A interface permite que dois componentes se comuniquem/conectem, desde que obedeçam um conjunto de definições e protocolos pré definidos por ela;
*  Toda essa ação/comunicação é mascarada e o requerente não tem ciência nem acesso.
  
    > Informações complementares:
    > *  HTTP (Hypertext Transfer Protocol) -> É um protocolo que permite a comunicação entre máquinas diferentes, uma espécie de padronização universal.
    > *  JSON (JavaScript Object Notation) -> É uma (das muitas) formatação/maneira de se enviar e receber dados através da web.

## :question: O que é a arquitetura REST (Representational State Transfer)?
*  É um conjunto de restrições usadas para a criação de APIs que utiliza como base o protocolo HTTP;
*  A arquitetura proporciona um nível relativamente alto de flexibilidade e liberdade para desenvolvedores.
  
   >  Existem outras arquiteturas utilizadas como base para a criação de APIs, como por exemplo: SOAP ou XML-RPC, porém não serão abordadas nesse estudo.
   
* A arquitetura REST não obriga a utilização de uma linguagem/tecnologia específica, o único requisito exigido por ela é que na hora do desenvolvimento sejam respeitadas as seguintes **seis** regras:
  
  * **Interface uniforme:**
  * **Desacoplamento do cliente-servidor:**
  * **Sem estado definido:**
  * **Capacidade de armazenamento em cache:**
  * **Arquitetura de sistema em camadas:**
  * **Código sob demanda (opcional):**

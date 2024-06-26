![](https://www.alura.com.br/artigos/assets/qual-e-a-melhor-linguagem-de-programacao/qual-e-a-melhor-linguagem-de-programacao.png)
# :books: Estudo sobre Rest API
## :question: O que é uma API (Application Programming Interface)?
*  É uma interface que permite uma comunicação segura entre duas aplicações (microsserviços) distintas, ou seja, faz o intermédio entre o requerente (cliente) e o requisitado (servidor), fazendo com que os dados sejam filtrados, seja na entrada ou na saída, servindo como uma barreria defensiva e consumindo apenas os recursos necessários para que a funcionalidade seja executada e devolve apenas os dados que satisfaçam a necessidade do requerente, seja ele uma funcionalidade ou o próprio usuário;
*  A interface permite que dois componentes se comuniquem/conectem desde que obedeçam um conjunto de definições e protocolos pré definidos por ela;
*  Toda essa ação/comunicação é mascarada e o requerente não tem ciência nem acesso.

## :question: O que é a arquitetura REST (Representational State Transfer)?
*  É um conjunto de restrições usadas para a criação de APIs que utiliza como base o protocolo HTTP;
  
    > *  HTTP (Hypertext Transfer Protocol) -> É um protocolo que permite a comunicação entre máquinas diferentes, uma espécie de padronização universal.
    
*  A arquitetura proporciona um nível relativamente alto de flexibilidade e liberdade para desenvolvedores.
  
   >  Existem outras arquiteturas utilizadas como base para a criação de APIs, como por exemplo: SOAP ou XML-RPC, porém não serão abordadas nesse estudo.
   
* A arquitetura REST não obriga a utilização de uma linguagem/tecnologia específica, o único requisito exigido por ela é que na hora do desenvolvimento sejam respeitadas as seguintes regras:
  
  * **Interface uniforme:**
    *  Todas as solicitações da API para o mesmo recurso devem ser iguais, ou seja, todas as solicitações à API devem ser feitas da mesma maneira e mantendo um mesmo formato, independente do cliente ou da ferramenta que está fazendo a solicitação.
  * **Desacoplamento do cliente-servidor:**
    *   Quando projetadas, as APIs REST se baseiam na independência entre cliente e servidor. O cliente apenas precisa receber a URI do recurso e se comunica via HTTP, enquanto o servidor processa as requisições e fornece os dados solicitados. Assim, não havendo uma interação direta do cliente com o servidor, nem do servidor com o cliente.
  * **Sem estado definido:**
    *  APIs REST operam sem estado, exigindo que cada requisição seja autossuficiente. Isso significa que todas as informações necessárias para processar a requisição devem estar presentes nela, dispensando a necessidade de sessões no servidor. Os servidores não podem armazenar dados específicos de cada cliente, garantindo uma comunicação leve e escalável. 
  * **Capacidade de armazenamento em cache:**
    * Sempre que possível, os recursos devem ser armazenados em cache, seja pelo cliente ou servidor, e as respostas fornecidas pelo servidor devem conter todas as informações/permissões necessárias de cache, visando assim, uma resposta mais rápida e imediata, resultando em um melhor desempenho e escalabilidade.
  * **Arquitetura de sistema em camadas:**
    * Não é possível se afirmar e confiar que as chamadas e respostas sejam lineares e simplórias, podendo haver diversos intermediários em diferentes níveis que são acessados para que seja possível realizar a atividade requisitada pelo cliente. A API deve ser feita de uma forma que, nem o cliente e nem o servidor tenham a mínima noção da complexidade da comunicação estabelecida entre os sistemas, deve ser algo velado.
  * **Código sob demanda (opcional):**
    * Em sua maioria, as APIs REST manipulam recursos estáticos, porém, em certos casos a resposta do servidor pode conter um código executável. Este código só deve ser executado sob demanda.
      
  ![](https://www.sololearn.com/wp-content/uploads/2023/03/Representation-of-REST-flow-1024x291.png)
  
## Referências
  * https://www.ibm.com/br-pt/topics/rest-apis
  * https://www.ibm.com/br-pt/topics/api
  * https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api
  * https://aws.amazon.com/pt/what-is/api/

# 🤖 API Rest com Spring boot e H2 Database

<p> O projeto trata-se de um desafio técnico de um processo seletivo. 


## 🔧 Ferramentas
<ul>
  <li> Java 17;</li>
  <li> Spring Boot 3;</li>
  <li> JPA;</li>
  <li> Banco de dados H2;</li>
  <li> Lombok.</li>
</ul>


## 🏁 Funcionalidades 
<ul>
  <li> Criar uma pessoa;</li>
  <li> Editar uma pessoa;</li>
  <li> Consultar uma pessoa;</li>
  <li> Listar pessoas;</li>
  <li> Criar endereço para pessoa;</li>
  <li> Listar endereços da pessoa;</li>
  <li> Informar o endereço principal da pessoa;</li>
</ul>


## 📃 Métodos HTTP
Requisições para a API devem seguir os padrões:
| Método | URL | Descrição |
|---|---|---| 
| `POST`|localhost:8080/pessoas | Utilizado para cadastrar uma pessoa. |
| `POST`|localhost:8080/pessoas/id/enderecos | Utilizado para cadastrar um endereço para a pessoa do id |
| `GET` | localhost:8080/pessoas | Retorna informações de uma ou mais pessoas. |
| `GET` | localhost:8080/pessoas/id/enderecos | Retorna informações da pessoa do id. |
| `PUT` | localhost:8080/pessoas/id | Atualiza dados da pessoa dona do id. |
| `DELETE` | localhost:8080/pessoas/id | Remove os registros da pessoa do sistema. |

## 🙋🏻‍♂️ Para testar:

<ol>
  <li> Digite: "git clone https://github.com/GustavoBomfim/API-Rest-SpringBoot-H2/tree/master" em seu terminal para baixar o projeto.</li>
  <li> Atualize as dependências do Maven e espere alguns instantes. </li>
  <li> Execute o projeto. </li>
  <li> Rode as requisições post em json. </li>
</ol>

<p> Para acessar o banco de dados H2: execute o projeto e digite a URL: http://localhost:8080/h2. Após isso clique em "conectar".

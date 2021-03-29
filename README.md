![](https://img.shields.io/badge/java-v.1.8-blue.svg)
![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)

# FinalAcademy

# :computer: Equipe QA Hopper :computer:

## Descrição do Desafio
### Criar uma aplicação Selenium com os seguintes casos de teste

### Caso de teste 1
Acessar o site da accenture e aceitar os cookies do LGPD<br>

<b>Cenário</b>: Aceitar o cookie LGPD<br>
dado que eu estou no site da accenture<br>
e aceito os termos LGPD<br>
Então deve fechar a caixa de informação<br>

<b>Cenário</b>: Configurações do cookie<br>
dado que eu estou no site da accenture<br>
e aceito os termos LGPD<br>
e clico em configurações de cookie<br>
Então devo ver o item de "sua privacidade"<br>
E devo ver "Cookies estritamente necessárias"<br>
e devo ver "Cookies Analíticos de Primeira Parte"<br>
e devo ver "Cookies de Desempenho e Cookies Funcionais"<br>
e devo ver "Cookies de Publicidade e Redes Sociais"<br>

### Caso de teste 2
Acessar o site da accenture a mostrar a lista de serviços<br>

<b>Cenário</b>: listar serviços da Accenture<br>
dado que eu estou no site da accenture
e clico no menu serviços<br>
Então devo ver os serviços abaixo<br>
  - [x] Accenture Strategy 
  - [x] Application Services 
  - [x] Artificial Intelligence 
  - [x] Automation 
  - [x] Business Process Services 
  - [x] Change Management 
  - [x] Cloud 
  - [x] Customer Experience 
  - [x] Data & Analytics 
  - [x] Ecosystem Partners 
  - [x] Finance Consulting 
  - [x] Industry X
  - [x] Infrastructure 
  - [x] Marketing 
  - [x] Mergers & Acquisitions (M&A) 
  - [x] Operating Models 
  - [x] Security 
  - [x] Supply Chain Management 
  - [x] Sustainability 
  - [x] Technology Consulting 
  - [x] Technology Innovation 
  - [x] Zero Based Budgeting (ZBB) 

<b>Cenário</b>: Clicar no serviço cloud<br>
dado que eu estou no site da accenture
e clico no menu serviços<br>
e clico no item do menu cloud<br>
Então devo encontrar o título "Serviços de Cloud"<br>

### Caso de teste 3
Acessar a lista de carreiras da accenture<br>

<b>Cenário</b>: Acessar o item de vagas de tecnologia<br>
dado que eu estou no site da accenture<br>
e clico no menu carreiras<br>
e clico no item do menu vagas em tecnologia<br>
Então devo ver o destaque em "Carreiras em Tecnologia"<br>

<b>Cenário</b>: Procurando uma vaga
dado que eu estou no site da accenture<br>
e digito no campo de busca "desenvolvedor"<br>
e clico no botão procurar<br>
Então devo encontrar vagas para programadores<br>

### Caso de teste 4
Sobre a accenture<br>

<b>Cenário</b>: Ver as características da accenture<br>
dado que eu estou no site da accenture<br>
e clico no menu sobre a accenture<br>
e clico no item do menu sobre a accenture<br>
Então devo ver o destaque em "Nosso propósito"<br>

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gutking(Cucumber) abrindo o browser fazendo o teste de comportamento<br>


## Pré-requisitos
Este projeto foi desenvolvido principalmente em Java, utilizando para fazer os testes Cucumber e Selenium. 


## 🚀 Guia de Uso

### Passos para rodar o projeto:

1- Baixar, instalar e configurar o Java JDK na máquina versão 1.8

2- Baixar e instalar o VScode (O programa auxilia o programador com algumas requisições necessárias, de acordo com o que é aberto por ele)

4- Baixar zip ou clonar o repositório
  
5- Abrir o terminal no [VScode](https://code.visualstudio.com/), caminhar até a pasta do projeto, para rodar o teste, executar o seguinte comando:

- ```./test.bat```- Windows
- ```./test.sh``` - Linux / MacOS

6- Se tudo tiver corrido bem, vai aparecer no seu terminal Build Sucess

7- Vídeo com nossa rotina real de trabalho

      https://youtu.be/93lSr3it7jk

## 🎨 Autores 
- [![Linkedin Badge](https://img.shields.io/badge/-Bruna-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/bruna-andrade-9958381b8/)](https://www.linkedin.com/in/bruna-andrade-9958381b8/) [Bruna Roberta Andrade dos Anjos](https://github.com/brunardosanjos)  	
- [Higea Celly Souza Barbosa](https://github.com/higeasouza)
- [![Linkedin Badge](https://img.shields.io/badge/-Luiz-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/karine-santos-8023b6127/)](https://www.linkedin.com/in/araujoluiz/)[Luiz ALberto Suares Araujo](https://github.com/luialbeto) 
- [![Linkedin Badge](https://img.shields.io/badge/-Karine-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/karine-santos-8023b6127/)](https://www.linkedin.com/in/karine-santos-8023b6127/) [Karine Carolina dos Santos](https://github.com/Karinecasant)  
- [Mauricio Nazario do Carmo](https://github.com/Mauricio-Nazario)
- [![Linkedin Badge](https://img.shields.io/badge/-Natália-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/natalialfbotelho/)](https://www.linkedin.com/in/natalialfbotelho/) [Natalia Luiza Freire Botelho](https://github.com/natalialfbotelho)  
- [Sigrid Rodrigues](https://github.com/sigrid-fr)

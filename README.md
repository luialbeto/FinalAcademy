![](https://img.shields.io/badge/java-v.1.8-blue.svg)
![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)
![](https://img.shields.io/badge/maven-v.3.3-orange.svg)

# Equipe: QA Hopper
🎨 Autores: <br>

- [![Linkedin Badge](https://img.shields.io/badge/-Bruna-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/bruna-andrade-9958381b8/)](https://www.linkedin.com/in/bruna-andrade-9958381b8/)[Bruna Roberta Andrade dos Anjos](https://github.com/brunardosanjos)
- [![Linkedin Badge](https://img.shields.io/badge/-Higea-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/higeasouza/)](https://www.linkedin.com/in/higeasouza/)[Higea Celly Souza Barbosa](https://github.com/higeasouza)
- [![Linkedin Badge](https://img.shields.io/badge/-Luiz-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/araujoluiz/)](https://www.linkedin.com/in/araujoluiz/)[Luiz ALberto Suares Araujo](https://github.com/luialbeto) 
- [![Linkedin Badge](https://img.shields.io/badge/-Karine-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/karine-santos-8023b6127/)](https://www.linkedin.com/in/karine-santos-8023b6127/) [Karine Carolina dos Santos](https://github.com/Karinecasant)  
- [![Linkedin Badge](https://img.shields.io/badge/-Natália-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/mauricionazario/)](https://www.linkedin.com/in/mauricionazario/)[Mauricio Nazario do Carmo](https://github.com/Mauricio-Nazario)
- [![Linkedin Badge](https://img.shields.io/badge/-Maurício-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/natalialfbotelho/)](https://www.linkedin.com/in/natalialfbotelho/) [Natalia Luiza Freire Botelho](https://github.com/natalialfbotelho)  
- [![Linkedin Badge](https://img.shields.io/badge/-Sigrid-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/sigrid-rodrigues/)](https://www.linkedin.com/in/sigrid-rodrigues/)[Sigrid Rodrigues](https://github.com/sigrid-fr)


# Descrição do desafio 🚀
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
dado que eu estou no site da accenture<br>
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
dado que eu estou no site da accenture<br>
e clico no menu serviços<br>
e clico no item do menu cloud<br>
Então devo encontrar o título "Serviços de Cloud"<br>

### Caso de teste
Acessar a lista de carreiras da accenture<br>

<b>Cenário</b>: Acessar o item de vagas de tecnologia<br>
dado que eu estou no site da accenture<br>
e clico no menu carreiras<br>
e clico no item do menu vagas em tecnologia<br>
Então devo ver o destaque em "Carreiras em Tecnologia"<br>

<b>Cenário</b>: Procurando uma vaga<br>
dado que eu estou no site da accenture<br>
e digito no campo de busca "desenvolvedor"<br>
e clico no botão procurar<br>
Então devo encontrar vagas para programadores<br>

### Caso de teste
Sobre a accenture<br>

<b>Cenário</b>: Ver as características da accenture<br>
dado que eu estou no site da accenture<br>
e clico no menu sobre a accenture<br>
e clico no item do menu sobre a accenture<br>
Então devo ver o destaque em "Nosso propósito"<br>

--------------------------------------------------------------------
## Dependencias
- Projeto Java do repo abaixo rodando no site da Accenture<br>
https://www.accenture.com/br-pt <br>
Link do repositório: https://github.com/luialbeto/FinalAcademy <br>

--------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/luialbeto/FinalAcademy
 ```

- Entrando na pasta do projeto
 ```bash
cd FinalAcademy
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos
<pre>
  driver <br>
      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- hopper<br>
    |  |  |  |  |  |-- LgdpTestSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- ListAccentureTestSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- ListaCarreirasTestSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br>
    |  |  |  |  |  |-- SharedSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- SobreTestSteps.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- hopper<br>
    |  |  |  |  |  |-- LgpdTest.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
    |  |  |  |  |  |-- ListAccentureTest.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
    |  |  |  |  |  |-- ListaCarreirasTest.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
    |  |  |  |  |  |-- SobreTest.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>

--------------------------------------------------------------------

## Vídeo com nossa rotina real de trabalho

      https://youtu.be/93lSr3it7jk


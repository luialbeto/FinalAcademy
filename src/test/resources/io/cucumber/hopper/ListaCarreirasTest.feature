# language: pt

Funcionalidade: Acessar o item de vagas de tecnologia
  O objetivo é acessar o site da accenture no menu carreiras, e testar menu e campo de busca
    
        Cenario: Acessar o item de vagas de tecnologia
            Dado que eu estou no site da accenture
              E clico no menu carreiras
              E clico no item do menu vagas em tecnologia
             Entao devo ver o destaque "Carreiras em tecnologia"

        Cenario: Procurando uma vaga
            Dado que eu estou no site da accenture
              E clico no menu carreiras
              E clico em procure por vagas
              E digito no campo de busca "desenvolvedor"
              E clico no botao procurar
             Entao devo encontrar vagas para programadores

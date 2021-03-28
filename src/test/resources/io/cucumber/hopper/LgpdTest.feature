# language: pt
Funcionalidade: Acessar o site da Accenture
  O objetivo e acessar testar a LGPD no site

    
        Cenário: Aceitar o cookie LGPD
            Dado que eu estou no site da accenture
              E aceito os termos LGPD
             Entao deve fechar a caixa de informacao

  
        Cenário: Configurações do cookie
            Dado que eu estou no site da accenture
              E aceito os termos LGPD
              E clico em configuracoes de cookie
             Entao devo ver o item de "Sua privacidade"
              E devo ver cookies
                  | Cookies estritamente necessarias           |
                  | Cookies Analiticos de Primeira Parte       |
                  | Cookies de Desempenho e Cookies Funcionais |
                  | Cookies de Publicidade e Redes Sociais     |

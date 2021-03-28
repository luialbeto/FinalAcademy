# language: pt

Funcionalidade: Acessar o site da Accenture
      O objetivo e acessar testar a LGPD no site

        Cenário: Aceitar o cookie LGPD
            Dado que eu estou no site da accenture 1
              E aceito os termos LGPD
             Entao deve fechar a caixa de informacao
        Cenário: Configurações do cookie
            Dado que eu estou no site da accenture 1
              E aceito os termos LGPD
              E clico em configuracoes de cookie
             Entao devo ver o item de "Sua privacidade"
<<<<<<< HEAD
              E devo ver cookies
=======
              E devo ver "cookies"
>>>>>>> 65e7ee2bc3a78a61d107d39c9f6bce72daf5b683
                  | Cookies estritamente necessarias           |
                  | Cookies Analiticos de Primeira Parte       |
                  | Cookies de Desempenho e Cookies Funcionais |
                  | Cookies de Publicidade e Redes Sociais     |

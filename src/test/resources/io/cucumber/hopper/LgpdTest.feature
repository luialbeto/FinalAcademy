# language: pt
Funcionalidade: Acessar o site da Accenture
  O objetivo e acessar testar a LGPD no site

    @ignore
    Cenário: Aceitar o cookie LGPD
        Dado que eu estou no site da accenture
        E aceito os termos LGPD
        Entao deve fechar a caixa de informacao

    @ignore
    Cenário: Configurações do cookie
        Dado que eu estou no site da accenture
        E aceito os termos LGPD
        E clico em configuracoes de cookie
        Entao devo ver o item de "sua privacidade"
        E devo ver "Cookies estritamente necessarias"
        E devo ver "Cookies Analiticos de Primeira Parte"
        E devo ver "Cookies de Desempenho e Cookies Funcionais"
        E devo ver "Cookies de Publicidade e Redes Sociais"
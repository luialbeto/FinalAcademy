# language: pt
Funcionalidade: listar servicos da Accenture
  O objetivo e acessar o site accenture e clicar no menu servicos
      
        Cenario: listar servicos da Accenture
            Dado que eu estou no site da accenture
              E clico no menu servicos
             Entao devo ver o servico Accenture Strategy
              E devo ver o servico "Application Services"
              E devo ver o servico "Artificial Intelligence"
              E devo ver o servico "Automation"
              E devo ver o servico "Business Process Services"
              E devo ver o servico "Change Management"
              E devo ver o servico "Cloud"
              E devo ver o servico "Customer Experience"
              E devo ver o servico "Data & Analytics"
              E devo ver o servico "Ecosystem Partners"
              E devo ver o servico "Finance Consulting"
              E devo ver o servico "Industry X"
              E devo ver o servico "Infrastructure"
              E devo ver o servico "Marketing"
              E devo ver o servico "Mergers & Acquisitions (M&A)"
              E devo ver o servico "Operating Models"
              E devo ver o servico "Security"
              E devo ver o servico "Supply Chain Management"
              E devo ver o servico "Sustainability"
              E devo ver o servico "Technology Consulting"
              E devo ver o servico "Technology Innovation"
              E devo ver o servico "Zero Based Budgeting (ZBB)"
	  
        Cenario: Clicar no servico cloud
            Dado que eu estou no site da accenture
              E clico no menu servicos
              E clico no item do menu cloud
             Entao devo encontrar o titulo "Serviços de Cloud"
             
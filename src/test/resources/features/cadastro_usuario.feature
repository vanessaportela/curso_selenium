# language: pt

@cadastro
Funcionalidade: Cadastro de usuário

  @cadastro-sucesso
  Cenário: Registrar novo usuário com sucesso
    Dado que estou na tela inicial
    E acesso o cadastro de usuário
    Quando eu preencho o formulário de cadastro
    E clico em registrar
    Então vejo a mensagem de cadastro realizado


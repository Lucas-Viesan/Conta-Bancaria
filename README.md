##Digrama de Classes

```mermaid
classDiagram
class Conta {
<<Abstract>>
  - numero : int
  - agencia : int
  - tipo : int
  - titular : String
  - saldo : float
  + int getNumero()
  + int getAgencia()
  + int getTipo()
  + String getTitular()
  + float getSaldo()
  + void setNumero(int numero)
  + void setAgencia(int agencia)
  + void setTipo(int tipo)
  + void setTitular(String titular)
  + void setSaldo(float saldo)
  + boolean sacar(float valor)
  + void depositar(float valor)
  + void visualizar()
}
class ContaCorrente {
  - limite : float
  + float getLimite()
  + void setLimite(float limite)
  + boolean sacar(float valor)
  + void visualizar()
}
class ContaPoupanca {
  - aniversario : int
  + int getAniversario()
  + void setAniversario(int aniversario)
  + void visualizar()
}
class ContaRepository{
<< Interface >>
+ void procurarPorNumero(int numero)
+ void listarTodas()
+ void cadastrar(Conta conta)
+ void atualizar(Conta conta)
+ void deletar(int numero)
+ void sacar(int numero, float valor)
+ void depositar(int numero, float valor)
+ void transferir(int numeroOrigem, int numeroDestino, float valor)
}
class ContaController{
+ void procurarPorNumero(int numero)
+ void listarTodas()
+ void cadastrar(Conta conta)
+ void atualizar(Conta conta)
+ void deletar(int numero)
+ void sacar(int numero, float valor)
+ void depositar(int numero, float valor)
+ void transferir(int numeroOrigem, int numeroDestino, float valor)
+ int gerarNumero()
+ Conta buscarNaCollection(int numero)
}
Conta <|-- ContaCorrente
Conta <|-- ContaPoupanca
Conta <.. ContaRepository
ContaRepository <|.. ContaController


# Componentes do Sistema
🔹 Classe Abstrata: Conta
Define os atributos e métodos básicos de uma conta bancária:

Atributos: número, agência, tipo, titular, saldo

Métodos: saque, depósito, visualização e getters/setters

🔹 ContaCorrente
Herda de Conta e adiciona:

Limite de crédito

Sobrescrita do método sacar considerando o limite

🔹 ContaPoupanca
Herda de Conta e adiciona:

Dia de aniversário da conta (utilizado para cálculo de juros, por exemplo)

🔹 Interface ContaRepository
Define os métodos principais para manipulação das contas:

Procurar, listar, cadastrar, atualizar, deletar

Saque, depósito e transferência

🔹 ContaController
Implementa a interface ContaRepository e contém a lógica principal do sistema:

Geração de número de conta

Operações de saque, depósito, transferência e busca


#Funcionalidades 
Cadastro de contas (Corrente ou Poupança)

✅ Listagem de todas as contas

✅ Atualização e exclusão de contas

✅ Depósito e saque

✅ Transferência entre contas

✅ Visualização de dados da conta

## Conceitos Praticados
Herança, Abstração e Polimorfismo

Interface e Encapsulamento

Sobrescrita de métodos

Manipulação de listas com objetos



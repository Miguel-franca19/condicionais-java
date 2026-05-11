# 🎭 Teatro Devisate
 
Sistema de gerenciamento de reservas de teatro desenvolvido como trabalho escolar na ETEC — aplicando estruturas de repetição, vetores e matrizes em Java.
 
---
 
## 📋 Proposta do Professor
 
Desenvolver um sistema em Java para o **Teatro Devisate**, um complexo cultural com múltiplas salas de espetáculo. Cada sala possui **144 lugares**, organizados em uma grade de **12 linhas × 12 colunas** (A–L / 1–12).
 
---
 
## 💡 O Sistema
 
### 🪑 Estados de uma Cadeira
 
| Símbolo | Estado | Descrição |
|---|---|---|
| `[ ]` | Livre | Disponível para reserva ou compra |
| `[R]` | Reservada | Bloqueada — 50% pago |
| `[X]` | Ocupada | Confirmada — 100% pago |
 
### ⚙️ Operações
 
- **Reservar** — cadeira passa de Livre → Reservada (cobra 50%)
- **Comprar** — cadeira passa para Ocupada (cobra 100% se livre, ou os 50% restantes se reservada)
- **Cancelar** — cadeira volta de Reservada → Livre (reembolsa o meio ingresso)
### 🗺️ Mapa da Sala
 
```
===========================================
SALA: Sala Beethoven
ESPETÁCULO: O Fantasma da Ópera
===========================================
   1   2   3   4   5   6   7   8   9  10  11  12
A [ ] [ ] [ ] [R] [ ] [ ] [X] [ ] [ ] [ ] [ ] [ ]
B [ ] [X] [ ] [ ] [ ] [R] [ ] [ ] [ ] [ ] [ ] [ ]
...
L [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ]
 
[ ] Livre  [R] Reservada  [X] Ocupada
Livres: 140 | Reservadas: 2 | Ocupadas: 2
===========================================
```
 
### 📊 Relatório Financeiro
 
O sistema exibe por sala: total de cadeiras por estado, total arrecadado, total em reservas e receita potencial máxima.
 
### 📚 Menu de Exercícios
 
Submenu paginado com 20 exercícios teóricos (7 por página), com navegação entre páginas e visualização do enunciado completo de cada exercício.
 
---
 
## 🛠️ Tecnologias e Conceitos Aplicados
 
`Java` `OOP` `Matrizes` `Vetores` `Loops`
 
| Conceito | Onde foi usado |
|---|---|
| Matriz bidimensional | Grade de cadeiras de cada sala |
| `for` aninhado | Exibição do mapa e cálculo de totais |
| `do/while` | Menu principal e submenu de exercícios |
| Vetor de `String` | Títulos e enunciados dos exercícios |
| Operador ternário | Símbolo da cadeira e opções de navegação |
| `switch / if-else` | Controle de operações e entradas do usuário |
 
---
 
## 🚀 Como Executar
 
```bash
# Clone o repositório
git clone https://github.com/byFranca/teatro-java.git
 
# Acesse a pasta
cd teatro-java
 
# Compile
javac Teatro.java
 
# Execute
java Teatro
```
 
---
 
## 👤 Autor
 
|<img src="https://github.com/byFranca.png" width="80" style="border-radius:50%"/>|
|:--:|
|**Miguel França**| 
|[github.com/byFranca](https://github.com/byFranca)|
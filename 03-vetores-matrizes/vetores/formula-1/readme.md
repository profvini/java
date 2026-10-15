# 🏎️ Atividade Prática: Análise de Dados da F1 em Java

## 1. Visão Geral
Você recebeu um projeto base contendo um sistema de telemetria da temporada de Fórmula 1 de 2026. O sistema é estruturado em três classes:
* `Circuito`: Representa a entidade de uma pista e suas propriedades.
* `CalendarioF1`: Armazena o vetor de circuitos e centraliza as operações estatísticas.
* `Main`: Ponto de entrada da aplicação, contendo a base de dados fixa e as chamadas de teste.

A modelagem inicial, o método construtor, os métodos de acesso (*getters* e *setters*) e a classe `Main` já foram fornecidos. Seu objetivo é preencher a lógica de cálculo e manipulação de vetores que foi suprimida nas classes **`Circuito`** e **`CalendarioF1`**.

---

## 2. Tarefas de Implementação

### Parte A: Regra de Negócio Individual (`Circuito.java`)

Localize e implemente a lógica do seguinte método:

#### `public double calcularDistanciaTotalCorrida()`
* **Objetivo:** Calcular a quilometragem total que um piloto percorre ao completar todo o Grande Prêmio.
* **Fórmula:** `distanciaTotal = extensaoKm * numeroVoltas`
* **Retorno:** Valor numérico correspondente à distância total da prova.

---

### Parte B: Algoritmos de Varredura de Vetor (`CalendarioF1.java`)

Manipule o array interno `circuitos` para implementar os 5 métodos abaixo:

#### 1. `public Circuito obterMaiorPista()`
* **Objetivo:** Percorrer o array `circuitos` e encontrar o autódromo com a **maior extensão por volta** (`extensaoKm`).
* **Dica de Lógica:** Inicialize uma variável sentinela apontando para o primeiro item (`circuitos[0]`) e utilize um laço (`for` ou `for-each`) para comparar os demais elementos.
* **Retorno:** Objeto `Circuito` com maior quilometragem por volta.

#### 2. `public Circuito obterMenorPista()`
* **Objetivo:** Percorrer o array `circuitos` e encontrar o autódromo com a **menor extensão por volta** (`extensaoKm`).
* **Retorno:** Objeto `Circuito` com menor quilometragem por volta.

#### 3. `public double calcularMediaExtensao()`
* **Objetivo:** Calcular a média aritmética de comprimento por volta considerando todas as pistas cadastradas.
* **Passos:**
  1. Acumular a soma de `extensaoKm` de todos os circuitos do vetor.
  2. Dividir o somatório pela quantidade total de pistas cadastradas (`circuitos.length`).
* **Retorno:** Média aritmética calculada.

#### 4. `public void listarPorTipo(String tipoBuscado)`
* **Objetivo:** Filtrar e exibir apenas as pistas cujo tipo coincide com o parâmetro informado (ex: `"Rua"`, `"Permanente"` ou `"Hibrido"`).
* **Regras:**
  * Utilize `c.getTipo().equalsIgnoreCase(tipoBuscado)` para efetuar uma busca que não diferencie maiúsculas de minúsculas.
  * Para cada pista compatível, chame `c.exibirResumo()`.
  * Altere a variável de controle `encontrou = true` ao encontrar pelo menos um registro correspondente.

#### 5. `public Circuito circuitoComMaisCurvas()`
* **Objetivo:** Encontrar o autódromo mais técnico/sinuoso da temporada, ou seja, aquele com o **maior número de curvas** (`numeroCurvas`).
* **Retorno:** Objeto `Circuito` correspondente.

---

## 3. Validação dos Resultados

Após concluir a codificação das lacunas, execute o arquivo `Main.java`. A saída no console deverá corresponder aos seguintes valores de referência:

| Métrica Avaliada | Resultado Esperado |
| :--- | :--- |
| **Pista mais longa** | Spa-Francorchamps (7.004 km) |
| **Pista mais curta** | Circuito de Monte Carlo (3.337 km) |
| **Extensão média das pistas** | ~5.305 km |
| **Pista com mais curvas** | Circuito IFEMA Madrid ou Circuito Urbano de Baku (20 curvas) |
| **Filtro tipo "Rua"** | Monte Carlo, Las Vegas e Baku |

---

## 4. Critérios de Avaliação
1. **Encapsulamento:** Acesso aos atributos dos objetos realizado estritamente por meio de métodos de leitura (*getters*).
2. **Estruturas de Repetição:** Uso correto de loops (`for`, `while` ou `for-each`) e controle de índices/acumuladores.
3. **Preservação das Assinaturas:** Não alterar os nomes dos métodos, modificadores de acesso, listas de parâmetros ou tipos de retorno predefinidos.

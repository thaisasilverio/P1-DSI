# Feira de Adoção de Gatos

Sistema desenvolvido em Java para a disciplina de Desenvolvimento para Servidores I (Fatec São Roque).
## Conceitos aplicados

- Classe e atributo (com visibilidade `private`)
- Método e método construtor (sobrecarregado)
- Encapsulamento (getters e setters)
- `this`
- Herança (`extends`)
- Sobrecarga de método
- Reescrita de método (`@Override`)

## Estrutura do projeto

- **Gato.java** — classe mãe. Guarda `nome`, `idade` e `raca`, e calcula o custo padrão de vacinação/castração que o adotante reembolsa ao abrigo.
- **GatoFilhote.java** — herda de `Gato`. Ainda não foi castrado, só vacinado, então o custo é reescrito para 50% do valor padrão.
- **GatoIdoso.java** — herda de `Gato`. O abrigo assume o custo total, para incentivar a adoção.
- **GatoEspecial.java** — herda de `Gato`. Gatos com necessidades especiais também têm o custo assumido pelo abrigo.
- **TestaFeiraAdocao.java** — classe principal (`main`), instancia um gato de cada tipo, atribui valores via setters e mostra os dados de cada um.

- Thaísa Vitória Fernandes Silvério. Sitemas Para Internet 4º semestre.

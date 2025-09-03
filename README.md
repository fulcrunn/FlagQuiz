# UFPR - TADS - DS151 DEV MOBILE 2025/2


---

## 🧩 Recursos de Bandeiras

- Adicione **pelo menos 10** imagens em `res/drawable/` com o padrão:
  - `flag_brasil.png`, `flag_japao.png`, `flag_alemanha.png`, `flag_franca.png`, `flag_italia.png`, `flag_espanha.png`, `flag_portugal.png`, `flag_argentina.png`, `flag_mexico.png`, `flag_canada.png`, …
- **No código**, use apenas o nome do país **sem** o prefixo `flag_` (ex.: `"brasil", "japao"`).
- O app faz `getIdentifier("flag_${country}", "drawable", packageName)`; se não achar, mostra **Toast** e segue.

---

## 🚀 Como Rodar

1. **Clone** o repositório e abra no **Android Studio** (Giraffe+).
2. Garanta `minSdkVersion >= 28`.
3. Verifique as três Activities no `AndroidManifest.xml`.
4. Confirme que existem **>=10** drawables de bandeiras com os nomes esperados.
5. **Run** em um emulador ou dispositivo físico (API 28+).

---

## ✅ Critérios de Aceite

- [ ] Nome vazio **não** inicia o quiz.
- [ ] Quiz começa em “**1 of 5**” e nunca repete bandeira.
- [ ] Respostas são **case/accent-insensitive**.
- [ ] Após responder: mostra **feedback**, trava input e **habilita Next**.
- [ ] Cada acerto vale **+20**; total correto exibido no fim.
- [ ] Tela de Resultados mostra nome, `Score: X/100` e **5 linhas** (Correct/Incorrect).
- [ ] **Play Again** volta ao início sem duplicar pilha.
- [ ] Rotação não quebra o fluxo (não precisa restaurar tudo, mas **não pode crashar**).

---

## 🔎 Dicas de Teste Manual

- Fluxo com 5 acertos / 5 erros / misto.
- Nomes com espaços/acentos.
- Respostas com acentos e variação de maiúsculas (“México”, “MEXICO”, “mexico”).
- Ausência de algum drawable (Toast aparece e quiz continua).
- Vários ciclos de “Play Again”.

---

## ♿ Acessibilidade

- `ImageView` com `contentDescription`: “Flag of <country>”.
- Texto suficiente para contraste e legibilidade.

---

## 🔧 Troubleshooting

- **Imagem não aparece**: confirme o nome do arquivo e extensão (PNG) e se o **prefixo `flag_`** está correto.
- **Crash em tempo de execução**: veja logs de `getIdentifier` retornando `0`.
- **Strings**: centralize mensagens em `res/values/strings.xml`.

---

## 🗺️ Roadmap (opcional)

- Persistir estado em rotação (`onSaveInstanceState` ou `ViewModel`).
- Internacionalização PT/EN completa.
- RecyclerView na tela de resumo.

---

## 📜 Licença

Este projeto é distribuído sob a licença que você escolher para o repositório.  
Se ainda não definiu, considere **MIT**.

---

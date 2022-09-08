package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    get("/", ctx -> "Bem-vindos a api calculadora os comandos sao /soma /subtracao /multiplicacao /divisao");
    mvc(new Adicao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}

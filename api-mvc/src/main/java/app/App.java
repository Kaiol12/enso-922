package app;

import io.jooby.Jooby;

public class App extends Jooby {
  
  {

    mvc(new Subtracao());
    mvc(new Adicao());
    mvc(new Multiplicacao());
    mvc(new Divisao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}

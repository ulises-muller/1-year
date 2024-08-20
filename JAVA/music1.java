class Instrumento {
    public void ejecuta(String n) { //<--- sin el virtual
    System.out.println("Instrumento.ejecuta() " + n);
    }
}
class Viento extends Instrumento {
    public void ejecuta(String n) {
    System.out.println("Ejecuta flauta (Viento.ejecuta())");
    }
}

class Cuerda extends Instrumento {
  public void ejecuta(String n) {
    System.out.println("Ejecuta guitarra (Cuerda.ejecuta())");
  }
}

class Percusion extends Instrumento {
  public void ejecuta(String n) {
    System.out.println("Ejecuta bombo (Percusion.ejecuta())");
  }
}
class music1 {
    static String media = "nota media";
    static String aguda = "nota aguda";
    static String baja = "nota baja";
    static void afinar(Instrumento i) { //<--- aca se proboca el polimorfismo en java acepta el hijo no ejecuta lo del padre / cuando ejectua lo del padre es upscasting
        System.out.println("aca se proboca el polimorfismo en java acepta el hijo no ejecuta lo del padre");
        i.ejecuta(media);
    }
    public static void main(String[] args) {
        Viento flauta = new Viento();
        Cuerda guitarra = new Cuerda();
        Percusion bombo = new Percusion();
        afinar(flauta);   // No upcasting
        afinar(guitarra); // No upcasting
        afinar(bombo);    // No upcasting
    }
}
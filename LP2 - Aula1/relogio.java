public class relogio {

    public static void main(String[] args) {
    Time1 tempo = new Time1();
    System.out.println(tempo.toUniversalString());
    tempo.setTime(13, 27, 6);
    System.out.println(tempo.toUniversalString());
    System.out.println(tempo.toString());

    Time2 tempo1 = new Time2();
    System.out.println("Classe 2 Construida !");
    System.out.printf("%s\n", tempo.toUniversalString());
    System.out.printf("%s\n", tempo.toString());

    int h; 
    tempo.setTime(21,2,2);
    h = tempo.hour;

    Time2 tempo2 = new Time2(h);
    System.out.printf("Hora atribuida ao construtor: %s\n", tempo2.getHour());

    tempo1.setTime(tempo.hour, tempo.minute, tempo.second);
    System.out.println("Classe com parâmetro construida !");
    System.out.printf("%s\n", tempo.toUniversalString());
    System.out.printf("%s\n", tempo.toString());
    }
    
}

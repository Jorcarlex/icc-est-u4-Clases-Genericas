public class App {
    public static void main(String[] args) throws Exception {
        Generic<String> genericString = new Generic<>();
        genericString.putSomething("Hola mundo");
        String content = genericString.getSomething();

        System.out.println("El contenido de tipo String es: " + content);

        Generic<Integer> genericInteger = new Generic<>();
        genericInteger.putSomething(2024);
        Integer number = genericInteger.getSomething();

        System.out.println("El contenido de tipo Integer es: " + number);

        Generic<Double> genericDouble = new Generic<>();
        genericDouble.putSomething(3.14159);
        Double pi = genericDouble.getSomething();

        System.out.println("El contenido de tipo double es: " + pi);

        Generic<Boolean> genericBoolean = new Generic<>();
        genericBoolean.putSomething(true);
        Boolean truth = genericBoolean.getSomething();

        System.out.println("El contenido de tipo Boolean es: " + truth);

        Generic<Character> genericChar = new Generic<>();
        genericChar.putSomething('A');
        Character letter = genericChar.getSomething();

        System.out.println("El contenido de tipo Char es: " + letter);
    }
}

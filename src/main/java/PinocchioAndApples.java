public class PinocchioAndApples {
    public static int countOfApplesInPinocchio = 5; //изменяемая переменная
    public static int countOfApplesSelectedByKarabasBarabas = 2; //изменяемая переменная

    public static void main(String args[]) {

        System.out.println("У Буратино было " + countOfApplesInPinocchio + " яблок(а).");
        System.out.println("Карабас Барабас отобрал у него " + countOfApplesSelectedByKarabasBarabas + " яблок(а).");

        int countOfApplesRemainingAtPinocchio = countOfApplesInPinocchio - countOfApplesSelectedByKarabasBarabas;
        System.out.println("У Буратино осталось " + countOfApplesRemainingAtPinocchio + " яблок(а) после того, как Карабас Барабас отобрал у него яблоки.");

    }


}

public class EnemyFactory {
    public Enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("orc")) {
            return new Orc();
        } else if (type.equalsIgnoreCase("troll")) {
            return new Troll();
        }
        return null;  // Returnerer null, hvis typen ikke er kendt
    }

    /* Factory-mønsteret gør det nemt at tilføje nye fjendetyper til spillet uden at
     ændre eksisterende kode. Dette opnås ved at tilføje nye klasser, der
     implementerer Enemy-interfacet, og ved at tilpasse createEnemy-metoden i
     EnemyFactory til også at håndtere de nye klasser.
     Factory-mønsteret hjælper med at holde systemet åbent for udvidelse,
     men lukket for ændringer.
     */
}

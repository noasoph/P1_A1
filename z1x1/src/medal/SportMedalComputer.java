// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package medal;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * {@link SportMedalComputer} - see task.
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class SportMedalComputer {
    
    /**
     * compute proper medal for participant
     * 
     * @param points number of  points earned by participant
     * @param age    age of participant
     * @return       resulting medal
     */
    public String evaluate(
        int    points,  // Punkte die Teilnehmer im Wettkampf erworben hat
        int    age      // Alter des jeweiligen Teilnehmers
    ){
        // Deklaration
        String medal;   // Medaille, die jeweiligem Teilnehmer ausgeh�ndigt wird
        
        // Initialisierung
        medal = "currently none"; //Initialisierung
        
        /*if ((age <= 13 && points >= 4000) || (age > 13 && points >= 5000)){
            medal = "Gold"; //Zuweisung
        }
        if ((age <= 13 && (points > 3000 && points <= 3999)) || (age > 13 && (points > 4000 && points <= 4999))){
            medal = "Silber";
        }
        if ((age <= 13 && points < 3000) || (age > 13 && points < 4000)){
            medal = "Bronze";
        }
        */
        
        if (age <= 13) {
            if (points >= 4000) {
                medal = "Gold";
            } else if (points > 3000){
                medal = "Silber";
            } else {
                medal = "Bronze";
            }
        } else {
            if (points >= 5000) {
                medal = "Gold";
            } else if (points > 4000){
                medal = "Silber";
            } else {
                medal = "Bronze";
            }
        }
        
        return medal;
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()
    
}//class

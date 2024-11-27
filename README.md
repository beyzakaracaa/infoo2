# infoo2

Bitte fügt in diese Datei noch eure Namen und Matrikelnummern ein.
Gruppe: Amal Bolakhrif (7423946), Beyza Karaca (7422370), Lena Igoumrane (7424588)

# Grading

| Sheet       | Ex. 1    | Ex. 2    | Ex. 3    | Ex. 4    | Ex. 5    | Sum          |
| ----------- | -------- | -------- | -------- | -------- | -------- | ------------ |
| Homework 01 | 4/4      | 4.5/6    | 3.75/5   | 4/5      | -        | 16.25/20     |
| Homework 02 | 3.75/4.5 | 2.5/4.5  | 5.5/6    | X/5      | -        | (11,75+X)/20 |
| Homework 03 | 0/8      | 0/5.5    | 0/6.5    | -        | -        | 0/20         |
| Homework 04 | 4,5/5    | 2,5/5    | 6,5/7    |  0/3     | -        | 13,5/20      |

### Erläuterungen zur Bewertung

Keine korrigierbare Abgabe für HW03, da die PDF-Datei HM3 beschädigt ist und nicht geöffnet werden kann.

HW02:
- Ex. 1: Schritt 5 fehlt. Die Abzweigung bezieht sich nicht darauf, ob die Lehrpersonen die eingegebenen Zeiten bestätigt, sondern ob nach der Analyse durch das System Änderungen an den Eingaben gemacht werden sollen. Der Adjustment-Branch führt eigentlich in eine Schleife, die wieder vor den Fork zurückführt.
- Ex. 2: Die visuell auffälligen schwarzen Punkte (Initial State und Final State) werden üblicherweise nicht mit konkreten State-Namen beschriftet, sondern lediglich mit dem konkreten Ausgangszustand (hier "Not Enrolled") bzw. mit den vor Beendigung angenommen Zuständen verbunden. Es gibt nur einen Final State (schwarzes Bull's Eye). Benutzt "Enrolled" als Composite State, in dem dann "Not Assigned", "Assigned" und "In Conflict" Substates sind. Transition von "Not Enrolled" zum Final State (bzw. "Terminated") durch das Event "Course closed" fehlt. Unbeschriftetes Event zwischen "Enrolled" und "Assigned".
- Ex. 3: Beschriftung der Interfaces vom Frontend aus fehlt (bspw. REST). Die jeweiligen Ports und Delegates auf beiden Seiten von den Interfaces "UserData" und "CourseData" fehlen.
- Ex. 4: 5 Punkte für Beyza und Amal, 0 Punkte für Lena, da anscheinend nicht alle von euch das Formular ausgefüllt haben.

HW01:
- Ex. 2: Bei den Quality Requirements solltet ihr die Requirements rausschreiben und dann Unterkategorien zuordnen. Ihr habt aber nur die Unterkategorien hingeschrieben. Euer Process Requirement ist eigentlich ein Functional Requirement.
- Ex. 3: Bei Functional Requirement 1 könnte man noch konkretisieren, welche Angaben bei der Gruppenerstellung gemacht werden müssen. Bei Functional Requirement 3 könnte präzisiert werden, wie das funktionieren soll: geben die Studierenden allgemein einfach alle Zeiten in der Woche an, an denen sie nicht können, oder wählen sie aus den Übungsterminen diejenigen aus, die ihnen nicht passen? Für sich allein genommen fehlt es dem Requirement etwas an Aussagekraft - das gilt aber für fast alle eure Functional Requirements, da die sehr knapp formuliert sind. Beim 3. Quality Requirement fehlt immer noch, wie das Requirement nun überhaupt formuliert sein soll. Wenn ihr einfach die zwei Sätze aus dem Text nehmen wolltet, sollte auffallen, dass "thousands of students" etwas zu unkonkret ist. Bzgl. des Project Requirements kann man sich fragen, welche Funktionalität in der Testversion schon alles enthalten sein soll.
- Ex. 4: "ranks her preferences" aus Szenario 1 fehlt im Main Flow und steht dafür im Trigger, was keinen Sinn ergibt. Der Trigger soll den Auslöser für den Beginn des Main Flows angeben und ihn nicht inhaltlich doppeln (also bspw. wäre der Login ein Trigger, den man dann im Main Flow weg lassen würde). Bei Schritt 2 fehlt der Protagonist. Die Alternativen Pfade bitte so nummerieren, dass man weiß, wo sie abzweigen, und kleinschrittiger aufdröseln.

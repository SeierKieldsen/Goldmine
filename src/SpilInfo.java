//Vi skal have ændret til Ali' kode
    public class SpilInfo {
        TerningertilCDIO2 terningeObjekt = new TerningertilCDIO2();
        Goldmine sprogObjekt = new Goldmine();
        String language;

        public boolean sprog(String l) {
            switch (l) {
                case "en":
                    System.out.println("You have choosen english");
                    language = "en";
                    return true;
                case "dk":
                    System.out.println("Du har valgt dansk");
                    language = "dk";
                    return true;
                default:
                    return false;
            }
        }
        int point;
        public void Felter (int s) {
            switch (s) {

                case 2:
                    if (language == "en") {
                       System.out.println("Congrats you entered the tower and earn 250");
                    }
                    if (language == "dk") {
                        System.out.println("Tillykke du kom en tur i tårnet og tjente 250");
                    }
                    point = 250;
                     break;
                case 3:
                    if (language == "en") {
                        System.out.println("You fell in the Crater and lost 100");
                    }
                    if (language == "dk") {
                        System.out.println("Du faldt i Crater og taber 100");
                    }
                    point = -100;
                    break;
                case 4:
                    if (language == "en") {
                        System.out.println("You arrived to the Palace gates and earned 100");
                    }
                    if (language == "dk") {
                        System.out.println("Du ankom til portene ved Paladset og tjente 100");
                    }
                    point = 100;
                    break;
                case 5:
                    if (language == "en") {
                        System.out.println("You arrived to the Cold dessert you lost 20");
                    }
                    if (language == "dk") {
                        System.out.println("Du ankom til den kolde ørken og tabte 20");
                    }
                    point = -20;
                    break;
                case 6:
                    if (language == "en") {
                        System.out.println("You arrive to the Walled city and recieve 180");
                    }
                    if (language == "dk") {
                        System.out.println("Du ankom til den befæstede by og modtager 180");
                    }
                    point = 180;
                    break;
                case 7:
                    if (language == "en") {
                        System.out.println("You arrived to the Monastery and get to sleep for free");
                    }
                    if (language == "dk") {
                        System.out.println("Du ankommer til klosteret og du får lov at overnatte gratis");
                    }
                    point = 0;
                    break;
                case 8:
                    if (language == "en") {
                        System.out.println("You hit the black cave and lost 70");
                    }
                    if (language == "dk") {
                        System.out.println("Du faldt i den sorte hule og tabte 70");
                    }
                    point = -70;
                    break;
                case 9:
                    if (language == "en") {
                        System.out.println("You arrive for the huts in the mountains and recieve 60");
                    }
                    if (language == "dk") {
                        System.out.println("Du ankom til hytten på bjerget og modtager 60");
                     }
                    point = 60;
                    break;
                case 10:
                    if (language == "en") {
                        System.out.println("You arrived to the werewolf wall, and lost 80, but you get a extra roll");
                    }
                    if (language == "dk") {
                        System.out.println("du ankom til vareulve væggen og taber 80, men du får et ekstra slag.");
                    }
                    point = -80;
                        break;
                case 11:
                    if (language == "en") {
                        System.out.println("You arrive at the pit and lose 50");
                    }
                    if (language == "dk") {
                        System.out.println("Du ankom til hullet og taber 50");
                    }
                    point = -50;
                    break;
                case 12:
                    if (language == "en") {
                        System.out.println("You just landed on the goldmine, congrats you are rich! +650 for you");
                     }
                    if (language == "dk") {
                        System.out.println("Tillykke! Du er lige blevet rig, du landede på guldminen og tjente 650");
                    }
                    point = 650;
                    break;
            }
        }
    }


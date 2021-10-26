//Vi skal have ændret til Ali' kode
    public class SpilInfo {
        TerningertilCDIO2 terningeObjekt = new TerningertilCDIO2();

        public void Felter (int s) {
            switch (s) {

                case 2:
                    if (English == true) {
                        System.out.println("Congrats you entered the tower and earn 250");
                    }
                    if (language == "dk") {
                        System.out.println("Tillykke du kom en tur i tårnet og tjente 250");
                    }

                case 3:
                    if (English == true) {
                        System.out.println("You fell in the Crater and lost 100");
                    }
                    if (Danish == true) {
                        System.out.println("Du faldt i Crater og taber 100");
                    }
                case 4:
                    if (English == true) {
                        System.out.println("You arrived to the Palace gates and earned 100");
                    }
                    if (Danish == true) {
                        System.out.println("Du ankom til portene ved Paladset og tjente 100");
                    }
                case 5:
                    if (English == true) {
                        System.out.println("You arrived to the Cold dessert you lost 20");
                    }
                    if (Danish == true) {
                        System.out.println("Du ankom til den kolde ørken og tabte 20");
                    }
                case 6:
                    if (English == true) {
                        System.out.println("You arrive to the Walled city and recieve 180");
                    }
                    if (Danish == true) {
                        System.out.println("Du ankom til den befæstede by og modtager 180");
                    }
                case 7:
                    if (English == true) {
                        System.out.println("You arrived to the Monastery and get to sleep for free");
                    }
                    if (Danish == true) {
                        System.out.println("Du ankommer til klosteret og du får lov at overnatte gratis");
                    }
                case 8:
                    if (English == true) {
                        System.out.println("You hit the black cave and lost 70");
                    }
                    if (Danish == true) {
                        System.out.println("Du faldt i den sorte hule og tabte 70");
                    }
                case 9:
                    if (English == true) {
                        System.out.println("You arrive for the huts in the mountains and recieve 60");
                    }
                    if (Danish == true) {
                        System.out.println("Du ankom til hytten på bjerget og modtager 60");
                    }
                case 10:
                    if (English == true) {
                        System.out.println("You arrived to the werewolf wall, and lost 80, but you get a extra roll");
                    }
                    if (Danish == true) {
                        System.out.println("du ankom til vareulve væggen og taber 80, men du får et ekstra slag.");
                    }

                    +EKSTRA ROLL
                case 11:
                    if (English == true) {
                        System.out.println("You arrive at the pit and lose 50");
                    }
                    if (Danish == true) {
                        System.out.println("Du ankom til hullet og taber 50");
                    }
                case 12:
                    if (English == true) {
                        System.out.println("You just landed on the goldmine, congrats you are rich! +650 for you");
                    }
                    if (Danish == true) {
                        System.out.println("Tillykke! Du er lige blevet rig, du landede på guldminen og tjente 650");
                    }
            }
        }
    }


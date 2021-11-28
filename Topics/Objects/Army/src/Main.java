class Army {

    public static void createArmy() {
        // Create all objects here
        Unit unit1 = new Unit("Marko");
        Unit unit2 = new Unit("Pesho");
        Unit unit3 = new Unit("Kolio");
        Unit unit4 = new Unit("Mustafa");
        Unit unit5 = new Unit("Ali");
        Knight knight1 = new Knight("Niki");
        Knight knight2 = new Knight("Stenli");
        Knight knight3 = new Knight("Goga");
        General general = new General("Kiko");
        Doctor doctor = new Doctor("Nikola");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
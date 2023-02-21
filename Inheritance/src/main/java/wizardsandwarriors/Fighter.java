package wizardsandwarriors;

abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);


}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        if(wizard.isVulnerable())
            return 10;
        else
            return 6;
    }
}

class Wizard extends Fighter {
    public boolean prepareSpell = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !prepareSpell;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if(prepareSpell) return 12;
        else return 3;
    }

    void prepareSpell() {
        prepareSpell = true;
    }

}

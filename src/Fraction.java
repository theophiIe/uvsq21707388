public class Fraction {
    private int numerateur;
    private int denominateur;
    public Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public String toString(){
        return "La fraction a pour denominateur " + this.denominateur + " et " + this.numerateur + " pour numerateur";
    }
}

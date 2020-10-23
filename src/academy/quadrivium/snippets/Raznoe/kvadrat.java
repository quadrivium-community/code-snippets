package academy.quadrivium.snippets.Raznoe;

class kvadrat {
    public static void main(String[] args) {
        double x=1;
        double y=(1-Math.pow(x,2))+2.5*(Math.pow(x,3))+Math.pow(x,4);
        double z=y*y;
        System.out.print(z);
    }
}
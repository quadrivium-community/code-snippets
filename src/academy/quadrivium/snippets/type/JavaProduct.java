package academy.quadrivium.snippets.type;

public class JavaProduct {

    private char[] container = new char[10];

    public JavaProduct(char[] chars){

    if(chars.length  <= container.length) {
        container[0] = chars[0];
        container[1] = chars[1];
        container[2] = chars[2];
        container[3] = chars[3];
        container[4] = chars[4];
        container[5] = chars[5];
        container[6] = chars[6];
        container[7] = chars[7];
        container[8] = chars[8];
        container[9] = chars[9];


    }
    }

    public void printString(){
        System.out.println(container);
    }

}



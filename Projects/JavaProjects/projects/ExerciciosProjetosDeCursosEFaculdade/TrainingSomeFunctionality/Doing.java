package TrainingSomeFunctionality;

public class Doing {
    public static void main (String[] args){
        String somename = "Mateus Davi";
        char word = somename.charAt(3);
        System.out.println("Word position 5: "+word);
        System.out.println("size: " + somename.length());
        if (somename.equalsIgnoreCase ("Mateus Davi")){
            System.out.println("True");
            System.out.println("Go on");
        }else {
            System.out.println("False");
        }
        System.out.println(somename.indexOf("Davi"));
        String sub = somename.substring(0, 11);

        System.out.println(sub);
        System.out.println(somename.toLowerCase());
        System.out.println(somename.endsWith("a"));
        System.out.println(somename.startsWith("Davi")? "True" : "False");

    }

}


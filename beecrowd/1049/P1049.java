import java.util.Scanner;
public class P1049 {
    public static void main(String[] args) {
        var s = new Scanner(System.in);        
        String c1 = s.nextLine();
        String c2 = s.nextLine();
        String c3 = s.nextLine();
        s.close();
        switch (c1) {
            case "vertebrado":
                switch(c2){
                    case "ave":
                        switch(c3){
                            case "carnivoro":
                                System.out.println("aguia");
                                break;
                            case "onivoro":
                                System.out.println("pomba");
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        break;
                    case "mamifero":
                        switch(c3){
                            case "onivoro":
                                System.out.println("homem");
                                break;
                            case "herbivoro":
                                System.out.println("vaca");
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            break;
            case "invertebrado":
                switch(c2){
                    case "inseto":
                        switch(c3){
                            case "hematofago":
                                System.out.println("pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        break;
                    case "anelideo":
                        switch(c3){
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;
                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
            default:
                break;
        }
    }    
}

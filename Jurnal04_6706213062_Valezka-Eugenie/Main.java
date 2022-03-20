import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

public class Main {

    public static void main(String[] args) {


        LinkedList<ListPlayer> listPlayers = new LinkedList<>();

        Scanner scan = new Scanner(System.in);

        boolean kondisi = true;
        while (kondisi){
            menu();

            switch (scan.nextInt()){
                case 1:
                    String judulLagu = scan.next();
                    String namaPenyanyi = scan.next();
                    listPlayers.addLast(new ListPlayer(judulLagu, namaPenyanyi));
                    break;
                                    case 2 :
                                        System.out.println("1. Hapus sesuai judul");
                                        System.out.println("2. Hapus yang terakhir");

                                        if(scan.nextInt() == 1){
                                            removeWithJudul(listPlayers, scan.next());
                                        }else {
                                            listPlayers.removeLast();
                                        }
                                    break;
                                                case 3:
                                                    print(listPlayers);
                                                    break;
                                                default:
                                                    kondisi = false;
                                                    break;
            }
        }
    }
    public static void print(LinkedList playerLists){
        ListIterator<ListPlayer> iterator = playerLists.listIterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if(iterator.hasNext()){
                System.out.print(" - ");
            }
        }

        System.out.println();

                    while (iterator.hasPrevious()){
                        System.out.print(iterator.previous());
                        if(iterator.hasPrevious()){
                            System.out.print(" - ");
                        }
                    }

                    System.out.println("\n ---- habis ----");
    }

    public static void removeWithJudul(LinkedList listPlayers, String judul){
        ListIterator<ListPlayer> iterator = listPlayers.listIterator();
        while (iterator.hasNext()){
            ListPlayer listPlayer = iterator.next();
            if(listPlayer.getJudulLagu().equals(judul)){
                iterator.remove();
                System.out.println("--- berhasil hapus ---");
            }
        }
    }

    public static void menu(){
        
        System.out.println("menu player list");
             System.out.println("1. Input lagu");
                 System.out.println("2. Hapus lagu");
                     System.out.println("3. Mainkan lagu");
                         System.out.println("4 Keluar");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.fjmg;

/**
 *
 * @author fco-j
 */
public class MainMemes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Meme mrIncredible = new Meme("Traumatized Mr Inredible",
                "Los que saben frente a los que no saben", 2021);

        Meme leeroy = new Meme("Leeroy Jenkins", "Frase famosa de un jugador"
                + " de Wow que se tiró como pollo sin cabeza", 2017);

        Meme duck = new Meme("Duckroll", "Predecesor del Rickroll", 2006);

        Meme rickroll = new Meme();

        Meme tomLaught = new Meme("Laugthing Tom", "Expresa burla "
                + "hacia alguna situacion donde se ridiculiza a "
                + "algún sujeto o situación", 2012);

        MemeDataList memeDatabase = new MemeDataList();

        memeDatabase.addMeme(mrIncredible);
        memeDatabase.addMeme(rickroll);
        memeDatabase.addMeme(duck);
        memeDatabase.addMeme(leeroy);

        System.out.println("Está el duckroll? "
                + memeDatabase.findMeme(duck));
        System.out.println("Posición: "
                + memeDatabase.searchMeme("Duckroll"));

        memeDatabase.delMeme(duck);

        System.out.println("Está el duckroll?"
                + memeDatabase.findMeme(duck));

        System.out.println("Datos del Rickroll: "
                + memeDatabase.getMeme(memeDatabase.searchMeme("Rickroll")));

        System.out.println("Datos del MemeDatabase: \n"
                + memeDatabase);

    }

}

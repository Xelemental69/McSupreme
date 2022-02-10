/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.fjmg;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class MemeDataList {
    
    ArrayList <Meme> memeList;

    public MemeDataList() {
        
        memeList = new ArrayList <>();
        
    }

    public MemeDataList(ArrayList<Meme> memeList) {
        
        this.memeList = memeList;
        
    }
    
    public void addMeme(Meme meme){
        
        memeList.add(meme);
        
    }
    
    public boolean delMeme(Meme meme){
        
        return memeList.remove(meme);
        
    }
    
    public Meme getMeme(int posicion){
        
        return memeList.get(posicion);
        
    }
    
    public boolean findMeme(Meme meme){
        
        return memeList.contains(meme);
        
    }

    public ArrayList<Meme> getMemes() {
        
        return memeList;
    
    }
    
    public int searchMeme(String titulo){
        
        int pos = -1;
        
        for (int i = 0; i < memeList.size(); i++){
            
            if (titulo.equalsIgnoreCase(memeList.get(i).getNombre())){
                
                pos = i;
                break;
                
            }
            
        }
        
        return pos;
        
    }

    @Override
    public String toString() {
        
        return "Meme Data List :" + memeList;
        
    }
    
}

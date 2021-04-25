package gt.edu.miumg.sistemas.ingesoftware.p2.BubbleSort1.Services;

import java.util.Scanner;

public class WordManager implements IWordManager{
    
    
     String words[];
     int count = 0;

    
 
    public static String[] InsertWord() {
    
        String []words = {"zorro", "angel", "juan", "dinosaurio"}; 
        
        IBubbleSort  bubble = new BubbleSort();
        
        bubble.Sort(words);
        
        return words;
     
    }

    @Override
    public void ShowWord() {
        String words[] = InsertWord();
        
         for (String word : words) {
             System.out.println(word);
         }              
        
    }
    
    
    
    
    
}

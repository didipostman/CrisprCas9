/**
 * 
 */
package com.juxtapose.example.ch02;

import org.springframework.batch.item.ItemProcessor;
import com.juxtapose.example.ch02.RabinKarp;

/**

 * @author wadï mami (mailto:didipostman77@gmail.com)
 * 2013-1-6下午09:55:38
 */
public class DNA_SequenceProcessor implements
		ItemProcessor<DNA_Sequence, DNA_Sequence> {
			
        
	private String[] snippetsVirusDna = {"TGCTGCT", "AATTCC", " GGAATAA"};  // the array can be more larger it is just an explanation
	
	public DNA_Sequence process(DNA_Sequence dnas) throws Exception {
		
	String strOffset ="";	
		
	for (int i=0; i<snippetsVirusDna.length; i++)  
          {  
  
            
	String pat = snippetsVirusDna[i] ;
	
        String txt = dnas.getDna() ;

        RabinKarp searcher = new RabinKarp.getInstance(pat);
        int offset = searcher.search(txt);
	
	strOffset = strOffset +String.valueOf(offset);
	
        
        
	}
		dnas.setOffsets(strOffset);
     } 
}

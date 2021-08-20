/**
 * 
 */
package com.juxtapose.example.ch02;

/**

 * @author wadï mami (mailto:didipostman77@gmail.com)
 * 2013-1-6下午09:56:02
 */
public class DNA_Sequence {
	
	private String dna = "";
	private String offsets = "";
	
	
	
	public String getDna() {
		return dna;
	}
	public void setDna(String dna) {
		this.dna = dna;
	}
	
	public String getOffsets() {
		return offsets;
	}
	public void setOffsets(String offsets) {
		this.offsets = offsets;
	}
	
	/**
	 * 
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append( "dna=" + getDna() +";pattern :" + getOffsets() );
		return sb.toString();
	}
}

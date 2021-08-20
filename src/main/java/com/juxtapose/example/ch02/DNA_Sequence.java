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
	private String crissprArrays = "";
	
	
	
	public String getDna() {
		return dna;
	}
	public void setDna(String dna) {
		this.dna = dna;
	}
	
	public String getCrissprArrays() {
		return crissprArrays;
	}
	public void setCrissprArrays(String crissprArrays) {
		this.crissprArrays = crissprArrays;
	}
	
	/**
	 * 
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append( "dna=" + getDna() +";pattern :" + getCrissprArrays() );
		return sb.toString();
	}
}

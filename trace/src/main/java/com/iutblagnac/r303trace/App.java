package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
	/*
	 * Méthode main qui affiche "Hello World!"
	 */
    public static void main( String[] args )
    {
        System.out.println(hello());
    }
    
    /*
     * Fonction qui retourne "Hello World!"
     */
    public static String hello() {
        return  "Hello World!" ;
    }
    
    /*
     * @param : String param : chaîne de caractères à retourner 
     * Fonction 
     */
    public static String hello(String param) {
        return  param ;
    }
    
}

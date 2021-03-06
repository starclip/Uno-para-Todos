/*
 ******************************************************************************
 * Clase que crea la carta de salto y sobreescribe el método ejecutarAccion.
 *
 ******************************************************************************
 */

// Importar packete.
package uno;

/**
 *
 * @author Jason Barrantes Arce 2015048456
 *         David Vargas Rosales 2015128043
 *         Randy Morales Gamboa 2015085446
 * 
 */

// Crea la carta salto.
public class CartaSalto extends Cartas{
    // Constructor.
    public CartaSalto(String Color, String Nombre){
        setNombre(Nombre);
        setColor(Color);
    }//-
    
    // Sobreescribe el método ejecutarAccion.
    @Override
    public String ejecutarAccion(){
        return "salto";
    }//-
    
}//-

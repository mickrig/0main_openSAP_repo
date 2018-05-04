/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc.model;

/**
 * Das Model ist komplett unabhängig von den anderen
 * Klassen und weiß nicht was um ihn herum geschieht.
 * Es ist völlig egal ob man dieses Model aus einem
 * Fenster oder einer Konsolen Eingabe verwendet -
 * beiden würde funktionieren.
 */
public class WurzelModel {

    long _value;

    public WurzelModel(){
        zurückSetzen();
    }

    public void zurückSetzen(){
        this._value = 0;
    }

    public void berechneWurzel(long wert){
        this._value =  (wert * wert);
    }

    public long getWurzel(){
        return this._value;
    }
}

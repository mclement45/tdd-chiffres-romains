package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }

    public String en_romain() {
	String res="";
	if (valeur==4) return "IV";
	if (valeur==9) return "IX";
	if (valeur==14) return "XIV";
	if (valeur==19) return "XIX";

	if(valeur>=10){
		res+="X"; valeur-=10;
	}
	if(valeur >=5 && valeur <=8){
		res+="V";valeur-=5;
	}
	while(valeur >=1 && valeur <= 3){
		res+="I";
		valeur--;
	}
	return res;
    }
}

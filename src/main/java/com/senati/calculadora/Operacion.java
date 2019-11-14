package com.senati.calculadora;

public class Operacion {
    
    public String calcular(String valor1, String valor2, TipoOperacion tipo){
        double numero1=Double.parseDouble(valor1);
        double numero2=Double.parseDouble(valor2);
        switch(tipo){
            case SUMA:
                return numero1+numero2+" ";
            case RESTA:
                return numero1-numero2+" ";
            case MULTIPLICACION:
                return numero1*numero2+" ";
            case DIVISION:
                if (numero2 != 0) return numero1/numero2+" ";
            case POTENCIA:
                return Math.pow(numero1, numero2)+" ";
            case RAIZ:
                if(numero2>0)
                    return Math.pow(numero1,1/numero2)+" ";
            case PORCENTAJE:
                return ((numero1 * numero2) / 100) + " ";
            default:
                return "Error ";
        }
    }    
    
    public String calcular(String valor, TipoOperacion tipo){
        double numero=Double.parseDouble(valor);
        switch(tipo){
            case INVERSA:
                return 1 / numero + " ";
            case CAMBIO_SIGNO:
                return (numero*-1)+" ";
            case FACTORIAL:
                double fact=1;
                for(double temp=1;temp<=numero;temp++)
                    fact=fact*temp;
                return fact+ " ";
            case EXPONENCIACION:
                return Math.exp(numero)+" ";
            case LOGARITMO:
                return Math.log(numero)+" ";
            default:
                return "Error";
        }
    }
    
    public String calcular(String valor, TipoOperacion tipo, TipoGrado grado){
        double numero=Double.parseDouble(valor);
        switch(tipo){
            case SENO:
                if(grado==TipoGrado.SEXAGESIMALES)
                    numero=Math.PI * numero / 180;
                return Math.sin(numero)+" ";
            case COSENO:
                if(grado==TipoGrado.SEXAGESIMALES)
                    numero=Math.PI * numero / 180;
                return Math.cos(numero)+" ";
            case TANGENTE:
                if(grado==TipoGrado.SEXAGESIMALES)
                    numero=Math.PI * numero / 180;
                return Math.tan(numero)+" ";
            case ASENO:
                if(grado==TipoGrado.SEXAGESIMALES)
                    return (Math.asin(numero) * 180 / Math.PI)+" ";
                else
                    return Math.asin(numero)+" ";
            case ACOSENO:
                if(grado==TipoGrado.SEXAGESIMALES)
                    return (Math.acos(numero) * 180 / Math.PI)+" ";
                else
                    return Math.acos(numero)+" ";
            case ATANGENTE:
                if(grado==TipoGrado.SEXAGESIMALES)
                    return (Math.atan(numero) * 180 / Math.PI)+" ";
                else
                    return Math.atan(numero)+" ";
            default:
                return "Error";
        }
    }
    
}

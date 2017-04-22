    
    /**
     * Clase que verifica que una oración contenga todas las letras del alfabeto.
     * 
     * @author (Margarito Zárate Santiago) 
     * @version (18-04-2017)
     */
    public class VerificarAlfabeto
    {
        //indicamos los elementos del alfabeto
        private final static String alfabeto="abcdefghijklmnñopqrstuvxyz";
    
        public VerificarAlfabeto()
        {
     
        }
    
        /**
         * Metodo para verificar que una oracion tiene todas las letras del alfabeto
         */
        
        public boolean verificarLetras(String oracion)
        {  
            boolean resultado=true;
            char letraAlfabeto;
            
            oracion=oracion.toLowerCase(); //convertimos a minuscula
            //analizamos que la oracion contenga cada letra del alfabeto
            for (int i=0;i<alfabeto.length();i++){
                letraAlfabeto=alfabeto.charAt(i);
                
                if(oracion.contains(String.valueOf(letraAlfabeto))){
                   System.out.println("La oracion si contiene la letra "+letraAlfabeto); 
                }else{
                    System.out.println("La oracion NO contiene la letra "+letraAlfabeto); 
                    resultado=false;   
                }
            }//fin for
        
            return resultado;
        }
        
        //Prueba de metodo de validacion
        public static void main (String [] args ){
            
            VerificarAlfabeto verificar=new VerificarAlfabeto();
            String oracionPrueba="Saludos desde Oaxaca";

            if(verificar.verificarLetras(oracionPrueba)){
                System.out.println("LA ORACIÓN "+ oracionPrueba +" :::SI::: CONTIENE TODAS LAS LETRAS DEL ALFABETO");
            }else{
                System.out.println("LA ORACIÓN "+ oracionPrueba +" :::NO::: CONTIENE TODAS LAS LETRAS DEL ALFABETO");
            }    
        }
    }

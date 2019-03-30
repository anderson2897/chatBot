package modelo;

public class ModeloBot {

    public ModeloBot() {
    }//costructor
    
    public String dialogo(String dPer){
        String dBot="";
        if (dPer.equalsIgnoreCase("hola")
                ||dPer.equalsIgnoreCase("holi")
                ||dPer.equalsIgnoreCase("entonces")
                ||dPer.equalsIgnoreCase("hola parce")) {
            dBot = "Hola parce";    
        }else if (dPer.equalsIgnoreCase("que dice?")
                ||dPer.equalsIgnoreCase("que cuenta?")
                ||dPer.equalsIgnoreCase("como está?")
                ||dPer.equalsIgnoreCase("que hay de nuevo?")) {
          dBot = "¡Usted no sabe quien soy yo!"  ;
        }else if (dPer.equalsIgnoreCase("Adios")
                ||dPer.equalsIgnoreCase("Nos vemos")
                ||dPer.equalsIgnoreCase("hasta la proxima")
                ||dPer.equalsIgnoreCase("se cuida")) {
         
            dBot="Como dijo andrea";
        }else{
            dBot="Afedo camate pofavo";
        }
        
        return dBot;
    }//dialogo
    
}//ModeloBot

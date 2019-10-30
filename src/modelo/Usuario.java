package modelo;

import java.util.ArrayList;

public class Usuario {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    private int  codUsuario;
    private String nomeUsuario;
    private String senhaUsuario;
    
    /*public Usuario(){
    }

    public Usuario(int codUsuario, String nomeUsuario, String senhaUsuario) {
        this.codUsuario = codUsuario;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }*/
         
    public  int getCodUsuario(){
        return codUsuario;
    }
    public void setCodUsuario(int codUsuario){
        this.codUsuario = codUsuario;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
     public void cadastroUsuario(int cod, String nomeUsuario, String senhaUsuario){
        setCodUsuario(cod);
        setNomeUsuario(nomeUsuario);
        setSenhaUsuario(senhaUsuario);
    } 
     
    public boolean validaUsuario(Usuario user){
        boolean find = false;
        
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getNomeUsuario().equals(user.getNomeUsuario()) && usuarios.get(i).getSenhaUsuario().equals(user.getSenhaUsuario())){
                find = true;
                break;
            }
        }
        
        return find;
    }
}

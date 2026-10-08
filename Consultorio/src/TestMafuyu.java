// Desarrolladores:
// 
//
// Eric Rene Avila Galindo

package pck_consultorio;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import pck_fecha.*;
import javax.swing.JOptionPane;

public class TestEric {
    public static void main(String[] args) {
        // Arreglos dinamicos
        ArrayList <Medico> medicos = new ArrayList <>();
        ArrayList <Consulta> consultas = new ArrayList <>();
        ArrayList <Paciente> pacientes = new ArrayList <>();
        
        // Variables para el manejo de archivos de entrada y salida
        FileInputStream fin = null;
        FileOutputStream fout = null;
        
        // Lectura de los archivos
        try{
            fin = new FileInputStream("Medicos.txt");
            ObjectInputStream entrada = new ObjectInputStream(fin);
            medicos = (ArrayList)entrada.readObject();
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error de clase\n" + e.getMessage());
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo\n" + e.getMessage());
        }catch(EOFException e){
            JOptionPane.showMessageDialog(null,"Lectura completada\n");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error de E/S\n" + e.getMessage());
        }finally{
            try{
                if(fin!=null){
                    fin.close();
                    fin = null;
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al cerrar archivo.\n" + e.getMessage());
            }
        }
        
        try{
            fin = new FileInputStream("Consultas.txt");
            ObjectInputStream entrada = new ObjectInputStream(fin);
            consultas = (ArrayList)entrada.readObject();
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error de clase\n" + e.getMessage());
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo\n" + e.getMessage());
        }catch(EOFException e){
            JOptionPane.showMessageDialog(null,"Lectura completada\n");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error de E/S\n" + e.getMessage());
        }finally{
            try{
                if(fin!=null){
                    fin.close();
                    fin = null;
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al cerrar archivo.\n" + e.getMessage());
            }
        }
        
        try{
            fin = new FileInputStream("Pacientes.txt");
            ObjectInputStream entrada = new ObjectInputStream(fin);
            pacientes = (ArrayList)entrada.readObject();
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Error de clase\n" + e.getMessage());
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo\n" + e.getMessage());
        }catch(EOFException e){
            JOptionPane.showMessageDialog(null,"Lectura completada\n");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error de E/S\n" + e.getMessage());
        }finally{
            try{
                if(fin!=null){
                    fin.close();
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al cerrar archivo.\n" + e.getMessage());
            }
        }
        
        // Programa Principal
        int opc;
        String menu = """
                      ------- CONSULTORIO MEDICO -------
                      
                      1) Alta de un médico familiar
                      2) Alta de un médico especialista
                      3) Alta de un paciente
                      4) Alta de una consulta
                      5) Listar médicos familiares
                      6) Listar médicos especialistas
                      7) Listar pacientes
                      8) Listar consultas
                      9) Ver detalle de un médico familiar
                      10) Ver detalle de un médico especialista
                      11) Ver detalle de un paciente
                      12) Ver detalle de una consulta
                      13) Eliminar un médico familiar
                      14) Eliminar un médico especialista
                      15) Eliminar un paciente
                      16) Eliminar una consulta
                      17) Salir
                      
                      Ingrese una opcion: """;
        String copyright = """
                           Todos los derechos reservados
                           
                           Desarrolladores:
                           n1
                           n2
                           Eric Rene Avila Galindo
                           """;
        
        do{
            do{
                opc = -1;
                try{
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null,menu,"Menu",3));
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"La opcion debe ser numerica","Error de entrada",2);
                }
            }while(opc==-1);
            switch(opc){
                case 1 -> {
                    
                }
                
                case 2 -> {
                    
                }
                
                case 3 -> {
                    
                }
                
                case 4 -> {
                    
                }
                
                case 5 -> {
                    
                }
                
                case 6 -> {
                    
                }
                
                case 7 -> {
                    
                }
                
                case 8 -> {
                    
                }
                
                case 9 -> {
                    
                }
                
                case 10 -> {
                    
                }
                
                case 11 -> {
                    
                }
                
                case 12 -> {
                    
                }
                
                case 13 -> {
                    
                }
                
                case 14 -> {
                    
                }
                
                case 15 -> {
                    
                }
                
                case 16 -> {
                    
                }
                
                case 17 -> {
                    JOptionPane.showMessageDialog(null,copyright,"Copyright",1);
                }
                
                default -> {
                    JOptionPane.showMessageDialog(null,"Verifique las opciones del menu","Error de entrada",2);
                }
            }
        }while(opc!=17);
        
        
        // Escritura de los archivos
        try{
            fout = new FileOutputStream("Medicos.txt");
            ObjectOutputStream salida = new ObjectOutputStream(fout);
            salida.writeObject(medicos);
            JOptionPane.showMessageDialog(null,"Archivo guardado con exito");
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo...\n" + e.getMessage());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error de E/S.\n" + e.getMessage());
        }finally{
            try{
                if(fout!=null){
                    fout.close();
                    fout = null;
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al cerrar archivo.\n" + e.getMessage());
            }
        }
        
        try{
            fout = new FileOutputStream("Consultas.txt");
            ObjectOutputStream salida = new ObjectOutputStream(fout);
            salida.writeObject(consultas);
            JOptionPane.showMessageDialog(null,"Archivo guardado con exito");
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo...\n" + e.getMessage());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error de E/S.\n" + e.getMessage());
        }finally{
            try{
                if(fout!=null){
                    fout.close();
                    fout = null;
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al cerrar archivo.\n" + e.getMessage());
            }
        }
        
        try{
            fout = new FileOutputStream("Pacientes.txt");
            ObjectOutputStream salida = new ObjectOutputStream(fout);
            salida.writeObject(pacientes);
            JOptionPane.showMessageDialog(null,"Archivo guardado con exito");
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo...\n" + e.getMessage());
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error de E/S.\n" + e.getMessage());
        }finally{
            try{
                if(fout!=null){
                    fout.close();
                }
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al cerrar archivo.\n" + e.getMessage());
            }
        }
        
    }

    
}

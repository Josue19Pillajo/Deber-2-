
package test;

import dominio.Curso;


public class TestCurso {
    public static void main(String[] args){
        Curso cursoA = new Curso();
        double [] notas = new double[12];
        for(int i=0;i<12;i++){
            notas[i] = Math.random()*6;
        }
        cursoA.setNotas(notas);
        System.out.println("Promedio del curso = "+cursoA.getPromedio());
        System.out.println("Nro Estudantes Encima del promedio = "+
                cursoA.nroEstudiantesEncimaPromedio());
        
    }
        
        
             
}

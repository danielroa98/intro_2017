import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
public class ProyectoFinalIntro
{
  public static void main(String[] args) throws IOException
  {
    Scanner lectura = new Scanner(System.in);

    File archivo;
		archivo = new File("calificaciones.txt");

    double total=0, totalpor, parcial1, parcial2, proyecto, semanai;
    double aprox=0, totalexamen, tareas, tar, trabajos, trab;
    double examenfinal, par1, par2, pr, semi, efinal, val1, val2, val3, val4, val5, val6;

    String y;
    String x = "si";
    String z = "Si";
    String materia;

    semi = .05;

    archivo.createNewFile();

    FileWriter escritor = new FileWriter(archivo, true);
    PrintWriter pw=new PrintWriter(escritor);

    JOptionPane.showMessageDialog(null, "Bienvenido al sistema!", "Inicio", JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null, "A continuación, insertarás tus calificaciones correspondientes.", "Inicio", JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null, "Esto calculará su calificación necesaria en el examen para pasar.", "Inicio", JOptionPane.INFORMATION_MESSAGE);

    materia = JOptionPane.showInputDialog(null, "Escribe el nombre de la materia", "Materia", JOptionPane.QUESTION_MESSAGE);

    y = JOptionPane.showInputDialog(null, "Estuviste en el Reto Emprendedor?", "Reto Emprendedor", JOptionPane.QUESTION_MESSAGE);

   if (y.equalsIgnoreCase("si"))
   {
     JOptionPane.showMessageDialog(null, "Por favor, agrega los porcentajes que insertarás en el sistema de la siguiente forma", "Porcentajes", JOptionPane.WARNING_MESSAGE);

     JOptionPane.showMessageDialog(null, "20% = .20", "Porcentajes", JOptionPane.WARNING_MESSAGE);

     parcial1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Primer Parcial?", "Porcentaje: Primer Parcial", JOptionPane.QUESTION_MESSAGE));

     parcial2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Segundo Parcial?", "Porcentaje: Segundo Parcial", JOptionPane.QUESTION_MESSAGE));

     proyecto = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Proyecto Final?", "Porcentaje: Proyecto Final", JOptionPane.QUESTION_MESSAGE));

     tareas = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto valen las tareas?", "Porcentaje: Tareas", JOptionPane.QUESTION_MESSAGE));

     trabajos = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto valen los trabajos?", "Porcentaje: Trabajos", JOptionPane.QUESTION_MESSAGE));

     examenfinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Examen Final?", "Porcentaje: Examen Final", JOptionPane.QUESTION_MESSAGE));

     JOptionPane.showMessageDialog(null, "El valor de la Semanai ya esta determinado como 5%", "Porcentaje: Reto Emprendedor", JOptionPane.INFORMATION_MESSAGE);

     JOptionPane.showMessageDialog(null, "Agrega a continuación las calificaciones que se te solicitan.", "Calificaciones", JOptionPane.INFORMATION_MESSAGE);

     par1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Primer Parcial?", "Calificaciones: Primer Parcial", JOptionPane.QUESTION_MESSAGE));

     par2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Segundo Parcial?", "Calificaciones: Segundo Parcial", JOptionPane.QUESTION_MESSAGE));

     pr = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Proyecto Final?", "Calificaciones: Proyecto Final", JOptionPane.QUESTION_MESSAGE));

     tar = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en las Tareas?", "Calificaciones: Tareas", JOptionPane.QUESTION_MESSAGE));

     trab = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en los trabajos?", "Calificaciones: Trabajos", JOptionPane.QUESTION_MESSAGE));

      semanai = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en la Semanai?", "Calificaciones: Semanai", JOptionPane.QUESTION_MESSAGE));

     val1 = par1 * parcial1;
     val2 = par2 * parcial2;
     val3 = semi * semanai;
     val4 = pr * proyecto;
     val5 = tareas * tar;
     val6 = trabajos * trab;

     total = val1+val2+val3+val4+val5;

     totalpor = (70-total);

    aprox = ((1*totalpor)/(examenfinal));

    totalexamen = total*totalpor;

    JOptionPane.showMessageDialog(null, "Tienes un minimo de: "+total+" puntos en la materia", "Puntos", JOptionPane.INFORMATION_MESSAGE);

     JOptionPane.showMessageDialog(null, "Necesitas: " +aprox+" de calificación en el examen.", "Calificación", JOptionPane.INFORMATION_MESSAGE);

   }else if (y.equalsIgnoreCase("no"))
   {
     JOptionPane.showMessageDialog(null, "Por favor, agrega los porcentajes que insertarás en el sistema de la siguiente forma", "Porcentajes", JOptionPane.WARNING_MESSAGE);

     JOptionPane.showMessageDialog(null, "20% = .20", "Porcentajes", JOptionPane.WARNING_MESSAGE);

     parcial1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Primer Parcial?", "Porcentaje: Primer Parcial", JOptionPane.QUESTION_MESSAGE));

     parcial2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Segundo Parcial?", "Porcentaje: Segundo Parcial", JOptionPane.QUESTION_MESSAGE));

     proyecto = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Proyecto Final?", "Porcentaje: Proyecto Final", JOptionPane.QUESTION_MESSAGE));

     tareas = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto valen las tareas?", "Porcentaje: Tareas", JOptionPane.QUESTION_MESSAGE));

     trabajos = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto valen los trabajos?", "Porcentaje: Trabajos", JOptionPane.QUESTION_MESSAGE));

     examenfinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Examen Final?", "Porcentaje: Examen Final", JOptionPane.QUESTION_MESSAGE));

     JOptionPane.showMessageDialog(null, "Agrega a continuación las calificaciones que se te solicitan.", "Calificaciones", JOptionPane.INFORMATION_MESSAGE);

     par1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Primer Parcial?", "Calificaciones: Primer Parcial", JOptionPane.QUESTION_MESSAGE));

     par2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Segundo Parcial?", "Calificaciones: Segundo Parcial", JOptionPane.QUESTION_MESSAGE));

     pr = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Proyecto Final?", "Calificaciones: Proyecto Final", JOptionPane.QUESTION_MESSAGE));

     tar = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en las Tareas?", "Calificaciones: Tareas", JOptionPane.QUESTION_MESSAGE));

     trab = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en los trabajos?", "Calificaciones: Trabajos", JOptionPane.QUESTION_MESSAGE));

     val1 = par1 * parcial1;
     val2 = par2 * parcial2;
     val3 = pr * proyecto;
     val4 = tareas * tar;
     val5 = trabajos * trab;

     total = val1+val2+val3+val4+val5;

     totalpor = (70-total);

     aprox = ((1*totalpor)/(examenfinal));

     totalexamen = total*totalpor;

     JOptionPane.showMessageDialog(null, "Tienes un minimo de: "+total+" puntos en la materia", "Puntos", JOptionPane.INFORMATION_MESSAGE);

      JOptionPane.showMessageDialog(null, "Necesitas: " +aprox+" de calificación en el examen.", "Calificación", JOptionPane.INFORMATION_MESSAGE);
   }

   pw.println("Materia: "+materia+". Minimo de puntos en la materia: "+total+". Calificacion necesaria en el examen final para pasar: "+aprox);

   escritor.close();

  }
}

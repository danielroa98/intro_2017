import javax.swing.JOptionPane;
import java.util.*;

public class ProyectoFinalIntro
{
  public static void main(String[] args)
  {
    Scanner lectura = new Scanner(System.in);

    double total, totalpor, parcial1, parcial2, proyecto, semanai;
    double aprox, totalexamen, tareas, tar, trabajos, trab;
    double examenfinal, par1, par2, pr, semi, efinal, val1, val2, val3, val4, val5, val6;

    String y;
    String x = "si";
    String z = "Si";

    semi = .05;

    //System.out.println("\nBienvenido al sistema!");
    JOptionPane.showMessageDialog(null, "Bienvenido al sistema!", "Inicio", JOptionPane.INFORMATION_MESSAGE);

    JOptionPane.showMessageDialog(null, "A continuación, insertarás tus calificaciones correspondientes.", "Inicio", JOptionPane.INFORMATION_MESSAGE);
    //System.out.println("\nA continuación, insertarás tus calificaciones correspondientes. (Este sistema fue hecho para alumnos de primer semestre)");

    JOptionPane.showMessageDialog(null, "Esto calculará su calificación necesaria en el examen para pasar.", "Inicio", JOptionPane.INFORMATION_MESSAGE);
    //System.out.println("\tEsto calculará su calificación necesaria en el examen para pasar.");



    y = JOptionPane.showInputDialog(null, "Estuviste en el Reto Emprendedor?", "Reto Emprendedor", JOptionPane.QUESTION_MESSAGE);
    //System.out.println("\nEstuviste en el Reto Emprendedor?");
   //y = lectura.nextLine();

   if (y.equalsIgnoreCase("si"))
   {
     JOptionPane.showMessageDialog(null, "Por favor, agrega los porcentajes que insertarás en el sistema de la siguiente forma", "Porcentajes", JOptionPane.WARNING_MESSAGE);
     //System.out.println("\nAgrega los porcentajes siguientes en decimales: ");
     JOptionPane.showMessageDialog(null, "20% = .20", "Porcentajes", JOptionPane.WARNING_MESSAGE);
     //System.out.println("\nPor ejemplo 20% = .20");

     parcial1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Primer Parcial?", "Porcentaje: Primer Parcial", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nPrimer parcial: ");
     parcial1 = lectura.nextDouble();
     */
     parcial2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Segundo Parcial?", "Porcentaje: Segundo Parcial", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nSeguno parcial: ");
     parcial2 = lectura.nextDouble();
     */

     proyecto = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Proyecto Final?", "Porcentaje: Proyecto Final", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nProyecto: ");
     proyecto = lectura.nextDouble();
     */

     tareas = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto valen las tareas?", "Porcentaje: Tareas", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nTareas: ");
     tareas = lectura.nextDouble();
     */

     trabajos = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto valen los trabajos?", "Porcentaje: Trabajos", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nTrabajos: ");
     trabajos = lectura.nextDouble();
     */

     examenfinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Examen Final?", "Porcentaje: Examen Final", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nExamen Final: ");
     examenfinal = lectura.nextDouble();
     */

     JOptionPane.showMessageDialog(null, "El valor de la Semanai ya esta determinado como 5%", "Porcentaje: Reto Emprendedor", JOptionPane.INFORMATION_MESSAGE);
     //System.out.print("\nEl valor de la Semanai ya esta determinado como 5%");

     JOptionPane.showMessageDialog(null, "Agrega a continuación las calificaciones que se te solicitan.", "Calificaciones", JOptionPane.INFORMATION_MESSAGE);
     //System.out.print("\nInserta tus calificaciones");

     par1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Primer Parcial?", "Calificaciones: Primer Parcial", JOptionPane.QUESTION_MESSAGE));
      //System.out.print("\nPrimer parcial: ");
     //par1 = lectura.nextDouble();

     par2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Segundo Parcial?", "Calificaciones: Segundo Parcial", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nSeguno parcial: ");
     //par2 = lectura.nextDouble();

     pr = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Proyecto Final?", "Calificaciones: Proyecto Final", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nProyecto: ");
     //pr = lectura.nextDouble();

     tar = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en las Tareas?", "Calificaciones: Tareas", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nTareas: ");
     //tar = lectura.nextDouble();

     trab = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en los trabajos?", "Calificaciones: Trabajos", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nTrabajos: ");
     //trab = lectura.nextDouble();

      semanai = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en la Semanai?", "Calificaciones: Semanai", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nSemanai: ");
     //semanai = lectura.nextDouble();

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
     //System.out.println("Tienes un minimo de: "+total+" puntos en la materia");

     JOptionPane.showMessageDialog(null, "Necesitas: " +aprox+" de calificación en el examen.", "Calificación", JOptionPane.INFORMATION_MESSAGE);
      //System.out.println("Necesitas: " +aprox+" de calificación en el examen.");

   }else if (y.equalsIgnoreCase("no"))
   {
     JOptionPane.showMessageDialog(null, "Por favor, agrega los porcentajes que insertarás en el sistema de la siguiente forma", "Porcentajes", JOptionPane.WARNING_MESSAGE);
     //System.out.println("\nAgrega los porcentajes siguientes en decimales: ");
     JOptionPane.showMessageDialog(null, "20% = .20", "Porcentajes", JOptionPane.WARNING_MESSAGE);
     //System.out.println("\nPor ejemplo 20% = .20");

     parcial1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Primer Parcial?", "Porcentaje: Primer Parcial", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nPrimer parcial: ");
     parcial1 = lectura.nextDouble();
     */
     parcial2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Segundo Parcial?", "Porcentaje: Segundo Parcial", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nSeguno parcial: ");
     parcial2 = lectura.nextDouble();
     */

     proyecto = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Proyecto Final?", "Porcentaje: Proyecto Final", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nProyecto: ");
     proyecto = lectura.nextDouble();
     */

     tareas = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto valen las tareas?", "Porcentaje: Tareas", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nTareas: ");
     tareas = lectura.nextDouble();
     */

     trabajos = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto valen los trabajos?", "Porcentaje: Trabajos", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nTrabajos: ");
     trabajos = lectura.nextDouble();
     */

     examenfinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto vale el Examen Final?", "Porcentaje: Examen Final", JOptionPane.QUESTION_MESSAGE));
     /*
     System.out.print("\nExamen Final: ");
     examenfinal = lectura.nextDouble();
     */

     JOptionPane.showMessageDialog(null, "Agrega a continuación las calificaciones que se te solicitan.", "Calificaciones", JOptionPane.INFORMATION_MESSAGE);
     //System.out.print("\nInserta tus calificaciones");

     par1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Primer Parcial?", "Calificaciones: Primer Parcial", JOptionPane.QUESTION_MESSAGE));
      //System.out.print("\nPrimer parcial: ");
     //par1 = lectura.nextDouble();

     par2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Segundo Parcial?", "Calificaciones: Segundo Parcial", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nSeguno parcial: ");
     //par2 = lectura.nextDouble();

     pr = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en el Proyecto Final?", "Calificaciones: Proyecto Final", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nProyecto: ");
     //pr = lectura.nextDouble();

     tar = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en las Tareas?", "Calificaciones: Tareas", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nTareas: ");
     //tar = lectura.nextDouble();

     trab = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuánto obtuviste en los trabajos?", "Calificaciones: Trabajos", JOptionPane.QUESTION_MESSAGE));
     //System.out.print("\nTrabajos: ");
     //trab = lectura.nextDouble();

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
      //System.out.println("Tienes un minimo de: "+total+" puntos en la materia");

      JOptionPane.showMessageDialog(null, "Necesitas: " +aprox+" de calificación en el examen.", "Calificación", JOptionPane.INFORMATION_MESSAGE);
       //System.out.println("Necesitas: " +aprox+" de calificación en el examen.");
   }


  }
}

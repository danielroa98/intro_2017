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

    System.out.println("\nBienvenido al sistema!");

    System.out.println("\nA continuación, insertarás tus calificaciones correspondientes. (Este sistema fue hecho para alumnos de primer semestre)");
      System.out.println("\tEsto calculará su calificación necesaria en el examen para pasar.");



   System.out.println("\nEstuviste en el Reto Emprendedor?");
   y = lectura.nextLine();

   if (y.equalsIgnoreCase("si"))
   {
     System.out.println("\nAgrega los porcentajes siguientes en decimales: ");
     System.out.println("\nPor ejemplo 20% = .20");

     System.out.print("\nPrimer parcial: ");
     parcial1 = lectura.nextDouble();

     System.out.print("\nSeguno parcial: ");
     parcial2 = lectura.nextDouble();

     System.out.print("\nProyecto: ");
     proyecto = lectura.nextDouble();

     System.out.print("\nTareas: ");
     tareas = lectura.nextDouble();

     System.out.print("\nTrabajos: ");
     trabajos = lectura.nextDouble();

     System.out.print("\nExamen Final: ");
     examenfinal = lectura.nextDouble();


     System.out.print("\nEl valor de la Semanai ya esta determinado como 5%");

     System.out.print("\nInserta tus calificaciones");

     System.out.print("\nPrimer parcial: ");
     par1 = lectura.nextDouble();

     System.out.print("\nSeguno parcial: ");
     par2 = lectura.nextDouble();

     System.out.print("\nProyecto: ");
     pr = lectura.nextDouble();

     System.out.print("\nTareas: ");
     tar = lectura.nextDouble();

     System.out.print("\nTrabajos: ");
     trab = lectura.nextDouble();

     System.out.print("\nSemanai: ");
     semanai = lectura.nextDouble();

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

     System.out.println("Tienes un minimo de: "+total+" puntos en la materia");

      System.out.println("Necesitas: " +aprox+" de calificación en el examen.");

     //System.out.println("Tu examen vale: "+aprox+" por ciento");


   }else if (y.equalsIgnoreCase("no"))
   {
     System.out.println("\nAgrega los porcentajes siguientes en decimales: ");
     System.out.println("\nPor ejemplo 20% = .20");

     System.out.print("\nPrimer parcial: ");
     parcial1 = lectura.nextDouble();

     System.out.print("\nSeguno parcial: ");
     parcial2 = lectura.nextDouble();

     System.out.print("\nProyecto: ");
     proyecto = lectura.nextDouble();

     System.out.print("\nExamen Final: ");
     examenfinal = lectura.nextDouble();

     System.out.print("\nTareas: ");
     tareas = lectura.nextDouble();

     System.out.print("\nTrabajos: ");
     trabajos = lectura.nextDouble();

     System.out.println("\nInserta tus calificaciones");

     System.out.print("\nPrimer parcial: ");
     par1 = lectura.nextDouble();

     System.out.print("\nSeguno parcial: ");
     par2 = lectura.nextDouble();

     System.out.print("\nProyecto: ");
     pr = lectura.nextDouble();

     System.out.print("\nTareas: ");
     tar = lectura.nextDouble();

     System.out.print("\nTrabajos: ");
     trab = lectura.nextDouble();

     val1 = par1 * parcial1;
     val2 = par2 * parcial2;
     val3 = pr * proyecto;
     val4 = tareas * tar;
     val5 = trabajos * trab;

     total = val1+val2+val3+val4+val5;

     totalpor = (70-total);

     aprox = ((1*totalpor)/(examenfinal));

     totalexamen = total*totalpor;

     System.out.println("Tienes un minimo de: "+total+" puntos en la materia");

      System.out.println("Necesitas: " +aprox+" de calificación en el examen.");
   }


  }
}

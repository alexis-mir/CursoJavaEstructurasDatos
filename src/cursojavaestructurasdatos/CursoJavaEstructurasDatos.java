package cursojavaestructurasdatos;

import javax.swing.JOptionPane;

public class CursoJavaEstructurasDatos {

    private static boolean sesionActiva = true;

    public static void main(String[] args) {
        while (sesionActiva) {
            seleccionEjerciciosControl();
        }

    }

    public static void seleccionEjerciciosControl() {
        //Ejercicios 1-9 Estructuras de Datos
        final String EJERCICIO_UNO = "Ejercicio 1:\nEscriba un programa que sume todos los elementos de un array de enteros. Primero \nrecórralo para rellenarlo y luego vuelva a recorrerlo para sumar los elementos.";
        final String EJERCICIO_DOS = "Ejercicio 2:\nEscriba un programa que lea 10 números enteros por teclado y los guarde en un array. \nCalcule y muestre el promedio de los números que estén en las posiciones pares del \narray. Considere la primera posición del array (posición 0) como par.";
        final String EJERCICIO_TRES = "Ejercicio 3:\nCree un array de 6 elementos de cadenas de caracteres, inicialice el arreglo con datos \nleídos por el teclado. Copie los elementos del array en otro arreglo, pero en orden \ninverso, y muéstrelo por la pantalla.";
        final String EJERCICIO_CUATRO = "Ejercicio 4:\nEscriba un programa que recoja de la entrada estándar dos arrays de enteros de tamaño \nespecificado por el usuario y los multiplique dos a dos, guardando el resultado en otro \narray e imprimiendo los valores de este último arreglo.";
        final String EJERCICIO_CINCO = "Ejercicio 5:\nSe quiere realizar un programa que lea por teclado las 4 notas obtenidas por un alumno \n(comprendidas entre 1 y 10). A continuación, se debe mostrar todas las notas, el \npromedio, e informar si la condición es Aprobado o Desaprobado (promedio >= 7).";
        final String EJERCICIO_SEIS = "Ejercicio 6:\nEscriba un programa que declare un array de 8 elementos enteros y pida números para \nrellenarlo hasta que se llene el arreglo o se introduzca un número negativo. Entonces se \ndebe imprimir el array (sólo los elementos introducidos).";
        final String EJERCICIO_SIETE = "Ejercicio 7:\nEscriba un programa que lea de la entrada un número y utilice ese número para crear un \narray de enteros de ese tamaño. A continuación, el programa inicializará el array con los \nvalores que el usuario introduzca por la entrada (únicamente comprendidos entre 0 y 10 \ninclusive). Finalmente, se deberá recorrer el array e imprimir el valor de cada elemento \ndel array a partir de un String. Ejemplo: los valores 1,7,2,10 producirán la siguiente salida: \nUno Siete Dos Diez.";
        final String EJERCICIO_OCHO = "Ejercicio 8:\nCree un programa que pida al usuario un número de mes (por ejemplo, el 11) y diga \ncuántos días tiene (por ejemplo, 30) y el nombre del mes (por ejemplo, noviembre). Debe \nusar una matriz. Para simplificarlo vamos a suponer que febrero tiene 28 días.";
        final String EJERCICIO_NUEVE = "Ejercicio 9:\nQueremos guardar los nombres y las edades de los alumnos de un curso. Realice un \nprograma que introduzca el nombre y la edad de cada alumno. El proceso de lectura de \ndatos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se \nmostrará el nombre y la edad de cada alumno en la matriz.";
        final String TITULO_ENUNCIADO = "Enunciado";
        String[] ejerciciosDatos = {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Ejercicio 9"};
        int ejercicioSeleccionado = JOptionPane.showOptionDialog(null, "Elije un ejercicio a ejecutar:", "Estructuras de Datos", 0, -1, null, ejerciciosDatos, ejerciciosDatos[0]);

        switch (ejercicioSeleccionado) {
            case 0:
                JOptionPane.showMessageDialog(null, EJERCICIO_UNO, TITULO_ENUNCIADO, -1);
                EjercicioUno.ejecutar();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, EJERCICIO_DOS, TITULO_ENUNCIADO, -1);
                EjercicioDos.ejecutar();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, EJERCICIO_TRES, TITULO_ENUNCIADO, -1);
                EjercicioTres.ejecutar();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, EJERCICIO_CUATRO, TITULO_ENUNCIADO, -1);
                EjercicioCuatro.ejecutar();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, EJERCICIO_CINCO, TITULO_ENUNCIADO, -1);
                EjercicioCinco.ejecutar();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, EJERCICIO_SEIS, TITULO_ENUNCIADO, -1);
                EjercicioSeis.ejecutar();
                break;
            case 6:
                JOptionPane.showMessageDialog(null, EJERCICIO_SIETE, TITULO_ENUNCIADO, -1);
                EjercicioSiete.ejecutar();
                break;
            case 7:
                JOptionPane.showMessageDialog(null, EJERCICIO_OCHO, TITULO_ENUNCIADO, -1);
                EjercicioOcho.ejecutar();
                break;
            case 8:
                JOptionPane.showMessageDialog(null, EJERCICIO_NUEVE, TITULO_ENUNCIADO, -1);
                EjercicioNueve.ejecutar();
                break;
            case -1:
                sesionActiva = false;
                break;
            default:
                break;
        }
    }

}

//----------------------------------------------------------
//Hoja de Trabajo #2
//Creada por Esteban Aldana Guerra 20591 
//Algoritmos y Estructura de Datos
//Ultima modificación: 05/02/2021
//----------------------------------------------------------
import java.util.Stack;

public class Calculadora implements CalculadoraGeneral {

    public Stack<Integer> stack;

    @Override
    public String calculo(String expresion) {
        //Se crea Stack
        stack = new Stack<Integer>();
        int x = 0, y = 0;
        char ch[] = expresion.toCharArray();
        //for para realizar las operaciones 
        for(char c: ch) {
          if(c >= '0' && c <= '9') {
            stack.push((int)(c - '0'));
          } else {
            y = stack.pop();
            x = stack.pop();
            switch(c) {
              case '+':
                stack.push(x+y);
                break;
              case '-':
                stack.push(x-y);
                break;
              case '*':
                stack.push(x*y);
                break;
              case '/':
                stack.push(x/y);
                break;
            }
          }
        }
        return String.valueOf(stack.pop());
    }

}

        
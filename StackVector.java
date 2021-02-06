//----------------------------------------------------------
//Hoja de Trabajo #2
//Creada por Esteban Aldana Guerra 20591 
//Algoritmos y Estructura de Datos
//Ultima modificación: 05/02/2021
//----------------------------------------------------------

import java.util.Vector;

public class StackVector<E> implements Stack<E> {

    public Vector<E> vector;

    public StackVector(){
        this.vector = new Vector<E>();
    }

    //Ingresa Valor al Stack
    @Override
    public void push(E data) {

        vector.add(data);
    }

    //Saca elemento del Stack
    @Override
    public E pop() {
        //El Stack no debe de estar vacio, por eso se chequea para ver si lo esta 
        if(vector.isEmpty())
        {
            return null;
        }
        else
        {
            //sca el ultimo elemento
            E v = vector.get(vector.indexOf(vector.lastElement()));
            vector.remove(v);
            return v;
        }
    }

    //Ultimo elemento del Stack
    @Override
    public E peek() {

        //El Stack no debe de estar vacio, por eso se chequea para ver si lo esta 
        if(vector.isEmpty())
        {
            return null;
        }
        else{
            return vector.get(vector.indexOf(vector.firstElement()));
        }
    }

    //Ver si esta vacio el Stack o no
    @Override
    public boolean empty() {

        return vector.isEmpty();
    }

    //Tamaño del Stack
    @Override
    public int size() {

        return vector.size();
    }
}
package Collections;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String text){
        array[size] = text;
        size++;
        if(size == array.length){
            String[] newArray = new String[array.length*2];
            for (int i = 0; i<array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
    public int remove(String text){
        int index = -1;
        for (int i = 0; i<size; i++){
            if(array[i].equals(text)){
                remove(i);
                index = i;
            }
        }
        return index;
    }

    public void remove(int index){
        if(index>=0 && index<size){
            for (int i = index; i<size-1; i++){
                array[i] = array[i+1];
            }
        }
        size--;
    }

    public String get(int index){
        return array[index];
    }

    public int getSize(){
        return size;
    }
}

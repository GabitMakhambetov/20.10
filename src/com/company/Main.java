package com.company;

class ArrayBubble{
    private long[] a;
    private int elems;

    public ArrayBubble(int max){
        a = new long[max];
        elems = 0;
    }

    public void into(long value){
        a[elems] = value;
        elems++;
    }

    public void printer(){
        for(int i = 0;i < elems;i++){
            System.out.println(a[i]+" ");
            System.out.println(" ");
        }
        System.out.println("  Оканчание вывода массива  ");
    }

    private void toSwap(int first,int second){
        long dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;
    }

    public void bubbleSorter(){
        for(int out = elems - 1;out >= 1;out--){
            for(int in = 0; in < out;in++){
                if(a[in] > a[in+1])
                    toSwap(in,in+1);
            }
        }
    }
}

public class Main{
    public static void main(String[] args){
        ArrayBubble array=new ArrayBubble(4);


        array.into(154);
        array.into(656);
        array.into(545);
        array.into(452);

        array.printer();
        array.bubbleSorter();
        array.printer();
    }
}
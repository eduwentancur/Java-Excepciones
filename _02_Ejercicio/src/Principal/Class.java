package Principal;

public class Class {
    private int[] arr;

    public Class() {
        this.arr= new int[10];
    }
    
    public void generarException(int num){
        for (int i = 0; i < num; i++) {
            this.arr[i]=i+1;
        }
    }
}

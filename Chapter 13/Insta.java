class A {
    private int j;


    public int getJ() {
        return j;
    }

    public void setJ(int j ) {
        this.j = j;
    }void show(){
        System.out.println(j);
    }

}

public class Insta {
    public static void main(String[] args) {
        A ob= new A();
        ob.setJ(10);
        int k =ob.getJ();
        for(int i=8;i<11;i++){
            k+=i;
            System.out.println(k);
        }
        ob.setJ(k);
        assert k>10:"k <=10";
        ob.show();
    }
}

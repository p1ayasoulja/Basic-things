import java.io.*;

public class Files {
    public static void main(String[] args)throws java.io.IOException {
        int i;
        FileInputStream Test;
        if (args.length != 1) {
            System.out.println("Using Test.txt");
            return;
        }
        try{
            Test=new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println("Cant open file!");
            return;
        }
        try{
            do{
                i=Test.read();
                if(i!=-1){
                    System.out.println((char)i);
                }

            }while(i!=-1);
        }catch (IOException e){
            System.out.println("Cant read file!");
        }
        try {
            Test.close();
        }catch (IOException e){
            System.out.println("Cant close!");
        }
    }
}

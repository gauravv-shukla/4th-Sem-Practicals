package File;
import java.io.File;

class files{
        
    void filerecurse(String s){
        File f1=new File(s);
        File f2;
        String[] s1=new String[21];
        s1=f1.list();
        int len=s1.length,i=0;
        while(len>i){            
            f2=new File(s1[i]);
            if(f2.isDirectory()){
                System.out.println("Path:"+f2.getAbsolutePath());                
                filerecurse(s1[i]);
            }
            else{
                System.out.println("File Name:"+f2.getName());
                System.out.println("Path:"+f2.getAbsolutePath());
                System.out.println();
            }
            i++;
        }
    return;
    }

}
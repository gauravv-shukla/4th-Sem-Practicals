package File;
import java.io.File;

class files{
        
    void filerecurse(String s){
        File f1=new File(s);
        File f2;
        File[] s1=f1.listFiles();
        int len=s1.length,i=0;
        while(len>i){            
            f2=s1[i];
            if(f2.isDirectory()){  
                System.out.println("---"+f2.getName());              
                filerecurse(f2.getAbsolutePath());
            }
            else{
                System.out.println("------"+f2.getName());
                //System.out.println("Path:"+f2.getAbsolutePath());
                //System.out.println();
            }
            i++;
        }
    return;
    }
}
import java.util.ArrayList;

public class Barcodes {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int n=barcodes.length;
        int[] k=new int[n];
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int[] f=new int[10001];
        for(int i=0;i<n;i++){
            f[barcodes[i]]++;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]>0){
                a.add(f[i]);
                b.add(i);
            }
        }
        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i)<a.get(j)){
                    int t=a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,t);

                    int tb=b.get(i);
                    b.set(i,b.get(j));
                    b.set(j,tb);
                }
            }
        }
    
        int in=0;
        for(int i=0;i<a.size();i++){
            int bar=b.get(i);
            for(int j=0;j<a.get(i);j++){
                k[in]=bar;
                in+=2;
                if(in>=n){
                    in=1;
                }
            }  
        }
        return k;
    }
}

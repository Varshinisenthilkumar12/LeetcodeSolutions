import java.util.Arrays;

public class SquareFromRec {
    public int countGoodRectangles(int[][] rectangles) {
        int count=0;
        if(rectangles.length ==1){
            return Math.min(rectangles[0][0],rectangles[0][1]);
        }
        int[] n=new int[rectangles.length];
        for(int i=0;i<rectangles.length;i++){
            int a=rectangles[i][0];
            int b=rectangles[i][1];
            n[i]=Math.min(a,b);
        } 
        Arrays.sort(n);
        for(int i=0;i<n.length-1;i++){
            if(n[i]<n[i+1]){
                count=1;
            }else if(n[i]==n[i+1]){
                count++;
            }
        } 
        
        return count;
    }
}

package lx;


     //输出数组地址
/*public class Demo02 {
	public static void main(String args[]) {
		int s[]=new int[10];
		//s[0]=1;
		for(int c:s) {
		System.out.println(c);//数组首地址
		}
	}
}
**/
//二路归并排序
	//import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args){
        int[] in = {46,12,33,72,68,19,80,33};
        int[] rein = new int[in.length]; //用于复制保留原纪录序列,辅助空间
        int left = 0; //序列in下限
        int right = in.length-1; //序列in上限
        MergeSort(in,rein,left,right);
        for(int i=0;i<in.length;i++){
            System.out.print(in[i]+" ");
        }
    }
    public static void MergeSort(int[] in,int[] rein,int left,int right){
        int middle;
        if(left<right){
            middle = (left+right)/2;
            MergeSort(in,rein,left,middle);//对左序列进行分组
            MergeSort(in,rein,middle+1,right);//对右序列进行分组
            Merge(in,rein,left,right,middle);//比较大小并排序
        }
    }
    public static void Merge(int[] in,int[] rein,int left,int right,int middle){
        int i,p1,p2;
        for(i=left;i<=right;i++){
           // System.out.println("luhan "+in[i]);
            rein[i] = in[i];
        }
        p1 = left;
        p2 = middle+1;
        i = left;
        while(p1<=middle && p2<=right){
            if(rein[p1]<=rein[p2]){
                in[i] = rein[p1];
                p1++;
            }else{

                in[i] = rein[p2];
                p2++;
            }
            i++;
        }
        while(p1<=middle){
            in[i] = rein[p1++];
            i++;
        }
        while(p2<=right){
          //  System.out.println("luhandd "+rein[p2]);
            in[i] = rein[p2++];
            i++;
        }
    }
}
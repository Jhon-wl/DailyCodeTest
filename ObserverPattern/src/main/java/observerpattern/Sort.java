package observerpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mr.w on 2017/6/13.
 */
public class Sort {

    public static void main(String args[]){
        int a[] = {1,3,3,7,11,9};
        int b[] = {2,4,6,8,10,10,14,16};
        int length1=a.length;
        int length2=a.length;
        int length= length1+length2;
        int [] result = new int[length];
        int i=0,j=0,k=0;
        while(i<length1&&j<length2){
            if(a[i]<b[j]){
                result[k++]=a[i++];
            }else if(a[i]==b[j]){
                result[k++]=a[i];
                j++;
                i++;
            }else{
                result[k++]=b[j++];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

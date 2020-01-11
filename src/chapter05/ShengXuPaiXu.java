package jp.dcnet.yjw.chapter05;

import java.util.Arrays;

public class ShengXuPaiXu {

	//質問７
	//配列を昇順でソートする
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//上昇
		int[] a=new int[]{1,4,3,2};

		sort(a);

        System.out.println("ソート後");
        System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		//插入排序法
        if(a==null||a.length==0){
        	return;
        }

        for(int i=1;i<a.length;i++){
        	int j=i-1;
        	int temp=a[i];

        	while(j>=0&&a[j]>temp){
        		a[j+1]=a[j];
        		j--;
        		/*System.out.println("a["+j+"]:"+a[j]);
        		System.out.println("j:"+j);
        		System.out.println("temp0:"+temp);*/
        		//System.out.println("i:"+i);
        	}
        	a[j+1]=temp;
        	/*System.out.println("a["+j+"+1]:"+a[j+1]);
        	System.out.println("temp:"+temp);*/
        	//System.out.println("i:"+i);

        }

    }

	/*//下降

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a=new int[]{1,4,3,2};

		sortDesc(a);

        System.out.println("ソート後");
        System.out.println(Arrays.toString(a));
	}

	private static void sortDesc(int[] nums) {

        Arrays.sort(nums);

        int[] numsTemp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsTemp[i] = nums[nums.length - 1 - i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsTemp[i];
        }

    }*/

}

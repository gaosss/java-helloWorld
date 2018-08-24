//
//选择排序(Select Sorting)也是一种简单的排序方法。它的基本思想是：第一次从
//R[0]-R[n-1]中选取最小值，与R[0]交换，第二次从R[1]-R[n-1]中选取最小值，与R[1]交
//换，第三次从R[2]-R[n-1]中选取最小值，与R[2]交换，...，第i 次从R[i-1]-R[n-1]中
//选取最小值，与R[i-1]交换，...，第n-1 次从R[n-2]-R[n-1]中选取最小值，与R[n-2]交
//换，总共通过n-1 次，得到一个按排序码从小到大排列的有序序列。
//例如，给定n=8，数组R 中的8 个元素的排序码为：(8,3,2,1,7,4,6,5)，选择排序过程。

package com.robbin.exercise2;

//选择排序法[Demo133.java]排序10 万个数用时7 秒
public class Selection_Sorting
{
	public static void main(String []args){
		int arr[]={8,3,2,1,7,4,6,5};
		int temp=0;
		for(int j=0;j<arr.length-1;j++){
			//认为第一个数就是最小数
			int min=arr[j];
			//记录最小数的下标
			int minIndex=j;
			for(int k=j+1;k<arr.length;k++){
				if(min>arr[k]){
					//修改最小值
					min=arr[k];
					minIndex=k;
				}
			}
			//当退出for 循环时就找到这次的最小值
			temp=arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
		}
		//输出最后结果
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
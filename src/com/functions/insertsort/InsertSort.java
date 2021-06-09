package com.functions.insertsort;

import java.util.Arrays;

public class InsertSort {
	
	public static void main(String[] args) {
		int[] arr = {45,32,1,78,100,13,42,2};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertSort(int[] array) {
		// �ӵڶ���Ԫ�ؿ�ʼ
		for(int i = 1;i < array.length;i++) {
			
			int temp = array[i];
			int j = i;
			
			while(j > 0 && temp < array[j - 1]) {
				
				// ǰһ��Ԫ�غ���
				array[j] = array[j - 1];
				j--;
			}
			
			array[j] = temp; 
		}
	}
}

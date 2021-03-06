package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 2016/10/22.
 */

import com.bigdataXiang.util.Log;

/**
 * 二叉排序树
 * 排序二叉树的3个特征：
 1：当前node的所有左孩子的值都小于当前node的值；
 2：当前node的所有右孩子的值都大于当前node的值；
 3：孩子节点也满足以上两点
 * @param <K,V>
 */
public class 二叉排序树<K, V extends Comparable> extends 二叉树 {

    public void add(K key, V value) {
        if(root==null){
            root = new BinarySortedNode(key, value);
        }else {
            ((BinarySortedNode) root).add(key, value);
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{23,54,1,65,9,3,100};
        二叉排序树 b2=new 二叉排序树<>();
        for(int i:arr){
            b2.add(i, i);
        }
        Log.v(b2.中序遍历());
    }
}

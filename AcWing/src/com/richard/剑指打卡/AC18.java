package com.richard.剑指打卡;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.HashMap;
import java.util.Map;

/**
 * 18. 重建二叉树
 */
public class AC18 {

    Map<Integer, Integer> map = new HashMap<>();
    int[] preorder;
    int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        this.preorder = preorder;
        this.inorder = inorder;

        for (int i=0; i<inorder.length; i++) {
            map.put(inorder[i],i);
        }

        return dfs(0,preorder.length-1,0,inorder.length-1);

    }

    public TreeNode dfs(int pl, int pr, int il, int ir) {
        if (pl > pr) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pl]);
        int k = map.get(root.val);
        // 左面
        //pl+1 根节点的位置 k-il-1左子树的长度
        root.left = dfs(pl+1,pl+1+k-il-1,il,k-1);
        // 右面
        root.right = dfs(pl+k-il+1, pr,k+1,ir);
        /**
         * root.left = dfs(pl+1, pl+1+il-k-1, il,k-1);
         *
         *root.right = dfs(pl+il-k+1,pr,k+1,ir);
         */
        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode father;
    TreeNode(int x) {
        val = x;
    }
}
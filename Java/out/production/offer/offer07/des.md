# 题目描述
输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

例如，给出

前序遍历 preorder = [3,9,20,15,7]  
中序遍历 inorder = [9,3,15,20,7]

返回如下的二叉树：   
```
    3
   / \
  9  20
    /  \
   15   7
```
限制：

0 <= 节点个数 <= 5000

# 解题思路
* 利用递归的思想，前序遍历的第一个必定是根节点，而此节点在中序遍历中将树分为左右两个子树
* 找出每个子树的对应串，其前序遍历的第一个必定是当前子树的根节点，而对应的中序中又把当前子树分为两个子树
* 在中序序列中，根节点左边的为左子树，右边的为右子树

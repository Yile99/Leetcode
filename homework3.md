### 第一题 LeetCode 78、子集

```
递归结束条件为当前的index i 等于 nums数组的长度时。
但其实这句终止条件在此题中不用加，因为接下来的for loop中边界刚好为判断i是否小于nums总长度。如果不满足则不会进入循环。
```

### 第二题 LeetCode 226、翻转二叉树

```
1. 递归终止条件一
如果当前访问的treenode root为空时，终止循环并返回null。

代码：
if(root == null) return null;

2. 递归终止条件二
如果当前访问的treenode root的左右节点都为空时（leaf node），终止循环并返回此时的root节点。

代码：
if( root.left == null && root.right == null) return root;
```

### 第三题  LeetCode 236、二叉树的最近公共祖先

```
1. 递归终止条件一
如果当前访问的treenode root为空时，终止循环并返回null。

代码：
if(root == null) return null;

2. 递归终止条件二
如果当前访问的treenode root为想要寻找的p或者q节点时，终止循环并返回此时的root节点。

代码：
if(root == p || root == q)  return root;
```

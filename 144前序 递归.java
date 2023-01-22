class Solution {
     List<Integer> answer = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return answer;
        answer.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return answer;
    }
}
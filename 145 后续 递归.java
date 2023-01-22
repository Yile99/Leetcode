class Solution {
     List<Integer> answer = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return answer;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        answer.add(root.val);
        return answer;
    }
}
package Trees;

public class CorrespondingNodeBinaryTreeCloneThatTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (target == null || cloned == null) {
            return null;
        }
        if (target.val == cloned.val) {
            return cloned;
        }


        TreeNode res = getTargetCopy(original, cloned.left, target);
        if (res != null) {
            return res;
        }
        res = getTargetCopy(original, cloned.right, target);
        if (res != null) {
            return res;
        }

        return null;
    }
}

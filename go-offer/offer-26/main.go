package main

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

var equal bool = false

func isSubStructure(A *TreeNode, B *TreeNode) bool {
	if equal {
		return equal
	}
	if B == nil {
		return false
	}
	if A == nil {
		return false
	}
	if A.Val == B.Val {
		judge(A, B)
	}
	_ = isSubStructure(A.Left, B)
	_ = isSubStructure(A.Right, B)
	return equal
}

func judge(A *TreeNode, B *TreeNode) {
	if equal {
		return
	}
	if A == nil && B == nil {
		equal = true
		return
	}
	if A == nil && B != nil || A != nil && B == nil {
		equal = false
		return
	}
	if A.Val != B.Val {
		equal = false
		return
	}
	judge(A.Left, B.Left)
	judge(A.Right, B.Right)
}

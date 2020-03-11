package main

const TAILINDEX = 0

type Queue struct{  //右边是尾，左边是头
    val []*TreeNode
    tail int  //永远指向0
    head int
}

type TreeNode struct{
    Val int
    Left *TreeNode
    Right *TreeNode
}

func newQueue()*Queue{
    return &Queue{
        val:  []*TreeNode{},
        tail: TAILINDEX,
        head: 0,
    }
}

func (queue *Queue)Clear(){
    //queue = newQueue()  //这个写法为啥不管用
    queue.val = queue.val[0:0]
    queue.head = 0
}

func newTree(val int)*TreeNode{
    return &TreeNode{
        Val:   val,
        Left:  nil,
        Right: nil,
    }
}

func (queue *Queue)length()int{
    return queue.head
}




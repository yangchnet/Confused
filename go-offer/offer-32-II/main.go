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

func newTree(val int)*TreeNode{
    return &TreeNode{
        Val:   val,
        Left:  nil,
        Right: nil,
    }
}

func (queue *Queue)EnQueue(val *TreeNode){  //入队，放在最右边
    queue.val = append(queue.val, val)
    queue.head++
}

func (queue *Queue)isEmpty()bool{
    return queue.head == queue.tail
}

func (queue *Queue)DeQueue()*TreeNode{    //出队，从最左边出去
    if(queue.isEmpty()){
        panic("empty queue")
    }
    res := queue.val[0]
    queue.val = queue.val[1:]
    queue.head--
    return res
}

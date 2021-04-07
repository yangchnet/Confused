package main

import (
	"os"
	"runtime/pprof"
	"testing"
)

func Test_reverseList(t *testing.T) {
	f, _ := os.OpenFile("cpu.pprof", os.O_CREATE|os.O_RDWR, 0644)
	defer f.Close()
	pprof.StartCPUProfile(f)
	defer pprof.StopCPUProfile()
	head := &ListNode{
		Val:  1,
		Next: nil,
	}
	//var head *ListNode
	insertToTail(head, 2)
	insertToTail(head, 3)
	insertToTail(head, 4)
	insertToTail(head, 5)

	reverseList(head)
	//fmt.Printf("%v", h)

}

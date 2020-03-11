package main

import "testing"

func TestQueue_Clear(t *testing.T) {
    type fields struct {
        val  []*TreeNode
        tail int
        head int
    }
    tests := []struct {
        name   string
        fields fields
    }{
        // TODO: Add test cases.
        {"test_clear",
            fields{
                val:  []*TreeNode{&TreeNode{
                    Val:   1,
                    Left:  nil,
                    Right: nil,
                }},
                tail: 0,
                head: 0,
            }},
    }
    for _, tt := range tests {
        t.Run(tt.name, func(t *testing.T) {
            queue := &Queue{
                val:  tt.fields.val,
                tail: tt.fields.tail,
                head: tt.fields.head,
            }
            queue.Clear()
            if queue.length() != 0{
                panic("error")
            }
        })
    }
}
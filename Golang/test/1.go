package main

import (
	"fmt"
	"io"
	"os"
	"strings"
)

func main() {
	reader := io.TeeReader(strings.NewReader("Go语言中文网"), os.Stdout)
	n, err := reader.Read(make([]byte, 20))
	fmt.Println(n, err)

}

package main

import (
	"io/ioutil"
	"os"
)

// 获取指定目录下的所有文件和目录
func GetFilesAndDirs(rootPath string) (files []string, dirs []string, err error){
	dir, err := ioutil.ReadDir(rootPath)
	if err != nil {
		return nil, nil, err
	}

	PathSep := string(os.PathSeparator)

}

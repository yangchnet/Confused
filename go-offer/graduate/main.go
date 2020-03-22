package main

import "fmt"

type Lichang struct{
    学院 string
    专业 string
    学号 string
    室友 []string
    女友 string
}

var 李昌 Lichang

func init(){
    李昌.学院 = "计算机与信息学院"
    李昌.专业 = "物联网工程"
    李昌.学号 = "16111206015"
    李昌.室友 = make([]string, 3, 3)
    李昌.女友 = nil
}

func (li *Lichang)getRoommate(){
    li.室友 = append(li.室友, "曹维克")
    li.室友 = append(li.室友, "赵翼")
    li.室友 = append(li.室友, "吴翔")
}

func (li *Lichang)getGirlFriend(){
    li.女友 = "汪丹阳"
    fmt.Println("I love you ❤❤❤❤")
}

func (li *Lichang)study(){
    fmt.Println("study study hard, day day up!!!")
}

func (li *Lichang)playLOL(){
    fmt.Println("德玛西亚.......")
}

func (li *Lichang)thanks(){
    fmt.Println("感谢我的父母家人，你们给了我无限的力量")
    fmt.Println("感谢我亲爱可爱敬爱的女朋友，你总是能让我感到温暖")
    fmt.Println("感谢我那三头室友，你们永远是我心中的狗子")
    fmt.Println("感谢尊敬的王杨教授，你给了我道路上的指引")
    fmt.Println("感谢我的同学们，你们都有着自己的性格，从你们身上我学到很多")
    fmt.Println("感谢老师们，你们给了我宝贵的精神财富")
}

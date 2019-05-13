class HelloNumbers {

    static void main(String[] args){

        Number n = 1

        println("n=${n},type:${n.class}")
        println("xxxVaule(),拆箱: ${n.intValue()}")
        println("compareTo:with 3:n comp 3 ? ${n.compareTo(3)}")
        println("compareTo:with 3:n <=> 3 ? ${(n <=> 3)}")
        println('也就是说 <=>  这个符号其实表示的是比较的意思')
        println("valueOf : n = ${Integer.valueOf(3)}")

        println('Numbers 强大的方法：')
        println("parseInt() 10:${Integer.parseInt('20',10)}")
        println("parseInt() 8:${Integer.parseInt('20', 8)}")
        println("parseInt() 4:${Integer.parseInt('20', 4)}")
        println("parseInt() 20:${Integer.parseInt('20', 20)}")

        println('abs:绝对值')
        println("abs() -3 : ${Math.abs(-3)}")

        println('ceil(): >= [] 大于等于取整')
        println('3.14 >= [] 大于等于取整应该是 4')
        println("3.14 ceil() : ${Math.ceil(3.14)}")

        println('floor(): <= [] 小于等于取整')
        println('9.998 <= [] 小于等于取整应该是 9')
        println("9.998 <= [] : ${Math.floor(9.998)}")
        println("10.002 <=[] : ${Math.floor(10.002)}")

        println('随机数')
        println(Math.random())

        println('''
            哈市的空间按付款了
            师傅好v
            WD
            AS

''')

        def st = 'hello world'
        println(st[-1 .. -3])
        println(st[0])
        println(st[-0])

        def arr = [1,2,3,4,5,6,7,8,9]
        println(arr[2..4])

        println(arr[3 ..< 6])

        def map = ['1st' : '第一个' , '2nd' : '第二个', '3rd' : '第三个']
        println(map)
        println(map['1st'])
        println('你告诉我你和python的区别是什么？python比你还多元组的数据结构')
        println(map['第一个'])

        if(st ==~ '.*ll.*'){
            println(st + 'tr')
        }
    }

}

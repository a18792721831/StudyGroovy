class HelloWorld {

    static void main(String[] args){
        println("hello world")
        def str = "hello def"
        println(str)
        String strs = 'hello string'
        println(strs)
        def a = 5
        a %= 3
        println(a)


        try{
            throw new HelloException()
        } catch (HelloException e){
            e.sayHelloException()
        }
    }

}

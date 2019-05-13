class HelloMethod {

    static def hello(){
        println('hello')
    }

    static void main(String[] args){

        hello()

        sayHello()

        sayAnything('one')

        sayAnything()

    }

    static def sayAnything(str = 'anything'){
        println(str)
    }

    static void sayHello(){
        println('sayHello')
    }


}

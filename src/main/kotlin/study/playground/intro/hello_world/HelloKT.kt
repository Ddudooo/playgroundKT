package study.playground.intro.hello_world

fun main(args: Array<String>) {
    if(args.isNotEmpty()) {
        println("Hello, World! " + args[0]);
    }else{
        println("Hello, World!");
    }
}
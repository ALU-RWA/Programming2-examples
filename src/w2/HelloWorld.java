package w2;

/*
    This is our basic Hello World example.
    Notice that we first start with a class declaration. The class name must match the file name.
 */
public class HelloWorld {

    /*
        Every Java programme begins in the public static void main(String[] args) function.
        The first line to execute in the programme is the first line in this function.

        Quick recap of each key word here:
        - public determines who can use the function. For now we will stick to public.
        - static we will cover in more depth in week 3, for now use it in all functions until then.
        - void means that the function does not return.

        Note that intelliJ has shortcuts for you: type psvm then hit tab and the function will be created
     */
    public static void main(String[] args) {

        /* To print, use println if you want a new line at the end, or print otherwise.
            Things to note here:
            - Remember that for strings, we want double quotes "". Single quotes '' are solely for char types
            - You also get a shortcut for this, do sout then tab.
        */
        System.out.println("Hello World");
    }
}

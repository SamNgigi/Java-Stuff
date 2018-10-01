# What does Compiled languages mean?

Computers understand instructions in `1s` & `0s` which we can refer to as binary and can also be understood as "on" and "off".

This language of 1 and 0 is what we can call machine language.

For example "Hello World" in binary:

```md
010010000110010101101100011011000110111100100000010101110110111101110010 0110110001100100
```

This binary form is not easy to write code it. In comes assembly a bit more expressive notation as compared to machine code. Assembly language then can be assembled into machine code using an assembler.

Machine and Assembly languages called low level language as they utilize/use the low-level details of a computer such as memory location where we would be storing data. They are very close to machine as compared to human language.

Thus "Hello world" assembly becomes;

```assembly
global _start

section .text

_start:
  mov rax, 1        ; write(
  mov rdi, 1        ;   STDOUT_FILENO,
  mov rsi, msg      ;   "Hello, world!\n",
  mov rdx, msglen   ;   sizeof("Hello, world!\n")
  syscall           ; );

  mov rax, 60       ; exit(
  mov rdi, 0        ;   EXIT_SUCCESS
  syscall           ; );

section .rodata
  msg: db "Hello, world!", 10
  msglen: equ $ - msg
```

Note however that assembly languages for different systems would look different and be executed differently.

This above is an example of Linux x86-64. To run it:

```bash
//Compiling before running
$ nasm -f elf64 -o hello.o hello.s
$ ld -o hello.o hello.o
$ ./hello
Hello, world!
```

More details on this assembly code [here](https://jameshfisher.com/2018/03/10/linux-assembly-hello-world.html).

It is still very tedious to write in low level notation and engineers needed a way that they could express instruction in a more readable human like way that could hide/abstract the low level details of computers.

Enter languages like FOTRAN C, C++, Java, C#;

The source code from these languages have to converted to machine code. This conversion is done through a compiler into the target language.

This target language can be the programming language of a target OS, bytecode, or machine code.

## A **compiler** does a couple of things:

1. Verifying **syntax** & **semantics** of source code.
2. Code optimizations
3. Generate machine code

The compiler does additional operations to ease a programmers task and depending on the complexity of the operations, the compilation process may take some time.

Once compiled though, the machine code execution by the c.p.u. is very fast and can be run anytime any amount of times.

Only caveat though is that the source code has to be compiled by the OS platform supported compiler. The machine code generated would run only on that platform.

So to sum up
> **Compilation** is the process by which high level source code is converted into executable machine code by a compiler. The machine code is then run by a computer's cpu to produce a result.
>
> Note that the compilation process and the execution happen separately and that the machine code generated is platform dependent.

So below we have Java source code that represents a more high level notation of code that is more expressive and readable.

```java
class HelloWorldApp {
  public static void main(String[] args) {
    // Printing hello world.
    System.out.println("Hello World!");
  }
}
```

Java is special because it is both **compiled** and **interpreted**. Next we have a look at the [interpreted](./interpreted) aspect.
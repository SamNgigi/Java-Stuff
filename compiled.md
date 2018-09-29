# What does Compiled languages mean?

Computers understand instructions in `1s` & `0s` which we can refer to as binary and can also be understood as "on" and "off".

This language of 1 and 0 is what we can call machine language.

For example "Hello World" in binary:

```md
010010000110010101101100011011000110111100100000010101110110111101110010 0110110001100100
```

This binary form is not easy to write code in and thus comes assembly as a sort of middle man between more human like language while still close to machine code as possible to make sure a computer can understand quickly.

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
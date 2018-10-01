# What is Java?

1. General Purpose
    ```md
    Java can be used to create a wide variety of application domains. It can be applied to cyber-security, machine-learning, web-development, enterprise and desktop apps.
    ```

2. Object Oriented.
    ```md
    Meaning that it uses the concept of classes and objects. In other
    words blueprints an instances of those blueprints. Kind of emulating
    real life.
    ```
3. Platform Independent.
    ```md
    Write Once Run Anywhere. (WORA).
    Code written in Java is meant to be able to execute on any platform regardless of operating system or architecture.
    ```
4. Concurrent.
    ```md
    Java programming allows for multi-threading meaning that it allows a program to perform multiple tasks at the same time.
    ```
5. Very fast.
    ```md
    Almost indistinguishable from C and C++ in terms of some of Java has
    to be compiled to machine language that makes it run fast.
    ```

Other features of the Java include.

* Familiar syntax:
    ```md
    For C and C++ engineers to make it easier for most programmers in the 1990s to transition to Java.
    ```
* Simplicity and Safety:
    ```md
    Compared to C & C++ where you have to manage/manipulate memory yourself to free space up.

    Java has automatic memory management that deals with that.
    ```

* Security:
    ```md
    Java compiler converts the Java code into byte code (.class files) and these byte codes are then run by Java Virtual Machine(JVM).

    The JVM is an interpreter which is installed in each client machine that is updated with the latest security updates by internet. So when the byte codes are executed, the JVM can verify the bytecode before it is run ensuring unsafe operations are not performed.

    So compiled then interpreted.
    ```
    [Here](https://www.quora.com/How-is-Java-more-secure-than-other-languages) is a article with additional info.

* Extensive Library
* Free and Open-Source

So Java is both compiled and interpreted. So first, what does for a language to be;

* [Compiled](./compiled.md)
* [Interpreted](./interpreted.md).

Click on the above to read my understanding of compilation & interpretation.

Java is first compiled from source code by the **Java compiler** into platform independent **bytecode**. Java bytecode can then be interpreted on any platform using the platform dependant Java Virtual Machine(JVM) which runs/executes the bytecode.

So say we have a `Hello.java` source code file. We first run:

```bash
    javac Hello.java
```

to compile our source using the Java compiler. This results in a Hello.class bytecode file. Bytecode is compact and optimized for interpretation by the JVM. We then run:

```bash
    java Hello
```

The above creates an instance of JVM , which means that the cpu loads JVM into memory then the JVM executes Hello.class.

The **JVM** takes care of the **platform independence** aspect of java programs.

Java code is must faster that other interpreted languages because of;

* **Java Bytecode**
    Compact and optimized compiled source code that allows for faster interpretation.

    Bytecode compactness allows for quick transfer across networks.

* **Just-in-time(JIT) compilation**
      * This is whereby the jvm identifies frequently executed bytecode that we call **hot spots.**
      * The JIT compiler converts **hot-spots** to machine code
      * This machine code is then cached.

    This means that frequently interpreted does not need to be interpreted but the corresponding cached machine code is executed. This result to increased speed when running java code.

Lets take a look at how the JVM works. Click [Here](./JVM.md).

# What is the JVM (Java Virtual Machine)?

The JVM is an Abstract Computing Machine that has instruction sets that it executes.

The instruction set of a JVM is a java bytecode. So while for a computer's cpu the instruction set is a platforms machine-code for the JVM its a java bytecode.

Also like a real computing machine, the JVM manipulates memory at runtime meaning that it uses memory to run programs and manipulate their data.

Note that runtime means the time in which a program is being executed.

On a high level we can think of a JVM as a virtual computer.

## JVM core responsibilities

+ Loading & interpreting bytecode
+ Security
+ Automatic memory management

We have *JVM specification* which lists out the core details of how the JVM works more details can be found [here](https://docs.oracle.com/javase/specs/jvms/se11/html/index.html).

We have **JVM implementations** which are like versions of the JVM specification. Which include the Oracle's HotSpot JVM and IBM's JVM.

So if JVM specification were a blueprint for a house, JVM implementation would be the actual house.

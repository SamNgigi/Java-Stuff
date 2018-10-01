# What does Interpreted Language mean?

Interpreters are basically **virtual machines** that simulate a c.p.u. So source code is run/executed directly by the interpreter to produce a result.

A c.p.u is responsible for the fetch and execute cycle. This means when we have instruction stored in memory, a c.p.u fetches the instructions one by one, executes the instruction then returns the result. This result is then stored in memory and another instruction is fetched.

An interpreter works in the same way in that, now instead of memory, instructions are fetched from source code statements, executes **pre-compiled machine code** in its library.

The way i understand it is that an interpreter comes with pre compiled machine code. So when that machine code corresponds to source code instructions, it is executed.

So no machine code is generated. It uses its own machine code to execute what the source code directs.

Interpreters achieve platform independence, in that the can be installed on different operating systems/platforms and the source code would run because the source code written would only need the interpreter to be executed.

## Advantages of interpreted languages

+ Platform independence

  We only need to install an interpreter on our different platforms

+ No compilation step
  
  Source code is run directly by our interpreter therefore we can execute a program immediately.

+ Easier to update

  We can update and run the updates more quickly using interpreted languages, because we don't need to compile the code first.

## Disadvantages of interpreted languages

+ Slow
  
  + Costly memory access which in compiled languages handle with registers
  + Source code is reinterpreted every time. The interpretation process has to run every time a program is run. A compiled program would only need to be compiled once.
  
+ Interpreters have to be loaded into a platforms memory.
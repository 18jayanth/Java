public class Java_63_Is_Java_compiled_or_interpreted {
    public static void main(String[] args) {
       /* Java follows a "compile once, run anywhere" model using both a compiler and an interpreter. Here's how it works:

✅ Step-by-Step Execution Flow

        1. Writing the Code
        You write your Java code in a file like:
// HelloWorld.java
        public class HelloWorld {
            public static void main(String[] args) {
                System.out.println("Hello, Java!");
            }
        }

        2. Compilation (javac)
        You use the Java Compiler (javac) to convert your .java file into a .class file.
         This .class file contains bytecode, which is not machine code but an intermediate code.
        javac HelloWorld.java
🧾 Output: HelloWorld.class → contains Java bytecode.

        3. Class Loader (JVM)
                The JVM (Java Virtual Machine) loads the .class file using the ClassLoader.
It checks for security, memory allocation, and class dependencies.

        4. Bytecode Verification
        A bytecode verifier checks for:
        Stack overflows
        Access violations
        Invalid instructions
        Prevents malicious code from crashing the JVM.

        5. Interpretation (or JIT Compilation)
        The JVM interprets the bytecode line-by-line OR uses the Just-In-Time (JIT) compiler.
        The JIT compiler translates bytecode into native machine code at runtime
         for better performance.
*/


    }
}

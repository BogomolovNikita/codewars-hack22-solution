package edu.hack22.solution.agent;

import java.io.FileOutputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class ClassFileTransformerImpl implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader,
                            String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) throws IllegalClassFormatException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(String.format("classes/%s.class", className))) {
            fileOutputStream.write(classfileBuffer);
        } catch (Throwable ignored) {/*NOOP*/}
        return classfileBuffer;
    }
}
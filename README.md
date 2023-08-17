### Solving the hack-22 task from CodeWars.

To run, use **jdk 1.8**. 

Otherwise, you will need to put **tools.jar** to your classpath. You also need to add the following expression to the jvm startup parameters. `-Djdk.attach.allowAttachSelf=true`

The task is solved using the [java-agent](https://docs.oracle.com/javase/7/docs/api/java/lang/instrument/package-summary.html) mechanism.

The solution cannot be simply pasted into [CodeWars](https://www.codewars.com/). For convenience, I broke everything into classes. This will help you find inspiration.

### Task condition:

> "You mean there's a catch?"
> 
> "Sure there's a catch", Doc Daneeka replied. "Catch-22." 

You are John Yossarian, the poor paranoid soldier from Joseph Heller's novel Catch-22.

Despite your declining mental health, squadron psychiatrist Doc Daneeka decides you are fit for combat.

```java
public abstract class Yossarian {
  public final boolean isCrazy() {
    return false;
  }
}
```


"You're not crazy", he keeps saying after each evaluation, and so do the quacks in main headquarters - they perform basically the same silly test:

```java
Yossarian yossarian = Catch22.loophole();
if (! yossarian.isCrazy()) fail("Keep fighting!");
```

> "Catch-22 says they have a right to do anything we can't stop them from doing."
>
> "What the hell are you talking about?" Yossarian shouted in bewildered, furious protest.

It will be tough going. You will be roaming strange places you have never seen before. Your comrades will tell you there's no way. But there is. **Don't give up**.

In the end, you will be rewarded with complete access to your subconscious mind.

> Yossarian was moved very deeply by the absolute simplicity of this clause of Catch-22 and let out a respectful whistle.


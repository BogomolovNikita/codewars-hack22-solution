### Solving the hack-22 task from CodeWars.

To run, use *jdk 1.8*. Otherwise, you will need to put *tools.jar* to your classpath. You also need to add the following expression to the jvm startup parameters. `-Djdk.attach.allowAttachSelf=true`

The task is solved using the [java-agent](https://docs.oracle.com/javase/7/docs/api/java/lang/instrument/package-summary.html) mechanism.

The solution cannot be simply pasted into [CodeWars](https://www.codewars.com/). For convenience, I broke everything into classes. This will help you find inspiration.

To avoid copyright infringement, I will not paste the entire text of the original problem here. I will insert a small excerpt for indexing by search engines.

_"You mean there's a catch?"_

_"Sure there's a catch", Doc Daneeka replied. "Catch-22."_

_You are John Yossarian, the poor paranoid soldier from Joseph Heller's novel Catch-22._

_Despite your declining mental health, squadron psychiatrist Doc Daneeka decides you are fit for combat._

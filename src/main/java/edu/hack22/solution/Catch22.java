package edu.hack22.solution;

import edu.hack22.solution.agent.AgentExploitJarMaker;
import edu.hack22.solution.agent.AgentExploitLoader;

import java.io.File;

@SuppressWarnings(value = "all")
public class Catch22{
    public static Yossarian loophole() throws Throwable {
        String javaAgentPath = "hack22.agent.jar";
        File javaAgentFile = new File(javaAgentPath);

        //Delete the agent if it already exists.
        //This will allow us to change the code and see the result.
        if(javaAgentFile.exists()) {
            javaAgentFile.delete();
        }
        //Let's create a new agent.
        AgentExploitJarMaker.makeJar(javaAgentPath);

        //Connect the agent to the current virtual machine.
        AgentExploitLoader.loadAgent(javaAgentFile.getAbsolutePath());
        return new Yossarian() {};
    }
}

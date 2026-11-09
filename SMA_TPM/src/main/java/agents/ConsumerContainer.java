package agents;

import jade.core.AID;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class ConsumerContainer {

    public static void main(String[] args) throws Exception {

        Runtime runtime = Runtime.instance();
        ProfileImpl profile = new ProfileImpl();

        profile.setParameter(Profile.MAIN_HOST, "192.168.100.17");


        AgentContainer container = runtime.createAgentContainer(profile);

       
        AgentController consumerAgent =
            container.createNewAgent(
                "consumer",
                "agents.ConsumerAgent",
                new Object[] {"JAVA pour les nuls"}
            );

        consumerAgent.start();
    }
}
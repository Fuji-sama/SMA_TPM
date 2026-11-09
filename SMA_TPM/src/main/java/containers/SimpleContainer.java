package containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class SimpleContainer {

    public static void main(String[] args) throws Exception {
    	try {
        Runtime runtime = Runtime.instance();
        ProfileImpl profile = new ProfileImpl();

        // IP address of the main container
        profile.setParameter(Profile.MAIN_HOST, "192.168.100.17");
        // Port of the main container (default 1099)
        profile.setParameter(Profile.MAIN_PORT, "1099");
        profile.setParameter(Profile.PLATFORM_ID,"192.168.100.17:1099/JADE");

        AgentContainer container = runtime.createAgentContainer(profile);
        container.start();
    	} catch (Exception e) {
            System.out.println("Une erreur est survenue");
            System.out.println(e.getMessage());
    }
    }
}
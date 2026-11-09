package containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;

public class SMAMainContainer {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.instance();
            ProfileImpl profile = new ProfileImpl();
            profile.setParameter(Profile.GUI, "true");
            AgentContainer mainContainer = runtime.createMainContainer(profile);
            mainContainer.start();
        } catch (Exception e) {
            System.out.println("Une erreur est survenue");
            System.out.println(e.getMessage());
           
        }
    }
}
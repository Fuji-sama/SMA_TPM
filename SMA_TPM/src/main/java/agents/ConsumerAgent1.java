package agents;

import jade.core.Agent;
import jade.wrapper.ControllerException;

public class ConsumerAgent1 extends Agent {

    @Override
    protected void setup() {
        String bookName = null;

        if (this.getArguments().length == 1) {
            bookName = (String) this.getArguments()[0];
        }

        System.out.println("Initialisation de l'agent " + this.getAID().getName());
        System.out.println("Je voudrais acheter le livre : " + bookName);
    }

    @Override
    protected void beforeMove() {
        try {
            System.out.println("Avant de migrer de " +
                this.getContainerController().getContainerName());
        } catch (ControllerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void afterMove() {
        try {
            System.out.println("Apres migration vers " +
                this.getContainerController().getContainerName());
        } catch (ControllerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
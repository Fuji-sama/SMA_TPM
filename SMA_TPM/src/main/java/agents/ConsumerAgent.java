package agents;

import jade.core.Agent;

public class ConsumerAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("Initialisation de l'agent " + this.getAID().getName());
    }

    @Override
    protected void beforeMove() {
        System.out.println("Avant de migrer,");
        System.out.println("Executer les taches ...RANI RAYE7");
    }

    @Override
    protected void afterMove() {
        System.out.println("Apres migration,");
        System.out.println("Executer les taches ...SALAM 3ALEIKOUM");
    }

    @Override
    protected void takeDown() {
        System.out.println("Avant de mettre fin à mon cycle de vie,");
        System.out.println("Executer les taches ... BKAOU 3LA KHEIR");
    }
}
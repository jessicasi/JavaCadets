/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JavaCadets.view;


/**
 *
 * @author Steven
 */
public class ManageTheCrops extends View {

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        System.out.println(" ********************** ");
        System.out.println(" * Manage Your Crops * ");
        System.out.println(" ********************** ");
        System.out.println();
        System.out.println("A - Buy Land");
        System.out.println("B - Sell Land");
        System.out.println("C - Feed Population");
        System.out.println("D - Plant Crops");
        System.out.println("E - Pay Tithes and Offerings");
        System.out.println("Q - Quit");

        String cropsInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = cropsInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "A": {
                BuyLand();
            }
            break;

            case "B": {
                SellLand();
            }
            break;

            case "C": {
                feedPopulation();
            }
            break;

            case "D": {
                plantCrops();
            }
            break;

            case "E": {
                payTithesAndOfferings();
            }
            break;
            case "Q":
                return true;

            default: {
                System.out.println("Invalid menu item");
            }
            break;
        }
        return false;
    }

    private void BuyLand() {
        BuyLandView buyLand = new BuyLandView();
        buyLand.display();
    }

    private void SellLand() {
        SellLandView sellLand = new SellLandView();
        sellLand.display();
    }

    private void feedPopulation() {
        FeedThePeopleView FeedThePeopleView = new FeedThePeopleView();
        FeedThePeopleView.display();
    }

    private void plantCrops() {
        PlantCropsView PlantCropsView = new PlantCropsView();
        PlantCropsView.display();
    }

    private void payTithesAndOfferings() {
        TithesView payTithesAndOfferings = new TithesView();
        payTithesAndOfferings.display();
    }

    
}

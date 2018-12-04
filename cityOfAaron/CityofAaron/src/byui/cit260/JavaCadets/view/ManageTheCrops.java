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

        this.console.println(" ********************** ");
        this.console.println(" * Manage Your Crops * ");
        this.console.println(" ********************** ");
        this.console.println();
        this.console.println("B - Buy Land");
        this.console.println("S - Sell Land");
        this.console.println("F - Feed Population");
        this.console.println("P - Plant Crops");
        this.console.println("T - Pay Tithes and Offerings");
        this.console.println("M - Make and Sell Bread");
        this.console.println("Q - Quit");

        String cropsInput = this.getInput("\nMake a selection from the Game Menu");
        inputs[0] = cropsInput;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0].toUpperCase();

        switch (menuItem) {

            case "B": {
                BuyLand();
            }
            break;

            case "F": {
                feedPopulation();
            }
            break;

            case "M": {
                makeBread();
            }
            break;
            
            case "S": {
                SellLand();
            }
            break;

            case "P": {
                plantCrops();
            }
            break;

            case "T": {
                payTithesAndOfferings();
            }
            break;
            case "Q":
                return true;

            default: {
                this.console.println("Invalid menu item");
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

    private void makeBread() {
        MakeAndSellBreadView makeBread = new MakeAndSellBreadView();
        makeBread.display();
    }

}

package Se.kth.iv1350.Project1PointOfSale.startup;

        import Se.kth.iv1350.Project1PointOfSale.integration.*;
        import Se.kth.iv1350.Project1PointOfSale.controller.*;
        import Se.kth.iv1350.Project1PointOfSale.view.*;

/**
 * Start the entire application,
 * contain the main method used to start the application.
 * @author tommy
 */
public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator ();
        Printer printer = new Printer();
        StorDTO storDTO = new StorDTO("Hem affär ");
        Controller controller = new Controller(creator,printer,storDTO);
        View view = new View(controller);
        view.fakeExecution();

    }
}

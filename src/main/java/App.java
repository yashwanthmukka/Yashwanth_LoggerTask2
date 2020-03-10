import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Construction standardConstruction = new Construction("standard", 800);
        Construction aboveStandardConstruction = new Construction("aboveStandard", 750);
        Construction highStandardConstruction = new Construction("highStandard", 1000);
        Construction automatedConstruction = new Construction("highStandard", 1000, true);
        Logger logger =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.log(Level.INFO, "Cost using standard material: " + standardConstruction.getConstructionCost());
        logger.log(Level.INFO, "Cost using above standard material: " + aboveStandardConstruction.getConstructionCost());
        logger.log(Level.INFO, "Cost using high standard material: " + highStandardConstruction.getConstructionCost());
        logger.log(Level.INFO, "Cost using high standard material with automation: " + automatedConstruction.getConstructionCost());
    }
}

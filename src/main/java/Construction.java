
public class Construction implements MaterialsCost{
    private String materialType;
    private Integer houseArea;
    private Boolean automation;

    Construction(String materialType, Integer houseArea) {
        this.materialType = materialType;
        this.houseArea = houseArea;
        this.automation = false;
    }

    Construction(String materialType, Integer houseArea, Boolean automation) {
        this.materialType = materialType;
        this.houseArea = houseArea;
        this.automation = automation;
    }

    public Integer getConstructionCost() {
        switch (materialType) {
            case "aboveStandard":
                return aboveStandardMaterail();
            case "highStandard":
                return highStandardMaterail();
            default:
                return standardMaterail();
        }
    }

    public Integer standardMaterail() {
        return 1200 * houseArea;
    }

    public Integer aboveStandardMaterail() {
        return 1500 * houseArea;
    }

    public Integer highStandardMaterail() {
        if (!automation)
            return 1800 * houseArea;
        return 2500 * houseArea;
    }
}

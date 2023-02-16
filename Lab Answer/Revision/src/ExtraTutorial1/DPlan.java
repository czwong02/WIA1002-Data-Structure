
package ExtraTutorial1;

public class DPlan extends ISP {
    private double chargePerMbps;
    private double chargePerGB;

    public DPlan(String plan, double chargePerMbps, double chargePerGB) {
        super(plan);
        this.chargePerMbps = chargePerMbps;
        this.chargePerGB = chargePerGB;
    }
    
    
}

package Question2;

public interface BidInterface {
/**Returns the name of the company making this bid.
* Precondition: None
* Postcondition: The name was returned
* @return The name of the company making this bid.
*/
public String getCompanyName();

/**Returns the description of the air conditioner that this bid is for.
* Precondition: None
* Postcondition: The description of the air conditioner was returned.
* @return The description of the air conditioner.
*/
public String getDescription();

/**Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
* Precondition: None
* Postcondition: The capacity of this bid's AC in tons was returned
* @return The capacity of this bid's AC in tons.
*/
public double getCapacity();

/**Returns the seasonal efficiency of this bid's AC (SEER).
* Precondition: None
* Postcondition: The seasonal efficiency was returned
* @return The seasonal efficiency of this bid's AC.
*/
public double getSEER();

/**Returns the cost of this bid's AC.
* Precondition: None
* Postcondition: The cost was returned
* @return The cost of this bid's AC.
*/
public double getCost();

/**Returns the cost of installing this bid's AC.
* Precondition: None
* Postcondition: The installation cost was returned.
* @return The installation cost of AC.
*/
public double getInstallationCost();

/**Returns the yearly cost of operating this bid's AC.
* Precondition: None
* Postcondition: The yearly operation cost was returned.
* @param operationHours Average number of unit operates per year.
* @param energyFee Cost per kilowatt hour.
* @return The cost for this AC, cost=12*tons**energyFee*operationHours/SEER.
*/
public double getYearlyOperationCost(double operationHours, double energyFee);
}//end BidInterface

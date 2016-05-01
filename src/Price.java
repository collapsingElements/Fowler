/**
 * Created by CHeizmann on 01.05.16.
 */
abstract class Price
{
	abstract int getPriceCode();

	abstract double getCharge(int daysRented);

	int getFrequentRenterPoints(int daysRented)
	{
		return 1;
	}
}

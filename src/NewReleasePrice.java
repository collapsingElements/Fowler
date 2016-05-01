/**
 * Created by CHeizmann on 01.05.16.
 */
public class NewReleasePrice extends Price
{
	@Override
	int getPriceCode()
	{
		return Movie.NEW_RELEASE;
	}

	@Override
	double getCharge(int daysRented)
	{
		return daysRented * 3;
	}
}

package appRating;

import java.util.ArrayList;
import java.util.List;

public class Ratting implements RatingStatisticsCollectors
{
	
	List<Rateclass> list = new ArrayList<Rateclass>();

	@Override
	public void putNewRating(String app, int rating)
	{
		list.add(new Rateclass(app, rating));
	}

	@Override
	public double getAverageRating(String app) 
	{
		double  sum = 0;
		double avg = 0;
		int count = 0;
		for (int i = 0; i < list.size(); i++) 
		{
			if (list.get(i).appName.compareToIgnoreCase(app)==0)
			{
				sum = sum + list.get(i).rating;
				count++;
			}
		}
		avg = sum/count;
		return avg;
	}

	@Override
	public int getRatingcount(String app) 
	{
		int count = 0;
		for (int i = 0; i < list.size(); i++) 
		{
			if (list.get(i).appName.compareToIgnoreCase(app)==0)
			{
				count++;
			}
		}
		return count;
	}
	
}

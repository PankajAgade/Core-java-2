package appRating;

public interface RatingStatisticsCollectors 
{
	public void putNewRating(String app , int rating);
	
	public double getAverageRating(String app);
	
	public int getRatingcount(String app);
}

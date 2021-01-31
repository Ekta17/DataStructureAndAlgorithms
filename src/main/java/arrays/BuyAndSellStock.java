package arrays;

public class BuyAndSellStock {

	//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	public int findMaxProfit(int prices[]) {
		int buyPrice = prices[0];
		int max = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < buyPrice)
				buyPrice = prices[i];
			else {
				int currentProfit = prices[i] - buyPrice;
				max = currentProfit > max ? currentProfit : max;
			}
		}

		return max;
	}

	//https://www.geeksforgeeks.org/stock-buy-sell/
	/*public int findTotalProfit(int prices[]) {
		List<Integer> localMinima = new ArrayList<>();
		List<Integer> localMaxima = new ArrayList<>();

		int i =0;
		while(i<prices.length-1){

			//find local minima
			while((i<prices.length-1) && prices[i] >=prices[i+1])
				i++;

			if(i == prices.length-1)
				break;

			localMinima.add(prices[i++]);

			//find local maxima
			while((i<prices.length) && prices[i]<=prices[i-1])
				i++;

			localMaxima.add(prices[i-1]);
		}
		System.out.println("localMinima="+localMinima);
		System.out.println("localMaxima="+localMaxima);
		int totalProfit = 0;
		for(int j = 0; j<localMinima.size();i++)
			totalProfit += localMaxima.get(j) - localMinima.get(j);
		return totalProfit;
	}*/
}

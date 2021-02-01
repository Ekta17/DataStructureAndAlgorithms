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
	//Design an algorithm to find the maximum profit.
	// You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
	public int findTotalProfit(int prices[]) {
		int totalProfit = 0;
		int localMinimaIndex = 0;

		for (int i = 1; i < prices.length; i++) {

			//update localMinimaIndex is lesser value element found
			// current element < previous element
			if (prices[i] < prices[i - 1])
				localMinimaIndex = i;

			//sell stock if current element is localMaxima
			//previous element <= current > next element
			if (prices[i] >= prices[i - 1] && (i + 1 == prices.length || prices[i] > prices[i + 1]))
				totalProfit += prices[i] - prices[localMinimaIndex];
		}

		return totalProfit;
	}
}

package arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuyAndSellStockTest {

	private static BuyAndSellStock buyAndSellStock;

	@BeforeAll
	public static void init(){
		buyAndSellStock = new BuyAndSellStock();
	}

	@Test
	public void testGetMaxProfit(){
		int[] prices = {7,1,5,3,6,4};
		int actualProfit = buyAndSellStock.findMaxProfit(prices);
		assertEquals(5, actualProfit);
	}

	@Test
	public void testGetMaxProfitWhenPricesInDescendingOrder(){
		int[] prices = {7,6,5,4,3,1};
		int actualProfit = buyAndSellStock.findMaxProfit(prices);
		assertEquals(0, actualProfit);
	}

	/*@Test
	public void testGetTotalProfitWhenFirstElementNeedsToBeIgnored(){
		int[] prices = {5, 1, 3, 8, 12, 13};
		int actualTotalProfit = buyAndSellStock.findTotalProfit(prices);
		assertEquals(12, actualTotalProfit);
	}

	@Test
	public void testGetTotalProfitWhenPricesInAscendingOrder(){
		int[] prices = {1, 2, 3, 4, 5};
		int actualTotalProfit = buyAndSellStock.findTotalProfit(prices);
		assertEquals(0, actualTotalProfit);
	}

	@Test
	public void testGetTotalProfitWhenPricesInDescendingOrder(){
		int[] prices = {5, 4, 3, 2, 1};
		int actualTotalProfit = buyAndSellStock.findTotalProfit(prices);
		assertEquals(4, actualTotalProfit);
	}*/
}
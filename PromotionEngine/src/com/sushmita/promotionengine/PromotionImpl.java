package com.sushmita.promotionengine;

public class PromotionImpl implements Promotions{

	@Override
	public int applyPromotion3A(int noOfA) {
		// TODO Auto-generated method stub
		int promotionAmountA = 0;
		int promotedA = noOfA/3;
		promotionAmountA = promotedA*130;
		int remainingA=noOfA%3;
		
			while(remainingA > 0) {
				promotionAmountA+=50;
				remainingA--;
			}
		
		return promotionAmountA;
	}

	@Override
	public int applyPromotion2B(int noOfB) {
		int promotionAmountB = 0;
		int promotedB = noOfB/2;
		promotionAmountB = promotedB*45;
		int remainingB=noOfB%2;
		
			while(remainingB > 0) {
				promotionAmountB+=30;
				remainingB--;
			}
		
		return promotionAmountB;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int applyPromotionCandD(int noOfC, int noOfD) {
		// TODO Auto-generated method stub
		int promotionAmountCD = 0;
		if(noOfC > 0 && noOfD > 0 && noOfC == noOfD) {
		    promotionAmountCD = noOfC*30;	
		}
		if(noOfC > 0 && noOfC != noOfD) {
			promotionAmountCD += noOfC*20;
		}
		if(noOfD > 0 && noOfC != noOfD) {
			promotionAmountCD += noOfD*15;
		}
		return promotionAmountCD;
		
	}
	

}

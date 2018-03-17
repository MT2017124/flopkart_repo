
package com.iiitb.ooadvoid.dao;

import java.util.List;

import com.iiitb.ooadvoid.pojo.FlopkartDeal;

public class FlopkartDealDAO extends HibernateDAO<FlopkartDeal>
{
	String entity_name = "FlopkartDeal";
	
	public FlopkartDeal addFlopkartDeal(FlopkartDeal deal)
	{
		super.add(deal);
		return deal;
	}
	
	public List<FlopkartDeal> getFlopkartDeals()
	{
		return super.list(new FlopkartDeal());
	}

	public FlopkartDeal getFlopkartDealById(int id)
	{
		return super.find(new FlopkartDeal(),id);
	}

	public int deleteFlopkartDeal(int id)
	{
		return super.remove(entity_name,id);
	}

	public int updateFlopkartDeal(int id, FlopkartDeal deal)
	{
		if (id <= 0)
			return 0;	
		super.update(deal,id);
		return 1;
	}
}

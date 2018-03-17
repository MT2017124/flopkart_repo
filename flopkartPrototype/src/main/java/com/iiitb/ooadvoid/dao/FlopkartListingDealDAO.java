
package com.iiitb.ooadvoid.dao;

import java.util.List;

import com.iiitb.ooadvoid.pojo.FlopkartListingDeal;

public class FlopkartListingDealDAO extends HibernateDAO<FlopkartListingDeal>
{
	String entity_name = "FlopkartListingDeal";
	
	public FlopkartListingDeal addFlopkartListingDeal(FlopkartListingDeal item)
	{
		super.add(item);
		return item;
	}
	
	
	public List<FlopkartListingDeal> getFlopkartListingDeals()
	{
		return super.list(new FlopkartListingDeal());
	}

	public FlopkartListingDeal getFlopkartListingDealById(int id)
	{
		return super.find(new FlopkartListingDeal(),id);
	}

  /*  public List<FlopkartListingDeal> getFlopkartListingDealByCategoty(FlopkartListingDeal item)
	{
		return super.findAll(entity_name,"category", item.getSubcategoryId());
	}
  */
	public int deleteFlopkartListingDeal(int id)
	{
		return super.remove(entity_name,id);
	}

	public int updateFlopkartListingDeal(int id, FlopkartListingDeal item)
	{
		if (id <= 0)
			return 0;	
		super.update(item,id);
		return 1;
	}
}

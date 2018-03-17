
package com.iiitb.ooadvoid.dao;

import java.util.List;

import com.iiitb.ooadvoid.pojo.FlopkartCategory;

public class FlopkartCategoryDAO extends HibernateDAO<FlopkartCategory>
{
	String entity_name = "FlopkartCategory";
	
	public FlopkartCategory addFlopkartCategory(FlopkartCategory category)
	{
		super.add(category);
		return category;
	}
	
	public List<FlopkartCategory> getFlopkartCategories()
	{
		return super.list(new FlopkartCategory());
	}

	public FlopkartCategory getFlopkartCategoryById(int id)
	{
		return super.find(new FlopkartCategory(),id);
	}

	public int deleteFlopkartCategory(int id)
	{
		return super.remove(entity_name,id);
	}

	public int updateFlopkartCategory(int id, FlopkartCategory category)
	{
		if (id <= 0)
			return 0;	
		super.update(category,id);
		return 1;
	}
}

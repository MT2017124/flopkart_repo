package com.iiitb.ooadvoid.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.iiitb.ooadvoid.pojo.FlopkartCategory;
import com.iiitb.ooadvoid.dao.FlopkartCategoryDAO;

@Path("/categories")
public class FlopkartCategoryServices 
{

	@GET
	@Produces("application/json")
	public List<FlopkartCategory> getFlopkartCategories()
	{
		FlopkartCategoryDAO dao = new FlopkartCategoryDAO();
		List<FlopkartCategory> category = dao.getFlopkartCategories();
		return category;
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public FlopkartCategory getFlopkartCategory(@PathParam("id") int id)
	{
		FlopkartCategoryDAO dao = new FlopkartCategoryDAO();
		FlopkartCategory category = dao.getFlopkartCategoryById(id);
		return category;
	}

	
	@POST
	@Path("/create")
	@Consumes("application/json")
	public Response addFlopkartCategory(FlopkartCategory category)
	{
		category.setCategoryName(category.getCategoryName());
		FlopkartCategoryDAO dao = new FlopkartCategoryDAO();
		dao.addFlopkartCategory(category);
		return Response.ok().build();
	}

	@PUT
	@Path("/update/{id}")
	@Consumes("application/json")
	public Response updateFlopkartCategory(@PathParam("id") int id, FlopkartCategory category)
	{
		FlopkartCategoryDAO dao = new FlopkartCategoryDAO();
		int count = dao.updateFlopkartCategory(id, category);
		if (count == 0)
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok().build();
	}

	@DELETE
	@Path("/delete/{id}")
	@Consumes("application/json")
	public Response deleteFlopkart_User(@PathParam("id") int id)
	{
		FlopkartCategoryDAO dao = new FlopkartCategoryDAO();
		int count = dao.deleteFlopkartCategory(id);
		if (count == 0)
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok().build();
	}
}

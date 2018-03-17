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

import com.iiitb.ooadvoid.pojo.FlopkartDeal;
import com.iiitb.ooadvoid.dao.FlopkartDealDAO;

@Path("/deals")
public class FlopkartDealServices 
{

	@GET
	@Produces("application/json")
	public List<FlopkartDeal> getFlopkartDeals()
	{
		FlopkartDealDAO dao = new FlopkartDealDAO();
		List<FlopkartDeal> deal = dao.getFlopkartDeals();
		return deal;
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public FlopkartDeal getFlopkartDeal(@PathParam("id") int id)
	{
		FlopkartDealDAO dao = new FlopkartDealDAO();
		FlopkartDeal deal = dao.getFlopkartDealById(id);
		return deal;
	}

	
	@POST
	@Path("/create")
	@Consumes("application/json")
	public Response addFlopkartDeal(FlopkartDeal deal)
	{
		deal.setDealname(deal.getDealname());
		FlopkartDealDAO dao = new FlopkartDealDAO();
		dao.addFlopkartDeal(deal);
		return Response.ok().build();
	}

	@PUT
	@Path("/update/{id}")
	@Consumes("application/json")
	public Response updateFlopkartDeal(@PathParam("id") int id, FlopkartDeal deal)
	{
		FlopkartDealDAO dao = new FlopkartDealDAO();
		int count = dao.updateFlopkartDeal(id, deal);
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
		FlopkartDealDAO dao = new FlopkartDealDAO();
		int count = dao.deleteFlopkartDeal(id);
		if (count == 0)
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok().build();
	}
}

package com.congun.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.congun.web.model.SupplierQuote;
import com.congun.web.service.SupplierQuoteService;

@RestController
@RequestMapping("supplier")
public class SupplierController {

	@Autowired
	SupplierQuoteService supplierService;
	
	@RequestMapping(value="/submitquote" , method=RequestMethod.POST)
	public 	String submitQuotation(@RequestBody SupplierQuote supplierQuotation){
		System.out.println("Posting Requirement details from Supplier");
		return supplierService.submitQuote(supplierQuotation);
		}
	

	@RequestMapping(value="/updatequote" , method=RequestMethod.PUT)
	public 	String updateQuotation(@RequestBody SupplierQuote supplierQuotation){
		System.out.println("Posting Requirement details from Supplier");
		return supplierService.updateQuote(supplierQuotation);	
	}
	
	@RequestMapping(value="/getquotesbysupplier/{supplierId}" , method=RequestMethod.GET)
	public 	String getQuotationsBySupplier(@PathVariable("supplierId") long suppId){
		System.out.println("Getting Quotation details from Supplier with Id : "+suppId);
		return supplierService.getQuotationsbySupplier(suppId);	
	}
	
	@RequestMapping(value="/getquotes/{quoteId}" , method=RequestMethod.GET)
	public 	String getQuotationsById(@PathVariable("quoteId") long quoteId){
		System.out.println("Getting Quotation details by Quotation Id's : "+quoteId);
		return supplierService.getQuotationsbyId(quoteId);	
	}
	
	@RequestMapping(value="/getquotesbyrequirement/{requirementId}" , method=RequestMethod.GET)
	public 	String getQuotationsByRequirement(@PathVariable("requirementId") long requirementId){
		System.out.println("Getting Quotation details for Requirement with Id : "+requirementId);
		return supplierService.getQuotationsbyRequirement(requirementId);	
	}
	
	@RequestMapping(value="/getnoofquotes/{requirementId}" , method=RequestMethod.GET)
	public 	int getnoOfQuotationsByRequirement(@PathVariable("requirementId") long requirementId){
		System.out.println("Getting Quotation details for Requirement with Id : "+requirementId);
		return supplierService.getNoOfQuotationsbyRequirement(requirementId);	
	}
	
	
	
	
}

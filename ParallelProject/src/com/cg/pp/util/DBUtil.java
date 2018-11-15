package com.cg.pp.util;

import java.util.ArrayList;
import java.util.List;

import com.cg.pp.bean.BankDetails;
import com.cg.pp.bean.CustomerDetails;

public class DBUtil {
static List<CustomerDetails> list=new ArrayList<>();
static List<BankDetails> list1=new ArrayList<BankDetails>();
static CustomerDetails customer=new CustomerDetails("Capgemini India Private Limited",51,"xyz","male","Meerut");
static BankDetails banker=new BankDetails(4209211, 4000, customer);
static
{
	list.add(customer);
	list1.add(banker);
}

public static void createAccount(CustomerDetails cd)
{
	list.add(cd);
}

public static int getCustomerInfo(BankDetails bank)
{
	list1.add(bank);
	return bank.getAccNum();
}
public static List<BankDetails> getAllBankAccount()
{
	return list1;
}

}

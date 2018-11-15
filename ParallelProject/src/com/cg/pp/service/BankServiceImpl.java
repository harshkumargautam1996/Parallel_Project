package com.cg.pp.service;

import com.cg.pp.bean.BankDetails;
import com.cg.pp.bean.CustomerDetails;
import com.cg.pp.dao.BankDao;
import com.cg.pp.dao.BankDaoImpl;
import com.cg.pp.exception.BankException;

public class BankServiceImpl implements BankService{
BankDao bankdao=null;
	@Override
	public int createAccount(CustomerDetails cd,BankDetails bank) throws BankException {
		bankdao=new BankDaoImpl();
		return bankdao.createAccount(cd,bank);
	}
	@Override
	public BankDetails showBalance(int cusAccNum) throws BankException {
		bankdao=new BankDaoImpl();
		return bankdao.showBalance(cusAccNum);
	}
	@Override
	public BankDetails deposit(int cusAccNum, int bal) throws BankException 
	{
		return bankdao.deposit(cusAccNum, bal);
		
	}
	@Override
	public BankDetails withdraw(int cusAccNum, int bal) throws BankException {
		return bankdao.withdraw(cusAccNum, bal);
	}
	@Override
	public BankDetails fundTransfer(int AccNum,int transferAccNum, int bal) throws BankException {
		return bankdao.fundTransfer(AccNum, transferAccNum, bal);
	}
	


}

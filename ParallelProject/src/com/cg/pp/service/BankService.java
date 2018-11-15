package com.cg.pp.service;

import com.cg.pp.bean.BankDetails;
import com.cg.pp.bean.CustomerDetails;
import com.cg.pp.exception.BankException;

public interface BankService {
public int createAccount(CustomerDetails cd,BankDetails bank) throws BankException;
public BankDetails showBalance(int cusAccNum) throws BankException;
public BankDetails deposit(int cusAccNum,int bal) throws BankException;
public BankDetails withdraw(int cusAccNum,int bal) throws BankException;
public BankDetails fundTransfer(int AccNum,int transferAccNum,int bal)throws BankException;
}

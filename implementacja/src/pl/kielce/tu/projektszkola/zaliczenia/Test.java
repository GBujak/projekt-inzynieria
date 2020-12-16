package pl.kielce.tu.projektszkola.zaliczenia;
// Damian Linek

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test implements ITest{
	
	private String id;
	private Date dataRozpoczecia;
	private int limitCzasu;
	private List<String> pytania;
	private IRozwiazanie rozwiazanie;
	private boolean aktywny = false;
	
	public Test(String id, Date dataRozpoczecia, int limitCzasu, List<String> pytania)
	{
		this.id = id;
		this.dataRozpoczecia = dataRozpoczecia;
		this.limitCzasu = limitCzasu;
		this.pytania = new ArrayList<String>(pytania);
	}
	
	public String getId()
	{
		return id;
	}
	
	public Date getDataRozpoczecia()
	{
		return dataRozpoczecia;
	}
	
	public int getLimitCzasu()
	{
		return limitCzasu;
	}
	
	public List<String> getPytania()
	{
		return pytania;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public void setDataRozpoczecia(Date dataRozpoczecia)
	{
		this.dataRozpoczecia = dataRozpoczecia;
	}
	
	public void setLimitCzasu(int limitCzasu)
	{
		this.limitCzasu = limitCzasu;
	}
	
	@Override
	public void dodajPytanie(String pytanie)
	{
		pytania.add(pytanie);
	}
	
	@Override
	public void udostepnij()
	{
		aktywny = true;
	}
	
	@Override 
	public void zamknijTest()
	{
		aktywny = false;
	}
	
	@Override
	public void rozwiaz()
	{
		if(aktywny == true)
			rozwiazanie = new Rozwiazanie();
		else
			System.out.println("Test nie jest aktywny. Nie można go rozwiązać.");
	}
}

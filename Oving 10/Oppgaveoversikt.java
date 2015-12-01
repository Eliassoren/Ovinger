public class Oppgaveoversikt
 {
	 private Student[] studenter;
	 private int antStud;
	 private int antOppg;
	 private boolean funnet;
	 private int funnetIndeks;
	 private boolean godkjent;
	 String output;
/*----------------------------------------
		Konstruktør
-----------------------------------------*/
	 public Oppgaveoversikt(Student[]studenter)
	 {
		 this.antStud = antStud;
		 this.studenter = studenter;
	 }

/*------------------------------------------------------
		get-Metoder
-------------------------------------------------------*/
	 public int getAntStud()
	 {
		antStud = studenter.length;
		return antStud;
	 }
	 public int getAntOppg(String student)
	 {
		 finnAntOppg(student);
		 if(antOppg > -1)
		 return antOppg;
		 else
		 feilmelding();
		 return antOppg;
	 }
/*----------------------------------------
		beregninger
--------------------------------------------*/
	private void finnAntOppg(String student)
	{
		antOppg = studenter[finnStudent(student)].getAntOppg();
	}

	private int finnStudent(String student)
	{
		int i = 0;
		int funnetIndeks = -1;
		while(i<studenter.length)
		{
			if(student.equals(studenter[i].getNavn()))
			{
			funnetIndeks = i;
			}
			i++;
		}//while

		return funnetIndeks;
	}//finnStudent

	public void registrer(Student nyStud)
	{
		utvidTabell();

		if(inspiserStudent(nyStud))
		{
		studenter[studenter.length-1] = nyStud;
		antStud++;
		}
		else
		feilmelding();
	}
	private String feilmelding()
	{
		return "Feil verdi";
	}

	private void utvidTabell()
	{
		Student[] nyTab = new Student[studenter.length+1];
		for(int i=0;i<studenter.length;i++)
		{
			nyTab[i]=studenter[i];
		}
		studenter = nyTab;
	}


	private boolean inspiserStudent(Object o)
	{
		return o instanceof Student;
	}

	public void økAntOppgaver(String navn,int økning)
	{
		studenter[finnStudent(navn)].økAntOppg(økning);
	}

	public String toString()
	{
		output ="";
		for(int meh =0;meh<studenter.length;meh++)
		{
			output +=studenter[meh]+"\n";
		}
		return output;
	}
 }//class
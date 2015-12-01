class Oppg12_10_1
{
	public static void main(String[]args)
	{
/*---------------------------------------------------------
	Oppretter objekter
----------------------------------------------------------*/
		Person person1 = new Person("Knut","Kirkhorn",19901201);
		Person person2 = new Person("Kristoffer","Aas",19960108);
		Person person3 = new Person("Pelle","Politi",19940701);
		Person person4 = new Person("Christian","Echtermeier",19962812);
		Person person100 = new Person("Elias","Sørensen",220396);

		Student student100 = new Student(person100,10);
		Student[]studenter =
		{
			new Student(person1,7),
			new Student(person2,2),
			new Student(person3,7),
			new Student(person4,0)
		};

		Oppgaveoversikt h2015 = new Oppgaveoversikt(studenter);
/*-----------------------------------------------------------
	Printlns Student test
------------------------------------------------------------*/
		System.out.println("Studenter-tabell :");
		System.out.println(studenter[0].getNavn());
		System.out.println(studenter[1].getNavn());
		System.out.println(studenter[2].getNavn());
		System.out.println(studenter[3].getNavn());
		System.out.println("Utenom: ");
		System.out.println(student100.getNavn());
/*----------------------------------------------------------
	 Oppgaveoversikt
------------------------------------------------------------*/
		System.out.println("");
		System.out.println("Studenter:\n" + h2015);
		System.out.println("Studenter registrert "+h2015.getAntStud());

		h2015.registrer(student100);

		System.out.println("Studenter registrert etter økning "+ h2015.getAntStud());
		System.out.println("");

		System.out.println("Studenter etter registrering:\n" + h2015);
		System.out.println("");

		System.out.println("Antall oppgaver for student1: " + studenter[0].getAntOppg());
		System.out.println("Øker antall oppgaver med 4");

		h2015.økAntOppgaver("Knut Kirkhorn",4);

		System.out.println("Antall oppgaver for student1 etter økning: " + studenter[0].getAntOppg());
		System.out.println("");

		System.out.println("Studenter:\n" + h2015);
		System.out.println("");





	}
}
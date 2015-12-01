class NyString
{
	private String nesteString;
	private String[]ord;
	private String utOrd;
	private String utFjernet;
	private String tom = "";
	public NyString(String nesteString)
	{
		this.nesteString = nesteString;
	}//Nystring
	public void kallMetoder()
	 {
		forkort();
		fjernBokstav();
	 }
	public String getForkortet()
	{
		return utOrd;
	}
	public String getFjernet()
	{
		return utFjernet;
	}
	private void forkort()
	{
		utOrd = "";
		ord = nesteString.split(" ");
		for(int i =0;i<ord.length;i++)
		{
			utOrd += ord[i].charAt(0);
		}
	}
	private void fjernBokstav()
	{
		utFjernet = nesteString.replace("e","");
	}
}
package week1;

public class DynamicConnectivityClient {
	
	public static void main(String[] args)
	{
		int N = StdIn.readInt();
		UF uf = new QuickFindUF(N);
		while(!StdIn.isEmpty())
		{
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if(!uf.connected(p, q))
			{
				uf.union(p, q);
				StdOut.println(p +" " + q);
			}
		}
		
	}
}

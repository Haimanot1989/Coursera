package week1;

public class QuickUnionUF extends UF{
	private int[] id;
	
	public QuickUnionUF(int N){
	 super(N);
		id = new int[N];
		for (int i = 0; i < N; i++) id[i] = i;
	}
	
	private int root(int i)
	{
		while(i != id[i]) i = id[i];
		return i;
	}
	
	public boolean connected(int p, int q){
		return root(p) == root(q); //if p and q have the same root, they are connected
	}

	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
}

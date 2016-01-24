package week1;

public class QuickFindUF {
	private int[] id;
	public QuickFindUF(int N){
		//creates the private datastructure(array in this case) 
		// and sets the vlaue of each object the same as it's id
		id = new int[N];
		for(int i = 0; i < N; i++)
			id[i] = i;
	}

	public boolean connected(int p, int q)
	{
		return id[p] == id[q];
	}
	
	public void union(int p, int q)
	{
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if(id[i] == pid) // the mistake we might make is, putting id[p] instead of pid
				id[i] = qid;
		}
	}
}

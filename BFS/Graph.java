import java.util.*;

public class Graph
{
	private int V;
    // Updated the linked list to get the character
	private LinkedList<Character> adj[];

    // Create a graph
	Graph()
	{
        // For storing the character we are initializing the number of vertices to be 256
		V=256;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++)
        {
			adj[i]=new LinkedList();
        }
	}

	// Add an edge into the graph
	void addEdge(char v,char w)
	{
		adj[v].add(w);
        // if the graph is directed then comment the below line
	    adj[w].add(v);
	}

	// BFS algorithm
	void BFS(char s)
	{
		boolean visited[]=new boolean[V];
        // Make the queue to for storing the character
		LinkedList<Character> queue=new LinkedList<Character>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.print(s+" ");
			Iterator<Character> i=adj[s].listIterator();
			while(i.hasNext())
			{
				char n=i.next();
				if(!visited[n])
				{
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String args[])
	{
		Graph g=new Graph();

		g.addEdge('A', 'B');
		g.addEdge('A', 'D');
		g.addEdge('A', 'E');
		g.addEdge('B', 'C');
		g.addEdge('E', 'F');
		g.addEdge('F', 'G');
		g.addEdge('F', 'H');
		System.out.println("Following is Breadth First Traversal "+"(starting from vertex A)");
		g.BFS('A');
        System.out.println();
	}
}

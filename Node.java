public class Node {
	public double x;
	public double y;
	public Node next;

	public Node(double x_cor, double y_cor, Node n) {
		x = x_cor;
		y = y_cor;
		next = n;
		
	}
	
	public Node(double x_cor, double y_cor) {
		x = x_cor;
		y = y_cor;
		next = null;
}
}

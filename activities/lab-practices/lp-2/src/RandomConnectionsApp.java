// java RandomConnectionsApp 10
public class RandomConnectionsApp {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int rand;
		double rad = 2 * Math.PI / N;
		double c = .5;
		double r = .5;
		Point2D p, p2;
		Point2D[] points = new Point2D[N];

		// System.out.println(rad);
		StdDraw.setPenRadius(.05);
		for (int i = 0; i < N; i++){
			p = new Point2D(r * Math.cos(rad * i) + c, r * Math.sin(rad * i) + c);
			points[i] = p;
			StdDraw.point(p.x(), p.y());
		}

		StdDraw.setPenRadius(.01);
		StdDraw.setPenColor(StdDraw.GRAY);
		for (int i = 0; i < N; i++){
			rand = StdRandom.uniform(N);
			p = points[i];
			p2 = points[rand];

			StdDraw.line(p.x(), p.y(), p2.x(), p2.y());
			StdOut.println(i + "-" + rand);
		}
	}
}
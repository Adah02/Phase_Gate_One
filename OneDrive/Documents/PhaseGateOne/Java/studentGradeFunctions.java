public class studentGradeFunctions {

	public static double[] studentScoreTotal(double[][] scores){

		int[] studentTotal = new int[scores.length];

		for (int index = 0; index < scores.length; index++){
			int total = 0;
			for (int count = 0; count < scores[index].length; count++){
				total += scores[index][count];
			}
		studentTotal[index] = total;
		}
	return []studentTotal;
	}

	public static double[] studentScoreAverage(double[][] scores){

		double[] studentAverage = new double[scores.length];

		for (int index = 0; index < scores.length; index++){
			int total = 0;
			for (int count = 0; count < scores[index].length; count++){
				total += scores[index][count];
			}
		studentAverage[index] = total / scores[index].length;
		}
	return []studentAverage;
	}

	
}
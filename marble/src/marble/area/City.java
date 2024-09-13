package marble.area;

public class City extends SaleLocal{
	public int building; // 0 : 건물없음
	
	public int[] buildCost = {4,2,6,10,10}; //new int[]; 
	public int[] fee = {1,2,4,12,45}; //new int[];
	
//	public City(int colorIdx, String name, int idx, int[] buildCost, int[] fee) {
//		super(colorIdx, name, idx);
//		this.buildCost = buildCost;
//		this.fee = fee;
//		
//		
//	}
	
	public City(int colorIdx, String name, int idx) {
		super(colorIdx, name, idx);
	}
	
	public int getFee()	{
		int cnt = 0;
		int feeResult = fee[cnt++];
		
		int i = building;
		while( i != 0) {
			if(i % 2 == 1) {
				feeResult += fee[cnt++];
			}
			cnt++;
		}
		
		
		return feeResult;
	}
	
}

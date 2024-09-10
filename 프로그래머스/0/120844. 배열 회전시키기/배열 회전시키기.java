class Solution {
    public int[] solution(int[] numbers, String direction) {
        int arr[] = new int[numbers.length];
		if(direction.equals("right")) {
			arr[0] = numbers[numbers.length-1];
			for(int i = 1; i < numbers.length; i++) {
				arr[i] = numbers[i-1];
			}
		} else {
			arr[numbers.length-1] = numbers[0];
			for(int i = numbers.length-1; i > 0; i--) {
				arr[i-1] = numbers[i];
			}
		}
		
		return arr;
    }
}
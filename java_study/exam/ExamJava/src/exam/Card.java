package exam;

public class Card {
		private final String shape;
		private final String value;
		
		public Card(String shape, String value) {
			this.shape = shape;
			this.value = value;
		}
		
		public String getShape() {
			return shape;
		}
		
		public String getValue() {
			return value;
		}
		
		@Override
		public String toString() {
			String str;
			str = shape + " (" + value + ")";
			
			return str;
			
		}
		
}

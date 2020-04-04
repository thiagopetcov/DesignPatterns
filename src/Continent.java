//Setting Enums
public enum Continent {
	
	SOUTHAMERICA {
		@Override
		public String toString() {
			return "South America";
		}
	},
	
	AFRICA {
		@Override
		public String toString() {
			return "Africa";
		}
	},
	
	ASIA {
		@Override
		public String toString() {
			return "Asia";
		}
	},
	EUROPE {
		@Override
		public String toString() {
			return "Europe";
		}
	},
	
	ANTARCTICA {
		@Override
		public String toString() {
			return "Antarctica";
		}
	},
	
	NORTHAMERICA {
		@Override
		public String toString() {
			return "North America";
		}
	},
	OCEANIA {
		@Override
		public String toString() {
			return "Oceania";
		}
	}

}


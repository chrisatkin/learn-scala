object Timer {
	def oncePerSecond(callback: () => Unit) {
		while(true) {
			callback();
			Thread sleep 1000
		}
	}

	def timeFlies() {
		println("time flies like an arrow...")
		return 1
	}

	def main(args: Array[String]) {
		oncePerSecond(timeFlies)
	}
}
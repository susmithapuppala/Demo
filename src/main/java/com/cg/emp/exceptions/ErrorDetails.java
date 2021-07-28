package com.cg.emp.exceptions;

	import java.time.LocalDateTime;
	 public class ErrorDetails {
	    private String errorMessage;
	    private LocalDateTime timestamp;
	    private String path;
	   
	  
		public ErrorDetails(String errorMessage, LocalDateTime timestamp, String path) {
			super();
			this.errorMessage = errorMessage;
			this.timestamp = timestamp;
			this.path = path;
		}
		

		public ErrorDetails() {
			super();
			// TODO Auto-generated constructor stub
		}


		public String getErrorMessage() {
			return errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public LocalDateTime getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(LocalDateTime timestamp) {
			this.timestamp = timestamp;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

}

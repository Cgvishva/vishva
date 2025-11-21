package model;

public class Courier {
	 private int id;
	 private String senderName;
     private String receiverName;
     private String source;
     private String destination;
     private String status;

     public Courier(int id, String senderName, String receiverName, String starts_from, String destination, String status) {
	    this.id = id;
	    this.senderName = senderName;
	    this.receiverName = receiverName;
	    this.source = starts_from;
	    this.destination = destination;
        this.status = status;
	 }

     public Courier(String senderName, String receiverName, String source, String destination, String status) {
	    this.senderName = senderName;
	    this.receiverName = receiverName;
        this.source = source;
        this.destination = destination;
        this.status = status;
     }

	 public int getId() {
		 return id;
		 }
   	 public String getSenderName() { 
   		 return senderName; 
   		 }
     public String getReceiverName() {
    	 return receiverName;
    	 }
	 public String getsource() {
		 return source;
		 }
	 public String getdestination() { 
		 return destination;
		 }
     public String getStatus() {
    	 return status; 
    	 }
	   
     void setStatus(String status) {
	    	this.status = status; 
	    	}

	    public String toString() {
	        return "Courier ID : " +id + "\nSender Name : " + senderName + "\nReciever Name : "+ receiverName +  "\nFrom : "+source + "\nTo : "+ destination + "\nCurrent Status : "+status +"\n        <-------->";
	    } 

}

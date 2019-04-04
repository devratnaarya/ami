package in.arya.ami.core.response.model;

import java.util.Date;

import lombok.Data;

@Data
public class Response<T> {
	
	public Response(T t) {
		this.timestamp = new Date().getTime();
		this.payload = t;
	}
	
	private Long timestamp;
	
	private T payload;

}

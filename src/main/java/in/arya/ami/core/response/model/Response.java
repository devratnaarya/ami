package in.arya.ami.core.response.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Response<T> {
	
	private Timestamp timestamp;
	
	private T payload;

}

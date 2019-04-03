package in.arya.ami.training.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.arya.ami.core.response.model.Response;
import in.arya.ami.training.model.Training;

@RestController
@RequestMapping(value="/training")
public class TrainingController {
	
	@PostMapping("/{ami-name}")
	public Response<Boolean> trainBot(@PathVariable("ami-name") String amiName, @RequestBody Training training) {
		if (training == null || StringUtils.isEmpty(amiName)) {
			throw new IllegalArgumentException("Invalid param provided!");
		}
		return null;
	}

}

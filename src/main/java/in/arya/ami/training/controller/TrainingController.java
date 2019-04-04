package in.arya.ami.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.arya.ami.core.response.model.Response;
import in.arya.ami.training.model.Training;
import in.arya.ami.training.service.TrainingService;

@RestController
@RequestMapping(value="/training")
public class TrainingController {
	
	private TrainingService trainingService;

	@Autowired
	public TrainingController(TrainingService trainingService) {
		this.trainingService = trainingService;
	}
	
	@PostMapping("/{ami-name}")
	public Response<Training> trainBot(@PathVariable("ami-name") String amiName, @RequestBody Training training) {
		if (training == null || StringUtils.isEmpty(amiName)) {
			throw new IllegalArgumentException("Invalid param provided!");
		}
		return new Response<>(trainingService.giveTraining(amiName, training));
	}

}

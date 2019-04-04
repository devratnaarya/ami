package in.arya.ami.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import in.arya.ami.training.model.Training;
import in.arya.ami.training.repository.TrainingRepository;
import in.arya.ami.training.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {
	
	private TrainingRepository repository;

	@Autowired
	public TrainingServiceImpl(TrainingRepository repository) {
		this.repository = repository;
	}

	@Override
	public Training giveTraining(String amiName, Training training) {
		if (StringUtils.isEmpty(amiName) || training == null) {
			throw new IllegalArgumentException("Invalid param provided!");
		}
		return repository.save(training);
	}

}

package in.arya.ami.training.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.arya.ami.training.model.Training;

public interface TrainingRepository extends MongoRepository<Training, String>{

}

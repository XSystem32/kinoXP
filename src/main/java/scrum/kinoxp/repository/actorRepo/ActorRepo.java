package scrum.kinoxp.repository.actorRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Actor;

import java.util.List;

@Repository
public interface ActorRepo {

    public void createActor (Actor actor);
    public void deleteActor (int index);
    public void updateMovie (Actor actor);

    Actor getActor(int index);
    List<Actor> getActors();

}

package scrum.kinoxp.repository.actorRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Actor;

import java.util.List;

@Repository
public interface ActorRepo {

    public boolean createActor (Actor actor);
    public boolean deleteActor (int index);
    public boolean updateMovie (Actor actor);

    Actor getActor(int index);
    List<Actor> getActors();

}

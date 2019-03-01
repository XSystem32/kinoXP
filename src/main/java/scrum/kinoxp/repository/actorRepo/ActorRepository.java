package scrum.kinoxp.repository.actorRepo;

import scrum.kinoxp.model.Actor;

import java.util.List;

public class ActorRepository implements ActorRepo{

    @Override
    public boolean createActor(Actor actor) {
        return false;
    }

    @Override
    public boolean deleteActor(int index) {
        return false;
    }

    @Override
    public boolean updateMovie(Actor actor) {
        return false;
    }

    @Override
    public Actor getActor(int index) {
        return null;
    }

    @Override
    public List<Actor> getActors() {
        return null;
    }
}

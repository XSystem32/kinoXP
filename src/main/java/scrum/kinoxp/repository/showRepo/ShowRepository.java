package scrum.kinoxp.repository.showRepo;

import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Show;

import java.util.List;

@Repository
public class ShowRepository implements ShowRepo{

    @Override
    public boolean createShow(Show show) {
        return false;
    }

    @Override
    public boolean deleteShow(int index) {
        return false;
    }

    @Override
    public boolean updateShow(Show show) {
        return false;
    }

    @Override
    public Show getShow(int index) {
        return null;
    }

    @Override
    public List<Show> getShows() {
        return null;
    }
}

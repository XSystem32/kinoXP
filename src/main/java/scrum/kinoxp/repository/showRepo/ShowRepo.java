package scrum.kinoxp.repository.showRepo;


import org.springframework.stereotype.Repository;
import scrum.kinoxp.model.Show;

import java.util.List;

@Repository
public interface ShowRepo {
    public boolean createShow (Show show);
    public boolean deleteShow (int index);
    public boolean updateShow (Show show);
    Show getShow (int index);
    List<Show> getShows();
}

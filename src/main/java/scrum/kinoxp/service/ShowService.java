package scrum.kinoxp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum.kinoxp.model.Show;
import scrum.kinoxp.model.Theater;
import scrum.kinoxp.repository.showRepo.ShowRepo;
import scrum.kinoxp.repository.showRepo.ShowRepository;

import java.util.List;

@Service
public class ShowService implements ShowRepo {

    @Autowired
    ShowRepository showRepo;


    @Override
    public boolean createShow(Show show) {
        showRepo.createShow(show);
        return true;
    }

    public void repoInit () {
        showRepo.repoInit();
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
    public Show getShow(int id) {

        Show show = showRepo.getShow(id);
        show.setTheater(getTheatreById(show.getTheatreId()));
        show.generateSeats();
        System.out.println(show.getSeats());
        return show;
    }

    @Override
    public List<Show> getShows() {
        return null;
    }

    public Theater getTheatreById(int id) {
        return showRepo.getTheatreById(id);
    }
}

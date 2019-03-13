package scrum.kinoxp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scrum.kinoxp.model.Show;
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

package com.mitchellaugustini.bingescale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service public class MediaService {
    @Autowired
    private com.mitchellaugustini.bingescale.MediaRepository MediaRepository;

    public List<Movie> getAllMedia() {
        return MediaRepository.findAll();
    }

    public void saveMovies(List<Movie> movies) {
        MediaRepository.saveAll(movies);
    }
}

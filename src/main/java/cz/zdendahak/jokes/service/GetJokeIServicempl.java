package cz.zdendahak.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetJokeIServicempl implements GetJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public GetJokeIServicempl() {

        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

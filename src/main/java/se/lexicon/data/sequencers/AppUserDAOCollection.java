package se.lexicon.data.sequencers;

import se.lexicon.model.AppUser;

import java.util.HashSet;
import java.util.Set;

public class AppUserDAOCollection implements AppUserDAO{

    private Set<AppUser> appUsers = new HashSet<AppUser>();

    @Override
    public AppUser persist(AppUser appUser) {
        return null;
    }

    /*
    @Override
    public AppUser persist(Appuser appUser) {
        return null;
    }

     */
/*
    @Override
    public AppUser persist(Object appUser) {
        return null;
    }

 */
}

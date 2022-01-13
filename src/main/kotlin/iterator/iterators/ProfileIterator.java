package iterator.iterators;

import iterator.profile.Profile;

// Общий интерфейс итераторов.
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
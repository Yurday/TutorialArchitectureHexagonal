package example.org.hexagonal.domain.services;

import example.org.hexagonal.domain.repo.BooksRepository;

public class BooksServiceFactory {
    public static BooksService getBooksService(BooksRepository booksRepository) {
        return new BooksServiceImpl(booksRepository);
    }
}

package com.thoughtworks.tddintro.exercises.library;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LibraryTest {
    private List<String> books;
    private PrintStream printStream;
    private Library library;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        books = new ArrayList<>();
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        library = new Library(books, printStream, bufferedReader);
    }

    @Test
    public void shouldPrintBookTitleWhenThereIsOneBook() {
        String title = "Book Title";
        System.setOut(printStream);
        books.add(title);
        library.listBooks();
        verify(printStream).println(title + "\n");
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooks() {
        System.setOut(printStream);
        library.listBooks();
        verify(printStream).println("");
        // implement me
    }

    @Test
    public void shouldPrintBothBookTitlesWhenThereAreTwoBooks() throws IOException {
        String title = "Book Title";
        String title2 = "Book Title 2";
        System.setOut(printStream);
        books.add(title);
        books.add(title2);
        library.listBooks();
        verify(printStream).println(title + "\n" + title2 + "\n");
        // implement me
    }

    @Test
    public void shouldAddBookToCollectionWhenEnteredByUser() throws IOException {
        when(bufferedReader.readLine()).thenReturn("The Hobbit");
        library.enterBook();
        assertThat(books, hasItems("The Hobbit"));
    }

    @Test
    @Ignore
    // I don't understand when/thenReturn
    public void shouldDeleteBookFromCollectionWhenRemovedByUser() throws IOException {
        // Add when/thenReturn here

        books.add("The Two Towers");
        library.removeBook();

        assertThat(books, not(hasItems("The Two Towers")));
    }
}

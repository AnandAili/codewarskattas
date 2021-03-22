package java8.exceptions;

import java.io.IOException;

@FunctionalInterface
public interface MyLamda<T> {
    T execute(T string) throws IOException;
}

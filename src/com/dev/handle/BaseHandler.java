package com.dev.handle;

import java.util.List;

public interface BaseHandler<T> {
    List<T> getAll();
    void save();
    List<T> getId(int id);
    void delete(int id);
}

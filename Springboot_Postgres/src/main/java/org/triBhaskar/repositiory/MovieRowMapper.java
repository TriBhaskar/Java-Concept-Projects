package org.triBhaskar.repositiory;

import org.springframework.jdbc.core.RowMapper;
import org.triBhaskar.model.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class MovieRowMapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Movie(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                List.of(),
                LocalDate.parse(resultSet.getString("release_date"))
        );
    }
}

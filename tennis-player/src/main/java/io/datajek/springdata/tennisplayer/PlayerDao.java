package io.datajek.springdata.tennisplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Player> getAllPlayers()
    {
        String sql = "SELECT * FROM PLAYER";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Player>(Player.class));
    }

    public Player getPlayerById(int id){
        String sql = "SELECT * FROM Player WHERE ID = ?";

        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Player>(Player.class), id);

    }
}

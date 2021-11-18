package com.revature.persistance;

import java.sql.ResultSet;

public abstract class Dao {
    public abstract ResultSet create();

    public abstract ResultSet read();

    public abstract ResultSet update();

    public abstract ResultSet delete();
}

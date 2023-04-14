package db.migration;

import java.sql.Statement;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

public class V02__MyJavaMigration extends BaseJavaMigration {

	public void migrate(Context context) throws Exception {
		try (final Statement statement = context.getConnection().createStatement()) {
			statement.execute("ALTER TABLE cats ADD COLUMN fav_toy TEXT NOT NULL DEFAULT '';");
		}
	}

}

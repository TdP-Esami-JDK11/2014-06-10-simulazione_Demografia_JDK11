package it.polito.tdp.demografia.db;

import it.polito.tdp.demografia.model.Movimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MovimentiDAO {
	
	public List<Movimento> getAllMovimenti() {
		String sql = "SELECT * FROM movimenti_intraurbani";

		Connection conn = DBConnect.getConnection();
		try {
			PreparedStatement st = conn.prepareStatement(sql);

			List<Movimento> movimenti = new ArrayList<>();

			ResultSet res = st.executeQuery();

			while (res.next()) {

				Calendar cal = Calendar.getInstance() ;
				cal.clear();
				cal.set(
						res.getInt("ANNO_REGISTRAZIONE"),
						res.getInt("MESE_REGISTRAZIONE")-1,
						res.getInt("GIORNO_REGISTRAZIONE")
						) ;
				
				
				Movimento mov = new Movimento(
						cal.getTime(),
						res.getInt("CIRCOSCRIZIONE_PROVENIENZA"),
						res.getInt("CIRCOSCRIZIONE_DESTINAZIONE"),
						res.getInt("TOTALE_EVENTI")
						);
				movimenti.add(mov);

			}

			st.close();
			conn.close();

			return movimenti;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Database error", e);
		}

	}
	
	


}

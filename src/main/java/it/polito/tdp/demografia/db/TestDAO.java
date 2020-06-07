package it.polito.tdp.demografia.db;

import java.util.List;

import it.polito.tdp.demografia.model.Movimento;

public class TestDAO {

	public static void main(String[] args) {
		MovimentiDAO self = new MovimentiDAO() ;
		
		List<Movimento> movs = self.getAllMovimenti() ;
		for(Movimento m : movs) {
			
			System.out.format("%d-%d: %d (%4$tY-%4$tm-%4$td)\n", m.getCircoscrizioneProvenienza(),
					m.getCircoscrizioneDestinazione(), m.getNumeroEventi(),
					m.getRegistrazione()) ;
		}
	}

}

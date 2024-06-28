package banana.dao;

import banana.model.Produto;
import br.com.hcf.HCFConnection;

public class ProdutoDao { 
		
		public void cadastro(Produto produto) {
			
			
			new HCFConnection<>(Produto.class).save(produto);
			
		}
	
	
}

package sg.edu.iss.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	@Query("select s from Stock s where s.product.productId =:id")
	public Stock search(@Param("id")int id);
}

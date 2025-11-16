package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "shoppingcarts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {
    @Id
    String shoppingCartNumber;
    List<CartLine> cartLines = new ArrayList<>();
    public void addToCart(Product product, int qty) {}
    public void removeFromCart(Product product) {}
    public void changeQuantity(Product product, int qty) {}
    public void checkout() {}
}

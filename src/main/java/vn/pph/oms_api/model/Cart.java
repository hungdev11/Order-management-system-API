package vn.pph.oms_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import vn.pph.oms_api.utils.CartStatus;

import java.util.ArrayList;
import java.util.List;

@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Cart extends BaseEntity {
    @OneToMany(mappedBy = "cart")
    @Column(nullable = false)
    @Builder.Default
    private List<CartProduct> products = new ArrayList<>();

    @Column(name = "no_products", nullable = false)
    @Builder.Default
    private int cartCount = 0;

    @Column(nullable = false, unique = true)
    private Long userId;

    @Builder.Default
    private CartStatus status = CartStatus.ACTIVE;
}

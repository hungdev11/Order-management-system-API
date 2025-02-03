package vn.pph.oms_api.dto.request;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderShop {
    private Long shopId;
    public List<CartItem> items;
}

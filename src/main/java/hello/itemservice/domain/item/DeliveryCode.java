package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Fast
 * Normal
 * Slow
 * 배송
 */

@Data
@AllArgsConstructor
public class DeliveryCode {
    private String code;
    private String displayName;
}

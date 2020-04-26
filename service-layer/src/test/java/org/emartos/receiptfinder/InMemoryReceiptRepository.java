package org.emartos.receiptfinder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

final class InMemoryReceiptRepository implements ReceiptRepository {
    private Map<Integer, Receipt> receipts = Collections.unmodifiableMap(new HashMap<Integer, Receipt>() {
        {
            put(ReceiptMother.CARROT_STICKS_ID, ReceiptMother.carrotSticks());
            put(ReceiptMother.FISH_AND_CHIPS_ID, ReceiptMother.fishAndChips());
        }
    });

    @Override
    public Optional<Receipt> searchById(Integer id) {
        return Optional.ofNullable(receipts.get(id));
    }

    @Override
    public Optional<Receipt> searchByType(Type type) {

        for (Receipt receipt: receipts.values()) {
            if (receipt.getType().equals(type)) {
                return Optional.of(receipt);
            }
        }

        return Optional.empty();
    }
}

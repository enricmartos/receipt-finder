package org.emartos.receiptfinder;

import java.util.Optional;

public interface ReceiptRepository {
    Optional<Receipt> searchById(Integer id);

    Optional<Receipt> searchByType(Type type);
}

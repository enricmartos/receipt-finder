package org.emartos.receiptfinder;

import java.util.Optional;

final class EmptyReceiptRepository implements ReceiptRepository {
    @Override
    public Optional<Receipt> searchById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Receipt> searchByType(Type type) {
        return Optional.empty();
    }
}

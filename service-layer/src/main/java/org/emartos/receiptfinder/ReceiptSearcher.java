package org.emartos.receiptfinder;

import java.util.Optional;

final class ReceiptSearcher {
    private ReceiptRepository receiptRepository;

    public ReceiptSearcher(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    public Optional<Receipt> searchById(Integer id) {
        return receiptRepository.searchById(id);
    }

    public Optional<Receipt> searchByType(Type type) {
        return receiptRepository.searchByType(type);
    }
}

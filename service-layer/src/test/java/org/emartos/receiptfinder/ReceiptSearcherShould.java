package org.emartos.receiptfinder;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
public class ReceiptSearcherShould {

    @Test
    public void find_existing_receipts_by_id() {
        ReceiptRepository inMemoryReceiptRepository = new InMemoryReceiptRepository();
        ReceiptSearcher receiptSearcher = new ReceiptSearcher(inMemoryReceiptRepository);

        Optional<Receipt> expectedReceipt = Optional.of(ReceiptMother.carrotSticks());

        assertEquals(expectedReceipt, receiptSearcher.searchById(ReceiptMother.CARROT_STICKS_ID));
    }

    @Test
    public void find_existing_receipts_by_type() {
        ReceiptRepository inMemoryReceiptRepository = new InMemoryReceiptRepository();
        ReceiptSearcher receiptSearcher = new ReceiptSearcher(inMemoryReceiptRepository);

        Optional<Receipt> expectedReceipt = Optional.of(ReceiptMother.fishAndChips());

        assertEquals(expectedReceipt, receiptSearcher.searchByType(Type.ANIMAL));
    }

    @Test
    public void not_find_non_exisiting_receipts() {
        ReceiptRepository emptyReceiptRepository = new EmptyReceiptRepository();
        ReceiptSearcher receiptSearcher = new ReceiptSearcher(emptyReceiptRepository);

        Integer nonExistingReceiptId = 1;
        Optional<Receipt> expectedEmptyResult = Optional.empty();

        assertEquals(expectedEmptyResult, receiptSearcher.searchById(nonExistingReceiptId));
    }

}

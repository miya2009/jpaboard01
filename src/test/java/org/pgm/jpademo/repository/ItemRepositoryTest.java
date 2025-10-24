package org.pgm.jpademo.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.pgm.jpademo.domain.Item;
import org.pgm.jpademo.domain.ItemSellStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class ItemRepositoryTest {
    @Autowired
    private ItemRepository itemRepository;
    @Test
    public void insertItem() {
        Item item = Item.builder()
                .itemNm("볼펜")
                .itemDetail("수성 볼펜")
                .itemSellStatus(ItemSellStatus.판매중)
                .price(1000)
                .stockNumber(10)
                .build();
        itemRepository.save(item);
    }
}

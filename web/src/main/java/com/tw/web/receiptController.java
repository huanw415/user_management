package com.tw.web;

import com.tw.core.ItemsService;
import com.tw.core.PromotionsService;
import com.tw.core.entity.Item;
import com.tw.core.entity.Promotion;
import com.tw.core.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by hgwang on 5/12/15.
 */

@RestController
@RequestMapping("/receipt")
public class receiptController {

    private PromotionsService promotionsService;
    private ReceiptService receiptService;
    private ItemsService itemsService;

    @Autowired
    public receiptController(PromotionsService promotionsService, ReceiptService receiptService, ItemsService itemsService) {
        this.promotionsService = promotionsService;
        this.receiptService = receiptService;
        this.itemsService = itemsService;
    }

    @RequestMapping(method = RequestMethod.POST)
//    public List<Map> getReceipt(@RequestBody List<Item> items) {
    public List<Map> getReceipt() {

        List<Item> items = itemsService.getAllItems();
        List<Promotion> promotions = promotionsService.getAllPromotions();

        return receiptService.getReceipt(items, promotions);
    }
}
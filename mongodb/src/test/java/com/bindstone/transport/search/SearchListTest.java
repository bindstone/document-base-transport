package com.bindstone.transport.search;

import com.bindstone.transport.domain.TransportList;
import com.bindstone.transport.service.TransportService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SearchListTest {

    @Autowired
    TransportService transportService;

    @Test
    public void getListTest() {
        List<TransportList> list = transportService.getList();
        System.out.println(list.size());
    }

    @Test
    public void getListPageTest() {
        System.out.println(transportService.getListPage().size());
    }
}

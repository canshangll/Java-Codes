package com.lmj.mode.FactoryMethod.demo1.idcard;

import com.lmj.mode.FactoryMethod.demo1.framework.Factory;
import com.lmj.mode.FactoryMethod.demo1.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    private HashMap hashMap = new HashMap<>();
    private Long seriad = 10000L;
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner,seriad++);
    }
    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        hashMap.put(new Long(card.getId()),card.getOwner());
//        owners.add(((IDCard) product).getOwner());
    }

    public HashMap<Long, String> getHashMap() {
        return hashMap;
    }

    public List getOwners() {
        return owners;
    }
}

package com.rectus29.winekeeper.repository.impl;

import com.rectus29.winekeeper.model.Bottle;
import com.rectus29.winekeeper.repository.IBottleRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.List;

@Repository
public class BottleRepositoryImpl extends GenericManagerImpl<Bottle, Long> implements IBottleRepository {

    public BottleRepositoryImpl() {
        super(Bottle.class);
    }

}

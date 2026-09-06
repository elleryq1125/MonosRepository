package com.example.monos.service;

import org.springframework.stereotype.Service;

import com.example.monos.dto.IndexSummary;
import com.example.monos.mapper.InventoryMapper;

@Service
public class IndexServiceImpl implements IndexService {
    private final InventoryMapper inventoryMapper;

    public IndexServiceImpl(InventoryMapper inventoryMapper) {
        this.inventoryMapper = inventoryMapper;
    }

    /**
	 * <p>トップページのサマリー情報を取得する。</p>
	 * @param companyId 会社ID
     * @return IndexSummary トップページのサマリー情報
	 */
    @Override
    public IndexSummary getIndexSummary(Integer companyId) {
        return new IndexSummary(
            inventoryMapper.selectStockOutCount(companyId),
            inventoryMapper.selectBelowReorderPointCount(companyId)
        );
    }

}

package com.example.monos.dto;

/**
 * トップページに表示する在庫情報のサマリーを表すDTO。
 * @author t.ueta
 */
public record IndexSummary(int stockOutCount, int belowReorderPointCount) {
}

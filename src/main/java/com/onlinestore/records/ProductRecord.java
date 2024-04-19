package com.onlinestore.records;

import lombok.Builder;

@Builder
public record ProductRecord(String name, String description, Double price, Integer quantity) {
}

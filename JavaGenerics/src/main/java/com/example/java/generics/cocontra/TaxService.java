package com.example.java.generics.cocontra;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiPredicate;

public class TaxService {
    public static void processTaxes(Taxable t) {

    }

    public static <E extends Taxable> void processBulkTaxes(List<E> list) {
        for (Taxable tax :
                list) {
            processTaxes(tax);
        }
    }

    public static void main(String[] args) {
        List<Taxable> taxables = List.of(new Taxable(), new Corporation(), new Individual());
        processBulkTaxes(taxables);
        List<Individual> individuals = List.of(new Individual(), new Individual(), new Individual());
        processBulkTaxes(individuals);

    }
}

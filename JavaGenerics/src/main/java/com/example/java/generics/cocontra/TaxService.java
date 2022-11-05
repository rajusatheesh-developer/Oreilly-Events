package com.example.java.generics.cocontra;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiPredicate;

public class TaxService {
    public static void processTaxes(Taxable t) {

    }

    //co-variance
    public static <E extends Taxable> void processBulkTaxes(List<E> list) {
        for (Taxable tax :
                list) {
            processTaxes(tax);
        }
    }

    //contravariant
    public static void getIndividualClients(List<? super Individual> list) {
        list.add(new Individual());
        list.add(new Individual());
        list.add(new Individual());
    }


    //List<Individual> - invariant
    public static void main(String[] args) {
        List<Taxable> taxables = List.of(new Taxable(), new Corporation(), new Individual());
        getIndividualClients(taxables);
        processBulkTaxes(taxables);
        List<Individual> individuals = List.of(new Individual(), new Individual(), new Individual());
        getIndividualClients(individuals);
        processBulkTaxes(individuals);
        getIndividualClients(List.of(new Object(),new Object()));

    }
}

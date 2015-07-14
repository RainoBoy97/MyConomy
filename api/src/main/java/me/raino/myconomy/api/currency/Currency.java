package me.raino.myconomy.api.currency;

public interface Currency {

    String getSingular();

    String getPlural();

    double getConversionFactor();

    double convert(double amount);

    double convert(double amount, Currency currency);

}

package com.codewithmosh.strategy;

public class DES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String text) {
        return "Encrypting message using DES";
    }
}

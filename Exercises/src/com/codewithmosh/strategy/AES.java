package com.codewithmosh.strategy;

public class AES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String text) {
        return "Encrypting message using AES";
    }
}

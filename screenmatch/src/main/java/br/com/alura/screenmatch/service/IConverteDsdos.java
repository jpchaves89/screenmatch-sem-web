package br.com.alura.screenmatch.service;

public interface IConverteDsdos {
    <T> T obterDados(String json, Class<T> classe);
}

package br.com.alura.aluraviagens.util;

import androidx.annotation.NonNull;

import br.com.alura.aluraviagens.model.Pacote;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    @NonNull
    public static String formataDiasEmTexto(int quantidadeDias) {
        String diasEmTexto = "";
        diasEmTexto = quantidadeDias > 1 ? quantidadeDias + PLURAL : quantidadeDias + SINGULAR;
        return diasEmTexto;
    }
}

package com.satc.satcloja.interfaces;

import com.satc.satcloja.enums.TipoOperacao;

import java.time.LocalDate;

public interface OperacaoFinanceira {
    public LocalDate getDataOperacao();
    public Double getValorOperacao();
    public TipoOperacao getTipoOperacao();
}

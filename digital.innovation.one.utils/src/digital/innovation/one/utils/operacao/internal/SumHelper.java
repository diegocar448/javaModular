package digital.innovation.one.utils.operacao.internal;

import digital.innovation.one.operacao.Operacao;

public class SumHelper implements Operacao {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

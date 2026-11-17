package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public interface tbqsvytpvh extends i1, iwxlajgraz {
    void esjtqupxsv(double d13);

    double getDoubleValue();

    default void iwizpuwonk(double d13) {
        esjtqupxsv(d13);
    }

    @Override // androidx.compose.runtime.iwxlajgraz
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        iwizpuwonk(((Number) obj).doubleValue());
    }

    @Override // androidx.compose.runtime.i1
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }
}

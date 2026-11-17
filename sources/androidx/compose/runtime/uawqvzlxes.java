package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public interface uawqvzlxes extends metgxyhuhe, iwxlajgraz {
    void btonecajqb(int i13);

    @Override // androidx.compose.runtime.metgxyhuhe
    int gxszxtbevo();

    default void oxmwwwfdhm(int i13) {
        btonecajqb(i13);
    }

    @Override // androidx.compose.runtime.iwxlajgraz
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        oxmwwwfdhm(((Number) obj).intValue());
    }

    @Override // androidx.compose.runtime.i1
    default Integer getValue() {
        return Integer.valueOf(gxszxtbevo());
    }
}

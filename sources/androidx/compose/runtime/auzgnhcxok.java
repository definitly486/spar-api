package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public interface auzgnhcxok extends bfopjjpdmp, iwxlajgraz {
    @Override // androidx.compose.runtime.bfopjjpdmp
    long ppxfxbqfkf();

    @Override // androidx.compose.runtime.iwxlajgraz
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        wflxmlrfwp(((Number) obj).longValue());
    }

    void tzroggbefp(long j13);

    default void wflxmlrfwp(long j13) {
        tzroggbefp(j13);
    }

    @Override // androidx.compose.runtime.i1
    default Long getValue() {
        return Long.valueOf(ppxfxbqfkf());
    }
}

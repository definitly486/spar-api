package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public interface roivzttewh extends ribwqtqdhb, iwxlajgraz {
    void pkzmftpjix(float f13);

    @Override // androidx.compose.runtime.iwxlajgraz
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        yggfygwlhe(((Number) obj).floatValue());
    }

    default void yggfygwlhe(float f13) {
        pkzmftpjix(f13);
    }

    @Override // androidx.compose.runtime.ribwqtqdhb
    float zoijcleaow();

    @Override // androidx.compose.runtime.i1
    default Float getValue() {
        return Float.valueOf(zoijcleaow());
    }
}

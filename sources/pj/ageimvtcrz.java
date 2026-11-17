package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ageimvtcrz extends pkzmftpjix {
    @Override // pj.pkzmftpjix
    public pkzmftpjix jlmebxxoox(int i13, String str) {
        uj.gtknphoqwx.iobyxmoadg(i13);
        return uj.gtknphoqwx.zoijcleaow(this, str);
    }

    protected final String rlfsiqarku() {
        ageimvtcrz ageimvtcrzVarXrmfcynszj;
        ageimvtcrz ageimvtcrzVarPpxfxbqfkf = ikoacuggdj.ppxfxbqfkf();
        if (this == ageimvtcrzVarPpxfxbqfkf) {
            return "Dispatchers.Main";
        }
        try {
            ageimvtcrzVarXrmfcynszj = ageimvtcrzVarPpxfxbqfkf.xrmfcynszj();
        } catch (UnsupportedOperationException unused) {
            ageimvtcrzVarXrmfcynszj = null;
        }
        if (this == ageimvtcrzVarXrmfcynszj) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract ageimvtcrz xrmfcynszj();
}

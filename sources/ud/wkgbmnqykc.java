package ud;

/* JADX INFO: loaded from: classes2.dex */
public enum wkgbmnqykc implements oc.gxszxtbevo {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f113451zdlpuopuiu;

    wkgbmnqykc(int i13) {
        this.f113451zdlpuopuiu = i13;
    }

    @Override // oc.gxszxtbevo
    public int getNumber() {
        return this.f113451zdlpuopuiu;
    }
}

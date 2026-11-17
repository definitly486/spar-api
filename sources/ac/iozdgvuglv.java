package ac;

/* JADX INFO: loaded from: classes2.dex */
public enum iozdgvuglv {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f1364zdlpuopuiu;

    iozdgvuglv(int i13) {
        this.f1364zdlpuopuiu = i13;
    }

    public static iozdgvuglv wkgbmnqykc(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int lqeggnwhkg() {
        return this.f1364zdlpuopuiu;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f1364zdlpuopuiu);
    }
}

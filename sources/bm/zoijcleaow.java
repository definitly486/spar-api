package bm;

/* JADX INFO: loaded from: classes3.dex */
public enum zoijcleaow {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f16782yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f16783zdlpuopuiu;

    zoijcleaow(int i13, String str) {
        this.f16783zdlpuopuiu = i13;
        this.f16782yggfygwlhe = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f16782yggfygwlhe;
    }
}

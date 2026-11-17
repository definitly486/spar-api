package ud;

/* JADX INFO: loaded from: classes2.dex */
public enum zdlpuopuiu implements oc.gxszxtbevo {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f113464zdlpuopuiu;

    zdlpuopuiu(int i13) {
        this.f113464zdlpuopuiu = i13;
    }

    @Override // oc.gxszxtbevo
    public int getNumber() {
        return this.f113464zdlpuopuiu;
    }
}

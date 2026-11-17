package xf;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements zf.zoijcleaow {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final eablkybsjg f122279jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f122280yggfygwlhe = new Object();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile Object f122281zdlpuopuiu;

    public wkgbmnqykc(eablkybsjg eablkybsjgVar) {
        this.f122279jyumaefscl = eablkybsjgVar;
    }

    @Override // zf.zoijcleaow
    public Object ojitshcjhn() {
        if (this.f122281zdlpuopuiu == null) {
            synchronized (this.f122280yggfygwlhe) {
                try {
                    if (this.f122281zdlpuopuiu == null) {
                        this.f122281zdlpuopuiu = this.f122279jyumaefscl.get();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f122281zdlpuopuiu;
    }
}

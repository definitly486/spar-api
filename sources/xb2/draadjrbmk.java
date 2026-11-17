package xb2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class draadjrbmk implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f122020iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f122021zoijcleaow;

    public draadjrbmk(eablkybsjg deviceIdProvider) {
        zdlpuopuiu.btonecajqb(deviceIdProvider, "deviceIdProvider");
        this.f122020iobyxmoadg = deviceIdProvider;
        this.f122021zoijcleaow = "";
    }

    @Override // xb2.gtknphoqwx
    public String getSessionId() {
        if (this.f122021zoijcleaow.length() == 0) {
            this.f122021zoijcleaow = bc2.ppxfxbqfkf.f15777iobyxmoadg.zoijcleaow() + ' ' + this.f122020iobyxmoadg.iobyxmoadg();
        }
        return this.f122021zoijcleaow;
    }
}

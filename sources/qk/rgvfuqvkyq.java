package qk;

import java.io.IOException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f79053iobyxmoadg;

    public rgvfuqvkyq(agtfadlqog routePlanner) {
        zdlpuopuiu.btonecajqb(routePlanner, "routePlanner");
        this.f79053iobyxmoadg = routePlanner;
    }

    @Override // qk.wkgbmnqykc
    public dxjokdxxww iobyxmoadg() throws Throwable {
        IOException iOException = null;
        while (!zoijcleaow().btonecajqb()) {
            try {
                agtfadlqog.zoijcleaow zoijcleaowVarPpxfxbqfkf = zoijcleaow().ppxfxbqfkf();
                if (!zoijcleaowVarPpxfxbqfkf.ppxfxbqfkf()) {
                    agtfadlqog.iobyxmoadg iobyxmoadgVarNufgyqmvbu = zoijcleaowVarPpxfxbqfkf.nufgyqmvbu();
                    if (iobyxmoadgVarNufgyqmvbu.gxszxtbevo()) {
                        iobyxmoadgVarNufgyqmvbu = zoijcleaowVarPpxfxbqfkf.wkgbmnqykc();
                    }
                    agtfadlqog.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVarNufgyqmvbu.iobyxmoadg();
                    Throwable thZoijcleaow = iobyxmoadgVarNufgyqmvbu.zoijcleaow();
                    if (thZoijcleaow != null) {
                        throw thZoijcleaow;
                    }
                    if (zoijcleaowVarIobyxmoadg != null) {
                        zoijcleaow().zoijcleaow().addFirst(zoijcleaowVarIobyxmoadg);
                    }
                }
                return zoijcleaowVarPpxfxbqfkf.iobyxmoadg();
            } catch (IOException e13) {
                if (iOException == null) {
                    iOException = e13;
                } else {
                    gg.lqeggnwhkg.iobyxmoadg(iOException, e13);
                }
                if (!agtfadlqog.wkgbmnqykc(zoijcleaow(), null, 1, null)) {
                    throw iOException;
                }
            }
        }
        throw new IOException("Canceled");
    }

    @Override // qk.wkgbmnqykc
    public agtfadlqog zoijcleaow() {
        return this.f79053iobyxmoadg;
    }
}

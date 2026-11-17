package rk;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iwizpuwonk;
import lk.zynmafqrjb;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg implements iwizpuwonk.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f82956dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zynmafqrjb f82957eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f82958gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final qk.nufgyqmvbu f82959iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f82960lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f82961nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f82962ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final qk.ppxfxbqfkf f82963wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f82964zoijcleaow;

    public lqeggnwhkg(qk.nufgyqmvbu call, List interceptors, int i13, qk.ppxfxbqfkf ppxfxbqfkfVar, zynmafqrjb request, int i14, int i15, int i16) {
        zdlpuopuiu.btonecajqb(call, "call");
        zdlpuopuiu.btonecajqb(interceptors, "interceptors");
        zdlpuopuiu.btonecajqb(request, "request");
        this.f82959iobyxmoadg = call;
        this.f82964zoijcleaow = interceptors;
        this.f82962ppxfxbqfkf = i13;
        this.f82963wkgbmnqykc = ppxfxbqfkfVar;
        this.f82957eablkybsjg = request;
        this.f82958gxszxtbevo = i14;
        this.f82960lqeggnwhkg = i15;
        this.f82961nufgyqmvbu = i16;
    }

    public static /* synthetic */ lqeggnwhkg lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar, int i13, qk.ppxfxbqfkf ppxfxbqfkfVar, zynmafqrjb zynmafqrjbVar, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = lqeggnwhkgVar.f82962ppxfxbqfkf;
        }
        if ((i17 & 2) != 0) {
            ppxfxbqfkfVar = lqeggnwhkgVar.f82963wkgbmnqykc;
        }
        qk.ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        if ((i17 & 4) != 0) {
            zynmafqrjbVar = lqeggnwhkgVar.f82957eablkybsjg;
        }
        zynmafqrjb zynmafqrjbVar2 = zynmafqrjbVar;
        if ((i17 & 8) != 0) {
            i14 = lqeggnwhkgVar.f82958gxszxtbevo;
        }
        int i18 = i14;
        if ((i17 & 16) != 0) {
            i15 = lqeggnwhkgVar.f82960lqeggnwhkg;
        }
        int i19 = i15;
        if ((i17 & 32) != 0) {
            i16 = lqeggnwhkgVar.f82961nufgyqmvbu;
        }
        return lqeggnwhkgVar.gxszxtbevo(i13, ppxfxbqfkfVar2, zynmafqrjbVar2, i18, i19, i16);
    }

    public int agtfadlqog() {
        return this.f82960lqeggnwhkg;
    }

    public final qk.ppxfxbqfkf btonecajqb() {
        return this.f82963wkgbmnqykc;
    }

    @Override // lk.iwizpuwonk.iobyxmoadg
    public lk.eablkybsjg call() {
        return this.f82959iobyxmoadg;
    }

    public final zynmafqrjb draadjrbmk() {
        return this.f82957eablkybsjg;
    }

    @Override // lk.iwizpuwonk.iobyxmoadg
    public zynmafqrjb dxjokdxxww() {
        return this.f82957eablkybsjg;
    }

    @Override // lk.iwizpuwonk.iobyxmoadg
    public iwizpuwonk.iobyxmoadg eablkybsjg(int i13, TimeUnit unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        if (this.f82963wkgbmnqykc == null) {
            return lqeggnwhkg(this, 0, null, null, 0, rgvfuqvkyq.gxszxtbevo("readTimeout", i13, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public final int gtknphoqwx() {
        return this.f82960lqeggnwhkg;
    }

    public final lqeggnwhkg gxszxtbevo(int i13, qk.ppxfxbqfkf ppxfxbqfkfVar, zynmafqrjb request, int i14, int i15, int i16) {
        zdlpuopuiu.btonecajqb(request, "request");
        return new lqeggnwhkg(this.f82959iobyxmoadg, this.f82964zoijcleaow, i13, ppxfxbqfkfVar, request, i14, i15, i16);
    }

    @Override // lk.iwizpuwonk.iobyxmoadg
    public iwizpuwonk.iobyxmoadg iobyxmoadg(int i13, TimeUnit unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        if (this.f82963wkgbmnqykc == null) {
            return lqeggnwhkg(this, 0, null, null, rgvfuqvkyq.gxszxtbevo("connectTimeout", i13, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public final qk.nufgyqmvbu nufgyqmvbu() {
        return this.f82959iobyxmoadg;
    }

    @Override // lk.iwizpuwonk.iobyxmoadg
    public iwizpuwonk.iobyxmoadg ppxfxbqfkf(int i13, TimeUnit unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        if (this.f82963wkgbmnqykc == null) {
            return lqeggnwhkg(this, 0, null, null, 0, 0, rgvfuqvkyq.gxszxtbevo("writeTimeout", i13, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public final int wflxmlrfwp() {
        return this.f82961nufgyqmvbu;
    }

    @Override // lk.iwizpuwonk.iobyxmoadg
    public lk.btonecajqb wkgbmnqykc() {
        qk.ppxfxbqfkf ppxfxbqfkfVar = this.f82963wkgbmnqykc;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar.nufgyqmvbu();
        }
        return null;
    }

    @Override // lk.iwizpuwonk.iobyxmoadg
    public cdpycssgdh zoijcleaow(zynmafqrjb request) {
        zdlpuopuiu.btonecajqb(request, "request");
        if (this.f82962ppxfxbqfkf >= this.f82964zoijcleaow.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f82956dxjokdxxww++;
        qk.ppxfxbqfkf ppxfxbqfkfVar = this.f82963wkgbmnqykc;
        if (ppxfxbqfkfVar != null) {
            if (!ppxfxbqfkfVar.btonecajqb().zoijcleaow().eablkybsjg(request.gtknphoqwx())) {
                throw new IllegalStateException(("network interceptor " + this.f82964zoijcleaow.get(this.f82962ppxfxbqfkf - 1) + " must retain the same host and port").toString());
            }
            if (this.f82956dxjokdxxww != 1) {
                throw new IllegalStateException(("network interceptor " + this.f82964zoijcleaow.get(this.f82962ppxfxbqfkf - 1) + " must call proceed() exactly once").toString());
            }
        }
        lqeggnwhkg lqeggnwhkgVarLqeggnwhkg = lqeggnwhkg(this, this.f82962ppxfxbqfkf + 1, null, request, 0, 0, 0, 58, null);
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) this.f82964zoijcleaow.get(this.f82962ppxfxbqfkf);
        cdpycssgdh cdpycssgdhVarIntercept = iwizpuwonkVar.intercept(lqeggnwhkgVarLqeggnwhkg);
        if (cdpycssgdhVarIntercept == null) {
            throw new NullPointerException("interceptor " + iwizpuwonkVar + " returned null");
        }
        if (this.f82963wkgbmnqykc == null || this.f82962ppxfxbqfkf + 1 >= this.f82964zoijcleaow.size() || lqeggnwhkgVarLqeggnwhkg.f82956dxjokdxxww == 1) {
            return cdpycssgdhVarIntercept;
        }
        throw new IllegalStateException(("network interceptor " + iwizpuwonkVar + " must call proceed() exactly once").toString());
    }
}

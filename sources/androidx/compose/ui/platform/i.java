package androidx.compose.ui.platform;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements z.iyctptxqzt {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private g0.btonecajqb f6963cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private g0.btonecajqb f6964esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Float f6965iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Float f6966jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f6967yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f6968zdlpuopuiu;

    public i(int i13, List list, Float f13, Float f14, g0.btonecajqb btonecajqbVar, g0.btonecajqb btonecajqbVar2) {
        this.f6968zdlpuopuiu = i13;
        this.f6967yggfygwlhe = list;
        this.f6966jyumaefscl = f13;
        this.f6965iwizpuwonk = f14;
        this.f6963cqumvgiudr = btonecajqbVar;
        this.f6964esjtqupxsv = btonecajqbVar2;
    }

    public final void dxjokdxxww(g0.btonecajqb btonecajqbVar) {
        this.f6964esjtqupxsv = btonecajqbVar;
    }

    public final g0.btonecajqb eablkybsjg() {
        return this.f6964esjtqupxsv;
    }

    public final void gxszxtbevo(g0.btonecajqb btonecajqbVar) {
        this.f6963cqumvgiudr = btonecajqbVar;
    }

    public final g0.btonecajqb iobyxmoadg() {
        return this.f6963cqumvgiudr;
    }

    @Override // z.iyctptxqzt
    public boolean j() {
        return this.f6967yggfygwlhe.contains(this);
    }

    public final void lqeggnwhkg(Float f13) {
        this.f6966jyumaefscl = f13;
    }

    public final void nufgyqmvbu(Float f13) {
        this.f6965iwizpuwonk = f13;
    }

    public final Float ppxfxbqfkf() {
        return this.f6965iwizpuwonk;
    }

    public final int wkgbmnqykc() {
        return this.f6968zdlpuopuiu;
    }

    public final Float zoijcleaow() {
        return this.f6966jyumaefscl;
    }
}

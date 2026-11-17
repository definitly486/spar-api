package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j0.f f73908iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private x.rgvfuqvkyq f73909ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private x.rgvfuqvkyq f73910zoijcleaow;

    public p0(j0.f fVar, x.rgvfuqvkyq rgvfuqvkyqVar, x.rgvfuqvkyq rgvfuqvkyqVar2) {
        this.f73908iobyxmoadg = fVar;
        this.f73910zoijcleaow = rgvfuqvkyqVar;
        this.f73909ppxfxbqfkf = rgvfuqvkyqVar2;
    }

    public static /* synthetic */ int eablkybsjg(p0 p0Var, long j13, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return p0Var.wkgbmnqykc(j13, z13);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    private final long iobyxmoadg(long j13) {
        g.lqeggnwhkg lqeggnwhkgVarIobyxmoadg;
        x.rgvfuqvkyq rgvfuqvkyqVar = this.f73910zoijcleaow;
        if (rgvfuqvkyqVar == null) {
            lqeggnwhkgVarIobyxmoadg = g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg();
        } else {
            if (rgvfuqvkyqVar.gxszxtbevo()) {
                x.rgvfuqvkyq rgvfuqvkyqVar2 = this.f73909ppxfxbqfkf;
                lqeggnwhkgVarIobyxmoadg = null;
                if (rgvfuqvkyqVar2 != null) {
                    lqeggnwhkgVarIobyxmoadg = x.rgvfuqvkyq.cdpycssgdh(rgvfuqvkyqVar2, rgvfuqvkyqVar, false, 2, null);
                }
            } else {
                lqeggnwhkgVarIobyxmoadg = g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg();
            }
            if (lqeggnwhkgVarIobyxmoadg == null) {
                lqeggnwhkgVarIobyxmoadg = g.lqeggnwhkg.f35592eablkybsjg.iobyxmoadg();
            }
        }
        return q0.zoijcleaow(j13, lqeggnwhkgVarIobyxmoadg);
    }

    public final long btonecajqb(long j13) {
        x.rgvfuqvkyq rgvfuqvkyqVar;
        x.rgvfuqvkyq rgvfuqvkyqVar2 = this.f73910zoijcleaow;
        if (rgvfuqvkyqVar2 == null) {
            return j13;
        }
        if (!rgvfuqvkyqVar2.gxszxtbevo()) {
            rgvfuqvkyqVar2 = null;
        }
        if (rgvfuqvkyqVar2 == null || (rgvfuqvkyqVar = this.f73909ppxfxbqfkf) == null) {
            return j13;
        }
        x.rgvfuqvkyq rgvfuqvkyqVar3 = rgvfuqvkyqVar.gxszxtbevo() ? rgvfuqvkyqVar : null;
        return rgvfuqvkyqVar3 == null ? j13 : rgvfuqvkyqVar2.oipsdeybqn(rgvfuqvkyqVar3, j13);
    }

    public final void dxjokdxxww(x.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f73910zoijcleaow = rgvfuqvkyqVar;
    }

    public final long gtknphoqwx(long j13) {
        x.rgvfuqvkyq rgvfuqvkyqVar;
        x.rgvfuqvkyq rgvfuqvkyqVar2 = this.f73910zoijcleaow;
        if (rgvfuqvkyqVar2 == null) {
            return j13;
        }
        if (!rgvfuqvkyqVar2.gxszxtbevo()) {
            rgvfuqvkyqVar2 = null;
        }
        if (rgvfuqvkyqVar2 == null || (rgvfuqvkyqVar = this.f73909ppxfxbqfkf) == null) {
            return j13;
        }
        x.rgvfuqvkyq rgvfuqvkyqVar3 = rgvfuqvkyqVar.gxszxtbevo() ? rgvfuqvkyqVar : null;
        return rgvfuqvkyqVar3 == null ? j13 : rgvfuqvkyqVar3.oipsdeybqn(rgvfuqvkyqVar2, j13);
    }

    public final j0.f gxszxtbevo() {
        return this.f73908iobyxmoadg;
    }

    public final boolean lqeggnwhkg(long j13) {
        long jBtonecajqb = btonecajqb(iobyxmoadg(j13));
        int iOxmwwwfdhm = this.f73908iobyxmoadg.oxmwwwfdhm(Float.intBitsToFloat((int) (4294967295L & jBtonecajqb)));
        int i13 = (int) (jBtonecajqb >> 32);
        return Float.intBitsToFloat(i13) >= this.f73908iobyxmoadg.kcexrzcfyt(iOxmwwwfdhm) && Float.intBitsToFloat(i13) <= this.f73908iobyxmoadg.zdlpuopuiu(iOxmwwwfdhm);
    }

    public final void nufgyqmvbu(x.rgvfuqvkyq rgvfuqvkyqVar) {
        this.f73909ppxfxbqfkf = rgvfuqvkyqVar;
    }

    public final x.rgvfuqvkyq ppxfxbqfkf() {
        return this.f73910zoijcleaow;
    }

    public final int wkgbmnqykc(long j13, boolean z13) {
        if (z13) {
            j13 = iobyxmoadg(j13);
        }
        return this.f73908iobyxmoadg.cqumvgiudr(btonecajqb(j13));
    }

    public final x.rgvfuqvkyq zoijcleaow() {
        return this.f73909ppxfxbqfkf;
    }

    public /* synthetic */ p0(j0.f fVar, x.rgvfuqvkyq rgvfuqvkyqVar, x.rgvfuqvkyq rgvfuqvkyqVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(fVar, (i13 & 2) != 0 ? null : rgvfuqvkyqVar, (i13 & 4) != 0 ? null : rgvfuqvkyqVar2);
    }
}

package z;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f127211iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final agtfadlqog f127212ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f127213zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f127214iobyxmoadg;

        static {
            int[] iArr = new int[zynmafqrjb.values().length];
            try {
                iArr[zynmafqrjb.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zynmafqrjb.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zynmafqrjb.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zynmafqrjb.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f127214iobyxmoadg = iArr;
        }
    }

    public rgvfuqvkyq(boolean z13) {
        this.f127211iobyxmoadg = new agtfadlqog(z13);
        this.f127213zoijcleaow = new agtfadlqog(z13);
        this.f127212ppxfxbqfkf = new agtfadlqog(z13);
    }

    public final boolean btonecajqb(pkzmftpjix pkzmftpjixVar) {
        return this.f127212ppxfxbqfkf.eablkybsjg(pkzmftpjixVar) || this.f127211iobyxmoadg.eablkybsjg(pkzmftpjixVar) || this.f127213zoijcleaow.eablkybsjg(pkzmftpjixVar);
    }

    public final boolean dxjokdxxww() {
        return !nufgyqmvbu();
    }

    public final boolean eablkybsjg(pkzmftpjix pkzmftpjixVar) {
        return this.f127211iobyxmoadg.zoijcleaow(pkzmftpjixVar) || this.f127213zoijcleaow.zoijcleaow(pkzmftpjixVar) || this.f127212ppxfxbqfkf.zoijcleaow(pkzmftpjixVar);
    }

    public final boolean gxszxtbevo(pkzmftpjix pkzmftpjixVar, boolean z13) {
        boolean z14 = pkzmftpjixVar.uwvvkdfqfp() == null;
        boolean z15 = this.f127211iobyxmoadg.zoijcleaow(pkzmftpjixVar) || this.f127213zoijcleaow.zoijcleaow(pkzmftpjixVar);
        if (z13) {
            if (z14 || !z15) {
                return false;
            }
        } else if ((!z14 || !z15) && !this.f127212ppxfxbqfkf.zoijcleaow(pkzmftpjixVar)) {
            return false;
        }
        return true;
    }

    public final boolean lqeggnwhkg() {
        return (this.f127212ppxfxbqfkf.ppxfxbqfkf() || this.f127211iobyxmoadg.ppxfxbqfkf()) ? false : true;
    }

    public final boolean nufgyqmvbu() {
        return this.f127211iobyxmoadg.ppxfxbqfkf() && this.f127212ppxfxbqfkf.ppxfxbqfkf() && this.f127213zoijcleaow.ppxfxbqfkf();
    }

    public final void wkgbmnqykc(pkzmftpjix pkzmftpjixVar, zynmafqrjb zynmafqrjbVar) {
        int i13 = iobyxmoadg.f127214iobyxmoadg[zynmafqrjbVar.ordinal()];
        if (i13 == 1) {
            this.f127211iobyxmoadg.iobyxmoadg(pkzmftpjixVar);
            this.f127212ppxfxbqfkf.iobyxmoadg(pkzmftpjixVar);
            return;
        }
        if (i13 == 2) {
            this.f127213zoijcleaow.iobyxmoadg(pkzmftpjixVar);
            this.f127212ppxfxbqfkf.iobyxmoadg(pkzmftpjixVar);
            return;
        }
        if (i13 == 3) {
            if (pkzmftpjixVar.uwvvkdfqfp() != null) {
                this.f127212ppxfxbqfkf.iobyxmoadg(pkzmftpjixVar);
                return;
            } else {
                this.f127211iobyxmoadg.iobyxmoadg(pkzmftpjixVar);
                return;
            }
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (pkzmftpjixVar.uwvvkdfqfp() != null) {
            this.f127212ppxfxbqfkf.iobyxmoadg(pkzmftpjixVar);
        } else {
            this.f127213zoijcleaow.iobyxmoadg(pkzmftpjixVar);
        }
    }
}

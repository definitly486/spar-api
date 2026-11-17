package v3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import t3.dsvhmnatus;
import t3.hcddaimhww;
import t3.pkzmftpjix;
import t3.vdvldrhtss;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int[] f115858agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f115859btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f115860draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f115861dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f115862eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f115863gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f115864gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f115865iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f115866lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f115867nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f115868ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long[] f115869wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f115870wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dsvhmnatus f115871zoijcleaow;

    public eablkybsjg(int i13, wkgbmnqykc wkgbmnqykcVar, dsvhmnatus dsvhmnatusVar) {
        this.f115865iobyxmoadg = wkgbmnqykcVar;
        int iZoijcleaow = wkgbmnqykcVar.zoijcleaow();
        boolean z13 = true;
        if (iZoijcleaow != 1 && iZoijcleaow != 2) {
            z13 = false;
        }
        y2.iobyxmoadg.iobyxmoadg(z13);
        this.f115868ppxfxbqfkf = wkgbmnqykc(i13, iZoijcleaow == 2 ? 1667497984 : 1651965952);
        this.f115862eablkybsjg = wkgbmnqykcVar.iobyxmoadg();
        this.f115871zoijcleaow = dsvhmnatusVar;
        this.f115870wkgbmnqykc = iZoijcleaow == 2 ? wkgbmnqykc(i13, 1650720768) : -1;
        this.f115860draadjrbmk = -1L;
        this.f115869wflxmlrfwp = new long[UserVerificationMethods.USER_VERIFY_NONE];
        this.f115858agtfadlqog = new int[UserVerificationMethods.USER_VERIFY_NONE];
        this.f115864gxszxtbevo = wkgbmnqykcVar.f115880eablkybsjg;
    }

    private long eablkybsjg(int i13) {
        return (this.f115862eablkybsjg * ((long) i13)) / ((long) this.f115864gxszxtbevo);
    }

    private hcddaimhww nufgyqmvbu(int i13) {
        return new hcddaimhww(((long) this.f115858agtfadlqog[i13]) * lqeggnwhkg(), this.f115869wflxmlrfwp[i13]);
    }

    private static int wkgbmnqykc(int i13, int i14) {
        return (((i13 % 10) + 48) << 8) | ((i13 / 10) + 48) | i14;
    }

    public void agtfadlqog(int i13) {
        this.f115866lqeggnwhkg = i13;
        this.f115867nufgyqmvbu = i13;
    }

    public boolean btonecajqb(int i13) {
        return this.f115868ppxfxbqfkf == i13 || this.f115870wkgbmnqykc == i13;
    }

    public boolean draadjrbmk() {
        return Arrays.binarySearch(this.f115858agtfadlqog, this.f115861dxjokdxxww) >= 0;
    }

    public pkzmftpjix.iobyxmoadg dxjokdxxww(long j13) {
        if (this.f115863gtknphoqwx == 0) {
            return new pkzmftpjix.iobyxmoadg(new hcddaimhww(0L, this.f115860draadjrbmk));
        }
        int iLqeggnwhkg = (int) (j13 / lqeggnwhkg());
        int iGxszxtbevo = stevsuqkhv.gxszxtbevo(this.f115858agtfadlqog, iLqeggnwhkg, true, true);
        if (this.f115858agtfadlqog[iGxszxtbevo] == iLqeggnwhkg) {
            return new pkzmftpjix.iobyxmoadg(nufgyqmvbu(iGxszxtbevo));
        }
        hcddaimhww hcddaimhwwVarNufgyqmvbu = nufgyqmvbu(iGxszxtbevo);
        int i13 = iGxszxtbevo + 1;
        return i13 < this.f115869wflxmlrfwp.length ? new pkzmftpjix.iobyxmoadg(hcddaimhwwVarNufgyqmvbu, nufgyqmvbu(i13)) : new pkzmftpjix.iobyxmoadg(hcddaimhwwVarNufgyqmvbu);
    }

    public boolean gtknphoqwx() {
        return (this.f115868ppxfxbqfkf & 1651965952) == 1651965952;
    }

    public long gxszxtbevo() {
        return eablkybsjg(this.f115861dxjokdxxww);
    }

    public void iobyxmoadg() {
        this.f115861dxjokdxxww++;
    }

    public long lqeggnwhkg() {
        return eablkybsjg(1);
    }

    public void ojitshcjhn(long j13) {
        if (this.f115863gtknphoqwx == 0) {
            this.f115861dxjokdxxww = 0;
        } else {
            this.f115861dxjokdxxww = this.f115858agtfadlqog[stevsuqkhv.lqeggnwhkg(this.f115869wflxmlrfwp, j13, true, true)];
        }
    }

    public void ppxfxbqfkf() {
        int i13;
        this.f115869wflxmlrfwp = Arrays.copyOf(this.f115869wflxmlrfwp, this.f115863gtknphoqwx);
        this.f115858agtfadlqog = Arrays.copyOf(this.f115858agtfadlqog, this.f115863gtknphoqwx);
        if (!gtknphoqwx() || this.f115865iobyxmoadg.f115883lqeggnwhkg == 0 || (i13 = this.f115863gtknphoqwx) <= 0) {
            return;
        }
        this.f115864gxszxtbevo = i13;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean wflxmlrfwp(vdvldrhtss vdvldrhtssVar) {
        int i13 = this.f115867nufgyqmvbu;
        int iGxszxtbevo = i13 - this.f115871zoijcleaow.gxszxtbevo(vdvldrhtssVar, i13, false);
        this.f115867nufgyqmvbu = iGxszxtbevo;
        boolean z13 = iGxszxtbevo == 0;
        if (z13) {
            if (this.f115866lqeggnwhkg > 0) {
                this.f115871zoijcleaow.zoijcleaow(gxszxtbevo(), draadjrbmk() ? 1 : 0, this.f115866lqeggnwhkg, 0, null);
            }
            iobyxmoadg();
        }
        return z13;
    }

    public void zoijcleaow(long j13, boolean z13) {
        if (this.f115860draadjrbmk == -1) {
            this.f115860draadjrbmk = j13;
        }
        if (z13) {
            if (this.f115863gtknphoqwx == this.f115858agtfadlqog.length) {
                long[] jArr = this.f115869wflxmlrfwp;
                this.f115869wflxmlrfwp = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f115858agtfadlqog;
                this.f115858agtfadlqog = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f115869wflxmlrfwp;
            int i13 = this.f115863gtknphoqwx;
            jArr2[i13] = j13;
            this.f115858agtfadlqog[i13] = this.f115859btonecajqb;
            this.f115863gtknphoqwx = i13 + 1;
        }
        this.f115859btonecajqb++;
    }
}

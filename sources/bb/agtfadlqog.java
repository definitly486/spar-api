package bb;

import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nb.cdpycssgdh;
import nb.istkbnxepw;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw f15613iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lb.iobyxmoadg f15614ppxfxbqfkf = lb.iobyxmoadg.f62024zoijcleaow;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f15615zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f15616iobyxmoadg;

        static {
            int[] iArr = new int[nb.lereixgezr.values().length];
            f15616iobyxmoadg = iArr;
            try {
                iArr[nb.lereixgezr.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15616iobyxmoadg[nb.lereixgezr.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15616iobyxmoadg[nb.lereixgezr.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lqeggnwhkg f15617iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f15618ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f15619wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gtknphoqwx f15620zoijcleaow;

        /* synthetic */ zoijcleaow(lqeggnwhkg lqeggnwhkgVar, gtknphoqwx gtknphoqwxVar, int i13, boolean z13, iobyxmoadg iobyxmoadgVar) {
            this(lqeggnwhkgVar, gtknphoqwxVar, i13, z13);
        }

        public lqeggnwhkg iobyxmoadg() {
            return this.f15617iobyxmoadg;
        }

        private zoijcleaow(lqeggnwhkg lqeggnwhkgVar, gtknphoqwx gtknphoqwxVar, int i13, boolean z13) {
            this.f15617iobyxmoadg = lqeggnwhkgVar;
            this.f15620zoijcleaow = gtknphoqwxVar;
            this.f15618ppxfxbqfkf = i13;
            this.f15619wkgbmnqykc = z13;
        }
    }

    private agtfadlqog(istkbnxepw istkbnxepwVar, List list) {
        this.f15613iobyxmoadg = istkbnxepwVar;
        this.f15615zoijcleaow = list;
    }

    public static final agtfadlqog agtfadlqog(rgvfuqvkyq rgvfuqvkyqVar, bb.iobyxmoadg iobyxmoadgVar) {
        return ojitshcjhn(rgvfuqvkyqVar, iobyxmoadgVar, new byte[0]);
    }

    private static Object btonecajqb(istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar, Class cls) throws GeneralSecurityException {
        try {
            return cqumvgiudr.lqeggnwhkg(ppxfxbqfkfVar.mbcevpiqjq(), cls);
        } catch (GeneralSecurityException e13) {
            if (e13.getMessage().contains("No key manager found for key type ") || e13.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e13;
        }
    }

    private Object draadjrbmk(Class cls, Class cls2) throws GeneralSecurityException {
        lereixgezr.wkgbmnqykc(this.f15613iobyxmoadg);
        jyumaefscl.zoijcleaow zoijcleaowVarBtonecajqb = jyumaefscl.btonecajqb(cls2);
        zoijcleaowVarBtonecajqb.eablkybsjg(this.f15614ppxfxbqfkf);
        for (int i13 = 0; i13 < rgvfuqvkyq(); i13++) {
            istkbnxepw.ppxfxbqfkf ppxfxbqfkfVarMbcevpiqjq = this.f15613iobyxmoadg.mbcevpiqjq(i13);
            if (ppxfxbqfkfVarMbcevpiqjq.sopmlzcsov().equals(nb.lereixgezr.ENABLED)) {
                Object objBtonecajqb = btonecajqb(ppxfxbqfkfVarMbcevpiqjq, cls2);
                Object objLqeggnwhkg = this.f15615zoijcleaow.get(i13) != null ? lqeggnwhkg(((zoijcleaow) this.f15615zoijcleaow.get(i13)).iobyxmoadg(), cls2) : null;
                if (ppxfxbqfkfVarMbcevpiqjq.ntlheqmsrt() == this.f15613iobyxmoadg.sopmlzcsov()) {
                    zoijcleaowVarBtonecajqb.zoijcleaow(objLqeggnwhkg, objBtonecajqb, ppxfxbqfkfVarMbcevpiqjq);
                } else {
                    zoijcleaowVarBtonecajqb.iobyxmoadg(objLqeggnwhkg, objBtonecajqb, ppxfxbqfkfVarMbcevpiqjq);
                }
            }
        }
        return cqumvgiudr.ojitshcjhn(zoijcleaowVarBtonecajqb.wkgbmnqykc(), cls);
    }

    static final agtfadlqog eablkybsjg(istkbnxepw istkbnxepwVar) throws GeneralSecurityException {
        zoijcleaow(istkbnxepwVar);
        return new agtfadlqog(istkbnxepwVar, gxszxtbevo(istkbnxepwVar));
    }

    private static List gxszxtbevo(istkbnxepw istkbnxepwVar) {
        ArrayList arrayList = new ArrayList(istkbnxepwVar.ntlheqmsrt());
        for (istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar : istkbnxepwVar.ulzqkzuiru()) {
            int iNtlheqmsrt = ppxfxbqfkfVar.ntlheqmsrt();
            try {
                arrayList.add(new zoijcleaow(com.google.crypto.tink.internal.dxjokdxxww.iobyxmoadg().wkgbmnqykc(vdvldrhtss(ppxfxbqfkfVar), gxszxtbevo.iobyxmoadg()), wflxmlrfwp(ppxfxbqfkfVar.sopmlzcsov()), iNtlheqmsrt, iNtlheqmsrt == istkbnxepwVar.sopmlzcsov(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void iobyxmoadg(nb.zdlpuopuiu zdlpuopuiuVar) throws GeneralSecurityException {
        if (zdlpuopuiuVar == null || zdlpuopuiuVar.kegysxyocb().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private Object lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar, Class cls) {
        try {
            return cqumvgiudr.ppxfxbqfkf(lqeggnwhkgVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static final agtfadlqog ojitshcjhn(rgvfuqvkyq rgvfuqvkyqVar, bb.iobyxmoadg iobyxmoadgVar, byte[] bArr) throws GeneralSecurityException {
        nb.zdlpuopuiu zdlpuopuiuVarIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg();
        iobyxmoadg(zdlpuopuiuVarIobyxmoadg);
        return eablkybsjg(ppxfxbqfkf(zdlpuopuiuVarIobyxmoadg, iobyxmoadgVar, bArr));
    }

    private static istkbnxepw ppxfxbqfkf(nb.zdlpuopuiu zdlpuopuiuVar, bb.iobyxmoadg iobyxmoadgVar, byte[] bArr) throws GeneralSecurityException {
        try {
            istkbnxepw istkbnxepwVarRibwqtqdhb = istkbnxepw.ribwqtqdhb(iobyxmoadgVar.zoijcleaow(zdlpuopuiuVar.kegysxyocb().zynmafqrjb(), bArr), com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
            zoijcleaow(istkbnxepwVarRibwqtqdhb);
            return istkbnxepwVarRibwqtqdhb;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static com.google.crypto.tink.internal.ojitshcjhn vdvldrhtss(istkbnxepw.ppxfxbqfkf ppxfxbqfkfVar) {
        try {
            return com.google.crypto.tink.internal.ojitshcjhn.zoijcleaow(ppxfxbqfkfVar.mbcevpiqjq().ntlheqmsrt(), ppxfxbqfkfVar.mbcevpiqjq().ulzqkzuiru(), ppxfxbqfkfVar.mbcevpiqjq().mbcevpiqjq(), ppxfxbqfkfVar.ulzqkzuiru(), ppxfxbqfkfVar.ulzqkzuiru() == ylkuphrtab.RAW ? null : Integer.valueOf(ppxfxbqfkfVar.ntlheqmsrt()));
        } catch (GeneralSecurityException e13) {
            throw new TinkBugException("Creating a protokey serialization failed", e13);
        }
    }

    private static gtknphoqwx wflxmlrfwp(nb.lereixgezr lereixgezrVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f15616iobyxmoadg[lereixgezrVar.ordinal()];
        if (i13 == 1) {
            return gtknphoqwx.f15645zoijcleaow;
        }
        if (i13 == 2) {
            return gtknphoqwx.f15643ppxfxbqfkf;
        }
        if (i13 == 3) {
            return gtknphoqwx.f15644wkgbmnqykc;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    private static nb.zdlpuopuiu wkgbmnqykc(istkbnxepw istkbnxepwVar, bb.iobyxmoadg iobyxmoadgVar, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrIobyxmoadg = iobyxmoadgVar.iobyxmoadg(istkbnxepwVar.toByteArray(), bArr);
        try {
            if (istkbnxepw.ribwqtqdhb(iobyxmoadgVar.zoijcleaow(bArrIobyxmoadg, bArr), com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow()).equals(istkbnxepwVar)) {
                return (nb.zdlpuopuiu) nb.zdlpuopuiu.tzroggbefp().agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(bArrIobyxmoadg)).ojitshcjhn(lereixgezr.zoijcleaow(istkbnxepwVar)).ppxfxbqfkf();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static void zoijcleaow(istkbnxepw istkbnxepwVar) throws GeneralSecurityException {
        if (istkbnxepwVar == null || istkbnxepwVar.ntlheqmsrt() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public cdpycssgdh dxjokdxxww() {
        return lereixgezr.zoijcleaow(this.f15613iobyxmoadg);
    }

    public Object gtknphoqwx(Class cls) throws GeneralSecurityException {
        Class clsWkgbmnqykc = cqumvgiudr.wkgbmnqykc(cls);
        if (clsWkgbmnqykc != null) {
            return draadjrbmk(cls, clsWkgbmnqykc);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void kcexrzcfyt(vdvldrhtss vdvldrhtssVar, bb.iobyxmoadg iobyxmoadgVar, byte[] bArr) {
        vdvldrhtssVar.zoijcleaow(wkgbmnqykc(this.f15613iobyxmoadg, iobyxmoadgVar, bArr));
    }

    istkbnxepw nufgyqmvbu() {
        return this.f15613iobyxmoadg;
    }

    public void oxmwwwfdhm(vdvldrhtss vdvldrhtssVar, bb.iobyxmoadg iobyxmoadgVar) {
        kcexrzcfyt(vdvldrhtssVar, iobyxmoadgVar, new byte[0]);
    }

    public int rgvfuqvkyq() {
        return this.f15613iobyxmoadg.ntlheqmsrt();
    }

    public String toString() {
        return dxjokdxxww().toString();
    }
}

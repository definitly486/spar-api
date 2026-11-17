package cb;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
abstract class agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.zoijcleaow f19388eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final pb.iobyxmoadg f19389iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.btonecajqb f19390ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.ppxfxbqfkf f19391wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.gtknphoqwx f19392zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f19393iobyxmoadg;

        static {
            int[] iArr = new int[nb.ylkuphrtab.values().length];
            f19393iobyxmoadg = iArr;
            try {
                iArr[nb.ylkuphrtab.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19393iobyxmoadg[nb.ylkuphrtab.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19393iobyxmoadg[nb.ylkuphrtab.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19393iobyxmoadg[nb.ylkuphrtab.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        pb.iobyxmoadg iobyxmoadgVarEablkybsjg = com.google.crypto.tink.internal.kcexrzcfyt.eablkybsjg("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f19389iobyxmoadg = iobyxmoadgVarEablkybsjg;
        f19392zoijcleaow = com.google.crypto.tink.internal.gtknphoqwx.iobyxmoadg(new btonecajqb(), dxjokdxxww.class, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f19390ppxfxbqfkf = com.google.crypto.tink.internal.btonecajqb.iobyxmoadg(new gtknphoqwx(), iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f19391wkgbmnqykc = com.google.crypto.tink.internal.ppxfxbqfkf.iobyxmoadg(new draadjrbmk(), lqeggnwhkg.class, com.google.crypto.tink.internal.ojitshcjhn.class);
        f19388eablkybsjg = com.google.crypto.tink.internal.zoijcleaow.iobyxmoadg(new com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow() { // from class: cb.wflxmlrfwp
            @Override // com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow
            public final bb.lqeggnwhkg iobyxmoadg(com.google.crypto.tink.internal.vdvldrhtss vdvldrhtssVar, bb.esjtqupxsv esjtqupxsvVar) {
                return agtfadlqog.zoijcleaow((com.google.crypto.tink.internal.ojitshcjhn) vdvldrhtssVar, esjtqupxsvVar);
            }
        }, iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.ojitshcjhn.class);
    }

    private static dxjokdxxww.ppxfxbqfkf eablkybsjg(nb.ylkuphrtab ylkuphrtabVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f19393iobyxmoadg[ylkuphrtabVar.ordinal()];
        if (i13 == 1) {
            return dxjokdxxww.ppxfxbqfkf.f19407zoijcleaow;
        }
        if (i13 == 2 || i13 == 3) {
            return dxjokdxxww.ppxfxbqfkf.f19405ppxfxbqfkf;
        }
        if (i13 == 4) {
            return dxjokdxxww.ppxfxbqfkf.f19406wkgbmnqykc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ylkuphrtabVar.getNumber());
    }

    public static void ppxfxbqfkf() {
        wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww.iobyxmoadg());
    }

    public static void wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.nufgyqmvbu(f19392zoijcleaow);
        dxjokdxxwwVar.lqeggnwhkg(f19390ppxfxbqfkf);
        dxjokdxxwwVar.gxszxtbevo(f19391wkgbmnqykc);
        dxjokdxxwwVar.eablkybsjg(f19388eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static lqeggnwhkg zoijcleaow(com.google.crypto.tink.internal.ojitshcjhn ojitshcjhnVar, bb.esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        if (!ojitshcjhnVar.gxszxtbevo().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            nb.dxjokdxxww dxjokdxxwwVarSopmlzcsov = nb.dxjokdxxww.sopmlzcsov(ojitshcjhnVar.lqeggnwhkg(), com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
            if (dxjokdxxwwVarSopmlzcsov.ntlheqmsrt() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return lqeggnwhkg.iobyxmoadg().eablkybsjg(dxjokdxxww.iobyxmoadg().ppxfxbqfkf(dxjokdxxwwVarSopmlzcsov.tzroggbefp().size()).zoijcleaow(dxjokdxxwwVarSopmlzcsov.mbcevpiqjq().kegysxyocb()).wkgbmnqykc(16).eablkybsjg(eablkybsjg(ojitshcjhnVar.eablkybsjg())).iobyxmoadg()).wkgbmnqykc(pb.zoijcleaow.iobyxmoadg(dxjokdxxwwVarSopmlzcsov.tzroggbefp().zynmafqrjb(), bb.esjtqupxsv.zoijcleaow(esjtqupxsvVar))).ppxfxbqfkf(ojitshcjhnVar.ppxfxbqfkf()).iobyxmoadg();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }
}

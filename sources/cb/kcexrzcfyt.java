package cb;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.zoijcleaow f19451eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final pb.iobyxmoadg f19452iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.btonecajqb f19453ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.ppxfxbqfkf f19454wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.gtknphoqwx f19455zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f19456iobyxmoadg;

        static {
            int[] iArr = new int[nb.ylkuphrtab.values().length];
            f19456iobyxmoadg = iArr;
            try {
                iArr[nb.ylkuphrtab.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19456iobyxmoadg[nb.ylkuphrtab.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19456iobyxmoadg[nb.ylkuphrtab.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19456iobyxmoadg[nb.ylkuphrtab.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        pb.iobyxmoadg iobyxmoadgVarEablkybsjg = com.google.crypto.tink.internal.kcexrzcfyt.eablkybsjg("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f19452iobyxmoadg = iobyxmoadgVarEablkybsjg;
        f19455zoijcleaow = com.google.crypto.tink.internal.gtknphoqwx.iobyxmoadg(new btonecajqb(), vdvldrhtss.class, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f19453ppxfxbqfkf = com.google.crypto.tink.internal.btonecajqb.iobyxmoadg(new gtknphoqwx(), iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f19454wkgbmnqykc = com.google.crypto.tink.internal.ppxfxbqfkf.iobyxmoadg(new draadjrbmk(), ojitshcjhn.class, com.google.crypto.tink.internal.ojitshcjhn.class);
        f19451eablkybsjg = com.google.crypto.tink.internal.zoijcleaow.iobyxmoadg(new com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow() { // from class: cb.oxmwwwfdhm
            @Override // com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow
            public final bb.lqeggnwhkg iobyxmoadg(com.google.crypto.tink.internal.vdvldrhtss vdvldrhtssVar, bb.esjtqupxsv esjtqupxsvVar) {
                return kcexrzcfyt.zoijcleaow((com.google.crypto.tink.internal.ojitshcjhn) vdvldrhtssVar, esjtqupxsvVar);
            }
        }, iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.ojitshcjhn.class);
    }

    private static vdvldrhtss.ppxfxbqfkf eablkybsjg(nb.ylkuphrtab ylkuphrtabVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f19456iobyxmoadg[ylkuphrtabVar.ordinal()];
        if (i13 == 1) {
            return vdvldrhtss.ppxfxbqfkf.f19489zoijcleaow;
        }
        if (i13 == 2 || i13 == 3) {
            return vdvldrhtss.ppxfxbqfkf.f19487ppxfxbqfkf;
        }
        if (i13 == 4) {
            return vdvldrhtss.ppxfxbqfkf.f19488wkgbmnqykc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ylkuphrtabVar.getNumber());
    }

    public static void ppxfxbqfkf() {
        wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww.iobyxmoadg());
    }

    public static void wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.nufgyqmvbu(f19455zoijcleaow);
        dxjokdxxwwVar.lqeggnwhkg(f19453ppxfxbqfkf);
        dxjokdxxwwVar.gxszxtbevo(f19454wkgbmnqykc);
        dxjokdxxwwVar.eablkybsjg(f19451eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ojitshcjhn zoijcleaow(com.google.crypto.tink.internal.ojitshcjhn ojitshcjhnVar, bb.esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        if (!ojitshcjhnVar.gxszxtbevo().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            nb.draadjrbmk draadjrbmkVarNtlheqmsrt = nb.draadjrbmk.ntlheqmsrt(ojitshcjhnVar.lqeggnwhkg(), com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
            if (draadjrbmkVarNtlheqmsrt.tzroggbefp() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return ojitshcjhn.iobyxmoadg().eablkybsjg(vdvldrhtss.iobyxmoadg().ppxfxbqfkf(draadjrbmkVarNtlheqmsrt.kegysxyocb().size()).zoijcleaow(12).wkgbmnqykc(16).eablkybsjg(eablkybsjg(ojitshcjhnVar.eablkybsjg())).iobyxmoadg()).wkgbmnqykc(pb.zoijcleaow.iobyxmoadg(draadjrbmkVarNtlheqmsrt.kegysxyocb().zynmafqrjb(), bb.esjtqupxsv.zoijcleaow(esjtqupxsvVar))).ppxfxbqfkf(ojitshcjhnVar.ppxfxbqfkf()).iobyxmoadg();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }
}

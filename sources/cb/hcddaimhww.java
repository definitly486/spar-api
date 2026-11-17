package cb;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
abstract class hcddaimhww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.zoijcleaow f19419eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final pb.iobyxmoadg f19420iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.btonecajqb f19421ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.ppxfxbqfkf f19422wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.gtknphoqwx f19423zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f19424iobyxmoadg;

        static {
            int[] iArr = new int[nb.ylkuphrtab.values().length];
            f19424iobyxmoadg = iArr;
            try {
                iArr[nb.ylkuphrtab.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19424iobyxmoadg[nb.ylkuphrtab.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19424iobyxmoadg[nb.ylkuphrtab.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19424iobyxmoadg[nb.ylkuphrtab.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        pb.iobyxmoadg iobyxmoadgVarEablkybsjg = com.google.crypto.tink.internal.kcexrzcfyt.eablkybsjg("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f19420iobyxmoadg = iobyxmoadgVarEablkybsjg;
        f19423zoijcleaow = com.google.crypto.tink.internal.gtknphoqwx.iobyxmoadg(new btonecajqb(), ylkuphrtab.class, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f19421ppxfxbqfkf = com.google.crypto.tink.internal.btonecajqb.iobyxmoadg(new gtknphoqwx(), iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f19422wkgbmnqykc = com.google.crypto.tink.internal.ppxfxbqfkf.iobyxmoadg(new draadjrbmk(), lmojexxdyd.class, com.google.crypto.tink.internal.ojitshcjhn.class);
        f19419eablkybsjg = com.google.crypto.tink.internal.zoijcleaow.iobyxmoadg(new com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow() { // from class: cb.pkzmftpjix
            @Override // com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow
            public final bb.lqeggnwhkg iobyxmoadg(com.google.crypto.tink.internal.vdvldrhtss vdvldrhtssVar, bb.esjtqupxsv esjtqupxsvVar) {
                return hcddaimhww.zoijcleaow((com.google.crypto.tink.internal.ojitshcjhn) vdvldrhtssVar, esjtqupxsvVar);
            }
        }, iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.ojitshcjhn.class);
    }

    private static ylkuphrtab.iobyxmoadg eablkybsjg(nb.ylkuphrtab ylkuphrtabVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f19424iobyxmoadg[ylkuphrtabVar.ordinal()];
        if (i13 == 1) {
            return ylkuphrtab.iobyxmoadg.f19508zoijcleaow;
        }
        if (i13 == 2 || i13 == 3) {
            return ylkuphrtab.iobyxmoadg.f19506ppxfxbqfkf;
        }
        if (i13 == 4) {
            return ylkuphrtab.iobyxmoadg.f19507wkgbmnqykc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ylkuphrtabVar.getNumber());
    }

    public static void ppxfxbqfkf() {
        wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww.iobyxmoadg());
    }

    public static void wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.nufgyqmvbu(f19423zoijcleaow);
        dxjokdxxwwVar.lqeggnwhkg(f19421ppxfxbqfkf);
        dxjokdxxwwVar.gxszxtbevo(f19422wkgbmnqykc);
        dxjokdxxwwVar.eablkybsjg(f19419eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static lmojexxdyd zoijcleaow(com.google.crypto.tink.internal.ojitshcjhn ojitshcjhnVar, bb.esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        if (!ojitshcjhnVar.gxszxtbevo().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            nb.hcddaimhww hcddaimhwwVarNtlheqmsrt = nb.hcddaimhww.ntlheqmsrt(ojitshcjhnVar.lqeggnwhkg(), com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
            if (hcddaimhwwVarNtlheqmsrt.tzroggbefp() == 0) {
                return lmojexxdyd.iobyxmoadg(eablkybsjg(ojitshcjhnVar.eablkybsjg()), pb.zoijcleaow.iobyxmoadg(hcddaimhwwVarNtlheqmsrt.kegysxyocb().zynmafqrjb(), bb.esjtqupxsv.zoijcleaow(esjtqupxsvVar)), ojitshcjhnVar.ppxfxbqfkf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }
}

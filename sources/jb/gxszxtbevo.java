package jb;

import bb.esjtqupxsv;
import com.google.crypto.tink.internal.kcexrzcfyt;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
abstract class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.zoijcleaow f50985eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final pb.iobyxmoadg f50986iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.btonecajqb f50987ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.ppxfxbqfkf f50988wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.gtknphoqwx f50989zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f50990iobyxmoadg;

        static {
            int[] iArr = new int[ylkuphrtab.values().length];
            f50990iobyxmoadg = iArr;
            try {
                iArr[ylkuphrtab.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50990iobyxmoadg[ylkuphrtab.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50990iobyxmoadg[ylkuphrtab.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50990iobyxmoadg[ylkuphrtab.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        pb.iobyxmoadg iobyxmoadgVarEablkybsjg = kcexrzcfyt.eablkybsjg("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f50986iobyxmoadg = iobyxmoadgVarEablkybsjg;
        f50989zoijcleaow = com.google.crypto.tink.internal.gtknphoqwx.iobyxmoadg(new cb.btonecajqb(), wkgbmnqykc.class, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f50987ppxfxbqfkf = com.google.crypto.tink.internal.btonecajqb.iobyxmoadg(new cb.gtknphoqwx(), iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f50988wkgbmnqykc = com.google.crypto.tink.internal.ppxfxbqfkf.iobyxmoadg(new cb.draadjrbmk(), jb.iobyxmoadg.class, com.google.crypto.tink.internal.ojitshcjhn.class);
        f50985eablkybsjg = com.google.crypto.tink.internal.zoijcleaow.iobyxmoadg(new com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow() { // from class: jb.eablkybsjg
            @Override // com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow
            public final bb.lqeggnwhkg iobyxmoadg(com.google.crypto.tink.internal.vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar) {
                return gxszxtbevo.zoijcleaow((com.google.crypto.tink.internal.ojitshcjhn) vdvldrhtssVar, esjtqupxsvVar);
            }
        }, iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.ojitshcjhn.class);
    }

    private static wkgbmnqykc.ppxfxbqfkf eablkybsjg(ylkuphrtab ylkuphrtabVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f50990iobyxmoadg[ylkuphrtabVar.ordinal()];
        if (i13 == 1) {
            return wkgbmnqykc.ppxfxbqfkf.f51018zoijcleaow;
        }
        if (i13 == 2) {
            return wkgbmnqykc.ppxfxbqfkf.f51016ppxfxbqfkf;
        }
        if (i13 == 3) {
            return wkgbmnqykc.ppxfxbqfkf.f51017wkgbmnqykc;
        }
        if (i13 == 4) {
            return wkgbmnqykc.ppxfxbqfkf.f51015eablkybsjg;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ylkuphrtabVar.getNumber());
    }

    public static void ppxfxbqfkf() {
        wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww.iobyxmoadg());
    }

    public static void wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.nufgyqmvbu(f50989zoijcleaow);
        dxjokdxxwwVar.lqeggnwhkg(f50987ppxfxbqfkf);
        dxjokdxxwwVar.gxszxtbevo(f50988wkgbmnqykc);
        dxjokdxxwwVar.eablkybsjg(f50985eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static jb.iobyxmoadg zoijcleaow(com.google.crypto.tink.internal.ojitshcjhn ojitshcjhnVar, esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        if (!ojitshcjhnVar.gxszxtbevo().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            nb.iobyxmoadg iobyxmoadgVarSopmlzcsov = nb.iobyxmoadg.sopmlzcsov(ojitshcjhnVar.lqeggnwhkg(), com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
            if (iobyxmoadgVarSopmlzcsov.ntlheqmsrt() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return jb.iobyxmoadg.ppxfxbqfkf().eablkybsjg(wkgbmnqykc.iobyxmoadg().zoijcleaow(iobyxmoadgVarSopmlzcsov.tzroggbefp().size()).ppxfxbqfkf(iobyxmoadgVarSopmlzcsov.mbcevpiqjq().kegysxyocb()).wkgbmnqykc(eablkybsjg(ojitshcjhnVar.eablkybsjg())).iobyxmoadg()).ppxfxbqfkf(pb.zoijcleaow.iobyxmoadg(iobyxmoadgVarSopmlzcsov.tzroggbefp().zynmafqrjb(), esjtqupxsv.zoijcleaow(esjtqupxsvVar))).wkgbmnqykc(ojitshcjhnVar.ppxfxbqfkf()).iobyxmoadg();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }
}

package jb;

import bb.esjtqupxsv;
import com.google.crypto.tink.internal.kcexrzcfyt;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import nb.jyumaefscl;
import nb.yggfygwlhe;
import nb.ylkuphrtab;

/* JADX INFO: loaded from: classes2.dex */
abstract class agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.zoijcleaow f50949eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final pb.iobyxmoadg f50950iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.btonecajqb f50951ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.ppxfxbqfkf f50952wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.gtknphoqwx f50953zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f50954iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f50955zoijcleaow;

        static {
            int[] iArr = new int[ylkuphrtab.values().length];
            f50955zoijcleaow = iArr;
            try {
                iArr[ylkuphrtab.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50955zoijcleaow[ylkuphrtab.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50955zoijcleaow[ylkuphrtab.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50955zoijcleaow[ylkuphrtab.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[yggfygwlhe.values().length];
            f50954iobyxmoadg = iArr2;
            try {
                iArr2[yggfygwlhe.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50954iobyxmoadg[yggfygwlhe.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50954iobyxmoadg[yggfygwlhe.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50954iobyxmoadg[yggfygwlhe.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50954iobyxmoadg[yggfygwlhe.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        pb.iobyxmoadg iobyxmoadgVarEablkybsjg = kcexrzcfyt.eablkybsjg("type.googleapis.com/google.crypto.tink.HmacKey");
        f50950iobyxmoadg = iobyxmoadgVarEablkybsjg;
        f50953zoijcleaow = com.google.crypto.tink.internal.gtknphoqwx.iobyxmoadg(new cb.btonecajqb(), draadjrbmk.class, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f50951ppxfxbqfkf = com.google.crypto.tink.internal.btonecajqb.iobyxmoadg(new cb.gtknphoqwx(), iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f50952wkgbmnqykc = com.google.crypto.tink.internal.ppxfxbqfkf.iobyxmoadg(new cb.draadjrbmk(), dxjokdxxww.class, com.google.crypto.tink.internal.ojitshcjhn.class);
        f50949eablkybsjg = com.google.crypto.tink.internal.zoijcleaow.iobyxmoadg(new com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow() { // from class: jb.wflxmlrfwp
            @Override // com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow
            public final bb.lqeggnwhkg iobyxmoadg(com.google.crypto.tink.internal.vdvldrhtss vdvldrhtssVar, esjtqupxsv esjtqupxsvVar) {
                return agtfadlqog.zoijcleaow((com.google.crypto.tink.internal.ojitshcjhn) vdvldrhtssVar, esjtqupxsvVar);
            }
        }, iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.ojitshcjhn.class);
    }

    private static draadjrbmk.ppxfxbqfkf eablkybsjg(yggfygwlhe yggfygwlheVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f50954iobyxmoadg[yggfygwlheVar.ordinal()];
        if (i13 == 1) {
            return draadjrbmk.ppxfxbqfkf.f50964zoijcleaow;
        }
        if (i13 == 2) {
            return draadjrbmk.ppxfxbqfkf.f50962ppxfxbqfkf;
        }
        if (i13 == 3) {
            return draadjrbmk.ppxfxbqfkf.f50963wkgbmnqykc;
        }
        if (i13 == 4) {
            return draadjrbmk.ppxfxbqfkf.f50960eablkybsjg;
        }
        if (i13 == 5) {
            return draadjrbmk.ppxfxbqfkf.f50961gxszxtbevo;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + yggfygwlheVar.getNumber());
    }

    private static draadjrbmk.wkgbmnqykc gxszxtbevo(ylkuphrtab ylkuphrtabVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f50955zoijcleaow[ylkuphrtabVar.ordinal()];
        if (i13 == 1) {
            return draadjrbmk.wkgbmnqykc.f50969zoijcleaow;
        }
        if (i13 == 2) {
            return draadjrbmk.wkgbmnqykc.f50967ppxfxbqfkf;
        }
        if (i13 == 3) {
            return draadjrbmk.wkgbmnqykc.f50968wkgbmnqykc;
        }
        if (i13 == 4) {
            return draadjrbmk.wkgbmnqykc.f50966eablkybsjg;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ylkuphrtabVar.getNumber());
    }

    public static void ppxfxbqfkf() {
        wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww.iobyxmoadg());
    }

    public static void wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.nufgyqmvbu(f50953zoijcleaow);
        dxjokdxxwwVar.lqeggnwhkg(f50951ppxfxbqfkf);
        dxjokdxxwwVar.gxszxtbevo(f50952wkgbmnqykc);
        dxjokdxxwwVar.eablkybsjg(f50949eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static dxjokdxxww zoijcleaow(com.google.crypto.tink.internal.ojitshcjhn ojitshcjhnVar, esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        if (!ojitshcjhnVar.gxszxtbevo().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            jyumaefscl jyumaefsclVarCrxdokpmqz = jyumaefscl.crxdokpmqz(ojitshcjhnVar.lqeggnwhkg(), com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
            if (jyumaefsclVarCrxdokpmqz.ulzqkzuiru() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return dxjokdxxww.ppxfxbqfkf().eablkybsjg(draadjrbmk.iobyxmoadg().ppxfxbqfkf(jyumaefsclVarCrxdokpmqz.mbcevpiqjq().size()).wkgbmnqykc(jyumaefsclVarCrxdokpmqz.ntlheqmsrt().mbcevpiqjq()).zoijcleaow(eablkybsjg(jyumaefsclVarCrxdokpmqz.ntlheqmsrt().tzroggbefp())).eablkybsjg(gxszxtbevo(ojitshcjhnVar.eablkybsjg())).iobyxmoadg()).wkgbmnqykc(pb.zoijcleaow.iobyxmoadg(jyumaefsclVarCrxdokpmqz.mbcevpiqjq().zynmafqrjb(), esjtqupxsv.zoijcleaow(esjtqupxsvVar))).ppxfxbqfkf(ojitshcjhnVar.ppxfxbqfkf()).iobyxmoadg();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }
}

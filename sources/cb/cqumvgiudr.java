package cb;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
abstract class cqumvgiudr {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.zoijcleaow f19395eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final pb.iobyxmoadg f19396iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.btonecajqb f19397ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.ppxfxbqfkf f19398wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.gtknphoqwx f19399zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f19400iobyxmoadg;

        static {
            int[] iArr = new int[nb.ylkuphrtab.values().length];
            f19400iobyxmoadg = iArr;
            try {
                iArr[nb.ylkuphrtab.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19400iobyxmoadg[nb.ylkuphrtab.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19400iobyxmoadg[nb.ylkuphrtab.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19400iobyxmoadg[nb.ylkuphrtab.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        pb.iobyxmoadg iobyxmoadgVarEablkybsjg = com.google.crypto.tink.internal.kcexrzcfyt.eablkybsjg("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f19396iobyxmoadg = iobyxmoadgVarEablkybsjg;
        f19399zoijcleaow = com.google.crypto.tink.internal.gtknphoqwx.iobyxmoadg(new btonecajqb(), jyumaefscl.class, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f19397ppxfxbqfkf = com.google.crypto.tink.internal.btonecajqb.iobyxmoadg(new gtknphoqwx(), iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.rgvfuqvkyq.class);
        f19398wkgbmnqykc = com.google.crypto.tink.internal.ppxfxbqfkf.iobyxmoadg(new draadjrbmk(), zdlpuopuiu.class, com.google.crypto.tink.internal.ojitshcjhn.class);
        f19395eablkybsjg = com.google.crypto.tink.internal.zoijcleaow.iobyxmoadg(new com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow() { // from class: cb.iwizpuwonk
            @Override // com.google.crypto.tink.internal.zoijcleaow.InterfaceC0413zoijcleaow
            public final bb.lqeggnwhkg iobyxmoadg(com.google.crypto.tink.internal.vdvldrhtss vdvldrhtssVar, bb.esjtqupxsv esjtqupxsvVar) {
                return cqumvgiudr.zoijcleaow((com.google.crypto.tink.internal.ojitshcjhn) vdvldrhtssVar, esjtqupxsvVar);
            }
        }, iobyxmoadgVarEablkybsjg, com.google.crypto.tink.internal.ojitshcjhn.class);
    }

    private static jyumaefscl.ppxfxbqfkf eablkybsjg(nb.ylkuphrtab ylkuphrtabVar) throws GeneralSecurityException {
        int i13 = iobyxmoadg.f19400iobyxmoadg[ylkuphrtabVar.ordinal()];
        if (i13 == 1) {
            return jyumaefscl.ppxfxbqfkf.f19447zoijcleaow;
        }
        if (i13 == 2 || i13 == 3) {
            return jyumaefscl.ppxfxbqfkf.f19445ppxfxbqfkf;
        }
        if (i13 == 4) {
            return jyumaefscl.ppxfxbqfkf.f19446wkgbmnqykc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ylkuphrtabVar.getNumber());
    }

    public static void ppxfxbqfkf() {
        wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww.iobyxmoadg());
    }

    public static void wkgbmnqykc(com.google.crypto.tink.internal.dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.nufgyqmvbu(f19399zoijcleaow);
        dxjokdxxwwVar.lqeggnwhkg(f19397ppxfxbqfkf);
        dxjokdxxwwVar.gxszxtbevo(f19398wkgbmnqykc);
        dxjokdxxwwVar.eablkybsjg(f19395eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zdlpuopuiu zoijcleaow(com.google.crypto.tink.internal.ojitshcjhn ojitshcjhnVar, bb.esjtqupxsv esjtqupxsvVar) throws GeneralSecurityException {
        if (!ojitshcjhnVar.gxszxtbevo().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            nb.agtfadlqog agtfadlqogVarNtlheqmsrt = nb.agtfadlqog.ntlheqmsrt(ojitshcjhnVar.lqeggnwhkg(), com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
            if (agtfadlqogVarNtlheqmsrt.tzroggbefp() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zdlpuopuiu.iobyxmoadg().eablkybsjg(jyumaefscl.iobyxmoadg().zoijcleaow(agtfadlqogVarNtlheqmsrt.kegysxyocb().size()).ppxfxbqfkf(eablkybsjg(ojitshcjhnVar.eablkybsjg())).iobyxmoadg()).wkgbmnqykc(pb.zoijcleaow.iobyxmoadg(agtfadlqogVarNtlheqmsrt.kegysxyocb().zynmafqrjb(), bb.esjtqupxsv.zoijcleaow(esjtqupxsvVar))).ppxfxbqfkf(ojitshcjhnVar.ppxfxbqfkf()).iobyxmoadg();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }
}

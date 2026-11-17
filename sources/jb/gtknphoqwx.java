package jb;

import bb.zdlpuopuiu;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import nb.cqumvgiudr;
import nb.esjtqupxsv;
import nb.iwizpuwonk;
import nb.jyumaefscl;
import nb.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx extends com.google.crypto.tink.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.draadjrbmk f50982wkgbmnqykc = com.google.crypto.tink.internal.draadjrbmk.zoijcleaow(new com.google.crypto.tink.internal.draadjrbmk.zoijcleaow() { // from class: jb.btonecajqb
        @Override // com.google.crypto.tink.internal.draadjrbmk.zoijcleaow
        public final Object iobyxmoadg(bb.lqeggnwhkg lqeggnwhkgVar) {
            return new kb.ppxfxbqfkf((dxjokdxxww) lqeggnwhkgVar);
        }
    }, dxjokdxxww.class, lqeggnwhkg.class);

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public zdlpuopuiu iobyxmoadg(jyumaefscl jyumaefsclVar) throws GeneralSecurityException {
            yggfygwlhe yggfygwlheVarTzroggbefp = jyumaefsclVar.ntlheqmsrt().tzroggbefp();
            SecretKeySpec secretKeySpec = new SecretKeySpec(jyumaefsclVar.mbcevpiqjq().zynmafqrjb(), "HMAC");
            int iMbcevpiqjq = jyumaefsclVar.ntlheqmsrt().mbcevpiqjq();
            int i13 = ppxfxbqfkf.f50983iobyxmoadg[yggfygwlheVarTzroggbefp.ordinal()];
            if (i13 == 1) {
                return new ob.ojitshcjhn(new ob.agtfadlqog("HMACSHA1", secretKeySpec), iMbcevpiqjq);
            }
            if (i13 == 2) {
                return new ob.ojitshcjhn(new ob.agtfadlqog("HMACSHA224", secretKeySpec), iMbcevpiqjq);
            }
            if (i13 == 3) {
                return new ob.ojitshcjhn(new ob.agtfadlqog("HMACSHA256", secretKeySpec), iMbcevpiqjq);
            }
            if (i13 == 4) {
                return new ob.ojitshcjhn(new ob.agtfadlqog("HMACSHA384", secretKeySpec), iMbcevpiqjq);
            }
            if (i13 == 5) {
                return new ob.ojitshcjhn(new ob.agtfadlqog("HMACSHA512", secretKeySpec), iMbcevpiqjq);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    static /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f50983iobyxmoadg;

        static {
            int[] iArr = new int[yggfygwlhe.values().length];
            f50983iobyxmoadg = iArr;
            try {
                iArr[yggfygwlhe.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50983iobyxmoadg[yggfygwlhe.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50983iobyxmoadg[yggfygwlhe.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50983iobyxmoadg[yggfygwlhe.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50983iobyxmoadg[yggfygwlhe.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public jyumaefscl iobyxmoadg(iwizpuwonk iwizpuwonkVar) {
            return (jyumaefscl) jyumaefscl.sopmlzcsov().rgvfuqvkyq(gtknphoqwx.this.agtfadlqog()).ojitshcjhn(iwizpuwonkVar.mbcevpiqjq()).agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(ob.rgvfuqvkyq.ppxfxbqfkf(iwizpuwonkVar.tzroggbefp()))).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public iwizpuwonk wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return iwizpuwonk.ulzqkzuiru(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(iwizpuwonk iwizpuwonkVar) throws GeneralSecurityException {
            if (iwizpuwonkVar.tzroggbefp() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            gtknphoqwx.oxmwwwfdhm(iwizpuwonkVar.mbcevpiqjq());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        public Map ppxfxbqfkf() {
            HashMap map = new HashMap();
            yggfygwlhe yggfygwlheVar = yggfygwlhe.SHA256;
            bb.draadjrbmk.zoijcleaow zoijcleaowVar = bb.draadjrbmk.zoijcleaow.TINK;
            map.put("HMAC_SHA256_128BITTAG", gtknphoqwx.wflxmlrfwp(32, 16, yggfygwlheVar, zoijcleaowVar));
            bb.draadjrbmk.zoijcleaow zoijcleaowVar2 = bb.draadjrbmk.zoijcleaow.RAW;
            map.put("HMAC_SHA256_128BITTAG_RAW", gtknphoqwx.wflxmlrfwp(32, 16, yggfygwlheVar, zoijcleaowVar2));
            map.put("HMAC_SHA256_256BITTAG", gtknphoqwx.wflxmlrfwp(32, 32, yggfygwlheVar, zoijcleaowVar));
            map.put("HMAC_SHA256_256BITTAG_RAW", gtknphoqwx.wflxmlrfwp(32, 32, yggfygwlheVar, zoijcleaowVar2));
            yggfygwlhe yggfygwlheVar2 = yggfygwlhe.SHA512;
            map.put("HMAC_SHA512_128BITTAG", gtknphoqwx.wflxmlrfwp(64, 16, yggfygwlheVar2, zoijcleaowVar));
            map.put("HMAC_SHA512_128BITTAG_RAW", gtknphoqwx.wflxmlrfwp(64, 16, yggfygwlheVar2, zoijcleaowVar2));
            map.put("HMAC_SHA512_256BITTAG", gtknphoqwx.wflxmlrfwp(64, 32, yggfygwlheVar2, zoijcleaowVar));
            map.put("HMAC_SHA512_256BITTAG_RAW", gtknphoqwx.wflxmlrfwp(64, 32, yggfygwlheVar2, zoijcleaowVar2));
            map.put("HMAC_SHA512_512BITTAG", gtknphoqwx.wflxmlrfwp(64, 64, yggfygwlheVar2, zoijcleaowVar));
            map.put("HMAC_SHA512_512BITTAG_RAW", gtknphoqwx.wflxmlrfwp(64, 64, yggfygwlheVar2, zoijcleaowVar2));
            return Collections.unmodifiableMap(map);
        }
    }

    public gtknphoqwx() {
        super(jyumaefscl.class, new iobyxmoadg(zdlpuopuiu.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oxmwwwfdhm(cqumvgiudr cqumvgiudrVar) throws GeneralSecurityException {
        if (cqumvgiudrVar.mbcevpiqjq() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i13 = ppxfxbqfkf.f50983iobyxmoadg[cqumvgiudrVar.tzroggbefp().ordinal()];
        if (i13 == 1) {
            if (cqumvgiudrVar.mbcevpiqjq() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i13 == 2) {
            if (cqumvgiudrVar.mbcevpiqjq() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i13 == 3) {
            if (cqumvgiudrVar.mbcevpiqjq() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i13 == 4) {
            if (cqumvgiudrVar.mbcevpiqjq() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i13 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (cqumvgiudrVar.mbcevpiqjq() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    public static void rgvfuqvkyq(boolean z13) {
        bb.cqumvgiudr.draadjrbmk(new gtknphoqwx(), z13);
        agtfadlqog.ppxfxbqfkf();
        com.google.crypto.tink.internal.nufgyqmvbu.ppxfxbqfkf().wkgbmnqykc(f50982wkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg wflxmlrfwp(int i13, int i14, yggfygwlhe yggfygwlheVar, bb.draadjrbmk.zoijcleaow zoijcleaowVar) {
        return new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg((iwizpuwonk) iwizpuwonk.ntlheqmsrt().ojitshcjhn((cqumvgiudr) cqumvgiudr.ntlheqmsrt().agtfadlqog(yggfygwlheVar).ojitshcjhn(i14).ppxfxbqfkf()).agtfadlqog(i13).ppxfxbqfkf(), zoijcleaowVar);
    }

    public int agtfadlqog() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(iwizpuwonk.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public gb.zoijcleaow.EnumC0829zoijcleaow iobyxmoadg() {
        return gb.zoijcleaow.EnumC0829zoijcleaow.f36734yggfygwlhe;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return esjtqupxsv.ppxfxbqfkf.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public jyumaefscl nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return jyumaefscl.crxdokpmqz(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(jyumaefscl jyumaefsclVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(jyumaefsclVar.ulzqkzuiru(), agtfadlqog());
        if (jyumaefsclVar.mbcevpiqjq().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        oxmwwwfdhm(jyumaefsclVar.ntlheqmsrt());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }
}

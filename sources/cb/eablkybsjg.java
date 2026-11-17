package cb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg extends com.google.crypto.tink.internal.wkgbmnqykc {

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public bb.iobyxmoadg iobyxmoadg(nb.wkgbmnqykc wkgbmnqykcVar) {
            return new ob.nufgyqmvbu((ob.draadjrbmk) new gxszxtbevo().eablkybsjg(wkgbmnqykcVar.tzroggbefp(), ob.draadjrbmk.class), (bb.zdlpuopuiu) new jb.gtknphoqwx().eablkybsjg(wkgbmnqykcVar.mbcevpiqjq(), bb.zdlpuopuiu.class), wkgbmnqykcVar.mbcevpiqjq().ntlheqmsrt().mbcevpiqjq());
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb.wkgbmnqykc iobyxmoadg(nb.eablkybsjg eablkybsjgVar) {
            nb.gxszxtbevo gxszxtbevoVar = (nb.gxszxtbevo) new gxszxtbevo().gxszxtbevo().iobyxmoadg(eablkybsjgVar.kegysxyocb());
            return (nb.wkgbmnqykc) nb.wkgbmnqykc.ulzqkzuiru().agtfadlqog(gxszxtbevoVar).ojitshcjhn((nb.jyumaefscl) new jb.gtknphoqwx().gxszxtbevo().iobyxmoadg(eablkybsjgVar.tzroggbefp())).rgvfuqvkyq(eablkybsjg.this.agtfadlqog()).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public nb.eablkybsjg wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return nb.eablkybsjg.ntlheqmsrt(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(nb.eablkybsjg eablkybsjgVar) throws InvalidAlgorithmParameterException {
            new gxszxtbevo().gxszxtbevo().eablkybsjg(eablkybsjgVar.kegysxyocb());
            new jb.gtknphoqwx().gxszxtbevo().eablkybsjg(eablkybsjgVar.tzroggbefp());
            ob.oxmwwwfdhm.iobyxmoadg(eablkybsjgVar.kegysxyocb().tzroggbefp());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        public Map ppxfxbqfkf() {
            HashMap map = new HashMap();
            nb.yggfygwlhe yggfygwlheVar = nb.yggfygwlhe.SHA256;
            bb.draadjrbmk.zoijcleaow zoijcleaowVar = bb.draadjrbmk.zoijcleaow.TINK;
            map.put("AES128_CTR_HMAC_SHA256", eablkybsjg.draadjrbmk(16, 16, 32, 16, yggfygwlheVar, zoijcleaowVar));
            bb.draadjrbmk.zoijcleaow zoijcleaowVar2 = bb.draadjrbmk.zoijcleaow.RAW;
            map.put("AES128_CTR_HMAC_SHA256_RAW", eablkybsjg.draadjrbmk(16, 16, 32, 16, yggfygwlheVar, zoijcleaowVar2));
            map.put("AES256_CTR_HMAC_SHA256", eablkybsjg.draadjrbmk(32, 16, 32, 32, yggfygwlheVar, zoijcleaowVar));
            map.put("AES256_CTR_HMAC_SHA256_RAW", eablkybsjg.draadjrbmk(32, 16, 32, 32, yggfygwlheVar, zoijcleaowVar2));
            return Collections.unmodifiableMap(map);
        }
    }

    eablkybsjg() {
        super(nb.wkgbmnqykc.class, new iobyxmoadg(bb.iobyxmoadg.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg draadjrbmk(int i13, int i14, int i15, int i16, nb.yggfygwlhe yggfygwlheVar, bb.draadjrbmk.zoijcleaow zoijcleaowVar) {
        return new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg(wflxmlrfwp(i13, i14, i15, i16, yggfygwlheVar), zoijcleaowVar);
    }

    public static void rgvfuqvkyq(boolean z13) {
        bb.cqumvgiudr.draadjrbmk(new eablkybsjg(), z13);
    }

    private static nb.eablkybsjg wflxmlrfwp(int i13, int i14, int i15, int i16, nb.yggfygwlhe yggfygwlheVar) {
        nb.lqeggnwhkg lqeggnwhkgVar = (nb.lqeggnwhkg) nb.lqeggnwhkg.ntlheqmsrt().ojitshcjhn((nb.nufgyqmvbu) nb.nufgyqmvbu.tzroggbefp().agtfadlqog(i14).ppxfxbqfkf()).agtfadlqog(i13).ppxfxbqfkf();
        return (nb.eablkybsjg) nb.eablkybsjg.mbcevpiqjq().agtfadlqog(lqeggnwhkgVar).ojitshcjhn((nb.iwizpuwonk) nb.iwizpuwonk.ntlheqmsrt().ojitshcjhn((nb.cqumvgiudr) nb.cqumvgiudr.ntlheqmsrt().agtfadlqog(yggfygwlheVar).ojitshcjhn(i16).ppxfxbqfkf()).agtfadlqog(i15).ppxfxbqfkf()).ppxfxbqfkf();
    }

    public int agtfadlqog() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(nb.eablkybsjg.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public gb.zoijcleaow.EnumC0829zoijcleaow iobyxmoadg() {
        return gb.zoijcleaow.EnumC0829zoijcleaow.f36734yggfygwlhe;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public nb.esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return nb.esjtqupxsv.ppxfxbqfkf.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public nb.wkgbmnqykc nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return nb.wkgbmnqykc.sopmlzcsov(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(nb.wkgbmnqykc wkgbmnqykcVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(wkgbmnqykcVar.ntlheqmsrt(), agtfadlqog());
        new gxszxtbevo().btonecajqb(wkgbmnqykcVar.tzroggbefp());
        new jb.gtknphoqwx().btonecajqb(wkgbmnqykcVar.mbcevpiqjq());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }
}

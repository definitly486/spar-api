package cb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq extends com.google.crypto.tink.internal.wkgbmnqykc {

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public bb.iobyxmoadg iobyxmoadg(nb.draadjrbmk draadjrbmkVar) {
            return new ob.ppxfxbqfkf(draadjrbmkVar.kegysxyocb().zynmafqrjb());
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb.draadjrbmk iobyxmoadg(nb.wflxmlrfwp wflxmlrfwpVar) {
            return (nb.draadjrbmk) nb.draadjrbmk.mbcevpiqjq().agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(ob.rgvfuqvkyq.ppxfxbqfkf(wflxmlrfwpVar.stevsuqkhv()))).ojitshcjhn(rgvfuqvkyq.this.wflxmlrfwp()).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public nb.wflxmlrfwp wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return nb.wflxmlrfwp.tzroggbefp(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(nb.wflxmlrfwp wflxmlrfwpVar) throws InvalidAlgorithmParameterException {
            ob.oxmwwwfdhm.iobyxmoadg(wflxmlrfwpVar.stevsuqkhv());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        public Map ppxfxbqfkf() {
            HashMap map = new HashMap();
            bb.draadjrbmk.zoijcleaow zoijcleaowVar = bb.draadjrbmk.zoijcleaow.TINK;
            map.put("AES128_GCM", rgvfuqvkyq.draadjrbmk(16, zoijcleaowVar));
            bb.draadjrbmk.zoijcleaow zoijcleaowVar2 = bb.draadjrbmk.zoijcleaow.RAW;
            map.put("AES128_GCM_RAW", rgvfuqvkyq.draadjrbmk(16, zoijcleaowVar2));
            map.put("AES256_GCM", rgvfuqvkyq.draadjrbmk(32, zoijcleaowVar));
            map.put("AES256_GCM_RAW", rgvfuqvkyq.draadjrbmk(32, zoijcleaowVar2));
            return Collections.unmodifiableMap(map);
        }
    }

    rgvfuqvkyq() {
        super(nb.draadjrbmk.class, new iobyxmoadg(bb.iobyxmoadg.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg draadjrbmk(int i13, bb.draadjrbmk.zoijcleaow zoijcleaowVar) {
        return new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg((nb.wflxmlrfwp) nb.wflxmlrfwp.kegysxyocb().agtfadlqog(i13).ppxfxbqfkf(), zoijcleaowVar);
    }

    public static void ojitshcjhn(boolean z13) {
        bb.cqumvgiudr.draadjrbmk(new rgvfuqvkyq(), z13);
        kcexrzcfyt.ppxfxbqfkf();
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public nb.draadjrbmk nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return nb.draadjrbmk.ntlheqmsrt(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(nb.wflxmlrfwp.class);
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
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(nb.draadjrbmk draadjrbmkVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(draadjrbmkVar.tzroggbefp(), wflxmlrfwp());
        ob.oxmwwwfdhm.iobyxmoadg(draadjrbmkVar.kegysxyocb().size());
    }

    public int wflxmlrfwp() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }
}

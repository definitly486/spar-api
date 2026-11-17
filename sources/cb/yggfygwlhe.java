package cb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe extends com.google.crypto.tink.internal.wkgbmnqykc {

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public bb.iobyxmoadg iobyxmoadg(nb.agtfadlqog agtfadlqogVar) {
            return new eb.iobyxmoadg(agtfadlqogVar.kegysxyocb().zynmafqrjb());
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb.agtfadlqog iobyxmoadg(nb.ojitshcjhn ojitshcjhnVar) {
            return (nb.agtfadlqog) nb.agtfadlqog.mbcevpiqjq().agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(ob.rgvfuqvkyq.ppxfxbqfkf(ojitshcjhnVar.stevsuqkhv()))).ojitshcjhn(yggfygwlhe.this.agtfadlqog()).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public nb.ojitshcjhn wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return nb.ojitshcjhn.tzroggbefp(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(nb.ojitshcjhn ojitshcjhnVar) throws InvalidAlgorithmParameterException {
            ob.oxmwwwfdhm.iobyxmoadg(ojitshcjhnVar.stevsuqkhv());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        public Map ppxfxbqfkf() {
            HashMap map = new HashMap();
            bb.draadjrbmk.zoijcleaow zoijcleaowVar = bb.draadjrbmk.zoijcleaow.TINK;
            map.put("AES128_GCM_SIV", yggfygwlhe.wflxmlrfwp(16, zoijcleaowVar));
            bb.draadjrbmk.zoijcleaow zoijcleaowVar2 = bb.draadjrbmk.zoijcleaow.RAW;
            map.put("AES128_GCM_SIV_RAW", yggfygwlhe.wflxmlrfwp(16, zoijcleaowVar2));
            map.put("AES256_GCM_SIV", yggfygwlhe.wflxmlrfwp(32, zoijcleaowVar));
            map.put("AES256_GCM_SIV_RAW", yggfygwlhe.wflxmlrfwp(32, zoijcleaowVar2));
            return Collections.unmodifiableMap(map);
        }
    }

    yggfygwlhe() {
        super(nb.agtfadlqog.class, new iobyxmoadg(bb.iobyxmoadg.class));
    }

    private static boolean draadjrbmk() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void rgvfuqvkyq(boolean z13) {
        if (draadjrbmk()) {
            bb.cqumvgiudr.draadjrbmk(new yggfygwlhe(), z13);
            cqumvgiudr.ppxfxbqfkf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg wflxmlrfwp(int i13, bb.draadjrbmk.zoijcleaow zoijcleaowVar) {
        return new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg((nb.ojitshcjhn) nb.ojitshcjhn.kegysxyocb().agtfadlqog(i13).ppxfxbqfkf(), zoijcleaowVar);
    }

    public int agtfadlqog() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(nb.ojitshcjhn.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public nb.esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return nb.esjtqupxsv.ppxfxbqfkf.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public nb.agtfadlqog nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return nb.agtfadlqog.ntlheqmsrt(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(nb.agtfadlqog agtfadlqogVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(agtfadlqogVar.tzroggbefp(), agtfadlqog());
        ob.oxmwwwfdhm.iobyxmoadg(agtfadlqogVar.kegysxyocb().size());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }
}

package cb;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nb.jpowsppfya;

/* JADX INFO: loaded from: classes2.dex */
public class wwaezpbzkn extends com.google.crypto.tink.internal.wkgbmnqykc {

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public bb.iobyxmoadg iobyxmoadg(nb.hcddaimhww hcddaimhwwVar) {
            return new ob.kcexrzcfyt(hcddaimhwwVar.kegysxyocb().zynmafqrjb());
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb.hcddaimhww iobyxmoadg(jpowsppfya jpowsppfyaVar) {
            return (nb.hcddaimhww) nb.hcddaimhww.mbcevpiqjq().ojitshcjhn(wwaezpbzkn.this.gtknphoqwx()).agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(ob.rgvfuqvkyq.ppxfxbqfkf(32))).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public jpowsppfya wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return jpowsppfya.stevsuqkhv(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(jpowsppfya jpowsppfyaVar) {
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        public Map ppxfxbqfkf() {
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg(jpowsppfya.wypolnanlu(), bb.draadjrbmk.zoijcleaow.TINK));
            map.put("XCHACHA20_POLY1305_RAW", new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg(jpowsppfya.wypolnanlu(), bb.draadjrbmk.zoijcleaow.RAW));
            return Collections.unmodifiableMap(map);
        }
    }

    wwaezpbzkn() {
        super(nb.hcddaimhww.class, new iobyxmoadg(bb.iobyxmoadg.class));
    }

    public static void wflxmlrfwp(boolean z13) {
        bb.cqumvgiudr.draadjrbmk(new wwaezpbzkn(), z13);
        hcddaimhww.ppxfxbqfkf();
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(nb.hcddaimhww hcddaimhwwVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(hcddaimhwwVar.tzroggbefp(), gtknphoqwx());
        if (hcddaimhwwVar.kegysxyocb().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public nb.hcddaimhww nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return nb.hcddaimhww.ntlheqmsrt(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    public int gtknphoqwx() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(jpowsppfya.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public nb.esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return nb.esjtqupxsv.ppxfxbqfkf.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }
}

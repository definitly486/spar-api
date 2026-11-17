package cb;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lereixgezr extends com.google.crypto.tink.internal.wkgbmnqykc {

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public bb.iobyxmoadg iobyxmoadg(nb.oxmwwwfdhm oxmwwwfdhmVar) {
            return new ob.lqeggnwhkg(oxmwwwfdhmVar.kegysxyocb().zynmafqrjb());
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb.oxmwwwfdhm iobyxmoadg(nb.kcexrzcfyt kcexrzcfytVar) {
            return (nb.oxmwwwfdhm) nb.oxmwwwfdhm.mbcevpiqjq().ojitshcjhn(lereixgezr.this.gtknphoqwx()).agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(ob.rgvfuqvkyq.ppxfxbqfkf(32))).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public nb.kcexrzcfyt wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return nb.kcexrzcfyt.stevsuqkhv(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(nb.kcexrzcfyt kcexrzcfytVar) {
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        public Map ppxfxbqfkf() {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg(nb.kcexrzcfyt.wypolnanlu(), bb.draadjrbmk.zoijcleaow.TINK));
            map.put("CHACHA20_POLY1305_RAW", new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg(nb.kcexrzcfyt.wypolnanlu(), bb.draadjrbmk.zoijcleaow.RAW));
            return Collections.unmodifiableMap(map);
        }
    }

    lereixgezr() {
        super(nb.oxmwwwfdhm.class, new iobyxmoadg(bb.iobyxmoadg.class));
    }

    public static void wflxmlrfwp(boolean z13) {
        bb.cqumvgiudr.draadjrbmk(new lereixgezr(), z13);
        istkbnxepw.ppxfxbqfkf();
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(nb.oxmwwwfdhm oxmwwwfdhmVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(oxmwwwfdhmVar.tzroggbefp(), gtknphoqwx());
        if (oxmwwwfdhmVar.kegysxyocb().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public nb.oxmwwwfdhm nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return nb.oxmwwwfdhm.ntlheqmsrt(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    public int gtknphoqwx() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(nb.kcexrzcfyt.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public nb.esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return nb.esjtqupxsv.ppxfxbqfkf.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }
}

package cb;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class iozdgvuglv extends com.google.crypto.tink.internal.wkgbmnqykc {

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public bb.iobyxmoadg iobyxmoadg(nb.lmojexxdyd lmojexxdydVar) {
            String strKegysxyocb = lmojexxdydVar.kegysxyocb().kegysxyocb();
            return new yadqdtsiqt(lmojexxdydVar.kegysxyocb().stevsuqkhv(), bb.kcexrzcfyt.iobyxmoadg(strKegysxyocb).zoijcleaow(strKegysxyocb));
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb.lmojexxdyd iobyxmoadg(nb.wwaezpbzkn wwaezpbzknVar) {
            return (nb.lmojexxdyd) nb.lmojexxdyd.mbcevpiqjq().agtfadlqog(wwaezpbzknVar).ojitshcjhn(iozdgvuglv.this.gtknphoqwx()).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public nb.wwaezpbzkn wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return nb.wwaezpbzkn.mbcevpiqjq(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(nb.wwaezpbzkn wwaezpbzknVar) throws GeneralSecurityException {
            if (wwaezpbzknVar.kegysxyocb().isEmpty() || !wwaezpbzknVar.tzroggbefp()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    iozdgvuglv() {
        super(nb.lmojexxdyd.class, new iobyxmoadg(bb.iobyxmoadg.class));
    }

    public static void wflxmlrfwp(boolean z13) {
        bb.cqumvgiudr.draadjrbmk(new iozdgvuglv(), z13);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(nb.lmojexxdyd lmojexxdydVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(lmojexxdydVar.tzroggbefp(), gtknphoqwx());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public nb.lmojexxdyd nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return nb.lmojexxdyd.ntlheqmsrt(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    public int gtknphoqwx() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(nb.wwaezpbzkn.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public nb.esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return nb.esjtqupxsv.ppxfxbqfkf.REMOTE;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }
}

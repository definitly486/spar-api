package cb;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo extends com.google.crypto.tink.internal.wkgbmnqykc {

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public ob.draadjrbmk iobyxmoadg(nb.gxszxtbevo gxszxtbevoVar) {
            return new ob.iobyxmoadg(gxszxtbevoVar.mbcevpiqjq().zynmafqrjb(), gxszxtbevoVar.ntlheqmsrt().kegysxyocb());
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb.gxszxtbevo iobyxmoadg(nb.lqeggnwhkg lqeggnwhkgVar) {
            return (nb.gxszxtbevo) nb.gxszxtbevo.sopmlzcsov().ojitshcjhn(lqeggnwhkgVar.mbcevpiqjq()).agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(ob.rgvfuqvkyq.ppxfxbqfkf(lqeggnwhkgVar.tzroggbefp()))).rgvfuqvkyq(gxszxtbevo.this.draadjrbmk()).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public nb.lqeggnwhkg wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return nb.lqeggnwhkg.ulzqkzuiru(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(nb.lqeggnwhkg lqeggnwhkgVar) throws GeneralSecurityException {
            ob.oxmwwwfdhm.iobyxmoadg(lqeggnwhkgVar.tzroggbefp());
            gxszxtbevo.this.ojitshcjhn(lqeggnwhkgVar.mbcevpiqjq());
        }
    }

    gxszxtbevo() {
        super(nb.gxszxtbevo.class, new iobyxmoadg(ob.draadjrbmk.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ojitshcjhn(nb.nufgyqmvbu nufgyqmvbuVar) throws GeneralSecurityException {
        if (nufgyqmvbuVar.kegysxyocb() < 12 || nufgyqmvbuVar.kegysxyocb() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(nb.gxszxtbevo gxszxtbevoVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(gxszxtbevoVar.ulzqkzuiru(), draadjrbmk());
        ob.oxmwwwfdhm.iobyxmoadg(gxszxtbevoVar.mbcevpiqjq().size());
        ojitshcjhn(gxszxtbevoVar.ntlheqmsrt());
    }

    public int draadjrbmk() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(nb.lqeggnwhkg.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public nb.esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return nb.esjtqupxsv.ppxfxbqfkf.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public nb.gxszxtbevo nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return nb.gxszxtbevo.crxdokpmqz(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }
}

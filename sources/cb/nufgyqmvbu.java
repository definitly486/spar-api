package cb;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nufgyqmvbu extends com.google.crypto.tink.internal.wkgbmnqykc {

    class iobyxmoadg extends com.google.crypto.tink.internal.wflxmlrfwp {
        iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public bb.iobyxmoadg iobyxmoadg(nb.dxjokdxxww dxjokdxxwwVar) {
            return new ob.zoijcleaow(dxjokdxxwwVar.tzroggbefp().zynmafqrjb(), dxjokdxxwwVar.mbcevpiqjq().kegysxyocb());
        }
    }

    class zoijcleaow extends com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public nb.dxjokdxxww iobyxmoadg(nb.btonecajqb btonecajqbVar) {
            return (nb.dxjokdxxww) nb.dxjokdxxww.ulzqkzuiru().agtfadlqog(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu.draadjrbmk(ob.rgvfuqvkyq.ppxfxbqfkf(btonecajqbVar.kegysxyocb()))).ojitshcjhn(btonecajqbVar.tzroggbefp()).rgvfuqvkyq(nufgyqmvbu.this.wflxmlrfwp()).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public nb.btonecajqb wkgbmnqykc(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
            return nb.btonecajqb.ntlheqmsrt(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(nb.btonecajqb btonecajqbVar) throws GeneralSecurityException {
            ob.oxmwwwfdhm.iobyxmoadg(btonecajqbVar.kegysxyocb());
            if (btonecajqbVar.tzroggbefp().kegysxyocb() != 12 && btonecajqbVar.tzroggbefp().kegysxyocb() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        public Map ppxfxbqfkf() {
            HashMap map = new HashMap();
            bb.draadjrbmk.zoijcleaow zoijcleaowVar = bb.draadjrbmk.zoijcleaow.TINK;
            map.put("AES128_EAX", nufgyqmvbu.draadjrbmk(16, 16, zoijcleaowVar));
            bb.draadjrbmk.zoijcleaow zoijcleaowVar2 = bb.draadjrbmk.zoijcleaow.RAW;
            map.put("AES128_EAX_RAW", nufgyqmvbu.draadjrbmk(16, 16, zoijcleaowVar2));
            map.put("AES256_EAX", nufgyqmvbu.draadjrbmk(32, 16, zoijcleaowVar));
            map.put("AES256_EAX_RAW", nufgyqmvbu.draadjrbmk(32, 16, zoijcleaowVar2));
            return Collections.unmodifiableMap(map);
        }
    }

    nufgyqmvbu() {
        super(nb.dxjokdxxww.class, new iobyxmoadg(bb.iobyxmoadg.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg draadjrbmk(int i13, int i14, bb.draadjrbmk.zoijcleaow zoijcleaowVar) {
        return new com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg((nb.btonecajqb) nb.btonecajqb.mbcevpiqjq().agtfadlqog(i13).ojitshcjhn((nb.gtknphoqwx) nb.gtknphoqwx.tzroggbefp().agtfadlqog(i14).ppxfxbqfkf()).ppxfxbqfkf(), zoijcleaowVar);
    }

    public static void ojitshcjhn(boolean z13) {
        bb.cqumvgiudr.draadjrbmk(new nufgyqmvbu(), z13);
        agtfadlqog.ppxfxbqfkf();
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public nb.dxjokdxxww nufgyqmvbu(com.google.crypto.tink.shaded.protobuf.nufgyqmvbu nufgyqmvbuVar) {
        return nb.dxjokdxxww.sopmlzcsov(nufgyqmvbuVar, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(nb.btonecajqb.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public nb.esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return nb.esjtqupxsv.ppxfxbqfkf.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(nb.dxjokdxxww dxjokdxxwwVar) throws GeneralSecurityException {
        ob.oxmwwwfdhm.ppxfxbqfkf(dxjokdxxwwVar.ntlheqmsrt(), wflxmlrfwp());
        ob.oxmwwwfdhm.iobyxmoadg(dxjokdxxwwVar.tzroggbefp().size());
        if (dxjokdxxwwVar.mbcevpiqjq().kegysxyocb() != 12 && dxjokdxxwwVar.mbcevpiqjq().kegysxyocb() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public int wflxmlrfwp() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }
}

package hb;

import bb.cqumvgiudr;
import bb.draadjrbmk;
import bb.eablkybsjg;
import com.google.crypto.tink.internal.wflxmlrfwp;
import com.google.crypto.tink.internal.wkgbmnqykc;
import com.google.crypto.tink.shaded.protobuf.nufgyqmvbu;
import com.google.crypto.tink.shaded.protobuf.ojitshcjhn;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nb.esjtqupxsv;
import nb.rgvfuqvkyq;
import nb.vdvldrhtss;
import ob.oxmwwwfdhm;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg extends wkgbmnqykc {

    /* JADX INFO: renamed from: hb.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0926iobyxmoadg extends wflxmlrfwp {
        C0926iobyxmoadg(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wflxmlrfwp
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public eablkybsjg iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
            return new ob.wkgbmnqykc(rgvfuqvkyqVar.kegysxyocb().zynmafqrjb());
        }
    }

    class zoijcleaow extends wkgbmnqykc.iobyxmoadg {
        zoijcleaow(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public rgvfuqvkyq iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
            return (rgvfuqvkyq) rgvfuqvkyq.mbcevpiqjq().agtfadlqog(nufgyqmvbu.draadjrbmk(ob.rgvfuqvkyq.ppxfxbqfkf(vdvldrhtssVar.stevsuqkhv()))).ojitshcjhn(iobyxmoadg.this.gtknphoqwx()).ppxfxbqfkf();
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public vdvldrhtss wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar) {
            return vdvldrhtss.tzroggbefp(nufgyqmvbuVar, ojitshcjhn.zoijcleaow());
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public void eablkybsjg(vdvldrhtss vdvldrhtssVar) throws InvalidAlgorithmParameterException {
            if (vdvldrhtssVar.stevsuqkhv() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + vdvldrhtssVar.stevsuqkhv() + ". Valid keys must have 64 bytes.");
        }

        @Override // com.google.crypto.tink.internal.wkgbmnqykc.iobyxmoadg
        public Map ppxfxbqfkf() {
            HashMap map = new HashMap();
            map.put("AES256_SIV", new wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg((vdvldrhtss) vdvldrhtss.kegysxyocb().agtfadlqog(64).ppxfxbqfkf(), draadjrbmk.zoijcleaow.TINK));
            map.put("AES256_SIV_RAW", new wkgbmnqykc.iobyxmoadg.C0412iobyxmoadg((vdvldrhtss) vdvldrhtss.kegysxyocb().agtfadlqog(64).ppxfxbqfkf(), draadjrbmk.zoijcleaow.RAW));
            return Collections.unmodifiableMap(map);
        }
    }

    iobyxmoadg() {
        super(rgvfuqvkyq.class, new C0926iobyxmoadg(eablkybsjg.class));
    }

    public static void wflxmlrfwp(boolean z13) {
        cqumvgiudr.draadjrbmk(new iobyxmoadg(), z13);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public void btonecajqb(rgvfuqvkyq rgvfuqvkyqVar) throws GeneralSecurityException {
        oxmwwwfdhm.ppxfxbqfkf(rgvfuqvkyqVar.tzroggbefp(), gtknphoqwx());
        if (rgvfuqvkyqVar.kegysxyocb().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + rgvfuqvkyqVar.kegysxyocb().size() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public rgvfuqvkyq nufgyqmvbu(nufgyqmvbu nufgyqmvbuVar) {
        return rgvfuqvkyq.ntlheqmsrt(nufgyqmvbuVar, ojitshcjhn.zoijcleaow());
    }

    public int gtknphoqwx() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public wkgbmnqykc.iobyxmoadg gxszxtbevo() {
        return new zoijcleaow(vdvldrhtss.class);
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public esjtqupxsv.ppxfxbqfkf lqeggnwhkg() {
        return esjtqupxsv.ppxfxbqfkf.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.wkgbmnqykc
    public String wkgbmnqykc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }
}

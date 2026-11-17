package p8;

import g9.draadjrbmk;
import g9.gtknphoqwx;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final g9.nufgyqmvbu f75975iobyxmoadg = new g9.nufgyqmvbu(1000);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final u1.eablkybsjg f75976zoijcleaow = h9.iobyxmoadg.wkgbmnqykc(10, new iobyxmoadg());

    class iobyxmoadg implements h9.iobyxmoadg.wkgbmnqykc {
        iobyxmoadg() {
        }

        @Override // h9.iobyxmoadg.wkgbmnqykc
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public zoijcleaow iobyxmoadg() {
            try {
                return new zoijcleaow(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e13) {
                throw new RuntimeException(e13);
            }
        }
    }

    private static final class zoijcleaow implements h9.iobyxmoadg.gxszxtbevo {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final h9.ppxfxbqfkf f75978yggfygwlhe = h9.ppxfxbqfkf.iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final MessageDigest f75979zdlpuopuiu;

        zoijcleaow(MessageDigest messageDigest) {
            this.f75979zdlpuopuiu = messageDigest;
        }

        @Override // h9.iobyxmoadg.gxszxtbevo
        public h9.ppxfxbqfkf eablkybsjg() {
            return this.f75978yggfygwlhe;
        }
    }

    private String iobyxmoadg(l8.eablkybsjg eablkybsjgVar) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) gtknphoqwx.eablkybsjg((zoijcleaow) this.f75976zoijcleaow.zoijcleaow());
        try {
            eablkybsjgVar.zoijcleaow(zoijcleaowVar.f75979zdlpuopuiu);
            return draadjrbmk.iwizpuwonk(zoijcleaowVar.f75979zdlpuopuiu.digest());
        } finally {
            this.f75976zoijcleaow.iobyxmoadg(zoijcleaowVar);
        }
    }

    public String zoijcleaow(l8.eablkybsjg eablkybsjgVar) {
        String strIobyxmoadg;
        synchronized (this.f75975iobyxmoadg) {
            strIobyxmoadg = (String) this.f75975iobyxmoadg.lqeggnwhkg(eablkybsjgVar);
        }
        if (strIobyxmoadg == null) {
            strIobyxmoadg = iobyxmoadg(eablkybsjgVar);
        }
        synchronized (this.f75975iobyxmoadg) {
            this.f75975iobyxmoadg.gtknphoqwx(eablkybsjgVar, strIobyxmoadg);
        }
        return strIobyxmoadg;
    }
}

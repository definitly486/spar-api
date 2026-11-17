package l8;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final zoijcleaow f61830eablkybsjg = new iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f61831iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f61832ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile byte[] f61833wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f61834zoijcleaow;

    class iobyxmoadg implements zoijcleaow {
        iobyxmoadg() {
        }

        @Override // l8.gxszxtbevo.zoijcleaow
        public void iobyxmoadg(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private gxszxtbevo(String str, Object obj, zoijcleaow zoijcleaowVar) {
        this.f61832ppxfxbqfkf = g9.gtknphoqwx.ppxfxbqfkf(str);
        this.f61831iobyxmoadg = obj;
        this.f61834zoijcleaow = (zoijcleaow) g9.gtknphoqwx.eablkybsjg(zoijcleaowVar);
    }

    public static gxszxtbevo eablkybsjg(String str) {
        return new gxszxtbevo(str, null, zoijcleaow());
    }

    public static gxszxtbevo gxszxtbevo(String str, Object obj) {
        return new gxszxtbevo(str, obj, zoijcleaow());
    }

    public static gxszxtbevo iobyxmoadg(String str, Object obj, zoijcleaow zoijcleaowVar) {
        return new gxszxtbevo(str, obj, zoijcleaowVar);
    }

    private byte[] wkgbmnqykc() {
        if (this.f61833wkgbmnqykc == null) {
            this.f61833wkgbmnqykc = this.f61832ppxfxbqfkf.getBytes(eablkybsjg.f61829iobyxmoadg);
        }
        return this.f61833wkgbmnqykc;
    }

    private static zoijcleaow zoijcleaow() {
        return f61830eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (obj instanceof gxszxtbevo) {
            return this.f61832ppxfxbqfkf.equals(((gxszxtbevo) obj).f61832ppxfxbqfkf);
        }
        return false;
    }

    public int hashCode() {
        return this.f61832ppxfxbqfkf.hashCode();
    }

    public void lqeggnwhkg(Object obj, MessageDigest messageDigest) {
        this.f61834zoijcleaow.iobyxmoadg(wkgbmnqykc(), obj, messageDigest);
    }

    public Object ppxfxbqfkf() {
        return this.f61831iobyxmoadg;
    }

    public String toString() {
        return "Option{key='" + this.f61832ppxfxbqfkf + "'}";
    }
}

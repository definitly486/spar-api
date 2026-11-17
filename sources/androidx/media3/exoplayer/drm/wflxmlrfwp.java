package androidx.media3.exoplayer.drm;

import g3.h0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface wflxmlrfwp {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final byte[] f10478iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f10479ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f10480zoijcleaow;

        public iobyxmoadg(byte[] bArr, String str, int i13) {
            this.f10478iobyxmoadg = bArr;
            this.f10480zoijcleaow = str;
            this.f10479ppxfxbqfkf = i13;
        }

        public byte[] iobyxmoadg() {
            return this.f10478iobyxmoadg;
        }

        public String zoijcleaow() {
            return this.f10480zoijcleaow;
        }
    }

    public interface ppxfxbqfkf {
        wflxmlrfwp iobyxmoadg(UUID uuid);
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final byte[] f10481iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f10482zoijcleaow;

        public wkgbmnqykc(byte[] bArr, String str) {
            this.f10481iobyxmoadg = bArr;
            this.f10482zoijcleaow = str;
        }

        public byte[] iobyxmoadg() {
            return this.f10481iobyxmoadg;
        }

        public String zoijcleaow() {
            return this.f10482zoijcleaow;
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, byte[] bArr, int i13, int i14, byte[] bArr2);
    }

    void btonecajqb(byte[] bArr);

    void draadjrbmk(zoijcleaow zoijcleaowVar);

    boolean dxjokdxxww(byte[] bArr, String str);

    void eablkybsjg(byte[] bArr, byte[] bArr2);

    byte[] gtknphoqwx(byte[] bArr, byte[] bArr2);

    void gxszxtbevo(byte[] bArr);

    Map iobyxmoadg(byte[] bArr);

    int lqeggnwhkg();

    e3.zoijcleaow nufgyqmvbu(byte[] bArr);

    wkgbmnqykc ppxfxbqfkf();

    void release();

    iobyxmoadg wflxmlrfwp(byte[] bArr, List list, int i13, HashMap map);

    byte[] wkgbmnqykc();

    default void zoijcleaow(byte[] bArr, h0 h0Var) {
    }
}

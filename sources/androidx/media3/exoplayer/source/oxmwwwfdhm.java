package androidx.media3.exoplayer.source;

import android.os.Handler;
import g3.h0;

/* JADX INFO: loaded from: classes.dex */
public interface oxmwwwfdhm {

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f11260iobyxmoadg = zdlpuopuiu.f11333zoijcleaow;

        iobyxmoadg eablkybsjg(i3.gtknphoqwx gtknphoqwxVar);

        iobyxmoadg gxszxtbevo(androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar);

        default iobyxmoadg iobyxmoadg(q4.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar) {
            return this;
        }

        default iobyxmoadg lqeggnwhkg(boolean z13) {
            return this;
        }

        default iobyxmoadg ppxfxbqfkf(int i13) {
            return this;
        }

        oxmwwwfdhm wkgbmnqykc(v2.kcexrzcfyt kcexrzcfytVar);
    }

    public interface ppxfxbqfkf {
        void iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar, v2.cdpycssgdh cdpycssgdhVar);
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final int f11261eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Object f11262iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f11263ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final long f11264wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f11265zoijcleaow;

        public zoijcleaow(Object obj) {
            this(obj, -1L);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f11262iobyxmoadg.equals(zoijcleaowVar.f11262iobyxmoadg) && this.f11265zoijcleaow == zoijcleaowVar.f11265zoijcleaow && this.f11263ppxfxbqfkf == zoijcleaowVar.f11263ppxfxbqfkf && this.f11264wkgbmnqykc == zoijcleaowVar.f11264wkgbmnqykc && this.f11261eablkybsjg == zoijcleaowVar.f11261eablkybsjg;
        }

        public int hashCode() {
            return ((((((((527 + this.f11262iobyxmoadg.hashCode()) * 31) + this.f11265zoijcleaow) * 31) + this.f11263ppxfxbqfkf) * 31) + ((int) this.f11264wkgbmnqykc)) * 31) + this.f11261eablkybsjg;
        }

        public zoijcleaow iobyxmoadg(Object obj) {
            return this.f11262iobyxmoadg.equals(obj) ? this : new zoijcleaow(obj, this.f11265zoijcleaow, this.f11263ppxfxbqfkf, this.f11264wkgbmnqykc, this.f11261eablkybsjg);
        }

        public boolean zoijcleaow() {
            return this.f11265zoijcleaow != -1;
        }

        public zoijcleaow(Object obj, long j13) {
            this(obj, -1, -1, j13, -1);
        }

        public zoijcleaow(Object obj, long j13, int i13) {
            this(obj, -1, -1, j13, i13);
        }

        public zoijcleaow(Object obj, int i13, int i14, long j13) {
            this(obj, i13, i14, j13, -1);
        }

        private zoijcleaow(Object obj, int i13, int i14, long j13, int i15) {
            this.f11262iobyxmoadg = obj;
            this.f11265zoijcleaow = i13;
            this.f11263ppxfxbqfkf = i14;
            this.f11264wkgbmnqykc = j13;
            this.f11261eablkybsjg = i15;
        }
    }

    default boolean agtfadlqog() {
        return true;
    }

    default void btonecajqb(v2.kcexrzcfyt kcexrzcfytVar) {
    }

    void draadjrbmk(ppxfxbqfkf ppxfxbqfkfVar);

    void dxjokdxxww(ppxfxbqfkf ppxfxbqfkfVar);

    void eablkybsjg(Handler handler, androidx.media3.exoplayer.drm.nufgyqmvbu nufgyqmvbuVar);

    void gtknphoqwx(ppxfxbqfkf ppxfxbqfkfVar);

    void gxszxtbevo(androidx.media3.exoplayer.drm.nufgyqmvbu nufgyqmvbuVar);

    void iobyxmoadg(Handler handler, kcexrzcfyt kcexrzcfytVar);

    void lqeggnwhkg(vdvldrhtss vdvldrhtssVar);

    void nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar, b3.wflxmlrfwp wflxmlrfwpVar, h0 h0Var);

    default v2.cdpycssgdh ojitshcjhn() {
        return null;
    }

    v2.kcexrzcfyt ppxfxbqfkf();

    vdvldrhtss rgvfuqvkyq(zoijcleaow zoijcleaowVar, p3.zoijcleaow zoijcleaowVar2, long j13);

    void wflxmlrfwp();

    void zoijcleaow(kcexrzcfyt kcexrzcfytVar);
}

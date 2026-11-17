package androidx.media3.exoplayer.drm;

import android.os.Looper;
import g3.h0;

/* JADX INFO: loaded from: classes.dex */
public interface dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final dxjokdxxww f10458iobyxmoadg = new iobyxmoadg();

    class iobyxmoadg implements dxjokdxxww {
        iobyxmoadg() {
        }

        @Override // androidx.media3.exoplayer.drm.dxjokdxxww
        public int eablkybsjg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            return iobyxmoadgVar.f9764kcexrzcfyt != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.dxjokdxxww
        public void ppxfxbqfkf(Looper looper, h0 h0Var) {
        }

        @Override // androidx.media3.exoplayer.drm.dxjokdxxww
        public DrmSession wkgbmnqykc(nufgyqmvbu.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) {
            if (iobyxmoadgVar2.f9764kcexrzcfyt == null) {
                return null;
            }
            return new draadjrbmk(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }
    }

    public interface zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f10459iobyxmoadg = new zoijcleaow() { // from class: i3.btonecajqb
            @Override // androidx.media3.exoplayer.drm.dxjokdxxww.zoijcleaow
            public final void release() {
                androidx.media3.exoplayer.drm.dxjokdxxww.zoijcleaow.zoijcleaow();
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void zoijcleaow() {
        }

        void release();
    }

    int eablkybsjg(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    default zoijcleaow gxszxtbevo(nufgyqmvbu.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2) {
        return zoijcleaow.f10459iobyxmoadg;
    }

    void ppxfxbqfkf(Looper looper, h0 h0Var);

    default void release() {
    }

    DrmSession wkgbmnqykc(nufgyqmvbu.iobyxmoadg iobyxmoadgVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar2);

    default void zoijcleaow() {
    }
}

package androidx.media3.exoplayer.drm;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f10447zdlpuopuiu;

        public DrmSessionException(Throwable th2, int i13) {
            super(th2);
            this.f10447zdlpuopuiu = i13;
        }
    }

    static void ppxfxbqfkf(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.gxszxtbevo(null);
        }
        if (drmSession != null) {
            drmSession.nufgyqmvbu(null);
        }
    }

    boolean dxjokdxxww(String str);

    e3.zoijcleaow eablkybsjg();

    int getState();

    void gxszxtbevo(nufgyqmvbu.iobyxmoadg iobyxmoadgVar);

    UUID iobyxmoadg();

    Map lqeggnwhkg();

    void nufgyqmvbu(nufgyqmvbu.iobyxmoadg iobyxmoadgVar);

    DrmSessionException wkgbmnqykc();

    boolean zoijcleaow();
}

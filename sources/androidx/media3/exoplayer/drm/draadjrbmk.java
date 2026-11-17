package androidx.media3.exoplayer.drm;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk implements DrmSession {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final DrmSession.DrmSessionException f10457iobyxmoadg;

    public draadjrbmk(DrmSession.DrmSessionException drmSessionException) {
        this.f10457iobyxmoadg = (DrmSession.DrmSessionException) y2.iobyxmoadg.eablkybsjg(drmSessionException);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean dxjokdxxww(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public e3.zoijcleaow eablkybsjg() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void gxszxtbevo(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID iobyxmoadg() {
        return v2.nufgyqmvbu.f115645iobyxmoadg;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map lqeggnwhkg() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void nufgyqmvbu(nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public DrmSession.DrmSessionException wkgbmnqykc() {
        return this.f10457iobyxmoadg;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean zoijcleaow() {
        return false;
    }
}

package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final long f10448iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final Map f10449jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final Uri f10450yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final b3.lqeggnwhkg f10451zdlpuopuiu;

    public MediaDrmCallbackException(b3.lqeggnwhkg lqeggnwhkgVar, Uri uri, Map map, long j13, Throwable th2) {
        super(th2);
        this.f10451zdlpuopuiu = lqeggnwhkgVar;
        this.f10450yggfygwlhe = uri;
        this.f10449jyumaefscl = map;
        this.f10448iwizpuwonk = j13;
    }
}

package androidx.media3.common;

import android.os.Bundle;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final Bundle f9639jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final long f9640yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final int f9641zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final String f9635iwizpuwonk = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final String f9633cqumvgiudr = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final String f9634esjtqupxsv = stevsuqkhv.uawqvzlxes(2);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final String f9636lereixgezr = stevsuqkhv.uawqvzlxes(3);

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final String f9637pmvmpeiblj = stevsuqkhv.uawqvzlxes(4);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final String f9638zynmafqrjb = stevsuqkhv.uawqvzlxes(5);

    protected PlaybackException(String str, Throwable th2, int i13, Bundle bundle, long j13) {
        super(str, th2);
        this.f9641zdlpuopuiu = i13;
        this.f9639jyumaefscl = bundle;
        this.f9640yggfygwlhe = j13;
    }
}

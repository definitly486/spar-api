package h3;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iozdgvuglv implements Executor {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Handler f39243zdlpuopuiu;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f39243zdlpuopuiu.post(runnable);
    }
}

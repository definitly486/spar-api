package ge;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
final class hcddaimhww implements Closeable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final /* synthetic */ ojitshcjhn f36910zdlpuopuiu;

    /* synthetic */ hcddaimhww(ojitshcjhn ojitshcjhnVar, pkzmftpjix pkzmftpjixVar) {
        this.f36910zdlpuopuiu = ojitshcjhnVar;
        Preconditions.checkState(((Thread) ojitshcjhnVar.f36928wkgbmnqykc.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f36910zdlpuopuiu.f36928wkgbmnqykc.set(null);
        this.f36910zdlpuopuiu.wkgbmnqykc();
    }
}

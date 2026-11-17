package pj;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class jhduphickx implements Executor {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final pkzmftpjix f76727zdlpuopuiu;

    public jhduphickx(pkzmftpjix pkzmftpjixVar) {
        this.f76727zdlpuopuiu = pkzmftpjixVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        pkzmftpjix pkzmftpjixVar = this.f76727zdlpuopuiu;
        lg.gtknphoqwx gtknphoqwxVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        if (pkzmftpjixVar.ulzqkzuiru(gtknphoqwxVar)) {
            this.f76727zdlpuopuiu.dsvhmnatus(gtknphoqwxVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f76727zdlpuopuiu.toString();
    }
}

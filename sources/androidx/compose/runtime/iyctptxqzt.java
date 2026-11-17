package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class iyctptxqzt implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final /* synthetic */ tg.draadjrbmk f5694zdlpuopuiu;

    public iyctptxqzt(tg.draadjrbmk draadjrbmkVar) {
        this.f5694zdlpuopuiu = draadjrbmkVar;
    }

    @Override // tg.draadjrbmk
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return iobyxmoadg(((Number) obj).longValue());
    }

    public final Object iobyxmoadg(long j13) {
        return this.f5694zdlpuopuiu.invoke(Long.valueOf(j13 / 1000000));
    }
}

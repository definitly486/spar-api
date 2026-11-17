package bz;

/* JADX INFO: loaded from: classes2.dex */
public class a extends RuntimeException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final m f17374zdlpuopuiu;

    a(m mVar) {
        this.f17374zdlpuopuiu = mVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "\n\n\tCircular dependency detected:\n" + this.f17374zdlpuopuiu;
    }
}

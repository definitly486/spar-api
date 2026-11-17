package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf implements lg.gxszxtbevo {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final ppxfxbqfkf f59996zdlpuopuiu = new ppxfxbqfkf();

    private ppxfxbqfkf() {
    }

    @Override // lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // lg.gxszxtbevo
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}

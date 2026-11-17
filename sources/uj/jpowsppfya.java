package uj;

/* JADX INFO: loaded from: classes3.dex */
public final class jpowsppfya implements lg.btonecajqb.ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ThreadLocal f113650zdlpuopuiu;

    public jpowsppfya(ThreadLocal threadLocal) {
        this.f113650zdlpuopuiu = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpowsppfya) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113650zdlpuopuiu, ((jpowsppfya) obj).f113650zdlpuopuiu);
    }

    public int hashCode() {
        return this.f113650zdlpuopuiu.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f113650zdlpuopuiu + ')';
    }
}

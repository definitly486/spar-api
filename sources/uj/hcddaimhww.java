package uj;

import pj.a;

/* JADX INFO: loaded from: classes3.dex */
public final class hcddaimhww implements a {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final lg.btonecajqb.ppxfxbqfkf f113644jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ThreadLocal f113645yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f113646zdlpuopuiu;

    public hcddaimhww(Object obj, ThreadLocal threadLocal) {
        this.f113646zdlpuopuiu = obj;
        this.f113645yggfygwlhe = threadLocal;
        this.f113644jyumaefscl = new jpowsppfya(threadLocal);
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return a.iobyxmoadg.iobyxmoadg(this, obj, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public lg.btonecajqb.zoijcleaow get(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getKey(), ppxfxbqfkfVar)) {
            return null;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // lg.btonecajqb.zoijcleaow
    public lg.btonecajqb.ppxfxbqfkf getKey() {
        return this.f113644jyumaefscl;
    }

    @Override // pj.a
    public void istkbnxepw(lg.btonecajqb btonecajqbVar, Object obj) {
        this.f113645yggfygwlhe.set(obj);
    }

    @Override // pj.a
    public Object jyumaefscl(lg.btonecajqb btonecajqbVar) {
        Object obj = this.f113645yggfygwlhe.get();
        this.f113645yggfygwlhe.set(this.f113646zdlpuopuiu);
        return obj;
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb minusKey(lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getKey(), ppxfxbqfkfVar) ? lg.gtknphoqwx.f62507zdlpuopuiu : this;
    }

    @Override // lg.btonecajqb
    public lg.btonecajqb plus(lg.btonecajqb btonecajqbVar) {
        return a.iobyxmoadg.zoijcleaow(this, btonecajqbVar);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f113646zdlpuopuiu + ", threadLocal = " + this.f113645yggfygwlhe + ')';
    }
}

package v0;

import h.a;
import h.jztzpxfvev;
import h.oipsdeybqn;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf implements rgvfuqvkyq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f115016ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a f115017zoijcleaow;

    public ppxfxbqfkf(a aVar, float f13) {
        this.f115017zoijcleaow = aVar;
        this.f115016ppxfxbqfkf = f13;
    }

    public final a btonecajqb() {
        return this.f115017zoijcleaow;
    }

    @Override // v0.rgvfuqvkyq
    public jztzpxfvev dxjokdxxww() {
        return this.f115017zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f115017zoijcleaow, ppxfxbqfkfVar.f115017zoijcleaow) && Float.compare(this.f115016ppxfxbqfkf, ppxfxbqfkfVar.f115016ppxfxbqfkf) == 0;
    }

    public int hashCode() {
        return (this.f115017zoijcleaow.hashCode() * 31) + Float.hashCode(this.f115016ppxfxbqfkf);
    }

    @Override // v0.rgvfuqvkyq
    public float iobyxmoadg() {
        return this.f115016ppxfxbqfkf;
    }

    public String toString() {
        return "BrushStyle(value=" + this.f115017zoijcleaow + ", alpha=" + this.f115016ppxfxbqfkf + ')';
    }

    @Override // v0.rgvfuqvkyq
    public long zoijcleaow() {
        return oipsdeybqn.f38945zoijcleaow.lqeggnwhkg();
    }
}

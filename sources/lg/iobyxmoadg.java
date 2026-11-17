package lg;

import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements btonecajqb.zoijcleaow {
    private final btonecajqb.ppxfxbqfkf key;

    public iobyxmoadg(btonecajqb.ppxfxbqfkf key) {
        zdlpuopuiu.btonecajqb(key, "key");
        this.key = key;
    }

    @Override // lg.btonecajqb
    public <R> R fold(R r13, rgvfuqvkyq rgvfuqvkyqVar) {
        return (R) btonecajqb.zoijcleaow.iobyxmoadg.iobyxmoadg(this, r13, rgvfuqvkyqVar);
    }

    @Override // lg.btonecajqb.zoijcleaow, lg.btonecajqb
    public <E extends btonecajqb.zoijcleaow> E get(btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return (E) btonecajqb.zoijcleaow.iobyxmoadg.zoijcleaow(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb.zoijcleaow
    public btonecajqb.ppxfxbqfkf getKey() {
        return this.key;
    }

    @Override // lg.btonecajqb
    public btonecajqb minusKey(btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
        return btonecajqb.zoijcleaow.iobyxmoadg.ppxfxbqfkf(this, ppxfxbqfkfVar);
    }

    @Override // lg.btonecajqb
    public btonecajqb plus(btonecajqb btonecajqbVar) {
        return btonecajqb.zoijcleaow.iobyxmoadg.wkgbmnqykc(this, btonecajqbVar);
    }
}

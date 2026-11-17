package t2;

import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends iobyxmoadg {
    /* JADX WARN: Multi-variable type inference failed */
    public wkgbmnqykc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // t2.iobyxmoadg
    public Object iobyxmoadg(iobyxmoadg.ppxfxbqfkf key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return zoijcleaow().get(key);
    }

    public final void ppxfxbqfkf(iobyxmoadg.ppxfxbqfkf key, Object obj) {
        zdlpuopuiu.btonecajqb(key, "key");
        zoijcleaow().put(key, obj);
    }

    public wkgbmnqykc(Map initialExtras) {
        zdlpuopuiu.btonecajqb(initialExtras, "initialExtras");
        zoijcleaow().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(iobyxmoadg initialExtras) {
        this(initialExtras.zoijcleaow());
        zdlpuopuiu.btonecajqb(initialExtras, "initialExtras");
    }

    public /* synthetic */ wkgbmnqykc(iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf : iobyxmoadgVar);
    }
}

package ag;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends ag.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final btonecajqb f1714zoijcleaow = eablkybsjg.iobyxmoadg(Collections.emptyMap());

    public static final class zoijcleaow extends ag.iobyxmoadg.AbstractC0036iobyxmoadg {
        public zoijcleaow ppxfxbqfkf(Object obj, btonecajqb btonecajqbVar) {
            super.iobyxmoadg(obj, btonecajqbVar);
            return this;
        }

        public zoijcleaow wkgbmnqykc(Object obj, fg.iobyxmoadg iobyxmoadgVar) {
            return ppxfxbqfkf(obj, gtknphoqwx.iobyxmoadg(iobyxmoadgVar));
        }

        public lqeggnwhkg zoijcleaow() {
            return new lqeggnwhkg(this.f1713iobyxmoadg);
        }

        private zoijcleaow(int i13) {
            super(i13);
        }
    }

    public static zoijcleaow zoijcleaow(int i13) {
        return new zoijcleaow(i13);
    }

    @Override // fg.iobyxmoadg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Map get() {
        LinkedHashMap linkedHashMapZoijcleaow = ag.zoijcleaow.zoijcleaow(iobyxmoadg().size());
        for (Map.Entry entry : iobyxmoadg().entrySet()) {
            linkedHashMapZoijcleaow.put(entry.getKey(), ((btonecajqb) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMapZoijcleaow);
    }

    private lqeggnwhkg(Map map) {
        super(map);
    }
}

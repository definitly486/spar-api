package gj;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConcurrentHashMap f37558iobyxmoadg = new ConcurrentHashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicInteger f37559zoijcleaow = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gxszxtbevo(lereixgezr lereixgezrVar, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return lereixgezrVar.f37559zoijcleaow.getAndIncrement();
    }

    public final int eablkybsjg(String keyQualifiedName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keyQualifiedName, "keyQualifiedName");
        return zoijcleaow(this.f37558iobyxmoadg, keyQualifiedName, new esjtqupxsv(this));
    }

    protected final Collection lqeggnwhkg() {
        Collection collectionValues = this.f37558iobyxmoadg.values();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    public final agtfadlqog ppxfxbqfkf(ah.wkgbmnqykc kClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kClass, "kClass");
        return new agtfadlqog(wkgbmnqykc(kClass));
    }

    public final int wkgbmnqykc(ah.wkgbmnqykc kClass) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kClass, "kClass");
        String strYggfygwlhe = kClass.yggfygwlhe();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(strYggfygwlhe);
        return eablkybsjg(strYggfygwlhe);
    }

    public abstract int zoijcleaow(ConcurrentHashMap concurrentHashMap, String str, tg.draadjrbmk draadjrbmkVar);
}

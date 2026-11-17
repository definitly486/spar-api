package gj;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: gj.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractC0850iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f37548iobyxmoadg;

        public AbstractC0850iobyxmoadg(int i13) {
            this.f37548iobyxmoadg = i13;
        }

        protected final Object ppxfxbqfkf(iobyxmoadg thisRef) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(thisRef, "thisRef");
            return thisRef.iobyxmoadg().get(this.f37548iobyxmoadg);
        }
    }

    protected abstract ppxfxbqfkf iobyxmoadg();

    public final boolean isEmpty() {
        return iobyxmoadg().iobyxmoadg() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return iobyxmoadg().iterator();
    }

    protected final void ppxfxbqfkf(ah.wkgbmnqykc tClass, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tClass, "tClass");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        String strYggfygwlhe = tClass.yggfygwlhe();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(strYggfygwlhe);
        wkgbmnqykc(strYggfygwlhe, value);
    }

    protected abstract void wkgbmnqykc(String str, Object obj);

    protected abstract lereixgezr zoijcleaow();
}

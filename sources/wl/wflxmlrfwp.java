package wl;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final ThreadLocal f120188iobyxmoadg = ThreadLocal.withInitial(new Supplier() { // from class: wl.draadjrbmk
        @Override // java.util.function.Supplier
        public final Object get() {
            return wflxmlrfwp.wkgbmnqykc();
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Supplier f120189zoijcleaow;

    public wflxmlrfwp(Supplier supplier) {
        this.f120189zoijcleaow = supplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SoftReference wkgbmnqykc() {
        return new SoftReference(new ArrayDeque());
    }

    public void eablkybsjg(Object obj) {
        ArrayDeque arrayDequePpxfxbqfkf = ppxfxbqfkf();
        if (arrayDequePpxfxbqfkf.size() < 12) {
            arrayDequePpxfxbqfkf.push(obj);
        }
    }

    ArrayDeque ppxfxbqfkf() {
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) this.f120188iobyxmoadg.get()).get();
        if (arrayDeque != null) {
            return arrayDeque;
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        this.f120188iobyxmoadg.set(new SoftReference(arrayDeque2));
        return arrayDeque2;
    }

    public Object zoijcleaow() {
        ArrayDeque arrayDequePpxfxbqfkf = ppxfxbqfkf();
        return !arrayDequePpxfxbqfkf.isEmpty() ? arrayDequePpxfxbqfkf.pop() : this.f120189zoijcleaow.get();
    }
}

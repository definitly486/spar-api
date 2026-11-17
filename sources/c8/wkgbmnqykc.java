package c8;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends AtomicReference implements eablkybsjg {
        iobyxmoadg(Object obj) {
            super(obj);
        }

        @Override // c8.eablkybsjg
        public Object getValue() {
            return get();
        }
    }

    public static final eablkybsjg iobyxmoadg(Object obj) {
        return new iobyxmoadg(obj);
    }
}

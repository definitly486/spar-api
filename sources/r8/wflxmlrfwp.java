package r8;

import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final g9.nufgyqmvbu f82109iobyxmoadg;

    class iobyxmoadg extends g9.nufgyqmvbu {
        iobyxmoadg(long j13) {
            super(j13);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // g9.nufgyqmvbu
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public void btonecajqb(zoijcleaow zoijcleaowVar, Object obj) {
            zoijcleaowVar.ppxfxbqfkf();
        }
    }

    static final class zoijcleaow {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final Queue f82111wkgbmnqykc = g9.draadjrbmk.gxszxtbevo(0);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f82112iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Object f82113ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f82114zoijcleaow;

        private zoijcleaow() {
        }

        static zoijcleaow iobyxmoadg(Object obj, int i13, int i14) {
            zoijcleaow zoijcleaowVar;
            Queue queue = f82111wkgbmnqykc;
            synchronized (queue) {
                zoijcleaowVar = (zoijcleaow) queue.poll();
            }
            if (zoijcleaowVar == null) {
                zoijcleaowVar = new zoijcleaow();
            }
            zoijcleaowVar.zoijcleaow(obj, i13, i14);
            return zoijcleaowVar;
        }

        private void zoijcleaow(Object obj, int i13, int i14) {
            this.f82113ppxfxbqfkf = obj;
            this.f82114zoijcleaow = i13;
            this.f82112iobyxmoadg = i14;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f82114zoijcleaow == zoijcleaowVar.f82114zoijcleaow && this.f82112iobyxmoadg == zoijcleaowVar.f82112iobyxmoadg && this.f82113ppxfxbqfkf.equals(zoijcleaowVar.f82113ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f82112iobyxmoadg * 31) + this.f82114zoijcleaow) * 31) + this.f82113ppxfxbqfkf.hashCode();
        }

        public void ppxfxbqfkf() {
            Queue queue = f82111wkgbmnqykc;
            synchronized (queue) {
                queue.offer(this);
            }
        }
    }

    public wflxmlrfwp(long j13) {
        this.f82109iobyxmoadg = new iobyxmoadg(j13);
    }

    public Object iobyxmoadg(Object obj, int i13, int i14) {
        zoijcleaow zoijcleaowVarIobyxmoadg = zoijcleaow.iobyxmoadg(obj, i13, i14);
        Object objLqeggnwhkg = this.f82109iobyxmoadg.lqeggnwhkg(zoijcleaowVarIobyxmoadg);
        zoijcleaowVarIobyxmoadg.ppxfxbqfkf();
        return objLqeggnwhkg;
    }

    public void zoijcleaow(Object obj, int i13, int i14, Object obj2) {
        this.f82109iobyxmoadg.gtknphoqwx(zoijcleaow.iobyxmoadg(obj, i13, i14), obj2);
    }
}

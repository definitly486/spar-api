package kh;

import hg.jyumaefscl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface nufgyqmvbu extends Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f55413nufgyqmvbu = iobyxmoadg.f55414iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f55414iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final nufgyqmvbu f55415zoijcleaow = new C1179iobyxmoadg();

        /* JADX INFO: renamed from: kh.nufgyqmvbu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1179iobyxmoadg implements nufgyqmvbu {
            C1179iobyxmoadg() {
            }

            public Void iobyxmoadg(ii.ppxfxbqfkf fqName) {
                zdlpuopuiu.btonecajqb(fqName, "fqName");
                return null;
            }

            @Override // kh.nufgyqmvbu
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return jyumaefscl.wflxmlrfwp().iterator();
            }

            @Override // kh.nufgyqmvbu
            public /* bridge */ /* synthetic */ ppxfxbqfkf lqeggnwhkg(ii.ppxfxbqfkf ppxfxbqfkfVar) {
                return (ppxfxbqfkf) iobyxmoadg(ppxfxbqfkfVar);
            }

            public String toString() {
                return "EMPTY";
            }

            @Override // kh.nufgyqmvbu
            public boolean wizcaqwiak(ii.ppxfxbqfkf ppxfxbqfkfVar) {
                return zoijcleaow.zoijcleaow(this, ppxfxbqfkfVar);
            }
        }

        private iobyxmoadg() {
        }

        public final nufgyqmvbu iobyxmoadg(List annotations) {
            zdlpuopuiu.btonecajqb(annotations, "annotations");
            return annotations.isEmpty() ? f55415zoijcleaow : new dxjokdxxww(annotations);
        }

        public final nufgyqmvbu zoijcleaow() {
            return f55415zoijcleaow;
        }
    }

    public static final class zoijcleaow {
        public static ppxfxbqfkf iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, ii.ppxfxbqfkf fqName) {
            Object next;
            zdlpuopuiu.btonecajqb(fqName, "fqName");
            Iterator it = nufgyqmvbuVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (zdlpuopuiu.eablkybsjg(((ppxfxbqfkf) next).gxszxtbevo(), fqName)) {
                    return (ppxfxbqfkf) next;
                }
            }
            next = null;
            return (ppxfxbqfkf) next;
        }

        public static boolean zoijcleaow(nufgyqmvbu nufgyqmvbuVar, ii.ppxfxbqfkf fqName) {
            zdlpuopuiu.btonecajqb(fqName, "fqName");
            return nufgyqmvbuVar.lqeggnwhkg(fqName) != null;
        }
    }

    boolean isEmpty();

    ppxfxbqfkf lqeggnwhkg(ii.ppxfxbqfkf ppxfxbqfkfVar);

    boolean wizcaqwiak(ii.ppxfxbqfkf ppxfxbqfkfVar);
}

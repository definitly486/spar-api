package z7;

import gg.wwaezpbzkn;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y7.gxszxtbevo f129241iobyxmoadg = new y7.gxszxtbevo(new C3281zoijcleaow(this));

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Map f129242zoijcleaow = new LinkedHashMap();

    private static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: z7.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3279iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C3279iobyxmoadg f129243iobyxmoadg = new C3279iobyxmoadg();

            private C3279iobyxmoadg() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3279iobyxmoadg);
            }

            public int hashCode() {
                return -1525461462;
            }

            public String toString() {
                return "OnComplete";
            }
        }

        public static final class ppxfxbqfkf extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Object f129244iobyxmoadg;

            public ppxfxbqfkf(Object obj) {
                super(null);
                this.f129244iobyxmoadg = obj;
            }

            public final Object iobyxmoadg() {
                return this.f129244iobyxmoadg;
            }
        }

        public static final class wkgbmnqykc extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final y7.ppxfxbqfkf f129245iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final y7.iobyxmoadg f129246zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public wkgbmnqykc(y7.ppxfxbqfkf observer, y7.iobyxmoadg disposable) {
                super(null);
                zdlpuopuiu.btonecajqb(observer, "observer");
                zdlpuopuiu.btonecajqb(disposable, "disposable");
                this.f129245iobyxmoadg = observer;
                this.f129246zoijcleaow = disposable;
            }

            public final y7.iobyxmoadg iobyxmoadg() {
                return this.f129246zoijcleaow;
            }

            public final y7.ppxfxbqfkf zoijcleaow() {
                return this.f129245iobyxmoadg;
            }
        }

        /* JADX INFO: renamed from: z7.zoijcleaow$iobyxmoadg$zoijcleaow, reason: collision with other inner class name */
        public static final class C3280zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final y7.iobyxmoadg f129247iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3280zoijcleaow(y7.iobyxmoadg disposable) {
                super(null);
                zdlpuopuiu.btonecajqb(disposable, "disposable");
                this.f129247iobyxmoadg = disposable;
            }

            public final y7.iobyxmoadg iobyxmoadg() {
                return this.f129247iobyxmoadg;
            }
        }

        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: z7.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C3281zoijcleaow extends vdvldrhtss implements draadjrbmk {
        C3281zoijcleaow(Object obj) {
            super(1, obj, zoijcleaow.class, "onEvent", "onEvent(Lcom/arkivanov/mvikotlin/core/rx/internal/BaseSubject$Event;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((iobyxmoadg) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(iobyxmoadg p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((zoijcleaow) this.receiver).dxjokdxxww(p13);
        }
    }

    private final void btonecajqb(Object obj) {
        Collection collectionValues;
        gxszxtbevo(obj);
        Map map = this.f129242zoijcleaow;
        if (map == null || (collectionValues = map.values()) == null) {
            return;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((y7.ppxfxbqfkf) it.next()).iobyxmoadg(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn draadjrbmk(zoijcleaow zoijcleaowVar, y7.iobyxmoadg Disposable) {
        zdlpuopuiu.btonecajqb(Disposable, "$this$Disposable");
        zoijcleaowVar.f129241iobyxmoadg.zoijcleaow(new iobyxmoadg.C3280zoijcleaow(Disposable));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dxjokdxxww(iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar instanceof iobyxmoadg.wkgbmnqykc) {
            iobyxmoadg.wkgbmnqykc wkgbmnqykcVar = (iobyxmoadg.wkgbmnqykc) iobyxmoadgVar;
            gtknphoqwx(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.iobyxmoadg());
        } else if (iobyxmoadgVar instanceof iobyxmoadg.ppxfxbqfkf) {
            btonecajqb(((iobyxmoadg.ppxfxbqfkf) iobyxmoadgVar).iobyxmoadg());
        } else if (iobyxmoadgVar instanceof iobyxmoadg.C3279iobyxmoadg) {
            lqeggnwhkg();
        } else {
            if (!(iobyxmoadgVar instanceof iobyxmoadg.C3280zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            nufgyqmvbu(((iobyxmoadg.C3280zoijcleaow) iobyxmoadgVar).iobyxmoadg());
        }
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void gtknphoqwx(y7.ppxfxbqfkf ppxfxbqfkfVar, y7.iobyxmoadg iobyxmoadgVar) {
        Map map = this.f129242zoijcleaow;
        if (map == null) {
            ppxfxbqfkfVar.onComplete();
            iobyxmoadgVar.iobyxmoadg();
        } else {
            map.put(iobyxmoadgVar, ppxfxbqfkfVar);
            eablkybsjg(ppxfxbqfkfVar);
        }
    }

    private final void lqeggnwhkg() {
        Map map = this.f129242zoijcleaow;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                y7.iobyxmoadg iobyxmoadgVar = (y7.iobyxmoadg) entry.getKey();
                ((y7.ppxfxbqfkf) entry.getValue()).onComplete();
                iobyxmoadgVar.iobyxmoadg();
            }
        }
        this.f129242zoijcleaow = null;
    }

    private final void nufgyqmvbu(y7.iobyxmoadg iobyxmoadgVar) {
        Map map = this.f129242zoijcleaow;
        if (map != null) {
        }
    }

    protected void eablkybsjg(y7.ppxfxbqfkf observer) {
        zdlpuopuiu.btonecajqb(observer, "observer");
    }

    protected void gxszxtbevo(Object obj) {
    }

    @Override // z7.dxjokdxxww, y7.ppxfxbqfkf
    public void iobyxmoadg(Object obj) {
        this.f129241iobyxmoadg.zoijcleaow(new iobyxmoadg.ppxfxbqfkf(obj));
    }

    @Override // z7.dxjokdxxww
    public boolean isActive() {
        return this.f129242zoijcleaow != null;
    }

    @Override // z7.dxjokdxxww, y7.ppxfxbqfkf
    public void onComplete() {
        this.f129241iobyxmoadg.zoijcleaow(iobyxmoadg.C3279iobyxmoadg.f129243iobyxmoadg);
    }

    @Override // z7.dxjokdxxww
    public y7.iobyxmoadg zoijcleaow(y7.ppxfxbqfkf observer) {
        zdlpuopuiu.btonecajqb(observer, "observer");
        y7.iobyxmoadg iobyxmoadgVarIobyxmoadg = y7.zoijcleaow.iobyxmoadg(new draadjrbmk() { // from class: z7.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return zoijcleaow.draadjrbmk(this.f129239zdlpuopuiu, (y7.iobyxmoadg) obj);
            }
        });
        this.f129241iobyxmoadg.zoijcleaow(new iobyxmoadg.wkgbmnqykc(observer, iobyxmoadgVarIobyxmoadg));
        return iobyxmoadgVarIobyxmoadg;
    }
}

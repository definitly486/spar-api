package zi;

import java.util.ArrayDeque;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class lrnfpwlwnk {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Set f130059btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private ArrayDeque f130060dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vdvldrhtss f130061eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final oxmwwwfdhm f130062gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f130063iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f130064lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f130065nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f130066ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dj.ojitshcjhn f130067wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f130068zoijcleaow;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: zi.lrnfpwlwnk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3314iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private boolean f130069iobyxmoadg;

            @Override // zi.lrnfpwlwnk.iobyxmoadg
            public void iobyxmoadg(tg.iobyxmoadg block) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
                if (this.f130069iobyxmoadg) {
                    return;
                }
                this.f130069iobyxmoadg = ((Boolean) block.invoke()).booleanValue();
            }

            public final boolean zoijcleaow() {
                return this.f130069iobyxmoadg;
            }
        }

        void iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar);
    }

    public static abstract class ppxfxbqfkf {

        public static abstract class iobyxmoadg extends ppxfxbqfkf {
            public iobyxmoadg() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: zi.lrnfpwlwnk$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C3315ppxfxbqfkf extends ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C3315ppxfxbqfkf f130070iobyxmoadg = new C3315ppxfxbqfkf();

            private C3315ppxfxbqfkf() {
                super(null);
            }

            @Override // zi.lrnfpwlwnk.ppxfxbqfkf
            public /* bridge */ /* synthetic */ dj.btonecajqb iobyxmoadg(lrnfpwlwnk lrnfpwlwnkVar, dj.dxjokdxxww dxjokdxxwwVar) {
                return (dj.btonecajqb) zoijcleaow(lrnfpwlwnkVar, dxjokdxxwwVar);
            }

            public Void zoijcleaow(lrnfpwlwnk state, dj.dxjokdxxww type) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class wkgbmnqykc extends ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final wkgbmnqykc f130071iobyxmoadg = new wkgbmnqykc();

            private wkgbmnqykc() {
                super(null);
            }

            @Override // zi.lrnfpwlwnk.ppxfxbqfkf
            public dj.btonecajqb iobyxmoadg(lrnfpwlwnk state, dj.dxjokdxxww type) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
                return state.btonecajqb().igdgnonuha(type);
            }
        }

        public static final class zoijcleaow extends ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f130072iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
                super(null);
            }

            @Override // zi.lrnfpwlwnk.ppxfxbqfkf
            public dj.btonecajqb iobyxmoadg(lrnfpwlwnk state, dj.dxjokdxxww type) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
                return state.btonecajqb().zdlpuopuiu(type);
            }
        }

        public /* synthetic */ ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public abstract dj.btonecajqb iobyxmoadg(lrnfpwlwnk lrnfpwlwnkVar, dj.dxjokdxxww dxjokdxxwwVar);

        private ppxfxbqfkf() {
        }
    }

    public enum zoijcleaow {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f130073cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public lrnfpwlwnk(boolean z13, boolean z14, boolean z15, dj.ojitshcjhn typeSystemContext, vdvldrhtss kotlinTypePreparator, oxmwwwfdhm kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f130063iobyxmoadg = z13;
        this.f130068zoijcleaow = z14;
        this.f130066ppxfxbqfkf = z15;
        this.f130067wkgbmnqykc = typeSystemContext;
        this.f130061eablkybsjg = kotlinTypePreparator;
        this.f130062gxszxtbevo = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean wkgbmnqykc(lrnfpwlwnk lrnfpwlwnkVar, dj.dxjokdxxww dxjokdxxwwVar, dj.dxjokdxxww dxjokdxxwwVar2, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return lrnfpwlwnkVar.ppxfxbqfkf(dxjokdxxwwVar, dxjokdxxwwVar2, z13);
    }

    public final boolean agtfadlqog() {
        return this.f130068zoijcleaow;
    }

    public final dj.ojitshcjhn btonecajqb() {
        return this.f130067wkgbmnqykc;
    }

    public final boolean draadjrbmk(dj.dxjokdxxww type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        return this.f130066ppxfxbqfkf && this.f130067wkgbmnqykc.wizcaqwiak(type);
    }

    public final Set dxjokdxxww() {
        return this.f130059btonecajqb;
    }

    public final void eablkybsjg() {
        ArrayDeque arrayDeque = this.f130060dxjokdxxww;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(arrayDeque);
        arrayDeque.clear();
        Set set = this.f130059btonecajqb;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(set);
        set.clear();
        this.f130065nufgyqmvbu = false;
    }

    public final void gtknphoqwx() {
        this.f130065nufgyqmvbu = true;
        if (this.f130060dxjokdxxww == null) {
            this.f130060dxjokdxxww = new ArrayDeque(4);
        }
        if (this.f130059btonecajqb == null) {
            this.f130059btonecajqb = jj.draadjrbmk.f51581jyumaefscl.iobyxmoadg();
        }
    }

    public boolean gxszxtbevo(dj.dxjokdxxww subType, dj.dxjokdxxww superType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
        return true;
    }

    public zoijcleaow lqeggnwhkg(dj.btonecajqb subType, dj.wkgbmnqykc superType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
        return zoijcleaow.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque nufgyqmvbu() {
        return this.f130060dxjokdxxww;
    }

    public final dj.dxjokdxxww ojitshcjhn(dj.dxjokdxxww type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        return this.f130061eablkybsjg.iobyxmoadg(type);
    }

    public Boolean ppxfxbqfkf(dj.dxjokdxxww subType, dj.dxjokdxxww superType, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
        return null;
    }

    public final dj.dxjokdxxww rgvfuqvkyq(dj.dxjokdxxww type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        return this.f130062gxszxtbevo.iobyxmoadg(type);
    }

    public boolean vdvldrhtss(tg.draadjrbmk block) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        iobyxmoadg.C3314iobyxmoadg c3314iobyxmoadg = new iobyxmoadg.C3314iobyxmoadg();
        block.invoke(c3314iobyxmoadg);
        return c3314iobyxmoadg.zoijcleaow();
    }

    public final boolean wflxmlrfwp() {
        return this.f130063iobyxmoadg;
    }
}

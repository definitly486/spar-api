package ub;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f113150eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lqeggnwhkg f113151gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113152iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Set f113153lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f113154ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f113155wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f113156zoijcleaow;

    public static ppxfxbqfkf draadjrbmk(final Object obj, Class cls) {
        return wflxmlrfwp(cls).gxszxtbevo(new lqeggnwhkg() { // from class: ub.iobyxmoadg
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
                return ppxfxbqfkf.vdvldrhtss(obj, wkgbmnqykcVar);
            }
        }).wkgbmnqykc();
    }

    public static zoijcleaow eablkybsjg(pmvmpeiblj pmvmpeibljVar) {
        return new zoijcleaow(pmvmpeibljVar, new pmvmpeiblj[0]);
    }

    public static zoijcleaow gxszxtbevo(pmvmpeiblj pmvmpeibljVar, pmvmpeiblj... pmvmpeibljVarArr) {
        return new zoijcleaow(pmvmpeibljVar, pmvmpeibljVarArr);
    }

    public static ppxfxbqfkf kcexrzcfyt(final Object obj, Class cls, Class... clsArr) {
        return wkgbmnqykc(cls, clsArr).gxszxtbevo(new lqeggnwhkg() { // from class: ub.zoijcleaow
            @Override // ub.lqeggnwhkg
            public final Object iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
                return ppxfxbqfkf.oxmwwwfdhm(obj, wkgbmnqykcVar);
            }
        }).wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object oxmwwwfdhm(Object obj, wkgbmnqykc wkgbmnqykcVar) {
        return obj;
    }

    public static zoijcleaow ppxfxbqfkf(Class cls) {
        return new zoijcleaow(cls, new Class[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object vdvldrhtss(Object obj, wkgbmnqykc wkgbmnqykcVar) {
        return obj;
    }

    public static zoijcleaow wflxmlrfwp(Class cls) {
        return ppxfxbqfkf(cls).lqeggnwhkg();
    }

    public static zoijcleaow wkgbmnqykc(Class cls, Class... clsArr) {
        return new zoijcleaow(cls, clsArr);
    }

    public boolean agtfadlqog() {
        return this.f113155wkgbmnqykc == 1;
    }

    public Set btonecajqb() {
        return this.f113156zoijcleaow;
    }

    public String dxjokdxxww() {
        return this.f113152iobyxmoadg;
    }

    public Set gtknphoqwx() {
        return this.f113153lqeggnwhkg;
    }

    public Set lqeggnwhkg() {
        return this.f113154ppxfxbqfkf;
    }

    public lqeggnwhkg nufgyqmvbu() {
        return this.f113151gxszxtbevo;
    }

    public boolean ojitshcjhn() {
        return this.f113155wkgbmnqykc == 2;
    }

    public boolean rgvfuqvkyq() {
        return this.f113150eablkybsjg == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f113156zoijcleaow.toArray()) + ">{" + this.f113155wkgbmnqykc + ", type=" + this.f113150eablkybsjg + ", deps=" + Arrays.toString(this.f113154ppxfxbqfkf.toArray()) + "}";
    }

    public ppxfxbqfkf zdlpuopuiu(lqeggnwhkg lqeggnwhkgVar) {
        return new ppxfxbqfkf(this.f113152iobyxmoadg, this.f113156zoijcleaow, this.f113154ppxfxbqfkf, this.f113155wkgbmnqykc, this.f113150eablkybsjg, lqeggnwhkgVar, this.f113153lqeggnwhkg);
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f113157eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private lqeggnwhkg f113158gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f113159iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final Set f113160lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Set f113161ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f113162wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Set f113163zoijcleaow;

        private void btonecajqb(pmvmpeiblj pmvmpeibljVar) {
            lereixgezr.iobyxmoadg(!this.f113163zoijcleaow.contains(pmvmpeibljVar), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        private zoijcleaow dxjokdxxww(int i13) {
            lereixgezr.wkgbmnqykc(this.f113162wkgbmnqykc == 0, "Instantiation type has already been set.");
            this.f113162wkgbmnqykc = i13;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public zoijcleaow lqeggnwhkg() {
            this.f113157eablkybsjg = 1;
            return this;
        }

        public zoijcleaow eablkybsjg() {
            return dxjokdxxww(2);
        }

        public zoijcleaow gxszxtbevo(lqeggnwhkg lqeggnwhkgVar) {
            this.f113158gxszxtbevo = (lqeggnwhkg) lereixgezr.ppxfxbqfkf(lqeggnwhkgVar, "Null factory");
            return this;
        }

        public zoijcleaow nufgyqmvbu(String str) {
            this.f113159iobyxmoadg = str;
            return this;
        }

        public zoijcleaow ppxfxbqfkf() {
            return dxjokdxxww(1);
        }

        public ppxfxbqfkf wkgbmnqykc() {
            lereixgezr.wkgbmnqykc(this.f113158gxszxtbevo != null, "Missing required property: factory.");
            return new ppxfxbqfkf(this.f113159iobyxmoadg, new HashSet(this.f113163zoijcleaow), new HashSet(this.f113161ppxfxbqfkf), this.f113162wkgbmnqykc, this.f113157eablkybsjg, this.f113158gxszxtbevo, this.f113160lqeggnwhkg);
        }

        public zoijcleaow zoijcleaow(vdvldrhtss vdvldrhtssVar) {
            lereixgezr.ppxfxbqfkf(vdvldrhtssVar, "Null dependency");
            btonecajqb(vdvldrhtssVar.ppxfxbqfkf());
            this.f113161ppxfxbqfkf.add(vdvldrhtssVar);
            return this;
        }

        private zoijcleaow(Class cls, Class... clsArr) {
            this.f113159iobyxmoadg = null;
            HashSet hashSet = new HashSet();
            this.f113163zoijcleaow = hashSet;
            this.f113161ppxfxbqfkf = new HashSet();
            this.f113162wkgbmnqykc = 0;
            this.f113157eablkybsjg = 0;
            this.f113160lqeggnwhkg = new HashSet();
            lereixgezr.ppxfxbqfkf(cls, "Null interface");
            hashSet.add(pmvmpeiblj.zoijcleaow(cls));
            for (Class cls2 : clsArr) {
                lereixgezr.ppxfxbqfkf(cls2, "Null interface");
                this.f113163zoijcleaow.add(pmvmpeiblj.zoijcleaow(cls2));
            }
        }

        private zoijcleaow(pmvmpeiblj pmvmpeibljVar, pmvmpeiblj... pmvmpeibljVarArr) {
            this.f113159iobyxmoadg = null;
            HashSet hashSet = new HashSet();
            this.f113163zoijcleaow = hashSet;
            this.f113161ppxfxbqfkf = new HashSet();
            this.f113162wkgbmnqykc = 0;
            this.f113157eablkybsjg = 0;
            this.f113160lqeggnwhkg = new HashSet();
            lereixgezr.ppxfxbqfkf(pmvmpeibljVar, "Null interface");
            hashSet.add(pmvmpeibljVar);
            for (pmvmpeiblj pmvmpeibljVar2 : pmvmpeibljVarArr) {
                lereixgezr.ppxfxbqfkf(pmvmpeibljVar2, "Null interface");
            }
            Collections.addAll(this.f113163zoijcleaow, pmvmpeibljVarArr);
        }
    }

    private ppxfxbqfkf(String str, Set set, Set set2, int i13, int i14, lqeggnwhkg lqeggnwhkgVar, Set set3) {
        this.f113152iobyxmoadg = str;
        this.f113156zoijcleaow = Collections.unmodifiableSet(set);
        this.f113154ppxfxbqfkf = Collections.unmodifiableSet(set2);
        this.f113155wkgbmnqykc = i13;
        this.f113150eablkybsjg = i14;
        this.f113151gxszxtbevo = lqeggnwhkgVar;
        this.f113153lqeggnwhkg = Collections.unmodifiableSet(set3);
    }
}

package m;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f64662iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f64663zoijcleaow;

    public static final class agtfadlqog extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64664ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64665wkgbmnqykc;

        /* JADX WARN: Illegal instructions before constructor call */
        public agtfadlqog(float f13, float f14) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f64664ppxfxbqfkf = f13;
            this.f64665wkgbmnqykc = f14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof agtfadlqog)) {
                return false;
            }
            agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
            return Float.compare(this.f64664ppxfxbqfkf, agtfadlqogVar.f64664ppxfxbqfkf) == 0 && Float.compare(this.f64665wkgbmnqykc, agtfadlqogVar.f64665wkgbmnqykc) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64664ppxfxbqfkf) * 31) + Float.hashCode(this.f64665wkgbmnqykc);
        }

        public final float ppxfxbqfkf() {
            return this.f64664ppxfxbqfkf;
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f64664ppxfxbqfkf + ", dy=" + this.f64665wkgbmnqykc + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64665wkgbmnqykc;
        }
    }

    public static final class btonecajqb extends nufgyqmvbu {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final float f64666dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f64667eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f64668gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final boolean f64669lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final float f64670nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64671ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64672wkgbmnqykc;

        /* JADX WARN: Illegal instructions before constructor call */
        public btonecajqb(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
            boolean z15 = false;
            super(z15, z15, 3, null);
            this.f64671ppxfxbqfkf = f13;
            this.f64672wkgbmnqykc = f14;
            this.f64667eablkybsjg = f15;
            this.f64668gxszxtbevo = z13;
            this.f64669lqeggnwhkg = z14;
            this.f64670nufgyqmvbu = f16;
            this.f64666dxjokdxxww = f17;
        }

        public final boolean dxjokdxxww() {
            return this.f64669lqeggnwhkg;
        }

        public final float eablkybsjg() {
            return this.f64671ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return Float.compare(this.f64671ppxfxbqfkf, btonecajqbVar.f64671ppxfxbqfkf) == 0 && Float.compare(this.f64672wkgbmnqykc, btonecajqbVar.f64672wkgbmnqykc) == 0 && Float.compare(this.f64667eablkybsjg, btonecajqbVar.f64667eablkybsjg) == 0 && this.f64668gxszxtbevo == btonecajqbVar.f64668gxszxtbevo && this.f64669lqeggnwhkg == btonecajqbVar.f64669lqeggnwhkg && Float.compare(this.f64670nufgyqmvbu, btonecajqbVar.f64670nufgyqmvbu) == 0 && Float.compare(this.f64666dxjokdxxww, btonecajqbVar.f64666dxjokdxxww) == 0;
        }

        public final float gxszxtbevo() {
            return this.f64667eablkybsjg;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f64671ppxfxbqfkf) * 31) + Float.hashCode(this.f64672wkgbmnqykc)) * 31) + Float.hashCode(this.f64667eablkybsjg)) * 31) + Boolean.hashCode(this.f64668gxszxtbevo)) * 31) + Boolean.hashCode(this.f64669lqeggnwhkg)) * 31) + Float.hashCode(this.f64670nufgyqmvbu)) * 31) + Float.hashCode(this.f64666dxjokdxxww);
        }

        public final float lqeggnwhkg() {
            return this.f64672wkgbmnqykc;
        }

        public final boolean nufgyqmvbu() {
            return this.f64668gxszxtbevo;
        }

        public final float ppxfxbqfkf() {
            return this.f64670nufgyqmvbu;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f64671ppxfxbqfkf + ", verticalEllipseRadius=" + this.f64672wkgbmnqykc + ", theta=" + this.f64667eablkybsjg + ", isMoreThanHalf=" + this.f64668gxszxtbevo + ", isPositiveArc=" + this.f64669lqeggnwhkg + ", arcStartDx=" + this.f64670nufgyqmvbu + ", arcStartDy=" + this.f64666dxjokdxxww + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64666dxjokdxxww;
        }
    }

    public static final class draadjrbmk extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64673ppxfxbqfkf;

        /* JADX WARN: Illegal instructions before constructor call */
        public draadjrbmk(float f13) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f64673ppxfxbqfkf = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof draadjrbmk) && Float.compare(this.f64673ppxfxbqfkf, ((draadjrbmk) obj).f64673ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f64673ppxfxbqfkf);
        }

        public final float ppxfxbqfkf() {
            return this.f64673ppxfxbqfkf;
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f64673ppxfxbqfkf + ')';
        }
    }

    public static final class dxjokdxxww extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64674ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64675wkgbmnqykc;

        public dxjokdxxww(float f13, float f14) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f64674ppxfxbqfkf = f13;
            this.f64675wkgbmnqykc = f14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return Float.compare(this.f64674ppxfxbqfkf, dxjokdxxwwVar.f64674ppxfxbqfkf) == 0 && Float.compare(this.f64675wkgbmnqykc, dxjokdxxwwVar.f64675wkgbmnqykc) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64674ppxfxbqfkf) * 31) + Float.hashCode(this.f64675wkgbmnqykc);
        }

        public final float ppxfxbqfkf() {
            return this.f64674ppxfxbqfkf;
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f64674ppxfxbqfkf + ", y=" + this.f64675wkgbmnqykc + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64675wkgbmnqykc;
        }
    }

    public static final class eablkybsjg extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64676ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64677wkgbmnqykc;

        /* JADX WARN: Illegal instructions before constructor call */
        public eablkybsjg(float f13, float f14) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f64676ppxfxbqfkf = f13;
            this.f64677wkgbmnqykc = f14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return Float.compare(this.f64676ppxfxbqfkf, eablkybsjgVar.f64676ppxfxbqfkf) == 0 && Float.compare(this.f64677wkgbmnqykc, eablkybsjgVar.f64677wkgbmnqykc) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64676ppxfxbqfkf) * 31) + Float.hashCode(this.f64677wkgbmnqykc);
        }

        public final float ppxfxbqfkf() {
            return this.f64676ppxfxbqfkf;
        }

        public String toString() {
            return "LineTo(x=" + this.f64676ppxfxbqfkf + ", y=" + this.f64677wkgbmnqykc + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64677wkgbmnqykc;
        }
    }

    public static final class gtknphoqwx extends nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f64678eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f64679gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final float f64680lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final float f64681nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64682ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64683wkgbmnqykc;

        public gtknphoqwx(float f13, float f14, float f15, float f16, float f17, float f18) {
            super(true, false, 2, null);
            this.f64682ppxfxbqfkf = f13;
            this.f64683wkgbmnqykc = f14;
            this.f64678eablkybsjg = f15;
            this.f64679gxszxtbevo = f16;
            this.f64680lqeggnwhkg = f17;
            this.f64681nufgyqmvbu = f18;
        }

        public final float eablkybsjg() {
            return this.f64680lqeggnwhkg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gtknphoqwx)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
            return Float.compare(this.f64682ppxfxbqfkf, gtknphoqwxVar.f64682ppxfxbqfkf) == 0 && Float.compare(this.f64683wkgbmnqykc, gtknphoqwxVar.f64683wkgbmnqykc) == 0 && Float.compare(this.f64678eablkybsjg, gtknphoqwxVar.f64678eablkybsjg) == 0 && Float.compare(this.f64679gxszxtbevo, gtknphoqwxVar.f64679gxszxtbevo) == 0 && Float.compare(this.f64680lqeggnwhkg, gtknphoqwxVar.f64680lqeggnwhkg) == 0 && Float.compare(this.f64681nufgyqmvbu, gtknphoqwxVar.f64681nufgyqmvbu) == 0;
        }

        public final float gxszxtbevo() {
            return this.f64683wkgbmnqykc;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f64682ppxfxbqfkf) * 31) + Float.hashCode(this.f64683wkgbmnqykc)) * 31) + Float.hashCode(this.f64678eablkybsjg)) * 31) + Float.hashCode(this.f64679gxszxtbevo)) * 31) + Float.hashCode(this.f64680lqeggnwhkg)) * 31) + Float.hashCode(this.f64681nufgyqmvbu);
        }

        public final float lqeggnwhkg() {
            return this.f64679gxszxtbevo;
        }

        public final float nufgyqmvbu() {
            return this.f64681nufgyqmvbu;
        }

        public final float ppxfxbqfkf() {
            return this.f64682ppxfxbqfkf;
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f64682ppxfxbqfkf + ", dy1=" + this.f64683wkgbmnqykc + ", dx2=" + this.f64678eablkybsjg + ", dy2=" + this.f64679gxszxtbevo + ", dx3=" + this.f64680lqeggnwhkg + ", dy3=" + this.f64681nufgyqmvbu + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64678eablkybsjg;
        }
    }

    public static final class gxszxtbevo extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64684ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64685wkgbmnqykc;

        /* JADX WARN: Illegal instructions before constructor call */
        public gxszxtbevo(float f13, float f14) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f64684ppxfxbqfkf = f13;
            this.f64685wkgbmnqykc = f14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return Float.compare(this.f64684ppxfxbqfkf, gxszxtbevoVar.f64684ppxfxbqfkf) == 0 && Float.compare(this.f64685wkgbmnqykc, gxszxtbevoVar.f64685wkgbmnqykc) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64684ppxfxbqfkf) * 31) + Float.hashCode(this.f64685wkgbmnqykc);
        }

        public final float ppxfxbqfkf() {
            return this.f64684ppxfxbqfkf;
        }

        public String toString() {
            return "MoveTo(x=" + this.f64684ppxfxbqfkf + ", y=" + this.f64685wkgbmnqykc + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64685wkgbmnqykc;
        }
    }

    public static final class iobyxmoadg extends nufgyqmvbu {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final float f64686dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f64687eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f64688gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final boolean f64689lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final float f64690nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64691ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64692wkgbmnqykc;

        /* JADX WARN: Illegal instructions before constructor call */
        public iobyxmoadg(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
            boolean z15 = false;
            super(z15, z15, 3, null);
            this.f64691ppxfxbqfkf = f13;
            this.f64692wkgbmnqykc = f14;
            this.f64687eablkybsjg = f15;
            this.f64688gxszxtbevo = z13;
            this.f64689lqeggnwhkg = z14;
            this.f64690nufgyqmvbu = f16;
            this.f64686dxjokdxxww = f17;
        }

        public final boolean dxjokdxxww() {
            return this.f64689lqeggnwhkg;
        }

        public final float eablkybsjg() {
            return this.f64691ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Float.compare(this.f64691ppxfxbqfkf, iobyxmoadgVar.f64691ppxfxbqfkf) == 0 && Float.compare(this.f64692wkgbmnqykc, iobyxmoadgVar.f64692wkgbmnqykc) == 0 && Float.compare(this.f64687eablkybsjg, iobyxmoadgVar.f64687eablkybsjg) == 0 && this.f64688gxszxtbevo == iobyxmoadgVar.f64688gxszxtbevo && this.f64689lqeggnwhkg == iobyxmoadgVar.f64689lqeggnwhkg && Float.compare(this.f64690nufgyqmvbu, iobyxmoadgVar.f64690nufgyqmvbu) == 0 && Float.compare(this.f64686dxjokdxxww, iobyxmoadgVar.f64686dxjokdxxww) == 0;
        }

        public final float gxszxtbevo() {
            return this.f64687eablkybsjg;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f64691ppxfxbqfkf) * 31) + Float.hashCode(this.f64692wkgbmnqykc)) * 31) + Float.hashCode(this.f64687eablkybsjg)) * 31) + Boolean.hashCode(this.f64688gxszxtbevo)) * 31) + Boolean.hashCode(this.f64689lqeggnwhkg)) * 31) + Float.hashCode(this.f64690nufgyqmvbu)) * 31) + Float.hashCode(this.f64686dxjokdxxww);
        }

        public final float lqeggnwhkg() {
            return this.f64692wkgbmnqykc;
        }

        public final boolean nufgyqmvbu() {
            return this.f64688gxszxtbevo;
        }

        public final float ppxfxbqfkf() {
            return this.f64690nufgyqmvbu;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f64691ppxfxbqfkf + ", verticalEllipseRadius=" + this.f64692wkgbmnqykc + ", theta=" + this.f64687eablkybsjg + ", isMoreThanHalf=" + this.f64688gxszxtbevo + ", isPositiveArc=" + this.f64689lqeggnwhkg + ", arcStartX=" + this.f64690nufgyqmvbu + ", arcStartY=" + this.f64686dxjokdxxww + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64686dxjokdxxww;
        }
    }

    public static final class kcexrzcfyt extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64693ppxfxbqfkf;

        /* JADX WARN: Illegal instructions before constructor call */
        public kcexrzcfyt(float f13) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f64693ppxfxbqfkf = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof kcexrzcfyt) && Float.compare(this.f64693ppxfxbqfkf, ((kcexrzcfyt) obj).f64693ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f64693ppxfxbqfkf);
        }

        public final float ppxfxbqfkf() {
            return this.f64693ppxfxbqfkf;
        }

        public String toString() {
            return "VerticalTo(y=" + this.f64693ppxfxbqfkf + ')';
        }
    }

    public static final class lqeggnwhkg extends nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f64694eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f64695gxszxtbevo;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64696ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64697wkgbmnqykc;

        public lqeggnwhkg(float f13, float f14, float f15, float f16) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f64696ppxfxbqfkf = f13;
            this.f64697wkgbmnqykc = f14;
            this.f64694eablkybsjg = f15;
            this.f64695gxszxtbevo = f16;
        }

        public final float eablkybsjg() {
            return this.f64697wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return Float.compare(this.f64696ppxfxbqfkf, lqeggnwhkgVar.f64696ppxfxbqfkf) == 0 && Float.compare(this.f64697wkgbmnqykc, lqeggnwhkgVar.f64697wkgbmnqykc) == 0 && Float.compare(this.f64694eablkybsjg, lqeggnwhkgVar.f64694eablkybsjg) == 0 && Float.compare(this.f64695gxszxtbevo, lqeggnwhkgVar.f64695gxszxtbevo) == 0;
        }

        public final float gxszxtbevo() {
            return this.f64695gxszxtbevo;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f64696ppxfxbqfkf) * 31) + Float.hashCode(this.f64697wkgbmnqykc)) * 31) + Float.hashCode(this.f64694eablkybsjg)) * 31) + Float.hashCode(this.f64695gxszxtbevo);
        }

        public final float ppxfxbqfkf() {
            return this.f64696ppxfxbqfkf;
        }

        public String toString() {
            return "QuadTo(x1=" + this.f64696ppxfxbqfkf + ", y1=" + this.f64697wkgbmnqykc + ", x2=" + this.f64694eablkybsjg + ", y2=" + this.f64695gxszxtbevo + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64694eablkybsjg;
        }
    }

    /* JADX INFO: renamed from: m.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    public static final class C1346nufgyqmvbu extends nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f64698eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f64699gxszxtbevo;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64700ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64701wkgbmnqykc;

        public C1346nufgyqmvbu(float f13, float f14, float f15, float f16) {
            super(true, false, 2, null);
            this.f64700ppxfxbqfkf = f13;
            this.f64701wkgbmnqykc = f14;
            this.f64698eablkybsjg = f15;
            this.f64699gxszxtbevo = f16;
        }

        public final float eablkybsjg() {
            return this.f64701wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1346nufgyqmvbu)) {
                return false;
            }
            C1346nufgyqmvbu c1346nufgyqmvbu = (C1346nufgyqmvbu) obj;
            return Float.compare(this.f64700ppxfxbqfkf, c1346nufgyqmvbu.f64700ppxfxbqfkf) == 0 && Float.compare(this.f64701wkgbmnqykc, c1346nufgyqmvbu.f64701wkgbmnqykc) == 0 && Float.compare(this.f64698eablkybsjg, c1346nufgyqmvbu.f64698eablkybsjg) == 0 && Float.compare(this.f64699gxszxtbevo, c1346nufgyqmvbu.f64699gxszxtbevo) == 0;
        }

        public final float gxszxtbevo() {
            return this.f64699gxszxtbevo;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f64700ppxfxbqfkf) * 31) + Float.hashCode(this.f64701wkgbmnqykc)) * 31) + Float.hashCode(this.f64698eablkybsjg)) * 31) + Float.hashCode(this.f64699gxszxtbevo);
        }

        public final float ppxfxbqfkf() {
            return this.f64700ppxfxbqfkf;
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f64700ppxfxbqfkf + ", y1=" + this.f64701wkgbmnqykc + ", x2=" + this.f64698eablkybsjg + ", y2=" + this.f64699gxszxtbevo + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64698eablkybsjg;
        }
    }

    public static final class ojitshcjhn extends nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f64702eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f64703gxszxtbevo;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64704ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64705wkgbmnqykc;

        public ojitshcjhn(float f13, float f14, float f15, float f16) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f64704ppxfxbqfkf = f13;
            this.f64705wkgbmnqykc = f14;
            this.f64702eablkybsjg = f15;
            this.f64703gxszxtbevo = f16;
        }

        public final float eablkybsjg() {
            return this.f64705wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ojitshcjhn)) {
                return false;
            }
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
            return Float.compare(this.f64704ppxfxbqfkf, ojitshcjhnVar.f64704ppxfxbqfkf) == 0 && Float.compare(this.f64705wkgbmnqykc, ojitshcjhnVar.f64705wkgbmnqykc) == 0 && Float.compare(this.f64702eablkybsjg, ojitshcjhnVar.f64702eablkybsjg) == 0 && Float.compare(this.f64703gxszxtbevo, ojitshcjhnVar.f64703gxszxtbevo) == 0;
        }

        public final float gxszxtbevo() {
            return this.f64703gxszxtbevo;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f64704ppxfxbqfkf) * 31) + Float.hashCode(this.f64705wkgbmnqykc)) * 31) + Float.hashCode(this.f64702eablkybsjg)) * 31) + Float.hashCode(this.f64703gxszxtbevo);
        }

        public final float ppxfxbqfkf() {
            return this.f64704ppxfxbqfkf;
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f64704ppxfxbqfkf + ", dy1=" + this.f64705wkgbmnqykc + ", dx2=" + this.f64702eablkybsjg + ", dy2=" + this.f64703gxszxtbevo + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64702eablkybsjg;
        }
    }

    public static final class oxmwwwfdhm extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64706ppxfxbqfkf;

        /* JADX WARN: Illegal instructions before constructor call */
        public oxmwwwfdhm(float f13) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f64706ppxfxbqfkf = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof oxmwwwfdhm) && Float.compare(this.f64706ppxfxbqfkf, ((oxmwwwfdhm) obj).f64706ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f64706ppxfxbqfkf);
        }

        public final float ppxfxbqfkf() {
            return this.f64706ppxfxbqfkf;
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f64706ppxfxbqfkf + ')';
        }
    }

    public static final class ppxfxbqfkf extends nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f64707eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f64708gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final float f64709lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final float f64710nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64711ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64712wkgbmnqykc;

        public ppxfxbqfkf(float f13, float f14, float f15, float f16, float f17, float f18) {
            super(true, false, 2, null);
            this.f64711ppxfxbqfkf = f13;
            this.f64712wkgbmnqykc = f14;
            this.f64707eablkybsjg = f15;
            this.f64708gxszxtbevo = f16;
            this.f64709lqeggnwhkg = f17;
            this.f64710nufgyqmvbu = f18;
        }

        public final float eablkybsjg() {
            return this.f64709lqeggnwhkg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return Float.compare(this.f64711ppxfxbqfkf, ppxfxbqfkfVar.f64711ppxfxbqfkf) == 0 && Float.compare(this.f64712wkgbmnqykc, ppxfxbqfkfVar.f64712wkgbmnqykc) == 0 && Float.compare(this.f64707eablkybsjg, ppxfxbqfkfVar.f64707eablkybsjg) == 0 && Float.compare(this.f64708gxszxtbevo, ppxfxbqfkfVar.f64708gxszxtbevo) == 0 && Float.compare(this.f64709lqeggnwhkg, ppxfxbqfkfVar.f64709lqeggnwhkg) == 0 && Float.compare(this.f64710nufgyqmvbu, ppxfxbqfkfVar.f64710nufgyqmvbu) == 0;
        }

        public final float gxszxtbevo() {
            return this.f64712wkgbmnqykc;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f64711ppxfxbqfkf) * 31) + Float.hashCode(this.f64712wkgbmnqykc)) * 31) + Float.hashCode(this.f64707eablkybsjg)) * 31) + Float.hashCode(this.f64708gxszxtbevo)) * 31) + Float.hashCode(this.f64709lqeggnwhkg)) * 31) + Float.hashCode(this.f64710nufgyqmvbu);
        }

        public final float lqeggnwhkg() {
            return this.f64708gxszxtbevo;
        }

        public final float nufgyqmvbu() {
            return this.f64710nufgyqmvbu;
        }

        public final float ppxfxbqfkf() {
            return this.f64711ppxfxbqfkf;
        }

        public String toString() {
            return "CurveTo(x1=" + this.f64711ppxfxbqfkf + ", y1=" + this.f64712wkgbmnqykc + ", x2=" + this.f64707eablkybsjg + ", y2=" + this.f64708gxszxtbevo + ", x3=" + this.f64709lqeggnwhkg + ", y3=" + this.f64710nufgyqmvbu + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64707eablkybsjg;
        }
    }

    public static final class rgvfuqvkyq extends nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f64713eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f64714gxszxtbevo;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64715ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64716wkgbmnqykc;

        public rgvfuqvkyq(float f13, float f14, float f15, float f16) {
            super(true, false, 2, null);
            this.f64715ppxfxbqfkf = f13;
            this.f64716wkgbmnqykc = f14;
            this.f64713eablkybsjg = f15;
            this.f64714gxszxtbevo = f16;
        }

        public final float eablkybsjg() {
            return this.f64716wkgbmnqykc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof rgvfuqvkyq)) {
                return false;
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return Float.compare(this.f64715ppxfxbqfkf, rgvfuqvkyqVar.f64715ppxfxbqfkf) == 0 && Float.compare(this.f64716wkgbmnqykc, rgvfuqvkyqVar.f64716wkgbmnqykc) == 0 && Float.compare(this.f64713eablkybsjg, rgvfuqvkyqVar.f64713eablkybsjg) == 0 && Float.compare(this.f64714gxszxtbevo, rgvfuqvkyqVar.f64714gxszxtbevo) == 0;
        }

        public final float gxszxtbevo() {
            return this.f64714gxszxtbevo;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f64715ppxfxbqfkf) * 31) + Float.hashCode(this.f64716wkgbmnqykc)) * 31) + Float.hashCode(this.f64713eablkybsjg)) * 31) + Float.hashCode(this.f64714gxszxtbevo);
        }

        public final float ppxfxbqfkf() {
            return this.f64715ppxfxbqfkf;
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f64715ppxfxbqfkf + ", dy1=" + this.f64716wkgbmnqykc + ", dx2=" + this.f64713eablkybsjg + ", dy2=" + this.f64714gxszxtbevo + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64713eablkybsjg;
        }
    }

    public static final class vdvldrhtss extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64717ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64718wkgbmnqykc;

        public vdvldrhtss(float f13, float f14) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f64717ppxfxbqfkf = f13;
            this.f64718wkgbmnqykc = f14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof vdvldrhtss)) {
                return false;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
            return Float.compare(this.f64717ppxfxbqfkf, vdvldrhtssVar.f64717ppxfxbqfkf) == 0 && Float.compare(this.f64718wkgbmnqykc, vdvldrhtssVar.f64718wkgbmnqykc) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64717ppxfxbqfkf) * 31) + Float.hashCode(this.f64718wkgbmnqykc);
        }

        public final float ppxfxbqfkf() {
            return this.f64717ppxfxbqfkf;
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f64717ppxfxbqfkf + ", dy=" + this.f64718wkgbmnqykc + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64718wkgbmnqykc;
        }
    }

    public static final class wflxmlrfwp extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64719ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final float f64720wkgbmnqykc;

        /* JADX WARN: Illegal instructions before constructor call */
        public wflxmlrfwp(float f13, float f14) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f64719ppxfxbqfkf = f13;
            this.f64720wkgbmnqykc = f14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wflxmlrfwp)) {
                return false;
            }
            wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
            return Float.compare(this.f64719ppxfxbqfkf, wflxmlrfwpVar.f64719ppxfxbqfkf) == 0 && Float.compare(this.f64720wkgbmnqykc, wflxmlrfwpVar.f64720wkgbmnqykc) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64719ppxfxbqfkf) * 31) + Float.hashCode(this.f64720wkgbmnqykc);
        }

        public final float ppxfxbqfkf() {
            return this.f64719ppxfxbqfkf;
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f64719ppxfxbqfkf + ", dy=" + this.f64720wkgbmnqykc + ')';
        }

        public final float wkgbmnqykc() {
            return this.f64720wkgbmnqykc;
        }
    }

    public static final class wkgbmnqykc extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f64721ppxfxbqfkf;

        /* JADX WARN: Illegal instructions before constructor call */
        public wkgbmnqykc(float f13) {
            boolean z13 = false;
            super(z13, z13, 3, null);
            this.f64721ppxfxbqfkf = f13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && Float.compare(this.f64721ppxfxbqfkf, ((wkgbmnqykc) obj).f64721ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f64721ppxfxbqfkf);
        }

        public final float ppxfxbqfkf() {
            return this.f64721ppxfxbqfkf;
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f64721ppxfxbqfkf + ')';
        }
    }

    public static final class zoijcleaow extends nufgyqmvbu {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final zoijcleaow f64722ppxfxbqfkf = new zoijcleaow();

        /* JADX WARN: Illegal instructions before constructor call */
        private zoijcleaow() {
            boolean z13 = false;
            super(z13, z13, 3, null);
        }
    }

    public /* synthetic */ nufgyqmvbu(boolean z13, boolean z14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(z13, z14);
    }

    public final boolean iobyxmoadg() {
        return this.f64662iobyxmoadg;
    }

    public final boolean zoijcleaow() {
        return this.f64663zoijcleaow;
    }

    private nufgyqmvbu(boolean z13, boolean z14) {
        this.f64662iobyxmoadg = z13;
        this.f64663zoijcleaow = z14;
    }

    public /* synthetic */ nufgyqmvbu(boolean z13, boolean z14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, null);
    }
}

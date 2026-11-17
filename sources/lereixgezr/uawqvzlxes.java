package lereixgezr;

import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public final class uawqvzlxes {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f62416iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f62417ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f62418wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Rational f62419zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f62421ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Rational f62423zoijcleaow;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f62420iobyxmoadg = 1;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f62422wkgbmnqykc = 0;

        public iobyxmoadg(Rational rational, int i13) {
            this.f62423zoijcleaow = rational;
            this.f62421ppxfxbqfkf = i13;
        }

        public uawqvzlxes iobyxmoadg() {
            u1.nufgyqmvbu.lqeggnwhkg(this.f62423zoijcleaow, "The crop aspect ratio must be set.");
            return new uawqvzlxes(this.f62420iobyxmoadg, this.f62423zoijcleaow, this.f62421ppxfxbqfkf, this.f62422wkgbmnqykc);
        }

        public iobyxmoadg ppxfxbqfkf(int i13) {
            this.f62420iobyxmoadg = i13;
            return this;
        }

        public iobyxmoadg zoijcleaow(int i13) {
            this.f62422wkgbmnqykc = i13;
            return this;
        }
    }

    uawqvzlxes(int i13, Rational rational, int i14, int i15) {
        this.f62416iobyxmoadg = i13;
        this.f62419zoijcleaow = rational;
        this.f62417ppxfxbqfkf = i14;
        this.f62418wkgbmnqykc = i15;
    }

    public Rational iobyxmoadg() {
        return this.f62419zoijcleaow;
    }

    public int ppxfxbqfkf() {
        return this.f62417ppxfxbqfkf;
    }

    public int wkgbmnqykc() {
        return this.f62416iobyxmoadg;
    }

    public int zoijcleaow() {
        return this.f62418wkgbmnqykc;
    }
}

package v2;

import android.util.SparseBooleanArray;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SparseBooleanArray f115674iobyxmoadg;

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SparseBooleanArray f115675iobyxmoadg = new SparseBooleanArray();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f115676zoijcleaow;

        public rgvfuqvkyq eablkybsjg() {
            y2.iobyxmoadg.lqeggnwhkg(!this.f115676zoijcleaow);
            this.f115676zoijcleaow = true;
            return new rgvfuqvkyq(this.f115675iobyxmoadg);
        }

        public zoijcleaow iobyxmoadg(int i13) {
            y2.iobyxmoadg.lqeggnwhkg(!this.f115676zoijcleaow);
            this.f115675iobyxmoadg.append(i13, true);
            return this;
        }

        public zoijcleaow ppxfxbqfkf(int... iArr) {
            for (int i13 : iArr) {
                iobyxmoadg(i13);
            }
            return this;
        }

        public zoijcleaow wkgbmnqykc(int i13, boolean z13) {
            return z13 ? iobyxmoadg(i13) : this;
        }

        public zoijcleaow zoijcleaow(rgvfuqvkyq rgvfuqvkyqVar) {
            for (int i13 = 0; i13 < rgvfuqvkyqVar.wkgbmnqykc(); i13++) {
                iobyxmoadg(rgvfuqvkyqVar.ppxfxbqfkf(i13));
            }
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        if (stevsuqkhv.f123602iobyxmoadg >= 24) {
            return this.f115674iobyxmoadg.equals(rgvfuqvkyqVar.f115674iobyxmoadg);
        }
        if (wkgbmnqykc() != rgvfuqvkyqVar.wkgbmnqykc()) {
            return false;
        }
        for (int i13 = 0; i13 < wkgbmnqykc(); i13++) {
            if (ppxfxbqfkf(i13) != rgvfuqvkyqVar.ppxfxbqfkf(i13)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (stevsuqkhv.f123602iobyxmoadg >= 24) {
            return this.f115674iobyxmoadg.hashCode();
        }
        int iWkgbmnqykc = wkgbmnqykc();
        for (int i13 = 0; i13 < wkgbmnqykc(); i13++) {
            iWkgbmnqykc = (iWkgbmnqykc * 31) + ppxfxbqfkf(i13);
        }
        return iWkgbmnqykc;
    }

    public boolean iobyxmoadg(int i13) {
        return this.f115674iobyxmoadg.get(i13);
    }

    public int ppxfxbqfkf(int i13) {
        y2.iobyxmoadg.ppxfxbqfkf(i13, 0, wkgbmnqykc());
        return this.f115674iobyxmoadg.keyAt(i13);
    }

    public int wkgbmnqykc() {
        return this.f115674iobyxmoadg.size();
    }

    public boolean zoijcleaow(int... iArr) {
        for (int i13 : iArr) {
            if (iobyxmoadg(i13)) {
                return true;
            }
        }
        return false;
    }

    private rgvfuqvkyq(SparseBooleanArray sparseBooleanArray) {
        this.f115674iobyxmoadg = sparseBooleanArray;
    }
}

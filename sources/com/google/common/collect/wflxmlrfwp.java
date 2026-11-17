package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final wflxmlrfwp f23692iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final wflxmlrfwp f23694zoijcleaow = new zoijcleaow(-1);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final wflxmlrfwp f23693ppxfxbqfkf = new zoijcleaow(1);

    class iobyxmoadg extends wflxmlrfwp {
        iobyxmoadg() {
            super(null);
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public int dxjokdxxww() {
            return 0;
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp eablkybsjg(long j13, long j14) {
            return gtknphoqwx(Long.compare(j13, j14));
        }

        wflxmlrfwp gtknphoqwx(int i13) {
            if (i13 < 0) {
                return wflxmlrfwp.f23694zoijcleaow;
            }
            return i13 > 0 ? wflxmlrfwp.f23693ppxfxbqfkf : wflxmlrfwp.f23692iobyxmoadg;
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp gxszxtbevo(Object obj, Object obj2, Comparator comparator) {
            return gtknphoqwx(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp lqeggnwhkg(boolean z13, boolean z14) {
            return gtknphoqwx(Boolean.compare(z13, z14));
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp nufgyqmvbu(boolean z13, boolean z14) {
            return gtknphoqwx(Boolean.compare(z14, z13));
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp wkgbmnqykc(int i13, int i14) {
            return gtknphoqwx(Integer.compare(i13, i14));
        }
    }

    private static final class zoijcleaow extends wflxmlrfwp {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final int f23695wkgbmnqykc;

        zoijcleaow(int i13) {
            super(null);
            this.f23695wkgbmnqykc = i13;
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public int dxjokdxxww() {
            return this.f23695wkgbmnqykc;
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp eablkybsjg(long j13, long j14) {
            return this;
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp gxszxtbevo(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp lqeggnwhkg(boolean z13, boolean z14) {
            return this;
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp nufgyqmvbu(boolean z13, boolean z14) {
            return this;
        }

        @Override // com.google.common.collect.wflxmlrfwp
        public wflxmlrfwp wkgbmnqykc(int i13, int i14) {
            return this;
        }
    }

    /* synthetic */ wflxmlrfwp(iobyxmoadg iobyxmoadgVar) {
        this();
    }

    public static wflxmlrfwp btonecajqb() {
        return f23692iobyxmoadg;
    }

    public abstract int dxjokdxxww();

    public abstract wflxmlrfwp eablkybsjg(long j13, long j14);

    public abstract wflxmlrfwp gxszxtbevo(Object obj, Object obj2, Comparator comparator);

    public abstract wflxmlrfwp lqeggnwhkg(boolean z13, boolean z14);

    public abstract wflxmlrfwp nufgyqmvbu(boolean z13, boolean z14);

    public abstract wflxmlrfwp wkgbmnqykc(int i13, int i14);

    private wflxmlrfwp() {
    }
}

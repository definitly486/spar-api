package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import xl.kcexrzcfyt;
import xl.wflxmlrfwp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf extends wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    boolean f74161eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final ArrayList f74162iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f74163ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f74164wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final List f74165zoijcleaow;

    public static final class iobyxmoadg extends ppxfxbqfkf {
        public iobyxmoadg(Collection collection) {
            super(collection);
        }

        @Override // org.jsoup.select.wkgbmnqykc
        public boolean dxjokdxxww(wflxmlrfwp wflxmlrfwpVar, kcexrzcfyt kcexrzcfytVar) {
            for (int i13 = 0; i13 < this.f74163ppxfxbqfkf; i13++) {
                if (!((wkgbmnqykc) this.f74165zoijcleaow.get(i13)).dxjokdxxww(wflxmlrfwpVar, kcexrzcfytVar)) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp wflxmlrfwpVar2) {
            for (int i13 = 0; i13 < this.f74163ppxfxbqfkf; i13++) {
                if (!((wkgbmnqykc) this.f74165zoijcleaow.get(i13)).lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return wl.kcexrzcfyt.rgvfuqvkyq(this.f74162iobyxmoadg, "");
        }

        iobyxmoadg(wkgbmnqykc... wkgbmnqykcVarArr) {
            this(Arrays.asList(wkgbmnqykcVarArr));
        }
    }

    ppxfxbqfkf() {
        this.f74163ppxfxbqfkf = 0;
        this.f74164wkgbmnqykc = 0;
        this.f74162iobyxmoadg = new ArrayList();
        this.f74165zoijcleaow = new ArrayList();
    }

    void agtfadlqog() {
        this.f74163ppxfxbqfkf = this.f74162iobyxmoadg.size();
        this.f74164wkgbmnqykc = 0;
        Iterator it = this.f74162iobyxmoadg.iterator();
        while (it.hasNext()) {
            this.f74164wkgbmnqykc += ((wkgbmnqykc) it.next()).eablkybsjg();
        }
        this.f74165zoijcleaow.clear();
        this.f74165zoijcleaow.addAll(this.f74162iobyxmoadg);
        this.f74165zoijcleaow.sort(Comparator.comparingInt(new ToIntFunction() { // from class: org.jsoup.select.zoijcleaow
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((wkgbmnqykc) obj).eablkybsjg();
            }
        }));
        Iterator it2 = this.f74162iobyxmoadg.iterator();
        while (it2.hasNext()) {
            if (((wkgbmnqykc) it2.next()).draadjrbmk()) {
                this.f74161eablkybsjg = true;
                return;
            }
        }
    }

    @Override // org.jsoup.select.wkgbmnqykc
    boolean draadjrbmk() {
        return this.f74161eablkybsjg;
    }

    @Override // org.jsoup.select.wkgbmnqykc
    protected int eablkybsjg() {
        return this.f74164wkgbmnqykc;
    }

    @Override // org.jsoup.select.wkgbmnqykc
    protected void gtknphoqwx() {
        Iterator it = this.f74162iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((wkgbmnqykc) it.next()).gtknphoqwx();
        }
        super.gtknphoqwx();
    }

    public void wflxmlrfwp(wkgbmnqykc wkgbmnqykcVar) {
        this.f74162iobyxmoadg.add(wkgbmnqykcVar);
        agtfadlqog();
    }

    public static final class zoijcleaow extends ppxfxbqfkf {
        public zoijcleaow(Collection collection) {
            if (this.f74163ppxfxbqfkf > 1) {
                this.f74162iobyxmoadg.add(new iobyxmoadg(collection));
            } else {
                this.f74162iobyxmoadg.addAll(collection);
            }
            agtfadlqog();
        }

        @Override // org.jsoup.select.wkgbmnqykc
        public boolean dxjokdxxww(wflxmlrfwp wflxmlrfwpVar, kcexrzcfyt kcexrzcfytVar) {
            for (int i13 = 0; i13 < this.f74163ppxfxbqfkf; i13++) {
                if (((wkgbmnqykc) this.f74165zoijcleaow.get(i13)).dxjokdxxww(wflxmlrfwpVar, kcexrzcfytVar)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.jsoup.select.wkgbmnqykc
        /* JADX INFO: renamed from: nufgyqmvbu */
        public boolean lqeggnwhkg(wflxmlrfwp wflxmlrfwpVar, wflxmlrfwp wflxmlrfwpVar2) {
            for (int i13 = 0; i13 < this.f74163ppxfxbqfkf; i13++) {
                if (((wkgbmnqykc) this.f74165zoijcleaow.get(i13)).lqeggnwhkg(wflxmlrfwpVar, wflxmlrfwpVar2)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return wl.kcexrzcfyt.rgvfuqvkyq(this.f74162iobyxmoadg, ", ");
        }

        zoijcleaow(wkgbmnqykc... wkgbmnqykcVarArr) {
            this(Arrays.asList(wkgbmnqykcVarArr));
        }
    }

    ppxfxbqfkf(Collection collection) {
        this();
        this.f74162iobyxmoadg.addAll(collection);
        agtfadlqog();
    }
}

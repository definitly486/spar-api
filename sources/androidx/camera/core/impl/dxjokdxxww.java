package androidx.camera.core.impl;

import android.util.Range;
import istkbnxepw.opjhrmiecq;
import istkbnxepw.ulzqkzuiru;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final List f3757eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f3758gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final List f3759iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final opjhrmiecq f3760lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final istkbnxepw.ojitshcjhn f3761nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final int f3762ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final boolean f3763wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final btonecajqb f3764zoijcleaow;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3755dxjokdxxww = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final btonecajqb.iobyxmoadg f3754btonecajqb = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final btonecajqb.iobyxmoadg f3756gtknphoqwx = btonecajqb.iobyxmoadg.iobyxmoadg("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    public interface zoijcleaow {
        void iobyxmoadg(istkbnxepw istkbnxepwVar, iobyxmoadg iobyxmoadgVar);
    }

    dxjokdxxww(List list, btonecajqb btonecajqbVar, int i13, boolean z13, List list2, boolean z14, opjhrmiecq opjhrmiecqVar, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        this.f3759iobyxmoadg = list;
        this.f3764zoijcleaow = btonecajqbVar;
        this.f3762ppxfxbqfkf = i13;
        this.f3757eablkybsjg = Collections.unmodifiableList(list2);
        this.f3758gxszxtbevo = z14;
        this.f3760lqeggnwhkg = opjhrmiecqVar;
        this.f3761nufgyqmvbu = ojitshcjhnVar;
        this.f3763wkgbmnqykc = z13;
    }

    public static dxjokdxxww zoijcleaow() {
        return new iobyxmoadg().nufgyqmvbu();
    }

    public boolean agtfadlqog() {
        return this.f3758gxszxtbevo;
    }

    public opjhrmiecq btonecajqb() {
        return this.f3760lqeggnwhkg;
    }

    public int draadjrbmk() {
        Integer num = (Integer) this.f3764zoijcleaow.lqeggnwhkg(istkbnxepw.f3792cdpycssgdh, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List dxjokdxxww() {
        return Collections.unmodifiableList(this.f3759iobyxmoadg);
    }

    public Range eablkybsjg() {
        Range range = (Range) this.f3764zoijcleaow.lqeggnwhkg(f3756gtknphoqwx, iwizpuwonk.f3803iobyxmoadg);
        Objects.requireNonNull(range);
        return range;
    }

    public int gtknphoqwx() {
        return this.f3762ppxfxbqfkf;
    }

    public int gxszxtbevo() {
        Object objWkgbmnqykc = this.f3760lqeggnwhkg.wkgbmnqykc("CAPTURE_CONFIG_ID_KEY");
        if (objWkgbmnqykc == null) {
            return -1;
        }
        return ((Integer) objWkgbmnqykc).intValue();
    }

    public btonecajqb lqeggnwhkg() {
        return this.f3764zoijcleaow;
    }

    public int nufgyqmvbu() {
        Integer num = (Integer) this.f3764zoijcleaow.lqeggnwhkg(istkbnxepw.f3795istkbnxepw, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List ppxfxbqfkf() {
        return this.f3757eablkybsjg;
    }

    public boolean wflxmlrfwp() {
        return this.f3763wkgbmnqykc;
    }

    public istkbnxepw.ojitshcjhn wkgbmnqykc() {
        return this.f3761nufgyqmvbu;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private List f3765eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f3766gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Set f3767iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private ulzqkzuiru f3768lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private istkbnxepw.ojitshcjhn f3769nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f3770ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f3771wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private vdvldrhtss f3772zoijcleaow;

        public iobyxmoadg() {
            this.f3767iobyxmoadg = new HashSet();
            this.f3772zoijcleaow = oxmwwwfdhm.jhduphickx();
            this.f3770ppxfxbqfkf = -1;
            this.f3771wkgbmnqykc = false;
            this.f3765eablkybsjg = new ArrayList();
            this.f3766gxszxtbevo = false;
            this.f3768lqeggnwhkg = ulzqkzuiru.lqeggnwhkg();
        }

        public static iobyxmoadg btonecajqb(istkbnxepw istkbnxepwVar) {
            zoijcleaow zoijcleaowVarRgvfuqvkyq = istkbnxepwVar.rgvfuqvkyq(null);
            if (zoijcleaowVarRgvfuqvkyq != null) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                zoijcleaowVarRgvfuqvkyq.iobyxmoadg(istkbnxepwVar, iobyxmoadgVar);
                return iobyxmoadgVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + istkbnxepwVar.yggfygwlhe(istkbnxepwVar.toString()));
        }

        public static iobyxmoadg gtknphoqwx(dxjokdxxww dxjokdxxwwVar) {
            return new iobyxmoadg(dxjokdxxwwVar);
        }

        public int agtfadlqog() {
            return this.f3770ppxfxbqfkf;
        }

        public Range draadjrbmk() {
            return (Range) this.f3772zoijcleaow.lqeggnwhkg(dxjokdxxww.f3756gtknphoqwx, iwizpuwonk.f3803iobyxmoadg);
        }

        public void dxjokdxxww() {
            this.f3767iobyxmoadg.clear();
        }

        public void eablkybsjg(btonecajqb btonecajqbVar) {
            for (btonecajqb.iobyxmoadg iobyxmoadgVar : btonecajqbVar.eablkybsjg()) {
                this.f3772zoijcleaow.lqeggnwhkg(iobyxmoadgVar, null);
                this.f3772zoijcleaow.ojitshcjhn(iobyxmoadgVar, btonecajqbVar.nufgyqmvbu(iobyxmoadgVar), btonecajqbVar.iobyxmoadg(iobyxmoadgVar));
            }
        }

        public void gxszxtbevo(DeferrableSurface deferrableSurface) {
            this.f3767iobyxmoadg.add(deferrableSurface);
        }

        public void iobyxmoadg(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ppxfxbqfkf((istkbnxepw.nufgyqmvbu) it.next());
            }
        }

        public void kcexrzcfyt(int i13) {
            this.f3770ppxfxbqfkf = i13;
        }

        public void lqeggnwhkg(String str, Object obj) {
            this.f3768lqeggnwhkg.dxjokdxxww(str, obj);
        }

        public dxjokdxxww nufgyqmvbu() {
            return new dxjokdxxww(new ArrayList(this.f3767iobyxmoadg), kcexrzcfyt.ribwqtqdhb(this.f3772zoijcleaow), this.f3770ppxfxbqfkf, this.f3771wkgbmnqykc, new ArrayList(this.f3765eablkybsjg), this.f3766gxszxtbevo, opjhrmiecq.ppxfxbqfkf(this.f3768lqeggnwhkg), this.f3769nufgyqmvbu);
        }

        public void ojitshcjhn(istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            this.f3769nufgyqmvbu = ojitshcjhnVar;
        }

        public void oxmwwwfdhm(int i13) {
            if (i13 != 0) {
                wkgbmnqykc(istkbnxepw.f3795istkbnxepw, Integer.valueOf(i13));
            }
        }

        public void ppxfxbqfkf(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
            if (this.f3765eablkybsjg.contains(nufgyqmvbuVar)) {
                return;
            }
            this.f3765eablkybsjg.add(nufgyqmvbuVar);
        }

        public void rgvfuqvkyq(Range range) {
            wkgbmnqykc(dxjokdxxww.f3756gtknphoqwx, range);
        }

        public void vdvldrhtss(btonecajqb btonecajqbVar) {
            this.f3772zoijcleaow = oxmwwwfdhm.ikoacuggdj(btonecajqbVar);
        }

        public Set wflxmlrfwp() {
            return this.f3767iobyxmoadg;
        }

        public void wkgbmnqykc(btonecajqb.iobyxmoadg iobyxmoadgVar, Object obj) {
            this.f3772zoijcleaow.vdvldrhtss(iobyxmoadgVar, obj);
        }

        public void yggfygwlhe(int i13) {
            if (i13 != 0) {
                wkgbmnqykc(istkbnxepw.f3792cdpycssgdh, Integer.valueOf(i13));
            }
        }

        public void zdlpuopuiu(boolean z13) {
            this.f3766gxszxtbevo = z13;
        }

        public void zoijcleaow(opjhrmiecq opjhrmiecqVar) {
            this.f3768lqeggnwhkg.gxszxtbevo(opjhrmiecqVar);
        }

        private iobyxmoadg(dxjokdxxww dxjokdxxwwVar) {
            HashSet hashSet = new HashSet();
            this.f3767iobyxmoadg = hashSet;
            this.f3772zoijcleaow = oxmwwwfdhm.jhduphickx();
            this.f3770ppxfxbqfkf = -1;
            this.f3771wkgbmnqykc = false;
            this.f3765eablkybsjg = new ArrayList();
            this.f3766gxszxtbevo = false;
            this.f3768lqeggnwhkg = ulzqkzuiru.lqeggnwhkg();
            hashSet.addAll(dxjokdxxwwVar.f3759iobyxmoadg);
            this.f3772zoijcleaow = oxmwwwfdhm.ikoacuggdj(dxjokdxxwwVar.f3764zoijcleaow);
            this.f3770ppxfxbqfkf = dxjokdxxwwVar.f3762ppxfxbqfkf;
            this.f3765eablkybsjg.addAll(dxjokdxxwwVar.ppxfxbqfkf());
            this.f3766gxszxtbevo = dxjokdxxwwVar.agtfadlqog();
            this.f3768lqeggnwhkg = ulzqkzuiru.nufgyqmvbu(dxjokdxxwwVar.btonecajqb());
            this.f3771wkgbmnqykc = dxjokdxxwwVar.f3763wkgbmnqykc;
        }
    }
}

package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final List f3804btonecajqb = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private InputConfiguration f3805dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f3806eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final wkgbmnqykc f3807gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f3808iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final dxjokdxxww f3809lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f3810nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f3811ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f3812wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f3813zoijcleaow;

    public interface eablkybsjg {
        void iobyxmoadg(Size size, istkbnxepw istkbnxepwVar, zoijcleaow zoijcleaowVar);
    }

    public static abstract class gxszxtbevo {

        public static abstract class iobyxmoadg {
            public abstract iobyxmoadg eablkybsjg(List list);

            public abstract iobyxmoadg gxszxtbevo(int i13);

            public abstract gxszxtbevo iobyxmoadg();

            public abstract iobyxmoadg ppxfxbqfkf(int i13);

            public abstract iobyxmoadg wkgbmnqykc(String str);

            public abstract iobyxmoadg zoijcleaow(lereixgezr.iwizpuwonk iwizpuwonkVar);
        }

        public static iobyxmoadg iobyxmoadg(DeferrableSurface deferrableSurface) {
            return new androidx.camera.core.impl.wkgbmnqykc.zoijcleaow().lqeggnwhkg(deferrableSurface).eablkybsjg(Collections.emptyList()).wkgbmnqykc(null).ppxfxbqfkf(-1).gxszxtbevo(-1).zoijcleaow(lereixgezr.iwizpuwonk.f62292wkgbmnqykc);
        }

        public abstract List eablkybsjg();

        public abstract DeferrableSurface gxszxtbevo();

        public abstract int lqeggnwhkg();

        public abstract int ppxfxbqfkf();

        public abstract String wkgbmnqykc();

        public abstract lereixgezr.iwizpuwonk zoijcleaow();
    }

    static class iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        gxszxtbevo f3814dxjokdxxww;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        wkgbmnqykc f3816gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        InputConfiguration f3818lqeggnwhkg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Set f3817iobyxmoadg = new LinkedHashSet();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final dxjokdxxww.iobyxmoadg f3822zoijcleaow = new dxjokdxxww.iobyxmoadg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final List f3820ppxfxbqfkf = new ArrayList();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final List f3821wkgbmnqykc = new ArrayList();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final List f3815eablkybsjg = new ArrayList();

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        int f3819nufgyqmvbu = 0;

        iobyxmoadg() {
        }
    }

    public enum lqeggnwhkg {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class nufgyqmvbu extends iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final pkzmftpjix.eablkybsjg f3826btonecajqb = new pkzmftpjix.eablkybsjg();

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private boolean f3828gtknphoqwx = true;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private boolean f3827draadjrbmk = false;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private List f3829wflxmlrfwp = new ArrayList();

        private void btonecajqb(int i13) {
            if (i13 != 0) {
                this.f3822zoijcleaow.yggfygwlhe(i13);
            }
        }

        private void dxjokdxxww(int i13) {
            if (i13 != 0) {
                this.f3822zoijcleaow.oxmwwwfdhm(i13);
            }
        }

        private List eablkybsjg() {
            ArrayList arrayList = new ArrayList();
            for (gxszxtbevo gxszxtbevoVar : this.f3817iobyxmoadg) {
                arrayList.add(gxszxtbevoVar.gxszxtbevo());
                Iterator it = gxszxtbevoVar.eablkybsjg().iterator();
                while (it.hasNext()) {
                    arrayList.add((DeferrableSurface) it.next());
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lqeggnwhkg(jyumaefscl jyumaefsclVar, lqeggnwhkg lqeggnwhkgVar) {
            Iterator it = this.f3829wflxmlrfwp.iterator();
            while (it.hasNext()) {
                ((wkgbmnqykc) it.next()).iobyxmoadg(jyumaefsclVar, lqeggnwhkgVar);
            }
        }

        private void nufgyqmvbu(Range range) {
            Range range2 = iwizpuwonk.f3803iobyxmoadg;
            if (range.equals(range2)) {
                return;
            }
            if (this.f3822zoijcleaow.draadjrbmk().equals(range2)) {
                this.f3822zoijcleaow.rgvfuqvkyq(range);
            } else {
                if (this.f3822zoijcleaow.draadjrbmk().equals(range)) {
                    return;
                }
                this.f3828gtknphoqwx = false;
                sopmlzcsov.iobyxmoadg("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        public boolean gxszxtbevo() {
            return this.f3827draadjrbmk && this.f3828gtknphoqwx;
        }

        public jyumaefscl ppxfxbqfkf() {
            if (!this.f3828gtknphoqwx) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f3817iobyxmoadg);
            this.f3826btonecajqb.wkgbmnqykc(arrayList);
            return new jyumaefscl(arrayList, new ArrayList(this.f3820ppxfxbqfkf), new ArrayList(this.f3821wkgbmnqykc), new ArrayList(this.f3815eablkybsjg), this.f3822zoijcleaow.nufgyqmvbu(), !this.f3829wflxmlrfwp.isEmpty() ? new wkgbmnqykc() { // from class: istkbnxepw.uwvvkdfqfp
                @Override // androidx.camera.core.impl.jyumaefscl.wkgbmnqykc
                public final void iobyxmoadg(androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.jyumaefscl.lqeggnwhkg lqeggnwhkgVar) {
                    this.f49428iobyxmoadg.lqeggnwhkg(jyumaefsclVar, lqeggnwhkgVar);
                }
            } : null, this.f3818lqeggnwhkg, this.f3819nufgyqmvbu, this.f3814dxjokdxxww);
        }

        public void wkgbmnqykc() {
            this.f3817iobyxmoadg.clear();
            this.f3822zoijcleaow.dxjokdxxww();
        }

        public void zoijcleaow(jyumaefscl jyumaefsclVar) {
            dxjokdxxww dxjokdxxwwVarGtknphoqwx = jyumaefsclVar.gtknphoqwx();
            if (dxjokdxxwwVarGtknphoqwx.gtknphoqwx() != -1) {
                this.f3827draadjrbmk = true;
                this.f3822zoijcleaow.kcexrzcfyt(jyumaefscl.eablkybsjg(dxjokdxxwwVarGtknphoqwx.gtknphoqwx(), this.f3822zoijcleaow.agtfadlqog()));
            }
            nufgyqmvbu(dxjokdxxwwVarGtknphoqwx.eablkybsjg());
            dxjokdxxww(dxjokdxxwwVarGtknphoqwx.nufgyqmvbu());
            btonecajqb(dxjokdxxwwVarGtknphoqwx.draadjrbmk());
            this.f3822zoijcleaow.zoijcleaow(jyumaefsclVar.gtknphoqwx().btonecajqb());
            this.f3820ppxfxbqfkf.addAll(jyumaefsclVar.ppxfxbqfkf());
            this.f3821wkgbmnqykc.addAll(jyumaefsclVar.draadjrbmk());
            this.f3822zoijcleaow.iobyxmoadg(jyumaefsclVar.btonecajqb());
            this.f3815eablkybsjg.addAll(jyumaefsclVar.agtfadlqog());
            if (jyumaefsclVar.wkgbmnqykc() != null) {
                this.f3829wflxmlrfwp.add(jyumaefsclVar.wkgbmnqykc());
            }
            if (jyumaefsclVar.lqeggnwhkg() != null) {
                this.f3818lqeggnwhkg = jyumaefsclVar.lqeggnwhkg();
            }
            this.f3817iobyxmoadg.addAll(jyumaefsclVar.nufgyqmvbu());
            this.f3822zoijcleaow.wflxmlrfwp().addAll(dxjokdxxwwVarGtknphoqwx.dxjokdxxww());
            if (!eablkybsjg().containsAll(this.f3822zoijcleaow.wflxmlrfwp())) {
                sopmlzcsov.iobyxmoadg("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f3828gtknphoqwx = false;
            }
            if (jyumaefsclVar.wflxmlrfwp() != this.f3819nufgyqmvbu && jyumaefsclVar.wflxmlrfwp() != 0 && this.f3819nufgyqmvbu != 0) {
                sopmlzcsov.iobyxmoadg("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f3828gtknphoqwx = false;
            } else if (jyumaefsclVar.wflxmlrfwp() != 0) {
                this.f3819nufgyqmvbu = jyumaefsclVar.wflxmlrfwp();
            }
            if (jyumaefsclVar.f3813zoijcleaow != null) {
                if (this.f3814dxjokdxxww == jyumaefsclVar.f3813zoijcleaow || this.f3814dxjokdxxww == null) {
                    this.f3814dxjokdxxww = jyumaefsclVar.f3813zoijcleaow;
                } else {
                    sopmlzcsov.iobyxmoadg("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f3828gtknphoqwx = false;
                }
            }
            this.f3822zoijcleaow.eablkybsjg(dxjokdxxwwVarGtknphoqwx.lqeggnwhkg());
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AtomicBoolean f3830iobyxmoadg = new AtomicBoolean(false);

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wkgbmnqykc f3831zoijcleaow;

        public ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar) {
            this.f3831zoijcleaow = wkgbmnqykcVar;
        }

        @Override // androidx.camera.core.impl.jyumaefscl.wkgbmnqykc
        public void iobyxmoadg(jyumaefscl jyumaefsclVar, lqeggnwhkg lqeggnwhkgVar) {
            if (this.f3830iobyxmoadg.get()) {
                return;
            }
            this.f3831zoijcleaow.iobyxmoadg(jyumaefsclVar, lqeggnwhkgVar);
        }

        public void zoijcleaow() {
            this.f3830iobyxmoadg.set(true);
        }
    }

    public interface wkgbmnqykc {
        void iobyxmoadg(jyumaefscl jyumaefsclVar, lqeggnwhkg lqeggnwhkgVar);
    }

    public static class zoijcleaow extends iobyxmoadg {
        public static zoijcleaow vdvldrhtss(istkbnxepw istkbnxepwVar, Size size) {
            eablkybsjg eablkybsjgVarUlzqkzuiru = istkbnxepwVar.ulzqkzuiru(null);
            if (eablkybsjgVarUlzqkzuiru != null) {
                zoijcleaow zoijcleaowVar = new zoijcleaow();
                eablkybsjgVarUlzqkzuiru.iobyxmoadg(size, istkbnxepwVar, zoijcleaowVar);
                return zoijcleaowVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + istkbnxepwVar.yggfygwlhe(istkbnxepwVar.toString()));
        }

        public zoijcleaow agtfadlqog(DeferrableSurface deferrableSurface, lereixgezr.iwizpuwonk iwizpuwonkVar, String str, int i13) {
            this.f3817iobyxmoadg.add(gxszxtbevo.iobyxmoadg(deferrableSurface).wkgbmnqykc(str).zoijcleaow(iwizpuwonkVar).ppxfxbqfkf(i13).iobyxmoadg());
            this.f3822zoijcleaow.gxszxtbevo(deferrableSurface);
            return this;
        }

        public zoijcleaow btonecajqb(gxszxtbevo gxszxtbevoVar) {
            this.f3817iobyxmoadg.add(gxszxtbevoVar);
            this.f3822zoijcleaow.gxszxtbevo(gxszxtbevoVar.gxszxtbevo());
            Iterator it = gxszxtbevoVar.eablkybsjg().iterator();
            while (it.hasNext()) {
                this.f3822zoijcleaow.gxszxtbevo((DeferrableSurface) it.next());
            }
            return this;
        }

        public zoijcleaow cqumvgiudr(int i13) {
            this.f3819nufgyqmvbu = i13;
            return this;
        }

        public zoijcleaow draadjrbmk(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f3821wkgbmnqykc.contains(stateCallback)) {
                return this;
            }
            this.f3821wkgbmnqykc.add(stateCallback);
            return this;
        }

        public zoijcleaow dxjokdxxww(DeferrableSurface deferrableSurface, lereixgezr.iwizpuwonk iwizpuwonkVar) {
            this.f3817iobyxmoadg.add(gxszxtbevo.iobyxmoadg(deferrableSurface).zoijcleaow(iwizpuwonkVar).iobyxmoadg());
            return this;
        }

        public zoijcleaow eablkybsjg(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
            this.f3822zoijcleaow.ppxfxbqfkf(nufgyqmvbuVar);
            if (!this.f3815eablkybsjg.contains(nufgyqmvbuVar)) {
                this.f3815eablkybsjg.add(nufgyqmvbuVar);
            }
            return this;
        }

        public zoijcleaow esjtqupxsv(int i13) {
            this.f3822zoijcleaow.kcexrzcfyt(i13);
            return this;
        }

        public zoijcleaow gtknphoqwx(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
            this.f3822zoijcleaow.ppxfxbqfkf(nufgyqmvbuVar);
            return this;
        }

        public zoijcleaow gxszxtbevo(CameraDevice.StateCallback stateCallback) {
            if (this.f3820ppxfxbqfkf.contains(stateCallback)) {
                return this;
            }
            this.f3820ppxfxbqfkf.add(stateCallback);
            return this;
        }

        public zoijcleaow iobyxmoadg(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                istkbnxepw.nufgyqmvbu nufgyqmvbuVar = (istkbnxepw.nufgyqmvbu) it.next();
                this.f3822zoijcleaow.ppxfxbqfkf(nufgyqmvbuVar);
                if (!this.f3815eablkybsjg.contains(nufgyqmvbuVar)) {
                    this.f3815eablkybsjg.add(nufgyqmvbuVar);
                }
            }
            return this;
        }

        public zoijcleaow iwizpuwonk(int i13) {
            if (i13 != 0) {
                this.f3822zoijcleaow.oxmwwwfdhm(i13);
            }
            return this;
        }

        public zoijcleaow jyumaefscl(DeferrableSurface deferrableSurface) {
            this.f3814dxjokdxxww = gxszxtbevo.iobyxmoadg(deferrableSurface).iobyxmoadg();
            return this;
        }

        public zoijcleaow kcexrzcfyt(Range range) {
            this.f3822zoijcleaow.rgvfuqvkyq(range);
            return this;
        }

        public zoijcleaow lereixgezr(int i13) {
            if (i13 != 0) {
                this.f3822zoijcleaow.yggfygwlhe(i13);
            }
            return this;
        }

        public zoijcleaow lqeggnwhkg(btonecajqb btonecajqbVar) {
            this.f3822zoijcleaow.eablkybsjg(btonecajqbVar);
            return this;
        }

        public zoijcleaow nufgyqmvbu(DeferrableSurface deferrableSurface) {
            return dxjokdxxww(deferrableSurface, lereixgezr.iwizpuwonk.f62292wkgbmnqykc);
        }

        public zoijcleaow ojitshcjhn(String str, Object obj) {
            this.f3822zoijcleaow.lqeggnwhkg(str, obj);
            return this;
        }

        public zoijcleaow oxmwwwfdhm(wkgbmnqykc wkgbmnqykcVar) {
            this.f3816gxszxtbevo = wkgbmnqykcVar;
            return this;
        }

        public zoijcleaow ppxfxbqfkf(Collection collection) {
            this.f3822zoijcleaow.iobyxmoadg(collection);
            return this;
        }

        public jyumaefscl rgvfuqvkyq() {
            return new jyumaefscl(new ArrayList(this.f3817iobyxmoadg), new ArrayList(this.f3820ppxfxbqfkf), new ArrayList(this.f3821wkgbmnqykc), new ArrayList(this.f3815eablkybsjg), this.f3822zoijcleaow.nufgyqmvbu(), this.f3816gxszxtbevo, this.f3818lqeggnwhkg, this.f3819nufgyqmvbu, this.f3814dxjokdxxww);
        }

        public zoijcleaow wflxmlrfwp(DeferrableSurface deferrableSurface) {
            return agtfadlqog(deferrableSurface, lereixgezr.iwizpuwonk.f62292wkgbmnqykc, null, -1);
        }

        public zoijcleaow wkgbmnqykc(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                draadjrbmk((CameraCaptureSession.StateCallback) it.next());
            }
            return this;
        }

        public zoijcleaow yggfygwlhe(InputConfiguration inputConfiguration) {
            this.f3818lqeggnwhkg = inputConfiguration;
            return this;
        }

        public zoijcleaow zdlpuopuiu(btonecajqb btonecajqbVar) {
            this.f3822zoijcleaow.vdvldrhtss(btonecajqbVar);
            return this;
        }

        public zoijcleaow zoijcleaow(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                gxszxtbevo((CameraDevice.StateCallback) it.next());
            }
            return this;
        }
    }

    jyumaefscl(List list, List list2, List list3, List list4, dxjokdxxww dxjokdxxwwVar, wkgbmnqykc wkgbmnqykcVar, InputConfiguration inputConfiguration, int i13, gxszxtbevo gxszxtbevoVar) {
        this.f3808iobyxmoadg = list;
        this.f3811ppxfxbqfkf = Collections.unmodifiableList(list2);
        this.f3812wkgbmnqykc = Collections.unmodifiableList(list3);
        this.f3806eablkybsjg = Collections.unmodifiableList(list4);
        this.f3807gxszxtbevo = wkgbmnqykcVar;
        this.f3809lqeggnwhkg = dxjokdxxwwVar;
        this.f3805dxjokdxxww = inputConfiguration;
        this.f3810nufgyqmvbu = i13;
        this.f3813zoijcleaow = gxszxtbevoVar;
    }

    public static int eablkybsjg(int i13, int i14) {
        List list = f3804btonecajqb;
        return list.indexOf(Integer.valueOf(i13)) >= list.indexOf(Integer.valueOf(i14)) ? i13 : i14;
    }

    public static jyumaefscl zoijcleaow() {
        return new jyumaefscl(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new dxjokdxxww.iobyxmoadg().nufgyqmvbu(), null, null, 0, null);
    }

    public List agtfadlqog() {
        return this.f3806eablkybsjg;
    }

    public List btonecajqb() {
        return this.f3809lqeggnwhkg.ppxfxbqfkf();
    }

    public List draadjrbmk() {
        return this.f3812wkgbmnqykc;
    }

    public gxszxtbevo dxjokdxxww() {
        return this.f3813zoijcleaow;
    }

    public dxjokdxxww gtknphoqwx() {
        return this.f3809lqeggnwhkg;
    }

    public btonecajqb gxszxtbevo() {
        return this.f3809lqeggnwhkg.lqeggnwhkg();
    }

    public InputConfiguration lqeggnwhkg() {
        return this.f3805dxjokdxxww;
    }

    public List nufgyqmvbu() {
        return this.f3808iobyxmoadg;
    }

    public List ojitshcjhn() {
        ArrayList arrayList = new ArrayList();
        for (gxszxtbevo gxszxtbevoVar : this.f3808iobyxmoadg) {
            arrayList.add(gxszxtbevoVar.gxszxtbevo());
            Iterator it = gxszxtbevoVar.eablkybsjg().iterator();
            while (it.hasNext()) {
                arrayList.add((DeferrableSurface) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List ppxfxbqfkf() {
        return this.f3811ppxfxbqfkf;
    }

    public int rgvfuqvkyq() {
        return this.f3809lqeggnwhkg.gtknphoqwx();
    }

    public int wflxmlrfwp() {
        return this.f3810nufgyqmvbu;
    }

    public wkgbmnqykc wkgbmnqykc() {
        return this.f3807gxszxtbevo;
    }
}

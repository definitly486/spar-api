package t;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix implements wwaezpbzkn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lmojexxdyd f109116eablkybsjg = new zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private stevsuqkhv f109117ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f109118wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public tg.draadjrbmk f109119zoijcleaow;

    private enum iobyxmoadg {
        Unknown,
        Dispatching,
        NotDispatching;


        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f109120cqumvgiudr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public static final class zoijcleaow extends lmojexxdyd {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private rgvfuqvkyq f109125ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private iobyxmoadg f109127zoijcleaow = iobyxmoadg.Unknown;

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ pkzmftpjix f109128yggfygwlhe;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(pkzmftpjix pkzmftpjixVar) {
                super(1);
                this.f109128yggfygwlhe = pkzmftpjixVar;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((MotionEvent) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f109128yggfygwlhe.draadjrbmk().invoke(motionEvent);
                } else {
                    zoijcleaow.this.f109127zoijcleaow = ((Boolean) this.f109128yggfygwlhe.draadjrbmk().invoke(motionEvent)).booleanValue() ? iobyxmoadg.Dispatching : iobyxmoadg.NotDispatching;
                }
            }
        }

        static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ pkzmftpjix f109130zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(pkzmftpjix pkzmftpjixVar) {
                super(1);
                this.f109130zdlpuopuiu = pkzmftpjixVar;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((MotionEvent) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(MotionEvent motionEvent) {
                this.f109130zdlpuopuiu.draadjrbmk().invoke(motionEvent);
            }
        }

        /* JADX INFO: renamed from: t.pkzmftpjix$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        static final class C2679zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ pkzmftpjix f109131zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2679zoijcleaow(pkzmftpjix pkzmftpjixVar) {
                super(1);
                this.f109131zdlpuopuiu = pkzmftpjixVar;
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((MotionEvent) obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(MotionEvent motionEvent) {
                this.f109131zdlpuopuiu.draadjrbmk().invoke(motionEvent);
            }
        }

        zoijcleaow() {
        }

        private final void btonecajqb(rgvfuqvkyq rgvfuqvkyqVar) {
            if (this.f109127zoijcleaow == iobyxmoadg.Dispatching) {
                x.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = zoijcleaow();
                if (rgvfuqvkyqVarZoijcleaow == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                jpowsppfya.zoijcleaow(rgvfuqvkyqVar, rgvfuqvkyqVarZoijcleaow.opjhrmiecq(g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf()), new ppxfxbqfkf(pkzmftpjix.this));
            }
            this.f109127zoijcleaow = iobyxmoadg.NotDispatching;
        }

        private final void dxjokdxxww() {
            this.f109127zoijcleaow = iobyxmoadg.Unknown;
            pkzmftpjix.this.wflxmlrfwp(false);
            this.f109125ppxfxbqfkf = null;
        }

        private final void nufgyqmvbu(rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
            List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
            int size = listPpxfxbqfkf.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                if (((pmvmpeiblj) listPpxfxbqfkf.get(i14)).rgvfuqvkyq()) {
                    btonecajqb(rgvfuqvkyqVar);
                    return;
                }
            }
            x.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = zoijcleaow();
            if (rgvfuqvkyqVarZoijcleaow == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            jpowsppfya.ppxfxbqfkf(rgvfuqvkyqVar, rgvfuqvkyqVarZoijcleaow.opjhrmiecq(g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf()), new iobyxmoadg(pkzmftpjix.this));
            if (this.f109127zoijcleaow == iobyxmoadg.Dispatching) {
                if (!a.nufgyqmvbu.f58gtknphoqwx) {
                    int size2 = listPpxfxbqfkf.size();
                    while (i13 < size2) {
                        ((pmvmpeiblj) listPpxfxbqfkf.get(i13)).iobyxmoadg();
                        i13++;
                    }
                } else if (z13) {
                    int size3 = listPpxfxbqfkf.size();
                    while (i13 < size3) {
                        ((pmvmpeiblj) listPpxfxbqfkf.get(i13)).iobyxmoadg();
                        i13++;
                    }
                }
                gxszxtbevo gxszxtbevoVarEablkybsjg = rgvfuqvkyqVar.eablkybsjg();
                if (gxszxtbevoVarEablkybsjg != null) {
                    gxszxtbevoVarEablkybsjg.eablkybsjg(!pkzmftpjix.this.btonecajqb());
                }
            }
        }

        @Override // t.lmojexxdyd
        public void eablkybsjg(rgvfuqvkyq rgvfuqvkyqVar, oxmwwwfdhm oxmwwwfdhmVar, long j13) {
            boolean z13;
            boolean z14;
            boolean z15;
            List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
            int size = listPpxfxbqfkf.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z13 = true;
                    break;
                }
                pmvmpeiblj pmvmpeibljVar = (pmvmpeiblj) listPpxfxbqfkf.get(i13);
                if (vdvldrhtss.zoijcleaow(pmvmpeibljVar) || vdvldrhtss.wkgbmnqykc(pmvmpeibljVar)) {
                    z13 = false;
                    break;
                }
                i13++;
            }
            if (!z13) {
                z14 = false;
                break;
            }
            int size2 = listPpxfxbqfkf.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    z14 = true;
                    break;
                } else {
                    if (((pmvmpeiblj) listPpxfxbqfkf.get(i14)).rgvfuqvkyq()) {
                        z14 = false;
                        break;
                    }
                    i14++;
                }
            }
            if (pkzmftpjix.this.btonecajqb()) {
                z15 = true;
                break;
            }
            int size3 = listPpxfxbqfkf.size();
            int i15 = 0;
            while (true) {
                if (i15 < size3) {
                    pmvmpeiblj pmvmpeibljVar2 = (pmvmpeiblj) listPpxfxbqfkf.get(i15);
                    if (!vdvldrhtss.zoijcleaow(pmvmpeibljVar2) && !vdvldrhtss.wkgbmnqykc(pmvmpeibljVar2)) {
                        i15++;
                    }
                } else if (!z14 || !a.nufgyqmvbu.f58gtknphoqwx) {
                    z15 = false;
                    break;
                }
                z15 = true;
                break;
            }
            if (this.f109127zoijcleaow != iobyxmoadg.NotDispatching) {
                if (oxmwwwfdhmVar == oxmwwwfdhm.Initial && z15) {
                    this.f109125ppxfxbqfkf = rgvfuqvkyqVar;
                    nufgyqmvbu(rgvfuqvkyqVar, !z13 || pkzmftpjix.this.btonecajqb());
                }
                if (oxmwwwfdhmVar == oxmwwwfdhm.Main && z13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(rgvfuqvkyqVar, this.f109125ppxfxbqfkf) && pkzmftpjix.this.btonecajqb() && a.nufgyqmvbu.f58gtknphoqwx) {
                    int size4 = listPpxfxbqfkf.size();
                    for (int i16 = 0; i16 < size4; i16++) {
                        ((pmvmpeiblj) listPpxfxbqfkf.get(i16)).iobyxmoadg();
                    }
                }
                if (!a.nufgyqmvbu.f58gtknphoqwx ? !(oxmwwwfdhmVar != oxmwwwfdhm.Final || z15) : !(oxmwwwfdhmVar != oxmwwwfdhm.Final || z15 || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(rgvfuqvkyqVar, this.f109125ppxfxbqfkf))) {
                    nufgyqmvbu(rgvfuqvkyqVar, true);
                }
            }
            if (oxmwwwfdhmVar == oxmwwwfdhm.Final) {
                int size5 = listPpxfxbqfkf.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        dxjokdxxww();
                        break;
                    } else if (!vdvldrhtss.wkgbmnqykc((pmvmpeiblj) listPpxfxbqfkf.get(i17))) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(rgvfuqvkyqVar, this.f109125ppxfxbqfkf) && z13 && a.nufgyqmvbu.f58gtknphoqwx) {
                    int size6 = listPpxfxbqfkf.size();
                    for (int i18 = 0; i18 < size6; i18++) {
                        if (((pmvmpeiblj) listPpxfxbqfkf.get(i18)).rgvfuqvkyq()) {
                            if (pkzmftpjix.this.btonecajqb()) {
                                break;
                            }
                            btonecajqb(rgvfuqvkyqVar);
                            return;
                        }
                    }
                    int size7 = listPpxfxbqfkf.size();
                    for (int i19 = 0; i19 < size7; i19++) {
                        ((pmvmpeiblj) listPpxfxbqfkf.get(i19)).iobyxmoadg();
                    }
                }
            }
        }

        @Override // t.lmojexxdyd
        public boolean ppxfxbqfkf() {
            return true;
        }

        @Override // t.lmojexxdyd
        public void wkgbmnqykc() {
            if (this.f109127zoijcleaow == iobyxmoadg.Dispatching) {
                jpowsppfya.iobyxmoadg(SystemClock.uptimeMillis(), new C2679zoijcleaow(pkzmftpjix.this));
                dxjokdxxww();
            }
        }
    }

    public final boolean btonecajqb() {
        return this.f109118wkgbmnqykc;
    }

    public final tg.draadjrbmk draadjrbmk() {
        tg.draadjrbmk draadjrbmkVar = this.f109119zoijcleaow;
        if (draadjrbmkVar != null) {
            return draadjrbmkVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("onTouchEvent");
        return null;
    }

    @Override // t.wwaezpbzkn
    public lmojexxdyd nufgyqmvbu() {
        return this.f109116eablkybsjg;
    }

    public final void ojitshcjhn(tg.draadjrbmk draadjrbmkVar) {
        this.f109119zoijcleaow = draadjrbmkVar;
    }

    public final void rgvfuqvkyq(stevsuqkhv stevsuqkhvVar) {
        stevsuqkhv stevsuqkhvVar2 = this.f109117ppxfxbqfkf;
        if (stevsuqkhvVar2 != null) {
            stevsuqkhvVar2.zoijcleaow(null);
        }
        this.f109117ppxfxbqfkf = stevsuqkhvVar;
        if (stevsuqkhvVar != null) {
            stevsuqkhvVar.zoijcleaow(this);
        }
    }

    public final void wflxmlrfwp(boolean z13) {
        this.f109118wkgbmnqykc = z13;
    }
}

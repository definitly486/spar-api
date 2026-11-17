package pw0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.lqeggnwhkg;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zynmafqrjb f77389iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zynmafqrjb f77390zoijcleaow;

    static final class iobyxmoadg extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ boolean f77391jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ boolean f77392yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f77393zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f77393zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!this.f77392yggfygwlhe && this.f77391jyumaefscl);
        }

        public final Object ojitshcjhn(boolean z13, boolean z14, gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f77392yggfygwlhe = z13;
            iobyxmoadgVar.f77391jyumaefscl = z14;
            return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public ppxfxbqfkf() {
        Boolean bool = Boolean.FALSE;
        this.f77389iobyxmoadg = kegysxyocb.iobyxmoadg(bool);
        this.f77390zoijcleaow = kegysxyocb.iobyxmoadg(bool);
    }

    public void eablkybsjg(boolean z13) {
        Object value;
        zynmafqrjb zynmafqrjbVar = this.f77389iobyxmoadg;
        do {
            value = zynmafqrjbVar.getValue();
            ((Boolean) value).booleanValue();
        } while (!zynmafqrjbVar.compareAndSet(value, Boolean.valueOf(z13)));
    }

    public void gxszxtbevo(boolean z13) {
        Object value;
        zynmafqrjb zynmafqrjbVar = this.f77390zoijcleaow;
        do {
            value = zynmafqrjbVar.getValue();
            ((Boolean) value).booleanValue();
        } while (!zynmafqrjbVar.compareAndSet(value, Boolean.valueOf(z13)));
    }

    public wypolnanlu iobyxmoadg() {
        return this.f77389iobyxmoadg;
    }

    public lqeggnwhkg ppxfxbqfkf() {
        return dxjokdxxww.vdvldrhtss(dxjokdxxww.wflxmlrfwp(iobyxmoadg(), zoijcleaow(), new iobyxmoadg(null)));
    }

    public void wkgbmnqykc(pw0.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof pw0.iobyxmoadg.C1718iobyxmoadg) {
            eablkybsjg(((pw0.iobyxmoadg.C1718iobyxmoadg) event).iobyxmoadg());
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, pw0.iobyxmoadg.zoijcleaow.f77388iobyxmoadg)) {
            gxszxtbevo(true);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, pw0.iobyxmoadg.ppxfxbqfkf.f77387iobyxmoadg)) {
            gxszxtbevo(false);
        }
    }

    public wypolnanlu zoijcleaow() {
        return this.f77390zoijcleaow;
    }
}

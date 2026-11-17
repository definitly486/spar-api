package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ydmasvzmpa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f6121iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f6124zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private List f6122ppxfxbqfkf = new ArrayList();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f6123wkgbmnqykc = true;

    static final class iobyxmoadg implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ pj.agtfadlqog f6125yggfygwlhe;

        iobyxmoadg(pj.agtfadlqog agtfadlqogVar) {
            this.f6125yggfygwlhe = agtfadlqogVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            Object obj = ydmasvzmpa.this.f6121iobyxmoadg;
            ydmasvzmpa ydmasvzmpaVar = ydmasvzmpa.this;
            pj.agtfadlqog agtfadlqogVar = this.f6125yggfygwlhe;
            synchronized (obj) {
                ydmasvzmpaVar.f6124zoijcleaow.remove(agtfadlqogVar);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }
    }

    public final boolean eablkybsjg() {
        boolean z13;
        synchronized (this.f6121iobyxmoadg) {
            z13 = this.f6123wkgbmnqykc;
        }
        return z13;
    }

    public final void gxszxtbevo() {
        synchronized (this.f6121iobyxmoadg) {
            try {
                if (eablkybsjg()) {
                    return;
                }
                List list = this.f6124zoijcleaow;
                this.f6124zoijcleaow = this.f6122ppxfxbqfkf;
                this.f6122ppxfxbqfkf = list;
                this.f6123wkgbmnqykc = true;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    lg.gxszxtbevo gxszxtbevoVar = (lg.gxszxtbevo) list.get(i13);
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    gxszxtbevoVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg));
                }
                list.clear();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjg()) {
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        synchronized (this.f6121iobyxmoadg) {
            this.f6124zoijcleaow.add(rgvfuqvkyqVar);
        }
        rgvfuqvkyqVar.stevsuqkhv(new iobyxmoadg(rgvfuqvkyqVar));
        Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
        if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo() ? objZdlpuopuiu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void wkgbmnqykc() {
        synchronized (this.f6121iobyxmoadg) {
            this.f6123wkgbmnqykc = false;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }
}

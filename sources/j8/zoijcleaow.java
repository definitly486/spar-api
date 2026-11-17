package j8;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.hkdspvbjdz;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import rj.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow implements d9.dxjokdxxww, c9.eablkybsjg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private volatile nufgyqmvbu f50855cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final List f50856esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile c9.ppxfxbqfkf f50857iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile dxjokdxxww f50858jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lqeggnwhkg f50859yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zdlpuopuiu f50860zdlpuopuiu;

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f50862yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50863zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = zoijcleaow.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f50862yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            cllcsxoeiz cllcsxoeizVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50863zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar2 = (cllcsxoeiz) this.f50862yggfygwlhe;
                j8.iobyxmoadg iobyxmoadgVar = (j8.iobyxmoadg) zoijcleaow.this.f50859yggfygwlhe;
                this.f50862yggfygwlhe = cllcsxoeizVar2;
                this.f50863zdlpuopuiu = 1;
                Object objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(this);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                cllcsxoeizVar = cllcsxoeizVar2;
                obj = objIobyxmoadg;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cllcsxoeizVar = (cllcsxoeiz) this.f50862yggfygwlhe;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            synchronized (cllcsxoeizVar) {
                zoijcleaowVar.f50858jyumaefscl = dxjokdxxwwVar;
                hkdspvbjdzVar.f60015zdlpuopuiu = new ArrayList(zoijcleaowVar.f50856esjtqupxsv);
                zoijcleaowVar.f50856esjtqupxsv.clear();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
            Iterator it = ((Iterable) hkdspvbjdzVar.f60015zdlpuopuiu).iterator();
            while (it.hasNext()) {
                ((d9.nufgyqmvbu) it.next()).gxszxtbevo(dxjokdxxwwVar.zoijcleaow(), dxjokdxxwwVar.iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public zoijcleaow(zdlpuopuiu scope, lqeggnwhkg size) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(size, "size");
        this.f50860zdlpuopuiu = scope;
        this.f50859yggfygwlhe = size;
        this.f50856esjtqupxsv = new ArrayList();
        if (size instanceof eablkybsjg) {
            this.f50858jyumaefscl = ((eablkybsjg) size).iobyxmoadg();
        } else if (size instanceof j8.iobyxmoadg) {
            gtknphoqwx.wkgbmnqykc(scope, null, null, new iobyxmoadg(null), 3, null);
        }
    }

    @Override // d9.dxjokdxxww
    public void btonecajqb(d9.nufgyqmvbu cb3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cb3, "cb");
        dxjokdxxww dxjokdxxwwVar = this.f50858jyumaefscl;
        if (dxjokdxxwwVar != null) {
            cb3.gxszxtbevo(dxjokdxxwwVar.zoijcleaow(), dxjokdxxwwVar.iobyxmoadg());
            return;
        }
        synchronized (this) {
            try {
                dxjokdxxww dxjokdxxwwVar2 = this.f50858jyumaefscl;
                if (dxjokdxxwwVar2 != null) {
                    cb3.gxszxtbevo(dxjokdxxwwVar2.zoijcleaow(), dxjokdxxwwVar2.iobyxmoadg());
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } else {
                    this.f50856esjtqupxsv.add(cb3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d9.dxjokdxxww
    public void dxjokdxxww(Drawable drawable) {
        this.f50860zdlpuopuiu.eablkybsjg(new gxszxtbevo(btonecajqb.FAILED, drawable));
    }

    @Override // c9.eablkybsjg
    public boolean eablkybsjg(Object resource, Object model, d9.dxjokdxxww target, l8.iobyxmoadg dataSource, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resource, "resource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(target, "target");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dataSource, "dataSource");
        c9.ppxfxbqfkf ppxfxbqfkfVar = this.f50857iwizpuwonk;
        nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu((ppxfxbqfkfVar == null || !ppxfxbqfkfVar.iobyxmoadg()) ? btonecajqb.RUNNING : btonecajqb.SUCCEEDED, resource, z13, dataSource);
        this.f50855cqumvgiudr = nufgyqmvbuVar;
        this.f50860zdlpuopuiu.eablkybsjg(nufgyqmvbuVar);
        return true;
    }

    @Override // d9.dxjokdxxww
    public void gxszxtbevo(Drawable drawable) {
        this.f50855cqumvgiudr = null;
        this.f50860zdlpuopuiu.eablkybsjg(new gxszxtbevo(btonecajqb.RUNNING, drawable));
    }

    @Override // d9.dxjokdxxww
    public c9.ppxfxbqfkf iobyxmoadg() {
        return this.f50857iwizpuwonk;
    }

    @Override // d9.dxjokdxxww
    public void lqeggnwhkg(Drawable drawable) {
        this.f50855cqumvgiudr = null;
        this.f50860zdlpuopuiu.eablkybsjg(new gxszxtbevo(btonecajqb.CLEARED, drawable));
    }

    @Override // d9.dxjokdxxww
    public void nufgyqmvbu(Object resource, e9.wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resource, "resource");
        throw new UnsupportedOperationException();
    }

    @Override // z8.draadjrbmk
    public void onDestroy() {
    }

    @Override // z8.draadjrbmk
    public void onStart() {
    }

    @Override // z8.draadjrbmk
    public void onStop() {
    }

    @Override // d9.dxjokdxxww
    public void ppxfxbqfkf(d9.nufgyqmvbu cb3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cb3, "cb");
        synchronized (this) {
            this.f50856esjtqupxsv.remove(cb3);
        }
    }

    @Override // c9.eablkybsjg
    public boolean wkgbmnqykc(GlideException glideException, Object obj, d9.dxjokdxxww target, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(target, "target");
        nufgyqmvbu nufgyqmvbuVar = this.f50855cqumvgiudr;
        c9.ppxfxbqfkf ppxfxbqfkfVar = this.f50857iwizpuwonk;
        if (nufgyqmvbuVar == null || ppxfxbqfkfVar == null || ppxfxbqfkfVar.iobyxmoadg() || ppxfxbqfkfVar.isRunning()) {
            return false;
        }
        this.f50860zdlpuopuiu.kcexrzcfyt().eablkybsjg(nufgyqmvbuVar.zoijcleaow());
        return false;
    }

    @Override // d9.dxjokdxxww
    public void zoijcleaow(c9.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f50857iwizpuwonk = ppxfxbqfkfVar;
    }
}

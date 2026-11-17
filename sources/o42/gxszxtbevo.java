package o42;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pd.ojitshcjhn;
import pj.cllcsxoeiz;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo implements n42.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f72045eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f72046iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f72047ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f72048wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f72049zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f72051yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f72052zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f72052zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            Throwable th2 = (Throwable) this.f72051yggfygwlhe;
            gxszxtbevo.this.vdvldrhtss(false);
            q30.iobyxmoadg.f77790iobyxmoadg.zoijcleaow(th2);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = gxszxtbevo.this.new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f72051yggfygwlhe = th2;
            return ppxfxbqfkfVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f72054zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return gxszxtbevo.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f72054zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                Task taskGxszxtbevo = gxszxtbevo.this.agtfadlqog().gxszxtbevo();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(taskGxszxtbevo, "activate(...)");
                this.f72054zdlpuopuiu = 1;
                if (zj.zoijcleaow.iobyxmoadg(taskGxszxtbevo, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            gxszxtbevo.this.vdvldrhtss(true);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pd.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(zoijcleaowVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f72055cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f72057jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f72058yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f72059zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f72057jyumaefscl = obj;
            this.f72055cqumvgiudr |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    public gxszxtbevo(cllcsxoeiz scope) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
        this.f72046iobyxmoadg = scope;
        this.f72048wkgbmnqykc = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: o42.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return gxszxtbevo.ojitshcjhn();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.firebase.remoteconfig.iobyxmoadg agtfadlqog() {
        return (com.google.firebase.remoteconfig.iobyxmoadg) this.f72048wkgbmnqykc.getValue();
    }

    private final Object btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
        if (this.f72047ppxfxbqfkf || this.f72049zoijcleaow >= 3) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Task taskDxjokdxxww = agtfadlqog().dxjokdxxww();
        final tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: o42.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.gtknphoqwx(this.f72060zdlpuopuiu, (Boolean) obj);
            }
        };
        Task taskAddOnFailureListener = taskDxjokdxxww.addOnSuccessListener(new OnSuccessListener() { // from class: o42.wkgbmnqykc
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                gxszxtbevo.draadjrbmk(draadjrbmkVar, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o42.eablkybsjg
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                gxszxtbevo.wflxmlrfwp(this.f72044iobyxmoadg, exc);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(taskAddOnFailureListener, "addOnFailureListener(...)");
        Object objIobyxmoadg = zj.zoijcleaow.iobyxmoadg(taskAddOnFailureListener, gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(tg.draadjrbmk draadjrbmkVar, Object obj) {
        draadjrbmkVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(gxszxtbevo gxszxtbevoVar, Boolean bool) {
        gxszxtbevoVar.vdvldrhtss(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.remoteconfig.iobyxmoadg ojitshcjhn() {
        com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVarIobyxmoadg = td.iobyxmoadg.iobyxmoadg(zc.iobyxmoadg.f129562iobyxmoadg);
        iobyxmoadgVarIobyxmoadg.iwizpuwonk(td.iobyxmoadg.zoijcleaow(new tg.draadjrbmk() { // from class: o42.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.rgvfuqvkyq((pd.gtknphoqwx.zoijcleaow) obj);
            }
        }));
        return iobyxmoadgVarIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(pd.gtknphoqwx.zoijcleaow remoteConfigSettings) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteConfigSettings, "$this$remoteConfigSettings");
        remoteConfigSettings.eablkybsjg(3600L);
        remoteConfigSettings.wkgbmnqykc(3L);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vdvldrhtss(boolean z13) {
        if (z13) {
            rs.wkgbmnqykc.eablkybsjg(rs.wkgbmnqykc.f83693iobyxmoadg, "Fetch config is successful", false, 2, null);
            this.f72049zoijcleaow = 0;
            this.f72047ppxfxbqfkf = true;
        } else {
            rs.wkgbmnqykc.eablkybsjg(rs.wkgbmnqykc.f83693iobyxmoadg, "Fetch config error", false, 2, null);
            int i13 = this.f72049zoijcleaow;
            if (i13 > 50) {
                this.f72049zoijcleaow = 0;
            } else {
                this.f72049zoijcleaow = i13 + 1;
            }
            this.f72047ppxfxbqfkf = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wflxmlrfwp(gxszxtbevo gxszxtbevoVar, Exception it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        gxszxtbevoVar.vdvldrhtss(false);
        q30.iobyxmoadg.f77790iobyxmoadg.zoijcleaow(it);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n42.iobyxmoadg
    public Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f72055cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f72055cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f72057jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f72055cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaowVar.f72059zdlpuopuiu = this;
            zoijcleaowVar.f72058yggfygwlhe = str;
            zoijcleaowVar.f72055cqumvgiudr = 1;
            if (btonecajqb(zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gxszxtbevoVar2 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) zoijcleaowVar.f72058yggfygwlhe;
            gxszxtbevoVar2 = (gxszxtbevo) zoijcleaowVar.f72059zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
        }
        String strOjitshcjhn = gxszxtbevoVar2.agtfadlqog().ojitshcjhn(str);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strOjitshcjhn, "getString(...)");
        return strOjitshcjhn;
    }

    @Override // n42.iobyxmoadg
    public void zoijcleaow() {
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(dxjokdxxww.gxszxtbevo(ojitshcjhn.iobyxmoadg(agtfadlqog()), new ppxfxbqfkf(null)), new wkgbmnqykc(null)), this.f72046iobyxmoadg);
    }
}

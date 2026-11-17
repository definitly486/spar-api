package uu0;

import android.content.Context;
import g6.cllcsxoeiz;
import g6.cqumvgiudr;
import g6.dxjokdxxww;
import g6.jyumaefscl;
import g6.nufgyqmvbu;
import g6.yadqdtsiqt;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ow1.dsvhmnatus;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.components.notifications.impl.workers.CheckNotificationRelevanceWorker;
import ru.myspar.proloyalty.components.notifications.impl.workers.HandleNewPushTokenWorker;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements tu0.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f114416eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vu0.iobyxmoadg f114417iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ir0.iobyxmoadg f114418ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dsvhmnatus f114419wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l42.iobyxmoadg f114420zoijcleaow;

    /* JADX INFO: renamed from: uu0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2839iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f114421iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f114423yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f114424zdlpuopuiu;

        C2839iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f114423yggfygwlhe = obj;
            this.f114421iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lqeggnwhkg(this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f114425cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f114427jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f114428yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f114429zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f114427jyumaefscl = obj;
            this.f114425cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f114430iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f114432yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f114433zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f114432yggfygwlhe = obj;
            this.f114430iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(this);
        }
    }

    public iobyxmoadg(vu0.iobyxmoadg notificationCache, l42.iobyxmoadg pushTokenProvider, ir0.iobyxmoadg deviceIdManager, dsvhmnatus uploadPushTokenUseCase, Context applicationContext) {
        zdlpuopuiu.btonecajqb(notificationCache, "notificationCache");
        zdlpuopuiu.btonecajqb(pushTokenProvider, "pushTokenProvider");
        zdlpuopuiu.btonecajqb(deviceIdManager, "deviceIdManager");
        zdlpuopuiu.btonecajqb(uploadPushTokenUseCase, "uploadPushTokenUseCase");
        zdlpuopuiu.btonecajqb(applicationContext, "applicationContext");
        this.f114417iobyxmoadg = notificationCache;
        this.f114420zoijcleaow = pushTokenProvider;
        this.f114418ppxfxbqfkf = deviceIdManager;
        this.f114419wkgbmnqykc = uploadPushTokenUseCase;
        this.f114416eablkybsjg = applicationContext;
    }

    private final void btonecajqb(boolean z13) {
        uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], SAVE newValue isSentToServer=" + z13);
        this.f114417iobyxmoadg.wkgbmnqykc(z13);
    }

    private final void draadjrbmk() {
        cllcsxoeiz.f36369iobyxmoadg.iobyxmoadg(this.f114416eablkybsjg).eablkybsjg("CHECK_PERIODIC_TOKEN_NAME", nufgyqmvbu.UPDATE, (yadqdtsiqt) ((yadqdtsiqt.iobyxmoadg) ((yadqdtsiqt.iobyxmoadg) ((yadqdtsiqt.iobyxmoadg) new yadqdtsiqt.iobyxmoadg(CheckNotificationRelevanceWorker.class, 12L, TimeUnit.HOURS).dxjokdxxww(new g6.wkgbmnqykc.iobyxmoadg().zoijcleaow(jyumaefscl.NOT_ROAMING).wkgbmnqykc(false).ppxfxbqfkf(true).iobyxmoadg())).gtknphoqwx(5L, TimeUnit.MINUTES)).iobyxmoadg("CHECK_PERIODIC_TOKEN_NAME")).zoijcleaow());
    }

    private final void gtknphoqwx() {
        cllcsxoeiz.f36369iobyxmoadg.iobyxmoadg(this.f114416eablkybsjg).gxszxtbevo("CHECK_ONE_TIME_TOKEN_NAME", dxjokdxxww.KEEP, (cqumvgiudr) ((cqumvgiudr.iobyxmoadg) new cqumvgiudr.iobyxmoadg(CheckNotificationRelevanceWorker.class).iobyxmoadg("CHECK_ONE_TIME_TOKEN_NAME")).zoijcleaow());
    }

    private final String nufgyqmvbu() {
        String strZoijcleaow = this.f114418ppxfxbqfkf.zoijcleaow();
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], GET token from sharedPref \"" + strZoijcleaow + "\"");
        return strZoijcleaow;
    }

    public void dxjokdxxww(String pushToken, boolean z13) {
        zdlpuopuiu.btonecajqb(pushToken, "pushToken");
        btonecajqb(zdlpuopuiu.eablkybsjg(pushToken, nufgyqmvbu()) && z13);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // tu0.iobyxmoadg
    public Object eablkybsjg(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f114430iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f114430iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = zoijcleaowVar.f114432yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f114430iwizpuwonk;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f114433zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                } else if (i14 == 2) {
                    iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f114433zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                    iobyxmoadgVar.f114418ppxfxbqfkf.eablkybsjg(q11.dxjokdxxww.ppxfxbqfkf());
                    zoijcleaowVar.f114433zdlpuopuiu = null;
                    zoijcleaowVar.f114430iwizpuwonk = 3;
                    objLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(zoijcleaowVar);
                    if (objLqeggnwhkg == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                }
                kcexrzcfyt.wkgbmnqykc((String) objLqeggnwhkg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            l42.iobyxmoadg iobyxmoadgVar3 = this.f114420zoijcleaow;
            zoijcleaowVar.f114433zdlpuopuiu = this;
            zoijcleaowVar.f114430iwizpuwonk = 1;
            if (iobyxmoadgVar3.iobyxmoadg(zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
            zoijcleaowVar.f114433zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f114430iwizpuwonk = 2;
            if (crxdokpmqz.zoijcleaow(500L, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar.f114418ppxfxbqfkf.eablkybsjg(q11.dxjokdxxww.ppxfxbqfkf());
            zoijcleaowVar.f114433zdlpuopuiu = null;
            zoijcleaowVar.f114430iwizpuwonk = 3;
            objLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(zoijcleaowVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            kcexrzcfyt.wkgbmnqykc((String) objLqeggnwhkg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tu0.iobyxmoadg
    public void iobyxmoadg(String newToken) {
        zdlpuopuiu.btonecajqb(newToken, "newToken");
        uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], onNewTokenGenerated.newToken=" + newToken);
        cllcsxoeiz.f36369iobyxmoadg.iobyxmoadg(this.f114416eablkybsjg).gxszxtbevo("HANDLE_NEW_TOKEN_NAME", dxjokdxxww.REPLACE, (cqumvgiudr) ((cqumvgiudr.iobyxmoadg) ((cqumvgiudr.iobyxmoadg) new cqumvgiudr.iobyxmoadg(HandleNewPushTokenWorker.class).draadjrbmk(new androidx.work.zoijcleaow.iobyxmoadg().lqeggnwhkg("HANDLE_TOKEN_WORKER_ARG_TOKEN", newToken).iobyxmoadg())).iobyxmoadg("HANDLE_NEW_TOKEN_NAME")).zoijcleaow());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        C2839iobyxmoadg c2839iobyxmoadg;
        String strNufgyqmvbu;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C2839iobyxmoadg) {
            c2839iobyxmoadg = (C2839iobyxmoadg) gxszxtbevoVar;
            int i13 = c2839iobyxmoadg.f114421iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2839iobyxmoadg.f114421iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2839iobyxmoadg = new C2839iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2839iobyxmoadg = new C2839iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c2839iobyxmoadg.f114423yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2839iobyxmoadg.f114421iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            strNufgyqmvbu = nufgyqmvbu();
            if (mj.kcexrzcfyt.zfvoamnweg(strNufgyqmvbu)) {
                uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], tokenFromCache is BLANK");
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    l42.iobyxmoadg iobyxmoadgVar3 = this.f114420zoijcleaow;
                    c2839iobyxmoadg.f114424zdlpuopuiu = this;
                    c2839iobyxmoadg.f114421iwizpuwonk = 1;
                    objZoijcleaow = iobyxmoadgVar3.zoijcleaow(c2839iobyxmoadg);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iobyxmoadgVar = this;
                } catch (Throwable th2) {
                    th = th2;
                    iobyxmoadgVar = this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            }
            return strNufgyqmvbu;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iobyxmoadgVar = (iobyxmoadg) c2839iobyxmoadg.f114424zdlpuopuiu;
        try {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        } catch (Throwable th3) {
            th = th3;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((String) objZoijcleaow);
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        strNufgyqmvbu = (String) objWkgbmnqykc;
        if (strNufgyqmvbu == null) {
            strNufgyqmvbu = "";
        }
        uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], pushTokenProvider.getPushToken() is CALL");
        uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], pushTokenProvider.getPushToken()=" + strNufgyqmvbu);
        iobyxmoadgVar.iobyxmoadg(strNufgyqmvbu);
        return strNufgyqmvbu;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // tu0.iobyxmoadg
    public Object ppxfxbqfkf(String str, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f114425cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f114425cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f114427jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f114425cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            dsvhmnatus.iobyxmoadg iobyxmoadgVar2 = new dsvhmnatus.iobyxmoadg(str, this.f114418ppxfxbqfkf.iobyxmoadg());
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                dsvhmnatus dsvhmnatusVar = this.f114419wkgbmnqykc;
                ppxfxbqfkfVar.f114429zdlpuopuiu = this;
                ppxfxbqfkfVar.f114428yggfygwlhe = str;
                ppxfxbqfkfVar.f114425cqumvgiudr = 1;
                if (dsvhmnatusVar.zoijcleaow(iobyxmoadgVar2, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) ppxfxbqfkfVar.f114428yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f114429zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], SUCCESS send token to backend \"" + ((wwaezpbzkn) objWkgbmnqykc) + "\"");
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], ERROR send token to backend \"" + str + "\"");
            thDxjokdxxww.printStackTrace();
            uu0.zoijcleaow.iobyxmoadg("[NotificationsRepository], " + wwaezpbzkn.f37140iobyxmoadg);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        }
        boolean zAgtfadlqog = kcexrzcfyt.agtfadlqog(objWkgbmnqykc);
        iobyxmoadgVar.dxjokdxxww(str, zAgtfadlqog);
        iobyxmoadgVar.wkgbmnqykc(!zAgtfadlqog);
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zAgtfadlqog);
    }

    @Override // tu0.iobyxmoadg
    public void wkgbmnqykc(boolean z13) {
        this.f114417iobyxmoadg.ppxfxbqfkf(z13 ? 0L : System.currentTimeMillis());
    }

    @Override // tu0.iobyxmoadg
    public void zoijcleaow() {
        gtknphoqwx();
        draadjrbmk();
    }
}

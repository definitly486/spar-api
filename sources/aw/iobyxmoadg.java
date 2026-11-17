package aw;

import android.content.Context;
import g6.cllcsxoeiz;
import g6.cqumvgiudr;
import g6.dxjokdxxww;
import g6.jyumaefscl;
import g6.nufgyqmvbu;
import g6.yadqdtsiqt;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import ha2.eablkybsjg;
import java.util.concurrent.TimeUnit;
import k30.draadjrbmk;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.crxdokpmqz;
import ru.myspar.components.notifications.impl.workers.CheckNotificationRelevanceWorker;
import ru.myspar.components.notifications.impl.workers.HandleNewPushTokenWorker;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements zv.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f14626eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bw.iobyxmoadg f14627iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f14628ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ca2.iobyxmoadg f14629wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l42.iobyxmoadg f14630zoijcleaow;

    /* JADX INFO: renamed from: aw.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0237iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f14631iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14633yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14634zdlpuopuiu;

        C0237iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14633yggfygwlhe = obj;
            this.f14631iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.nufgyqmvbu(this);
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f14635cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f14637jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f14638yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14639zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14637jyumaefscl = obj;
            this.f14635cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f14640iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14642yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14643zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14642yggfygwlhe = obj;
            this.f14640iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.eablkybsjg(this);
        }
    }

    public iobyxmoadg(bw.iobyxmoadg notificationCache, l42.iobyxmoadg pushTokenProvider, ca2.ppxfxbqfkf userRepository, ca2.iobyxmoadg deviceUtils, Context applicationContext) {
        zdlpuopuiu.btonecajqb(notificationCache, "notificationCache");
        zdlpuopuiu.btonecajqb(pushTokenProvider, "pushTokenProvider");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(deviceUtils, "deviceUtils");
        zdlpuopuiu.btonecajqb(applicationContext, "applicationContext");
        this.f14627iobyxmoadg = notificationCache;
        this.f14630zoijcleaow = pushTokenProvider;
        this.f14628ppxfxbqfkf = userRepository;
        this.f14629wkgbmnqykc = deviceUtils;
        this.f14626eablkybsjg = applicationContext;
    }

    private final void btonecajqb(boolean z13) {
        aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], SAVE newValue isSentToServer=" + z13);
        this.f14627iobyxmoadg.gxszxtbevo(z13);
    }

    private final void draadjrbmk() {
        cllcsxoeiz.f36369iobyxmoadg.iobyxmoadg(this.f14626eablkybsjg).eablkybsjg("CHECK_PERIODIC_TOKEN_NAME", nufgyqmvbu.UPDATE, (yadqdtsiqt) ((yadqdtsiqt.iobyxmoadg) ((yadqdtsiqt.iobyxmoadg) ((yadqdtsiqt.iobyxmoadg) new yadqdtsiqt.iobyxmoadg(CheckNotificationRelevanceWorker.class, 12L, TimeUnit.HOURS).dxjokdxxww(new g6.wkgbmnqykc.iobyxmoadg().zoijcleaow(jyumaefscl.NOT_ROAMING).wkgbmnqykc(false).ppxfxbqfkf(true).iobyxmoadg())).gtknphoqwx(5L, TimeUnit.MINUTES)).iobyxmoadg("CHECK_PERIODIC_TOKEN_NAME")).zoijcleaow());
    }

    private final String dxjokdxxww() {
        String strZoijcleaow = this.f14627iobyxmoadg.zoijcleaow();
        aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], GET token from sharedPref \"" + strZoijcleaow + "\"");
        return strZoijcleaow;
    }

    private final void gtknphoqwx() {
        cllcsxoeiz.f36369iobyxmoadg.iobyxmoadg(this.f14626eablkybsjg).gxszxtbevo("CHECK_ONE_TIME_TOKEN_NAME", dxjokdxxww.KEEP, (cqumvgiudr) ((cqumvgiudr.iobyxmoadg) new cqumvgiudr.iobyxmoadg(CheckNotificationRelevanceWorker.class).iobyxmoadg("CHECK_ONE_TIME_TOKEN_NAME")).zoijcleaow());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zv.iobyxmoadg
    public Object eablkybsjg(gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f14640iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f14640iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = zoijcleaowVar.f14642yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f14640iwizpuwonk;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f14643zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
                } else if (i14 == 2) {
                    iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f14643zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
                    iobyxmoadgVar.f14627iobyxmoadg.eablkybsjg(draadjrbmk.ppxfxbqfkf());
                    zoijcleaowVar.f14643zdlpuopuiu = null;
                    zoijcleaowVar.f14640iwizpuwonk = 3;
                    objNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu(zoijcleaowVar);
                    if (objNufgyqmvbu == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
                }
                kcexrzcfyt.wkgbmnqykc((String) objNufgyqmvbu);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            l42.iobyxmoadg iobyxmoadgVar3 = this.f14630zoijcleaow;
            zoijcleaowVar.f14643zdlpuopuiu = this;
            zoijcleaowVar.f14640iwizpuwonk = 1;
            if (iobyxmoadgVar3.iobyxmoadg(zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
            zoijcleaowVar.f14643zdlpuopuiu = iobyxmoadgVar;
            zoijcleaowVar.f14640iwizpuwonk = 2;
            if (crxdokpmqz.zoijcleaow(500L, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar.f14627iobyxmoadg.eablkybsjg(draadjrbmk.ppxfxbqfkf());
            zoijcleaowVar.f14643zdlpuopuiu = null;
            zoijcleaowVar.f14640iwizpuwonk = 3;
            objNufgyqmvbu = iobyxmoadgVar.nufgyqmvbu(zoijcleaowVar);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            kcexrzcfyt.wkgbmnqykc((String) objNufgyqmvbu);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // zv.iobyxmoadg
    public void gxszxtbevo(String pushToken, boolean z13) {
        zdlpuopuiu.btonecajqb(pushToken, "pushToken");
        btonecajqb(zdlpuopuiu.eablkybsjg(pushToken, dxjokdxxww()) && z13);
    }

    @Override // zv.iobyxmoadg
    public void iobyxmoadg(String newToken) {
        zdlpuopuiu.btonecajqb(newToken, "newToken");
        aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], onNewTokenGenerated.newToken=" + newToken);
        cllcsxoeiz.f36369iobyxmoadg.iobyxmoadg(this.f14626eablkybsjg).gxszxtbevo("HANDLE_NEW_TOKEN_NAME", dxjokdxxww.REPLACE, (cqumvgiudr) ((cqumvgiudr.iobyxmoadg) ((cqumvgiudr.iobyxmoadg) new cqumvgiudr.iobyxmoadg(HandleNewPushTokenWorker.class).draadjrbmk(new androidx.work.zoijcleaow.iobyxmoadg().lqeggnwhkg("HANDLE_TOKEN_WORKER_ARG_TOKEN", newToken).iobyxmoadg())).iobyxmoadg("HANDLE_NEW_TOKEN_NAME")).zoijcleaow());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zv.iobyxmoadg
    public Object nufgyqmvbu(gxszxtbevo gxszxtbevoVar) {
        C0237iobyxmoadg c0237iobyxmoadg;
        String strDxjokdxxww;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C0237iobyxmoadg) {
            c0237iobyxmoadg = (C0237iobyxmoadg) gxszxtbevoVar;
            int i13 = c0237iobyxmoadg.f14631iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0237iobyxmoadg.f14631iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0237iobyxmoadg = new C0237iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0237iobyxmoadg = new C0237iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0237iobyxmoadg.f14633yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0237iobyxmoadg.f14631iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            strDxjokdxxww = dxjokdxxww();
            if (mj.kcexrzcfyt.zfvoamnweg(strDxjokdxxww)) {
                aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], tokenFromCache is BLANK");
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    l42.iobyxmoadg iobyxmoadgVar3 = this.f14630zoijcleaow;
                    c0237iobyxmoadg.f14634zdlpuopuiu = this;
                    c0237iobyxmoadg.f14631iwizpuwonk = 1;
                    objZoijcleaow = iobyxmoadgVar3.zoijcleaow(c0237iobyxmoadg);
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
            return strDxjokdxxww;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iobyxmoadgVar = (iobyxmoadg) c0237iobyxmoadg.f14634zdlpuopuiu;
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
        strDxjokdxxww = (String) objWkgbmnqykc;
        if (strDxjokdxxww == null) {
            strDxjokdxxww = "";
        }
        aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], pushTokenProvider.getPushToken() is CALL");
        aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], pushTokenProvider.getPushToken()=" + strDxjokdxxww);
        iobyxmoadgVar.iobyxmoadg(strDxjokdxxww);
        return strDxjokdxxww;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0091, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00b1, please report this as an issue */
    @Override // zv.iobyxmoadg
    public Object ppxfxbqfkf(String str, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        eablkybsjg eablkybsjgVar;
        iobyxmoadg iobyxmoadgVar2;
        Object objWkgbmnqykc;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f14635cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f14635cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f14637jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f14635cqumvgiudr;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                ca2.iobyxmoadg iobyxmoadgVar3 = this.f14629wkgbmnqykc;
                ppxfxbqfkfVar.f14639zdlpuopuiu = this;
                ppxfxbqfkfVar.f14638yggfygwlhe = str;
                ppxfxbqfkfVar.f14635cqumvgiudr = 1;
                objIobyxmoadg = iobyxmoadgVar3.iobyxmoadg(ppxfxbqfkfVar);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) ppxfxbqfkfVar.f14638yggfygwlhe;
                    iobyxmoadgVar2 = (iobyxmoadg) ppxfxbqfkfVar.f14639zdlpuopuiu;
                    try {
                        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                    } catch (Throwable th2) {
                        th = th2;
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                    }
                    if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                        aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], SUCCESS send token to backend \"" + ((wwaezpbzkn) objWkgbmnqykc) + "\"");
                    }
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], ERROR send token to backend \"" + str + "\"");
                        thDxjokdxxww.printStackTrace();
                        aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], " + wwaezpbzkn.f37140iobyxmoadg);
                        rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    boolean zAgtfadlqog = kcexrzcfyt.agtfadlqog(objWkgbmnqykc);
                    iobyxmoadgVar2.gxszxtbevo(str, zAgtfadlqog);
                    iobyxmoadgVar2.wkgbmnqykc(!zAgtfadlqog);
                    return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zAgtfadlqog);
                }
                str = (String) ppxfxbqfkfVar.f14638yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f14639zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            ca2.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVar.f14628ppxfxbqfkf;
            ppxfxbqfkfVar.f14639zdlpuopuiu = iobyxmoadgVar;
            ppxfxbqfkfVar.f14638yggfygwlhe = str;
            ppxfxbqfkfVar.f14635cqumvgiudr = 2;
            if (ppxfxbqfkfVar2.wflxmlrfwp(eablkybsjgVar, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar2 = iobyxmoadgVar;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], SUCCESS send token to backend \"" + ((wwaezpbzkn) objWkgbmnqykc) + "\"");
            }
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], ERROR send token to backend \"" + str + "\"");
                thDxjokdxxww.printStackTrace();
                aw.zoijcleaow.iobyxmoadg("[NotificationsRepository], " + wwaezpbzkn.f37140iobyxmoadg);
                rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
            }
            boolean zAgtfadlqog2 = kcexrzcfyt.agtfadlqog(objWkgbmnqykc);
            iobyxmoadgVar2.gxszxtbevo(str, zAgtfadlqog2);
            iobyxmoadgVar2.wkgbmnqykc(!zAgtfadlqog2);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zAgtfadlqog2);
        } catch (Throwable th3) {
            th = th3;
            iobyxmoadgVar2 = iobyxmoadgVar;
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        eablkybsjgVar = new eablkybsjg(str, (String) objIobyxmoadg);
    }

    @Override // zv.iobyxmoadg
    public void wkgbmnqykc(boolean z13) {
        this.f14627iobyxmoadg.wkgbmnqykc(z13 ? 0L : System.currentTimeMillis());
    }

    @Override // zv.iobyxmoadg
    public void zoijcleaow() {
        gtknphoqwx();
        draadjrbmk();
    }
}

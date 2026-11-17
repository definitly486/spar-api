package ew1;

import aw1.AuthTokenInfoResponse;
import aw1.AuthTokenResponse;
import dw1.TokenInfoEntity;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.io.IOException;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import lk.cdpycssgdh;
import lk.iwizpuwonk;
import pj.btonecajqb;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.core.error_handler.exceptions.RefreshTokenLogoutException;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import sj.kegysxyocb;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;
import yj.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yj.iobyxmoadg f32253eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fw1.iobyxmoadg f32254iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hw1.zoijcleaow f32255ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zynmafqrjb f32256wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final s21.iobyxmoadg f32257zoijcleaow;

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f32258cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f32260jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f32261yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32262zdlpuopuiu;

        eablkybsjg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32260jyumaefscl = obj;
            this.f32258cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.btonecajqb(null, this);
        }
    }

    /* JADX INFO: renamed from: ew1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0698iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f32263iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f32265yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32266zdlpuopuiu;

        C0698iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32265yggfygwlhe = obj;
            this.f32263iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.gxszxtbevo(this);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ iwizpuwonk.iobyxmoadg f32267cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ iwizpuwonk.iobyxmoadg f32268esjtqupxsv;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32270jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f32271yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32272zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(iwizpuwonk.iobyxmoadg iobyxmoadgVar, iwizpuwonk.iobyxmoadg iobyxmoadgVar2, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f32267cqumvgiudr = iobyxmoadgVar;
            this.f32268esjtqupxsv = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f32267cqumvgiudr, this.f32268esjtqupxsv, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0077  */
        /* JADX WARN: Code duplicated, block: B:29:0x0087 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x008c  */
        /* JADX WARN: Code duplicated, block: B:34:0x0096 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) throws Throwable {
            iwizpuwonk.iobyxmoadg iobyxmoadgVar;
            iobyxmoadg iobyxmoadgVar2;
            cdpycssgdh cdpycssgdhVar;
            iobyxmoadg iobyxmoadgVar3;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f32270jyumaefscl;
            if (i13 != 0) {
                if (i13 == 1) {
                    iobyxmoadgVar = (iwizpuwonk.iobyxmoadg) this.f32271yggfygwlhe;
                    iobyxmoadgVar2 = (iobyxmoadg) this.f32272zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 == 2) {
                        zdlpuopuiu.zoijcleaow(obj);
                        cdpycssgdhVar = (cdpycssgdh) obj;
                        if (cdpycssgdhVar == null) {
                            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
                            iwizpuwonk.iobyxmoadg iobyxmoadgVar5 = this.f32268esjtqupxsv;
                            zynmafqrjb zynmafqrjbVarLqeggnwhkg = iobyxmoadgVar4.lqeggnwhkg();
                            this.f32270jyumaefscl = 3;
                            obj = ew1.ppxfxbqfkf.gtknphoqwx(iobyxmoadgVar4, iobyxmoadgVar5, zynmafqrjbVarLqeggnwhkg, this);
                            if (obj == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            cdpycssgdhVar = (cdpycssgdh) obj;
                            if (cdpycssgdhVar == null) {
                                iobyxmoadgVar3 = iobyxmoadg.this;
                                this.f32270jyumaefscl = 4;
                                if (iobyxmoadgVar3.gxszxtbevo(this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            }
                        }
                        return cdpycssgdhVar;
                    }
                    if (i13 == 3) {
                        zdlpuopuiu.zoijcleaow(obj);
                        cdpycssgdhVar = (cdpycssgdh) obj;
                        if (cdpycssgdhVar == null) {
                            iobyxmoadgVar3 = iobyxmoadg.this;
                            this.f32270jyumaefscl = 4;
                            if (iobyxmoadgVar3.gxszxtbevo(this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                        return cdpycssgdhVar;
                    }
                    if (i13 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                throw new KotlinNothingValueException();
            }
            zdlpuopuiu.zoijcleaow(obj);
            if (!ew1.ppxfxbqfkf.wkgbmnqykc(iobyxmoadg.this.f32254iobyxmoadg)) {
                iwizpuwonk.iobyxmoadg iobyxmoadgVar6 = this.f32267cqumvgiudr;
                return iobyxmoadgVar6.zoijcleaow(iobyxmoadgVar6.dxjokdxxww());
            }
            iobyxmoadg iobyxmoadgVar7 = iobyxmoadg.this;
            iobyxmoadgVar = this.f32267cqumvgiudr;
            this.f32272zdlpuopuiu = iobyxmoadgVar7;
            this.f32271yggfygwlhe = iobyxmoadgVar;
            this.f32270jyumaefscl = 1;
            Object objNufgyqmvbu = iobyxmoadgVar7.nufgyqmvbu(iobyxmoadgVar, this);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar2 = iobyxmoadgVar7;
            obj = objNufgyqmvbu;
            this.f32272zdlpuopuiu = null;
            this.f32271yggfygwlhe = null;
            this.f32270jyumaefscl = 2;
            obj = iobyxmoadgVar2.dxjokdxxww(iobyxmoadgVar, (String) obj, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cdpycssgdhVar = (cdpycssgdh) obj;
            if (cdpycssgdhVar == null) {
                iobyxmoadg iobyxmoadgVar8 = iobyxmoadg.this;
                iwizpuwonk.iobyxmoadg iobyxmoadgVar9 = this.f32268esjtqupxsv;
                zynmafqrjb zynmafqrjbVarLqeggnwhkg2 = iobyxmoadgVar8.lqeggnwhkg();
                this.f32270jyumaefscl = 3;
                obj = ew1.ppxfxbqfkf.gtknphoqwx(iobyxmoadgVar8, iobyxmoadgVar9, zynmafqrjbVarLqeggnwhkg2, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                cdpycssgdhVar = (cdpycssgdh) obj;
                if (cdpycssgdhVar == null) {
                    iobyxmoadgVar3 = iobyxmoadg.this;
                    this.f32270jyumaefscl = 4;
                    if (iobyxmoadgVar3.gxszxtbevo(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    throw new KotlinNothingValueException();
                }
            }
            return cdpycssgdhVar;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32273jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f32275zdlpuopuiu;

        wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32275zdlpuopuiu = obj;
            this.f32273jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.dxjokdxxww(null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f32277esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f32278iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f32279jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f32280yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32281zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32278iwizpuwonk = obj;
            this.f32277esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.nufgyqmvbu(null, this);
        }
    }

    public iobyxmoadg(fw1.iobyxmoadg userLocalSource, s21.iobyxmoadg apiEndPointsProvider, hw1.zoijcleaow userLogoutObserver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userLocalSource, "userLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userLogoutObserver, "userLogoutObserver");
        this.f32254iobyxmoadg = userLocalSource;
        this.f32257zoijcleaow = apiEndPointsProvider;
        this.f32255ppxfxbqfkf = userLogoutObserver;
        this.f32256wkgbmnqykc = kegysxyocb.iobyxmoadg(0);
        this.f32253eablkybsjg = lqeggnwhkg.zoijcleaow(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [aw1.ppxfxbqfkf] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ew1.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final Object btonecajqb(AuthTokenResponse authTokenResponse, gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        Object objWkgbmnqykc;
        ?? r13;
        kr0.wkgbmnqykc wkgbmnqykcVar;
        Throwable thDxjokdxxww;
        dw1.ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        fw1.iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f32258cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f32258cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object obj = eablkybsjgVar.f32260jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f32258cqumvgiudr;
        try {
            if (i14 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                    TokenInfoEntity tokenInfoEntityIozdgvuglv = gw1.iobyxmoadg.iozdgvuglv(gw1.iobyxmoadg.yggfygwlhe(authTokenResponse));
                    dw1.ppxfxbqfkf ppxfxbqfkfVarLmojexxdyd = gw1.iobyxmoadg.lmojexxdyd(gw1.iobyxmoadg.lqeggnwhkg(authTokenResponse.getTokenInfo().getToken()));
                    fw1.iobyxmoadg iobyxmoadgVar4 = this.f32254iobyxmoadg;
                    eablkybsjgVar.f32262zdlpuopuiu = this;
                    eablkybsjgVar.f32261yggfygwlhe = ppxfxbqfkfVarLmojexxdyd;
                    eablkybsjgVar.f32258cqumvgiudr = 1;
                    if (iobyxmoadgVar4.cdpycssgdh(tokenInfoEntityIozdgvuglv, eablkybsjgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVarLmojexxdyd;
                    iobyxmoadgVar = this;
                    iobyxmoadgVar2 = iobyxmoadgVar.f32254iobyxmoadg;
                    eablkybsjgVar.f32262zdlpuopuiu = iobyxmoadgVar;
                    eablkybsjgVar.f32261yggfygwlhe = null;
                    eablkybsjgVar.f32258cqumvgiudr = 2;
                    authTokenResponse = iobyxmoadgVar;
                    if (iobyxmoadgVar2.iozdgvuglv(ppxfxbqfkfVar, eablkybsjgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                    r13 = authTokenResponse;
                    wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) == null) {
                        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(kcexrzcfyt.agtfadlqog(objWkgbmnqykc));
                    }
                    eablkybsjgVar.f32262zdlpuopuiu = null;
                    eablkybsjgVar.f32261yggfygwlhe = null;
                    eablkybsjgVar.f32258cqumvgiudr = 3;
                    if (r13.gxszxtbevo(eablkybsjgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    authTokenResponse = this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    r13 = authTokenResponse;
                }
            } else if (i14 == 1) {
                dw1.ppxfxbqfkf ppxfxbqfkfVar2 = (dw1.ppxfxbqfkf) eablkybsjgVar.f32261yggfygwlhe;
                iobyxmoadg iobyxmoadgVar6 = (iobyxmoadg) eablkybsjgVar.f32262zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(obj);
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    iobyxmoadgVar = iobyxmoadgVar6;
                    iobyxmoadgVar2 = iobyxmoadgVar.f32254iobyxmoadg;
                    eablkybsjgVar.f32262zdlpuopuiu = iobyxmoadgVar;
                    eablkybsjgVar.f32261yggfygwlhe = null;
                    eablkybsjgVar.f32258cqumvgiudr = 2;
                    authTokenResponse = iobyxmoadgVar;
                    if (iobyxmoadgVar2.iozdgvuglv(ppxfxbqfkfVar, eablkybsjgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                    r13 = authTokenResponse;
                } catch (Throwable th3) {
                    th = th3;
                    authTokenResponse = iobyxmoadgVar6;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                    r13 = authTokenResponse;
                }
                wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                }
                if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) == null) {
                    return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(kcexrzcfyt.agtfadlqog(objWkgbmnqykc));
                }
                eablkybsjgVar.f32262zdlpuopuiu = null;
                eablkybsjgVar.f32261yggfygwlhe = null;
                eablkybsjgVar.f32258cqumvgiudr = 3;
                if (r13.gxszxtbevo(eablkybsjgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else if (i14 == 2) {
                iobyxmoadg iobyxmoadgVar8 = (iobyxmoadg) eablkybsjgVar.f32262zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
                authTokenResponse = iobyxmoadgVar8;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                r13 = authTokenResponse;
                wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                }
                if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) == null) {
                    return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(kcexrzcfyt.agtfadlqog(objWkgbmnqykc));
                }
                eablkybsjgVar.f32262zdlpuopuiu = null;
                eablkybsjgVar.f32261yggfygwlhe = null;
                eablkybsjgVar.f32258cqumvgiudr = 3;
                if (r13.gxszxtbevo(eablkybsjgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dxjokdxxww(iwizpuwonk.iobyxmoadg iobyxmoadgVar, String str, gxszxtbevo gxszxtbevoVar) throws IOException {
        wkgbmnqykc wkgbmnqykcVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f32273jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f32273jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f32275zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f32273jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            cdpycssgdh cdpycssgdhVarZoijcleaow = iobyxmoadgVar.zoijcleaow(ew1.ppxfxbqfkf.draadjrbmk(iobyxmoadgVar.dxjokdxxww(), str));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(ew1.ppxfxbqfkf.ppxfxbqfkf(cdpycssgdhVarZoijcleaow));
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            kr0.wkgbmnqykc wkgbmnqykcVar2 = kr0.wkgbmnqykc.f60450iobyxmoadg;
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                wkgbmnqykcVar2.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
            }
            Throwable thDxjokdxxww2 = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww2 != null) {
                throw new IOException(thDxjokdxxww2);
            }
            BasicResponse basicResponse = (BasicResponse) objWkgbmnqykc;
            if (!ew1.ppxfxbqfkf.gxszxtbevo(basicResponse)) {
                if (ew1.ppxfxbqfkf.lqeggnwhkg(basicResponse)) {
                    objWkgbmnqykc = null;
                }
                if (((BasicResponse) objWkgbmnqykc) != null) {
                    return cdpycssgdhVarZoijcleaow;
                }
                return null;
            }
            wkgbmnqykcVar.f32273jyumaefscl = 1;
            if (gxszxtbevo(wkgbmnqykcVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gxszxtbevo(gxszxtbevo gxszxtbevoVar) throws RefreshTokenLogoutException {
        C0698iobyxmoadg c0698iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C0698iobyxmoadg) {
            c0698iobyxmoadg = (C0698iobyxmoadg) gxszxtbevoVar;
            int i13 = c0698iobyxmoadg.f32263iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0698iobyxmoadg.f32263iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0698iobyxmoadg = new C0698iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0698iobyxmoadg = new C0698iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = c0698iobyxmoadg.f32265yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0698iobyxmoadg.f32263iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) c0698iobyxmoadg.f32266zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            throw new RefreshTokenLogoutException();
        }
        zdlpuopuiu.zoijcleaow(obj);
        ew1.ppxfxbqfkf.btonecajqb(this.f32256wkgbmnqykc);
        fw1.iobyxmoadg iobyxmoadgVar2 = this.f32254iobyxmoadg;
        c0698iobyxmoadg.f32266zdlpuopuiu = this;
        c0698iobyxmoadg.f32263iwizpuwonk = 1;
        if (iobyxmoadgVar2.iobyxmoadg(c0698iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        hw1.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f32255ppxfxbqfkf;
        c0698iobyxmoadg.f32266zdlpuopuiu = null;
        c0698iobyxmoadg.f32263iwizpuwonk = 2;
        if (zoijcleaowVar.gtknphoqwx(c0698iobyxmoadg) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        throw new RefreshTokenLogoutException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:83:0x0147  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yj.iobyxmoadg] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final Object nufgyqmvbu(iwizpuwonk.iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        zoijcleaow zoijcleaowVar;
        yj.iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        Object objWkgbmnqykc;
        Object objWkgbmnqykc2;
        BasicResponse basicResponse;
        AuthTokenResponse authTokenResponse;
        yj.iobyxmoadg iobyxmoadgVar4;
        iobyxmoadg iobyxmoadgVar5;
        String token;
        AuthTokenInfoResponse tokenInfo;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f32277esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f32277esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f32278iwizpuwonk;
        ?? Gxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f32277esjtqupxsv;
        try {
            try {
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadgVar2 = this.f32253eablkybsjg;
                    zoijcleaowVar.f32281zdlpuopuiu = this;
                    zoijcleaowVar.f32280yggfygwlhe = iobyxmoadgVar;
                    zoijcleaowVar.f32279jyumaefscl = iobyxmoadgVar2;
                    zoijcleaowVar.f32277esjtqupxsv = 1;
                    if (iobyxmoadgVar2.iobyxmoadg(null, zoijcleaowVar) == Gxszxtbevo) {
                        return Gxszxtbevo;
                    }
                    iobyxmoadgVar3 = this;
                } else {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            zdlpuopuiu.zoijcleaow(obj);
                            throw new KotlinNothingValueException();
                        }
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        authTokenResponse = (AuthTokenResponse) zoijcleaowVar.f32279jyumaefscl;
                        iobyxmoadgVar4 = (yj.iobyxmoadg) zoijcleaowVar.f32280yggfygwlhe;
                        iobyxmoadgVar5 = (iobyxmoadg) zoijcleaowVar.f32281zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                        if (((Boolean) obj).booleanValue()) {
                            authTokenResponse = null;
                        }
                        if (authTokenResponse != null || (tokenInfo = authTokenResponse.getTokenInfo()) == null || (token = tokenInfo.getToken()) == null) {
                            iobyxmoadgVar2 = iobyxmoadgVar4;
                            iobyxmoadgVar4 = iobyxmoadgVar2;
                            token = null;
                        } else {
                            ew1.ppxfxbqfkf.btonecajqb(iobyxmoadgVar5.f32256wkgbmnqykc);
                        }
                        iobyxmoadgVar4.eablkybsjg(null);
                        return token;
                    }
                    yj.iobyxmoadg iobyxmoadgVar6 = (yj.iobyxmoadg) zoijcleaowVar.f32279jyumaefscl;
                    iwizpuwonk.iobyxmoadg iobyxmoadgVar7 = (iwizpuwonk.iobyxmoadg) zoijcleaowVar.f32280yggfygwlhe;
                    iobyxmoadgVar3 = (iobyxmoadg) zoijcleaowVar.f32281zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadgVar2 = iobyxmoadgVar6;
                    iobyxmoadgVar = iobyxmoadgVar7;
                }
                TokenInfoEntity tokenInfoEntityPmvmpeiblj = iobyxmoadgVar3.f32254iobyxmoadg.pmvmpeiblj();
                if (tokenInfoEntityPmvmpeiblj == null) {
                    throw new RefreshTokenLogoutException();
                }
                if (!ew1.ppxfxbqfkf.eablkybsjg(tokenInfoEntityPmvmpeiblj.getTokenEndTime())) {
                    TokenInfoEntity tokenInfoEntityPmvmpeiblj2 = iobyxmoadgVar3.f32254iobyxmoadg.pmvmpeiblj();
                    String token2 = tokenInfoEntityPmvmpeiblj2 != null ? tokenInfoEntityPmvmpeiblj2.getToken() : null;
                    iobyxmoadgVar2.eablkybsjg(null);
                    return token2;
                }
                lk.zynmafqrjb zynmafqrjbVarWflxmlrfwp = ew1.ppxfxbqfkf.wflxmlrfwp(iobyxmoadgVar.dxjokdxxww(), iobyxmoadgVar3.f32257zoijcleaow.zoijcleaow(), tokenInfoEntityPmvmpeiblj.getRefreshToken());
                try {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(ew1.ppxfxbqfkf.dxjokdxxww(iobyxmoadgVar, zynmafqrjbVarWflxmlrfwp));
                } catch (Throwable th2) {
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
                }
                if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                    objWkgbmnqykc = null;
                }
                cdpycssgdh cdpycssgdhVar = (cdpycssgdh) objWkgbmnqykc;
                if (cdpycssgdhVar != null) {
                    try {
                        objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(ew1.ppxfxbqfkf.zoijcleaow(cdpycssgdhVar));
                    } catch (Throwable th3) {
                        kcexrzcfyt.iobyxmoadg iobyxmoadgVar10 = kcexrzcfyt.f37117yggfygwlhe;
                        objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th3));
                    }
                    kr0.wkgbmnqykc wkgbmnqykcVar = kr0.wkgbmnqykc.f60450iobyxmoadg;
                    Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc2);
                    if (thDxjokdxxww != null) {
                        wkgbmnqykcVar.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                    }
                    if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2)) {
                        objWkgbmnqykc2 = null;
                    }
                    basicResponse = (BasicResponse) objWkgbmnqykc2;
                } else {
                    basicResponse = null;
                }
                if (cdpycssgdhVar != null) {
                    cdpycssgdhVar.close();
                }
                if (ew1.ppxfxbqfkf.gxszxtbevo(basicResponse)) {
                    zoijcleaowVar.f32281zdlpuopuiu = iobyxmoadgVar2;
                    zoijcleaowVar.f32280yggfygwlhe = null;
                    zoijcleaowVar.f32279jyumaefscl = null;
                    zoijcleaowVar.f32277esjtqupxsv = 2;
                    if (iobyxmoadgVar3.gxszxtbevo(zoijcleaowVar) == Gxszxtbevo) {
                        return Gxszxtbevo;
                    }
                    throw new KotlinNothingValueException();
                }
                if (basicResponse == null || (authTokenResponse = (AuthTokenResponse) basicResponse.getData()) == null) {
                    iobyxmoadgVar4 = iobyxmoadgVar2;
                    token = null;
                } else {
                    zoijcleaowVar.f32281zdlpuopuiu = iobyxmoadgVar3;
                    zoijcleaowVar.f32280yggfygwlhe = iobyxmoadgVar2;
                    zoijcleaowVar.f32279jyumaefscl = authTokenResponse;
                    zoijcleaowVar.f32277esjtqupxsv = 3;
                    Object objBtonecajqb = iobyxmoadgVar3.btonecajqb(authTokenResponse, zoijcleaowVar);
                    if (objBtonecajqb == Gxszxtbevo) {
                        return Gxszxtbevo;
                    }
                    iobyxmoadgVar4 = iobyxmoadgVar2;
                    obj = objBtonecajqb;
                    iobyxmoadgVar5 = iobyxmoadgVar3;
                    if (((Boolean) obj).booleanValue()) {
                        authTokenResponse = null;
                    }
                    if (authTokenResponse != null) {
                    }
                    iobyxmoadgVar2 = iobyxmoadgVar4;
                    iobyxmoadgVar4 = iobyxmoadgVar2;
                    token = null;
                }
                iobyxmoadgVar4.eablkybsjg(null);
                return token;
            } catch (Throwable th4) {
                th = th4;
                Gxszxtbevo = iobyxmoadgVar2;
                Gxszxtbevo.eablkybsjg(null);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(chain, "chain");
        return (cdpycssgdh) btonecajqb.zoijcleaow(null, new ppxfxbqfkf(chain, chain, null), 1, null);
    }

    public final zynmafqrjb lqeggnwhkg() {
        return this.f32256wkgbmnqykc;
    }
}

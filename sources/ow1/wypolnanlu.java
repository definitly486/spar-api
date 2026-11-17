package ow1;

import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.user.domain.model.TokenInfo;
import ru.myspar.proloyalty.user.domain.model.UserInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class wypolnanlu extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ir0.iobyxmoadg f74984ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74985zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f74986iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final TokenInfo f74987zoijcleaow;

        public iobyxmoadg(boolean z13, TokenInfo tokenInfo) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tokenInfo, "tokenInfo");
            this.f74986iobyxmoadg = z13;
            this.f74987zoijcleaow = tokenInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f74986iobyxmoadg == iobyxmoadgVar.f74986iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74987zoijcleaow, iobyxmoadgVar.f74987zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f74986iobyxmoadg) * 31) + this.f74987zoijcleaow.hashCode();
        }

        public final TokenInfo iobyxmoadg() {
            return this.f74987zoijcleaow;
        }

        public String toString() {
            return "VerifyResult(isActive=" + this.f74986iobyxmoadg + ", tokenInfo=" + this.f74987zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f74986iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f74989esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f74990iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f74991jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f74992yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74993zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74990iwizpuwonk = obj;
            this.f74989esjtqupxsv |= Integer.MIN_VALUE;
            return wypolnanlu.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wypolnanlu(iw1.iobyxmoadg userRepository, ir0.iobyxmoadg deviceIdManager, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceIdManager, "deviceIdManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74985zoijcleaow = userRepository;
        this.f74984ppxfxbqfkf = deviceIdManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(nw1.btonecajqb btonecajqbVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        wypolnanlu wypolnanluVar;
        TokenInfo tokenInfo;
        String token;
        Object objWkgbmnqykc;
        ?? r13;
        wypolnanlu wypolnanluVar2;
        TokenInfo tokenInfo2;
        int i13;
        boolean isActive;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i14 = zoijcleaowVar.f74989esjtqupxsv;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f74989esjtqupxsv = i14 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objPkzmftpjix = zoijcleaowVar.f74990iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = zoijcleaowVar.f74989esjtqupxsv;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    wypolnanluVar = (wypolnanlu) zoijcleaowVar.f74993zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objPkzmftpjix);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = zoijcleaowVar.f74991jyumaefscl;
                    tokenInfo2 = (TokenInfo) zoijcleaowVar.f74992yggfygwlhe;
                    wypolnanluVar2 = (wypolnanlu) zoijcleaowVar.f74993zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objPkzmftpjix);
                }
                wypolnanluVar2.f74985zoijcleaow.wkgbmnqykc(false);
                r13 = i13;
                tokenInfo = tokenInfo2;
                r13 = isActive;
                return new iobyxmoadg(r13 != 0, tokenInfo);
            }
            gg.zdlpuopuiu.zoijcleaow(objPkzmftpjix);
            iw1.iobyxmoadg iobyxmoadgVar = this.f74985zoijcleaow;
            String strIobyxmoadg = this.f74984ppxfxbqfkf.iobyxmoadg();
            String strZoijcleaow = this.f74984ppxfxbqfkf.zoijcleaow();
            if (strZoijcleaow == null) {
                strZoijcleaow = "";
            }
            zoijcleaowVar.f74993zdlpuopuiu = this;
            zoijcleaowVar.f74989esjtqupxsv = 1;
            objPkzmftpjix = iobyxmoadgVar.pkzmftpjix(btonecajqbVar, strIobyxmoadg, strZoijcleaow, zoijcleaowVar);
            if (objPkzmftpjix == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wypolnanluVar = this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gw1.iobyxmoadg.lqeggnwhkg(token));
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        tokenInfo = (TokenInfo) objPkzmftpjix;
        token = tokenInfo.getToken();
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        }
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        UserInfo userInfo = (UserInfo) objWkgbmnqykc;
        if (userInfo != null) {
            isActive = userInfo.getIsActive();
        } else {
            r13 = 0;
        }
        if (r13 != 0) {
            iw1.iobyxmoadg iobyxmoadgVar4 = wypolnanluVar.f74985zoijcleaow;
            zoijcleaowVar.f74993zdlpuopuiu = wypolnanluVar;
            zoijcleaowVar.f74992yggfygwlhe = tokenInfo;
            zoijcleaowVar.f74991jyumaefscl = r13 == true ? 1 : 0;
            zoijcleaowVar.f74989esjtqupxsv = 2;
            if (iobyxmoadgVar4.crxdokpmqz(tokenInfo, userInfo, zoijcleaowVar) == objGxszxtbevo) {
                r13 = isActive;
                return objGxszxtbevo;
            }
            r13 = isActive;
            wypolnanluVar2 = wypolnanluVar;
            tokenInfo2 = tokenInfo;
            i13 = r13 == true ? 1 : 0;
            wypolnanluVar2.f74985zoijcleaow.wkgbmnqykc(false);
            r13 = i13;
            tokenInfo = tokenInfo2;
        }
        r13 = isActive;
        return new iobyxmoadg(r13 != 0, tokenInfo);
    }
}

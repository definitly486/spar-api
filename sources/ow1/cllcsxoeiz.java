package ow1;

import aw1.AuthTokenResponse;
import dw1.TokenInfoEntity;

/* JADX INFO: loaded from: classes6.dex */
public final class cllcsxoeiz extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ir0.iobyxmoadg f74872ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fw1.iobyxmoadg f74873zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final AuthTokenResponse f74874iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f74875ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f74876wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f74877zoijcleaow;

        public iobyxmoadg(AuthTokenResponse authTokenResponse, String pushToken, String deviceId, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pushToken, "pushToken");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceId, "deviceId");
            this.f74874iobyxmoadg = authTokenResponse;
            this.f74877zoijcleaow = pushToken;
            this.f74875ppxfxbqfkf = deviceId;
            this.f74876wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74874iobyxmoadg, iobyxmoadgVar.f74874iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74877zoijcleaow, iobyxmoadgVar.f74877zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74875ppxfxbqfkf, iobyxmoadgVar.f74875ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74876wkgbmnqykc, iobyxmoadgVar.f74876wkgbmnqykc);
        }

        public int hashCode() {
            AuthTokenResponse authTokenResponse = this.f74874iobyxmoadg;
            int iHashCode = (((((authTokenResponse == null ? 0 : authTokenResponse.hashCode()) * 31) + this.f74877zoijcleaow.hashCode()) * 31) + this.f74875ppxfxbqfkf.hashCode()) * 31;
            String str = this.f74876wkgbmnqykc;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String iobyxmoadg() {
            return this.f74875ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f74877zoijcleaow;
        }

        public String toString() {
            return "Params(response=" + this.f74874iobyxmoadg + ", pushToken=" + this.f74877zoijcleaow + ", deviceId=" + this.f74875ppxfxbqfkf + ", installationId=" + this.f74876wkgbmnqykc + ")";
        }

        public final AuthTokenResponse wkgbmnqykc() {
            return this.f74874iobyxmoadg;
        }

        public final String zoijcleaow() {
            return this.f74876wkgbmnqykc;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f74879esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f74880iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f74881jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f74882yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74883zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74880iwizpuwonk = obj;
            this.f74879esjtqupxsv |= Integer.MIN_VALUE;
            return cllcsxoeiz.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cllcsxoeiz(fw1.iobyxmoadg userLocalSource, ir0.iobyxmoadg deviceIdManager, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userLocalSource, "userLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceIdManager, "deviceIdManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74873zoijcleaow = userLocalSource;
        this.f74872ppxfxbqfkf = deviceIdManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        cllcsxoeiz cllcsxoeizVar;
        cllcsxoeiz cllcsxoeizVar2;
        iobyxmoadg iobyxmoadgVar2;
        dw1.ppxfxbqfkf ppxfxbqfkfVar;
        fw1.iobyxmoadg iobyxmoadgVar3;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f74879esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f74879esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f74880iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f74879esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (iobyxmoadgVar.wkgbmnqykc() != null) {
                TokenInfoEntity tokenInfoEntityIozdgvuglv = gw1.iobyxmoadg.iozdgvuglv(gw1.iobyxmoadg.yggfygwlhe(iobyxmoadgVar.wkgbmnqykc()));
                dw1.ppxfxbqfkf ppxfxbqfkfVarLmojexxdyd = gw1.iobyxmoadg.lmojexxdyd(gw1.iobyxmoadg.lqeggnwhkg(iobyxmoadgVar.wkgbmnqykc().getTokenInfo().getToken()));
                fw1.iobyxmoadg iobyxmoadgVar4 = this.f74873zoijcleaow;
                zoijcleaowVar.f74883zdlpuopuiu = this;
                zoijcleaowVar.f74882yggfygwlhe = iobyxmoadgVar;
                zoijcleaowVar.f74881jyumaefscl = ppxfxbqfkfVarLmojexxdyd;
                zoijcleaowVar.f74879esjtqupxsv = 1;
                if (iobyxmoadgVar4.cdpycssgdh(tokenInfoEntityIozdgvuglv, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                cllcsxoeizVar2 = this;
                iobyxmoadgVar2 = iobyxmoadgVar;
                ppxfxbqfkfVar = ppxfxbqfkfVarLmojexxdyd;
                iobyxmoadgVar3 = cllcsxoeizVar2.f74873zoijcleaow;
                zoijcleaowVar.f74883zdlpuopuiu = cllcsxoeizVar2;
                zoijcleaowVar.f74882yggfygwlhe = iobyxmoadgVar2;
                zoijcleaowVar.f74881jyumaefscl = null;
                zoijcleaowVar.f74879esjtqupxsv = 2;
                if (iobyxmoadgVar3.iozdgvuglv(ppxfxbqfkfVar, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = iobyxmoadgVar2;
                cllcsxoeizVar = cllcsxoeizVar2;
            } else {
                cllcsxoeizVar = this;
            }
        } else if (i14 == 1) {
            ppxfxbqfkfVar = (dw1.ppxfxbqfkf) zoijcleaowVar.f74881jyumaefscl;
            iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f74882yggfygwlhe;
            cllcsxoeizVar2 = (cllcsxoeiz) zoijcleaowVar.f74883zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadgVar3 = cllcsxoeizVar2.f74873zoijcleaow;
            zoijcleaowVar.f74883zdlpuopuiu = cllcsxoeizVar2;
            zoijcleaowVar.f74882yggfygwlhe = iobyxmoadgVar2;
            zoijcleaowVar.f74881jyumaefscl = null;
            zoijcleaowVar.f74879esjtqupxsv = 2;
            if (iobyxmoadgVar3.iozdgvuglv(ppxfxbqfkfVar, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            cllcsxoeizVar = cllcsxoeizVar2;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f74882yggfygwlhe;
            cllcsxoeizVar = (cllcsxoeiz) zoijcleaowVar.f74883zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        cllcsxoeizVar.f74872ppxfxbqfkf.eablkybsjg(iobyxmoadgVar.ppxfxbqfkf());
        cllcsxoeizVar.f74872ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVar.iobyxmoadg());
        cllcsxoeizVar.f74872ppxfxbqfkf.gxszxtbevo(iobyxmoadgVar.zoijcleaow());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

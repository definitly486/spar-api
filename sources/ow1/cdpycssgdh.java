package ow1;

import ru.myspar.proloyalty.user.domain.model.TokenInfo;
import ru.myspar.proloyalty.user.domain.model.UserInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class cdpycssgdh extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iw1.iobyxmoadg f74864zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final nw1.lqeggnwhkg f74865iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f74866ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f74867zoijcleaow;

        public iobyxmoadg(nw1.lqeggnwhkg registrationData, String token, String refreshToken) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(registrationData, "registrationData");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(token, "token");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(refreshToken, "refreshToken");
            this.f74865iobyxmoadg = registrationData;
            this.f74867zoijcleaow = token;
            this.f74866ppxfxbqfkf = refreshToken;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74865iobyxmoadg, iobyxmoadgVar.f74865iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74867zoijcleaow, iobyxmoadgVar.f74867zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f74866ppxfxbqfkf, iobyxmoadgVar.f74866ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f74865iobyxmoadg.hashCode() * 31) + this.f74867zoijcleaow.hashCode()) * 31) + this.f74866ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f74866ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f74867zoijcleaow;
        }

        public String toString() {
            return "Params(registrationData=" + this.f74865iobyxmoadg + ", token=" + this.f74867zoijcleaow + ", refreshToken=" + this.f74866ppxfxbqfkf + ")";
        }

        public final nw1.lqeggnwhkg zoijcleaow() {
            return this.f74865iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f74868iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f74870yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f74871zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f74870yggfygwlhe = obj;
            this.f74868iwizpuwonk |= Integer.MIN_VALUE;
            return cdpycssgdh.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdpycssgdh(iw1.iobyxmoadg userRepository, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74864zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iw1.iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f74868iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f74868iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f74870yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f74868iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iw1.iobyxmoadg) zoijcleaowVar.f74871zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (iw1.iobyxmoadg) zoijcleaowVar.f74871zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadgVar2.gxszxtbevo(true);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        iw1.iobyxmoadg iobyxmoadgVar3 = this.f74864zoijcleaow;
        nw1.lqeggnwhkg lqeggnwhkgVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f74871zdlpuopuiu = iobyxmoadgVar3;
        zoijcleaowVar.f74868iwizpuwonk = 1;
        Object objYlkuphrtab = iobyxmoadgVar3.ylkuphrtab(lqeggnwhkgVarZoijcleaow, strPpxfxbqfkf, strIobyxmoadg, zoijcleaowVar);
        if (objYlkuphrtab == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        obj = objYlkuphrtab;
        iobyxmoadgVar2 = iobyxmoadgVar3;
        TokenInfo tokenInfo = (TokenInfo) obj;
        UserInfo userInfoLqeggnwhkg = gw1.iobyxmoadg.lqeggnwhkg(tokenInfo.getToken());
        zoijcleaowVar.f74871zdlpuopuiu = iobyxmoadgVar2;
        zoijcleaowVar.f74868iwizpuwonk = 2;
        if (iobyxmoadgVar2.crxdokpmqz(tokenInfo, userInfoLqeggnwhkg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2.gxszxtbevo(true);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

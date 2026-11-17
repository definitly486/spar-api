package ra2;

import aw1.AuthTokenResponse;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.cllcsxoeiz;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class gtknphoqwx extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final pa2.iobyxmoadg f82439eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f82440ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cllcsxoeiz f82441wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final qa2.zoijcleaow f82442zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f82443iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f82445yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82446zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82445yggfygwlhe = obj;
            this.f82443iwizpuwonk |= Integer.MIN_VALUE;
            return gtknphoqwx.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(qa2.zoijcleaow userRemoteSource, ca2.wkgbmnqykc userSharedPreferences, cllcsxoeiz updateJwtTokenUseCase, pa2.iobyxmoadg credentialSharedPreferences, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRemoteSource, "userRemoteSource");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(updateJwtTokenUseCase, "updateJwtTokenUseCase");
        zdlpuopuiu.btonecajqb(credentialSharedPreferences, "credentialSharedPreferences");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f82442zoijcleaow = userRemoteSource;
        this.f82440ppxfxbqfkf = userSharedPreferences;
        this.f82441wkgbmnqykc = updateJwtTokenUseCase;
        this.f82439eablkybsjg = credentialSharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        gtknphoqwx gtknphoqwxVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f82443iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f82443iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = iobyxmoadgVar.f82445yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f82443iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                gtknphoqwxVar = (gtknphoqwx) iobyxmoadgVar.f82446zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        if (!this.f82440ppxfxbqfkf.nufgyqmvbu()) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        qa2.zoijcleaow zoijcleaowVar = this.f82442zoijcleaow;
        iobyxmoadgVar.f82446zdlpuopuiu = this;
        iobyxmoadgVar.f82443iwizpuwonk = 1;
        objWkgbmnqykc = zoijcleaowVar.wkgbmnqykc(iobyxmoadgVar);
        if (objWkgbmnqykc == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gtknphoqwxVar = this;
        cllcsxoeiz.iobyxmoadg iobyxmoadgVar2 = new cllcsxoeiz.iobyxmoadg((AuthTokenResponse) objWkgbmnqykc, gtknphoqwxVar.f82439eablkybsjg.eablkybsjg(), gtknphoqwxVar.f82439eablkybsjg.ppxfxbqfkf(), gtknphoqwxVar.f82439eablkybsjg.wkgbmnqykc());
        cllcsxoeiz cllcsxoeizVar = gtknphoqwxVar.f82441wkgbmnqykc;
        iobyxmoadgVar.f82446zdlpuopuiu = null;
        iobyxmoadgVar.f82443iwizpuwonk = 2;
        if (cllcsxoeizVar.zoijcleaow(iobyxmoadgVar2, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

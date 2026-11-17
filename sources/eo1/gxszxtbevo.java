package eo1;

import gg.wwaezpbzkn;
import ow1.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.user.domain.model.UserInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zdlpuopuiu f31646ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final t81.iobyxmoadg f31647zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f31648iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f31650yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f31651zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31650yggfygwlhe = obj;
            this.f31648iwizpuwonk |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(t81.iobyxmoadg featureManager, zdlpuopuiu getUserInfoUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserInfoUseCase, "getUserInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f31647zoijcleaow = featureManager;
        this.f31646ppxfxbqfkf = getUserInfoUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f31648iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f31648iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f31650yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f31648iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                gxszxtbevoVar2 = (gxszxtbevo) iobyxmoadgVar.f31651zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            }
            UserInfo userInfo = (UserInfo) objPpxfxbqfkf;
            return userInfo == null ? kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false) : kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(userInfo.getScangoAccess());
        }
        gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        if (!uw0.ppxfxbqfkf.f114521iobyxmoadg.hkdspvbjdz()) {
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        }
        t81.iobyxmoadg iobyxmoadgVar2 = this.f31647zoijcleaow;
        s81.iobyxmoadg iobyxmoadgVar3 = s81.iobyxmoadg.f105727iozdgvuglv;
        iobyxmoadgVar.f31651zdlpuopuiu = this;
        iobyxmoadgVar.f31648iwizpuwonk = 1;
        objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(iobyxmoadgVar3, iobyxmoadgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gxszxtbevoVar2 = this;
        if (!((Boolean) objPpxfxbqfkf).booleanValue()) {
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        }
        zdlpuopuiu zdlpuopuiuVar = gxszxtbevoVar2.f31646ppxfxbqfkf;
        wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
        iobyxmoadgVar.f31651zdlpuopuiu = null;
        iobyxmoadgVar.f31648iwizpuwonk = 2;
        objPpxfxbqfkf = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar2, iobyxmoadgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        UserInfo userInfo2 = (UserInfo) objPpxfxbqfkf;
        if (userInfo2 == null) {
        }
    }
}

package g42;

import ca2.wkgbmnqykc;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f36191ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f36192wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final g42.iobyxmoadg f36193zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f36194cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f36196jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f36197yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f36198zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f36196jyumaefscl = obj;
            this.f36194cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(g42.iobyxmoadg installationId, wkgbmnqykc userSharedPreferences, ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(installationId, "installationId");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f36193zoijcleaow = installationId;
        this.f36191ppxfxbqfkf = userSharedPreferences;
        this.f36192wkgbmnqykc = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        String str;
        ppxfxbqfkf ppxfxbqfkfVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f36194cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f36194cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f36196jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f36194cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f36198zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) iobyxmoadgVar.f36197yggfygwlhe;
                ppxfxbqfkfVar2 = (ppxfxbqfkf) iobyxmoadgVar.f36198zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            ppxfxbqfkfVar2.f36191ppxfxbqfkf.wkgbmnqykc(str);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        g42.iobyxmoadg iobyxmoadgVar2 = this.f36193zoijcleaow;
        iobyxmoadgVar.f36198zdlpuopuiu = this;
        iobyxmoadgVar.f36194cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar2.zoijcleaow(iobyxmoadgVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        String str2 = (String) objZoijcleaow;
        ca2.ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkfVar.f36192wkgbmnqykc;
        String str3 = str2 == null ? "" : str2;
        iobyxmoadgVar.f36198zdlpuopuiu = ppxfxbqfkfVar;
        iobyxmoadgVar.f36197yggfygwlhe = str2;
        iobyxmoadgVar.f36194cqumvgiudr = 2;
        if (ppxfxbqfkfVar3.gtknphoqwx(str3, iobyxmoadgVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        str = str2;
        ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        ppxfxbqfkfVar2.f36191ppxfxbqfkf.wkgbmnqykc(str);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}

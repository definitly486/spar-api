package g42;

import ca2.wkgbmnqykc;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final g42.iobyxmoadg f36199ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f36200zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f36201iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f36203yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f36204zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f36203yggfygwlhe = obj;
            this.f36201iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(wkgbmnqykc userSharedPreferences, g42.iobyxmoadg installationId, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(installationId, "installationId");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f36200zoijcleaow = userSharedPreferences;
        this.f36199ppxfxbqfkf = installationId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f36201iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f36201iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f36203yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f36201iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            if (this.f36199ppxfxbqfkf.iobyxmoadg()) {
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            }
            g42.iobyxmoadg iobyxmoadgVar2 = this.f36199ppxfxbqfkf;
            iobyxmoadgVar.f36204zdlpuopuiu = this;
            iobyxmoadgVar.f36201iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f36204zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        String str = (String) objZoijcleaow;
        String strDxjokdxxww = zoijcleaowVar.f36200zoijcleaow.dxjokdxxww();
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(strDxjokdxxww == null || strDxjokdxxww.length() == 0 || !zdlpuopuiu.eablkybsjg(strDxjokdxxww, str));
    }
}

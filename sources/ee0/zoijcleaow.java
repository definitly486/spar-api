package ee0;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;
import pm.dxjokdxxww;
import rx.nufgyqmvbu;
import s40.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f31209iobyxmoadg = new zoijcleaow();

    private zoijcleaow() {
    }

    public static /* synthetic */ nufgyqmvbu eablkybsjg(zoijcleaow zoijcleaowVar, Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            iobyxmoadgVar = null;
        }
        if ((i13 & 4) != 0) {
            iobyxmoadgVar2 = null;
        }
        return zoijcleaowVar.wkgbmnqykc(context, iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static /* synthetic */ nufgyqmvbu zoijcleaow(zoijcleaow zoijcleaowVar, Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, rx.ppxfxbqfkf ppxfxbqfkfVar, int i13, Object obj) {
        tg.iobyxmoadg iobyxmoadgVar4 = (i13 & 2) != 0 ? null : iobyxmoadgVar;
        tg.iobyxmoadg iobyxmoadgVar5 = (i13 & 4) != 0 ? null : iobyxmoadgVar2;
        tg.iobyxmoadg iobyxmoadgVar6 = (i13 & 8) != 0 ? null : iobyxmoadgVar3;
        if ((i13 & 16) != 0) {
            ppxfxbqfkfVar = rx.ppxfxbqfkf.HORIZONTAL;
        }
        return zoijcleaowVar.iobyxmoadg(context, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, ppxfxbqfkfVar);
    }

    public final int gxszxtbevo(Context context, int i13) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        return (int) (i13 * context.getResources().getDisplayMetrics().density);
    }

    public final nufgyqmvbu iobyxmoadg(Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, tg.iobyxmoadg iobyxmoadgVar3, rx.ppxfxbqfkf buttonsAlignmentType) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(buttonsAlignmentType, "buttonsAlignmentType");
        return new nufgyqmvbu.iobyxmoadg(context, null, iobyxmoadgVar3, 2, null).agtfadlqog(dxjokdxxww.age_maturity_title).lqeggnwhkg(dxjokdxxww.age_maturity).wkgbmnqykc(true).draadjrbmk(dxjokdxxww.action_yes, iobyxmoadgVar).btonecajqb(dxjokdxxww.action_no, iobyxmoadgVar2).ppxfxbqfkf(buttonsAlignmentType).zoijcleaow();
    }

    public final nufgyqmvbu ppxfxbqfkf(Context context, String message, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(message, "message");
        return new nufgyqmvbu.iobyxmoadg(context, null, null, 6, null).agtfadlqog(dxjokdxxww.attention).rgvfuqvkyq(8388611).dxjokdxxww(8388611).nufgyqmvbu(message).draadjrbmk(draadjrbmk.action_edit, iobyxmoadgVar).btonecajqb(dxjokdxxww.action_cancel, iobyxmoadgVar2).ppxfxbqfkf(rx.ppxfxbqfkf.VERTICAL).zoijcleaow();
    }

    public final nufgyqmvbu wkgbmnqykc(Context context, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2) {
        zdlpuopuiu.btonecajqb(context, "context");
        return new nufgyqmvbu.iobyxmoadg(context, null, null, 6, null).agtfadlqog(dxjokdxxww.restaurant_clear_shop_cart).draadjrbmk(dxjokdxxww.action_yes, iobyxmoadgVar).btonecajqb(dxjokdxxww.action_no, iobyxmoadgVar2).zoijcleaow();
    }
}

package kk;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import spay.sdk.RedirectActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class gk extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f56718zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(RedirectActivity redirectActivity) {
        super(1);
        this.f56718zdlpuopuiu = redirectActivity;
    }

    @Override // tg.draadjrbmk
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        RedirectActivity redirectActivity = this.f56718zdlpuopuiu;
        int i13 = RedirectActivity.f107822g;
        synchronized (redirectActivity) {
            try {
                if (zBooleanValue) {
                    List listIgdgnonuha = redirectActivity.getSupportFragmentManager().igdgnonuha();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha, "supportFragmentManager.fragments");
                    Iterator it = listIgdgnonuha.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            redirectActivity.getSupportFragmentManager().kcexrzcfyt().eablkybsjg(new npi.spay.uo(), "SdkFlowBottomSheetDialogFragment").gtknphoqwx();
                        } else if (((Fragment) it.next()) instanceof npi.spay.uo) {
                        }
                    }
                } else {
                    List listIgdgnonuha2 = redirectActivity.getSupportFragmentManager().igdgnonuha();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listIgdgnonuha2, "supportFragmentManager.fragments");
                    Object objLrnfpwlwnk = hg.jyumaefscl.lrnfpwlwnk(listIgdgnonuha2, 0);
                    npi.spay.uo uoVar = objLrnfpwlwnk instanceof npi.spay.uo ? (npi.spay.uo) objLrnfpwlwnk : null;
                    if (uoVar != null) {
                        uoVar.dismiss();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

package bz;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnSuccessListener;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class lxfrhoxuzk extends metgxyhuhe implements e, t6.stevsuqkhv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17521eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17522gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f17523lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f17524nufgyqmvbu;

    class iobyxmoadg extends e.iobyxmoadg {
        iobyxmoadg(kc2.gxszxtbevo gxszxtbevoVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zoijcleaow(kc2.lqeggnwhkg lqeggnwhkgVar, AppSetIdInfo appSetIdInfo) {
            lxfrhoxuzk.this.f17524nufgyqmvbu = appSetIdInfo.getScope();
            lxfrhoxuzk.this.f17523lqeggnwhkg = appSetIdInfo.getId();
            if (lqeggnwhkgVar == kc2.lqeggnwhkg.AppSetIdScopeApp && lxfrhoxuzk.this.f17524nufgyqmvbu == 1) {
                lxfrhoxuzk lxfrhoxuzkVar = lxfrhoxuzk.this;
                lxfrhoxuzkVar.btonecajqb(lxfrhoxuzkVar.f17523lqeggnwhkg);
            } else if (lqeggnwhkgVar == kc2.lqeggnwhkg.AppSetIdScopeDeveloper && lxfrhoxuzk.this.f17524nufgyqmvbu == 2) {
                lxfrhoxuzk lxfrhoxuzkVar2 = lxfrhoxuzk.this;
                lxfrhoxuzkVar2.btonecajqb(lxfrhoxuzkVar2.f17523lqeggnwhkg);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            final kc2.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = lxfrhoxuzk.this.iwizpuwonk();
            if (lxfrhoxuzk.this.ppxfxbqfkf() != null) {
                return;
            }
            AppSet.getClient(lxfrhoxuzk.this.f17521eablkybsjg).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: bz.igdgnonuha
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f17455iobyxmoadg.zoijcleaow(lqeggnwhkgVarIwizpuwonk, (AppSetIdInfo) obj);
                }
            });
        }
    }

    lxfrhoxuzk(kc2.lqeggnwhkg lqeggnwhkgVar, Context context, t6.zdlpuopuiu zdlpuopuiuVar) {
        super(lqeggnwhkgVar);
        this.f17523lqeggnwhkg = "";
        this.f17521eablkybsjg = context;
        this.f17522gxszxtbevo = zdlpuopuiuVar;
    }

    @Override // bz.e
    public e.iobyxmoadg agtfadlqog(kc2.gxszxtbevo gxszxtbevoVar) {
        return new iobyxmoadg(gxszxtbevoVar);
    }

    @Override // t6.stevsuqkhv
    public Set eablkybsjg() {
        return t6.jyumaefscl.iobyxmoadg(t6.bfopjjpdmp.f109785iobyxmoadg, t6.bfopjjpdmp.f109788zoijcleaow, t6.bfopjjpdmp.f109786ppxfxbqfkf, t6.bfopjjpdmp.f109787wkgbmnqykc, t6.bfopjjpdmp.f109784eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: iozdgvuglv, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jrbgnlbqoe, u4 {
        String str = (String) ppxfxbqfkf();
        if (str != null && !str.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
            return str;
        }
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f17521eablkybsjg) != 0) {
            throw new u4("!GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(mContext)");
        }
        ojitshcjhn(null);
        throw new jrbgnlbqoe("cachedValue == null");
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17522gxszxtbevo;
    }
}

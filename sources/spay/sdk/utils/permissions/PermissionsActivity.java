package spay.sdk.utils.permissions;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.wkgbmnqykc;
import androidx.core.app.zoijcleaow;
import gg.cqumvgiudr;
import hg.agtfadlqog;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Map;
import kk.bt;
import kk.mp;
import kk.ow;
import kk.r80;
import kk.rj;
import kk.we0;
import kk.xr;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lspay/sdk/utils/permissions/PermissionsActivity;", "Landroidx/appcompat/app/wkgbmnqykc;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PermissionsActivity extends wkgbmnqykc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bt f107846a;

    @Override // androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    public final void onCreate(Bundle bundle) {
        rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f107846a = rjVar.f58386iobyxmoadg.zoijcleaow();
        }
        super.onCreate(bundle);
        zdlpuopuiu.btonecajqb(this, "<this>");
        zoijcleaow.lqeggnwhkg(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 13);
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, android.app.Activity
    public final void onRequestPermissionsResult(int i13, String[] permissions, int[] grantResults) {
        zdlpuopuiu.btonecajqb(permissions, "permissions");
        zdlpuopuiu.btonecajqb(grantResults, "grantResults");
        super.onRequestPermissionsResult(i13, permissions, grantResults);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bt btVar = this.f107846a;
        if (btVar != null) {
            btVar.iobyxmoadg(new ow(xr.SC_PERMISSIONS, we0.MERCHANT_VIEW, mp.SC, null, null, null, null, 120));
        }
        for (Map.Entry entry : tzroggbefp.kcexrzcfyt(agtfadlqog.x(grantResults, permissions)).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (iIntValue == -1) {
                Intent intent = new Intent("action_permissions_denied");
                intent.setPackage(getApplicationContext().getPackageName());
                sendBroadcast(intent);
                arrayList2.add(entry.getValue());
            } else if (iIntValue == 0) {
                Intent intent2 = new Intent("action_permissions_granted");
                intent2.setPackage(getApplicationContext().getPackageName());
                sendBroadcast(intent2);
                arrayList.add(entry.getValue());
            }
        }
        if (this.f107846a != null) {
            bt btVar2 = null;
            if (!arrayList.isEmpty()) {
                bt btVar3 = this.f107846a;
                if (btVar3 == null) {
                    zdlpuopuiu.pmvmpeiblj("metricFacade");
                    btVar3 = null;
                }
                btVar3.iobyxmoadg(new ow(xr.SC_GOOD_PERMISSIONS, we0.MERCHANT_VIEW, mp.SC, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("Granted", arrayList.toString())), null, null, null, 112));
            }
            if (!arrayList2.isEmpty()) {
                bt btVar4 = this.f107846a;
                if (btVar4 != null) {
                    btVar2 = btVar4;
                } else {
                    zdlpuopuiu.pmvmpeiblj("metricFacade");
                }
                btVar2.iobyxmoadg(new ow(xr.SC_FAIL_PERMISSIONS, we0.MERCHANT_VIEW, mp.SC, tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg("Denied", arrayList2.toString())), null, null, null, 112));
            }
        }
        finish();
    }
}

package kk;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public String f57197iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public String f57198zoijcleaow;

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    public final dh0 iobyxmoadg(Intent intent) {
        boolean z13;
        String queryParameter;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        dh0 dh0Var = new dh0(null, null, null, null, 63);
        if (intent.getData() == null) {
            return dh0Var;
        }
        Uri data = intent.getData();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data);
        String queryParameter2 = data.getQueryParameter("state");
        if (intent.getData() != null) {
            Uri data2 = intent.getData();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data2);
            if (data2.getQueryParameter("code") == null || !mj.kcexrzcfyt.cdpycssgdh(this.f57197iobyxmoadg, queryParameter2, false, 2, null)) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else {
            z13 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z13);
        dh0Var.f56292iobyxmoadg = boolValueOf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(boolValueOf);
        if (z13) {
            dh0Var.f56295zoijcleaow = queryParameter2;
            dh0Var.f56293ppxfxbqfkf = this.f57198zoijcleaow;
            Uri data3 = intent.getData();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data3);
            dh0Var.f56294wkgbmnqykc = data3.getQueryParameter("code");
        } else {
            Uri data4 = intent.getData();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data4);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(data4.getQueryParameter("error"), "null")) {
                queryParameter = mj.kcexrzcfyt.cdpycssgdh(this.f57197iobyxmoadg, data4.getQueryParameter("state"), false, 2, null) ? "invalid_state" : "internal_error";
            } else {
                queryParameter = data4.getQueryParameter("error");
            }
            dh0Var.f56290eablkybsjg = queryParameter;
            Uri data5 = intent.getData();
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(data5);
            dh0Var.f56291gxszxtbevo = data5.getQueryParameter("error_code");
        }
        this.f57197iobyxmoadg = null;
        this.f57198zoijcleaow = null;
        return dh0Var;
    }
}

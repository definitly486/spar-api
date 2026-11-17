package pe;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;

/* JADX INFO: loaded from: classes2.dex */
public final class oxmwwwfdhm extends ge.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ge.dxjokdxxww f76459iobyxmoadg;

    public oxmwwwfdhm(ge.dxjokdxxww dxjokdxxwwVar) {
        this.f76459iobyxmoadg = dxjokdxxwwVar;
    }

    @Override // ge.eablkybsjg
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        oe.wkgbmnqykc wkgbmnqykcVar = (oe.wkgbmnqykc) obj;
        zzuc zzucVarZzb = zzun.zzb(wkgbmnqykcVar.zoijcleaow());
        Context contextZoijcleaow = this.f76459iobyxmoadg.zoijcleaow();
        return new wkgbmnqykc(zzucVarZzb, (GoogleApiAvailabilityLight.getInstance().getApkVersion(contextZoijcleaow) >= 204700000 || wkgbmnqykcVar.wkgbmnqykc()) ? new gxszxtbevo(contextZoijcleaow, wkgbmnqykcVar, zzucVarZzb) : new lqeggnwhkg(contextZoijcleaow), wkgbmnqykcVar);
    }
}

package le;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww extends ge.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ge.dxjokdxxww f62161iobyxmoadg;

    public dxjokdxxww(ge.dxjokdxxww dxjokdxxwwVar) {
        this.f62161iobyxmoadg = dxjokdxxwwVar;
    }

    @Override // ge.eablkybsjg
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        ie.zoijcleaow zoijcleaowVar = (ie.zoijcleaow) obj;
        Context contextZoijcleaow = this.f62161iobyxmoadg.zoijcleaow();
        zzwp zzwpVarZzb = zzxa.zzb(zoijcleaow.wkgbmnqykc());
        return new draadjrbmk(this.f62161iobyxmoadg, zoijcleaowVar, (ojitshcjhn.zoijcleaow(contextZoijcleaow) || GoogleApiAvailabilityLight.getInstance().getApkVersion(contextZoijcleaow) >= 204500000) ? new ojitshcjhn(contextZoijcleaow, zoijcleaowVar, zzwpVarZzb) : new vdvldrhtss(contextZoijcleaow, zoijcleaowVar, zzwpVarZzb), zzwpVarZzb);
    }
}

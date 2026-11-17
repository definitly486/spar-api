package le;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ojitshcjhn implements wflxmlrfwp {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final zzcs f62177nufgyqmvbu = zzcs.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ie.zoijcleaow f62178eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final zzwp f62179gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f62180iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private zzyl f62181lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f62182ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Context f62183wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f62184zoijcleaow;

    ojitshcjhn(Context context, ie.zoijcleaow zoijcleaowVar, zzwp zzwpVar) {
        this.f62183wkgbmnqykc = context;
        this.f62178eablkybsjg = zoijcleaowVar;
        this.f62179gxszxtbevo = zzwpVar;
    }

    static boolean zoijcleaow(Context context) {
        return DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // le.wflxmlrfwp
    public final List iobyxmoadg(me.iobyxmoadg iobyxmoadgVar) throws MlKitException {
        if (this.f62181lqeggnwhkg == null) {
            zzc();
        }
        zzyl zzylVar = (zzyl) Preconditions.checkNotNull(this.f62181lqeggnwhkg);
        if (!this.f62180iobyxmoadg) {
            try {
                zzylVar.zze();
                this.f62180iobyxmoadg = true;
            } catch (RemoteException e13) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e13);
            }
        }
        int iBtonecajqb = iobyxmoadgVar.btonecajqb();
        if (iobyxmoadgVar.eablkybsjg() == 35) {
            iBtonecajqb = ((Image.Plane[]) Preconditions.checkNotNull(iobyxmoadgVar.nufgyqmvbu()))[0].getRowStride();
        }
        try {
            List listZzd = zzylVar.zzd(ne.wkgbmnqykc.zoijcleaow().iobyxmoadg(iobyxmoadgVar), new zzyu(iobyxmoadgVar.eablkybsjg(), iBtonecajqb, iobyxmoadgVar.gxszxtbevo(), ne.zoijcleaow.iobyxmoadg(iobyxmoadgVar.dxjokdxxww()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new je.iobyxmoadg(new agtfadlqog((zzyb) it.next()), iobyxmoadgVar.wkgbmnqykc()));
            }
            return arrayList;
        } catch (RemoteException e14) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e14);
        }
    }

    final zzyl ppxfxbqfkf(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        boolean z13;
        zzyo zzyoVarZza = zzyn.zza(DynamiteModule.load(this.f62183wkgbmnqykc, versionPolicy, str).instantiate(str2));
        ie.zoijcleaow zoijcleaowVar = this.f62178eablkybsjg;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.f62183wkgbmnqykc);
        int iIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        if (zoijcleaowVar.wkgbmnqykc()) {
            z13 = true;
        } else {
            this.f62178eablkybsjg.zoijcleaow();
            z13 = false;
        }
        return zzyoVarZza.zzd(iObjectWrapperWrap, new zzyd(iIobyxmoadg, z13));
    }

    @Override // le.wflxmlrfwp
    public final void zzb() {
        zzyl zzylVar = this.f62181lqeggnwhkg;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException e13) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e13);
            }
            this.f62181lqeggnwhkg = null;
            this.f62180iobyxmoadg = false;
        }
    }

    @Override // le.wflxmlrfwp
    public final boolean zzc() throws MlKitException {
        if (this.f62181lqeggnwhkg != null) {
            return this.f62184zoijcleaow;
        }
        if (zoijcleaow(this.f62183wkgbmnqykc)) {
            this.f62184zoijcleaow = true;
            try {
                this.f62181lqeggnwhkg = ppxfxbqfkf(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e13) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e13);
            } catch (DynamiteModule.LoadingException e14) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e14);
            }
        } else {
            this.f62184zoijcleaow = false;
            if (!ge.wflxmlrfwp.iobyxmoadg(this.f62183wkgbmnqykc, f62177nufgyqmvbu)) {
                if (!this.f62182ppxfxbqfkf) {
                    ge.wflxmlrfwp.wkgbmnqykc(this.f62183wkgbmnqykc, zzcs.zzh("barcode", "tflite_dynamite"));
                    this.f62182ppxfxbqfkf = true;
                }
                zoijcleaow.eablkybsjg(this.f62179gxszxtbevo, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f62181lqeggnwhkg = ppxfxbqfkf(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e15) {
                zoijcleaow.eablkybsjg(this.f62179gxszxtbevo, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e15);
            }
        }
        zoijcleaow.eablkybsjg(this.f62179gxszxtbevo, zzrb.NO_ERROR);
        return this.f62184zoijcleaow;
    }
}

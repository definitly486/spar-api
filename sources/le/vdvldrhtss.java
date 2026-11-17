package le;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class vdvldrhtss implements wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private zzaj f62186eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f62187iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zzah f62188ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zzwp f62189wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f62190zoijcleaow;

    vdvldrhtss(Context context, ie.zoijcleaow zoijcleaowVar, zzwp zzwpVar) {
        zzah zzahVar = new zzah();
        this.f62188ppxfxbqfkf = zzahVar;
        this.f62190zoijcleaow = context;
        zzahVar.zza = zoijcleaowVar.iobyxmoadg();
        this.f62189wkgbmnqykc = zzwpVar;
    }

    @Override // le.wflxmlrfwp
    public final List iobyxmoadg(me.iobyxmoadg iobyxmoadgVar) throws MlKitException {
        zzu[] zzuVarArrZzf;
        if (this.f62186eablkybsjg == null) {
            zzc();
        }
        zzaj zzajVar = this.f62186eablkybsjg;
        if (zzajVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) Preconditions.checkNotNull(zzajVar);
        zzan zzanVar = new zzan(iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo(), 0, 0L, ne.zoijcleaow.iobyxmoadg(iobyxmoadgVar.dxjokdxxww()));
        try {
            int iEablkybsjg = iobyxmoadgVar.eablkybsjg();
            if (iEablkybsjg == -1) {
                zzuVarArrZzf = zzajVar2.zzf(ObjectWrapper.wrap(iobyxmoadgVar.zoijcleaow()), zzanVar);
            } else if (iEablkybsjg == 17) {
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(iobyxmoadgVar.ppxfxbqfkf()), zzanVar);
            } else if (iEablkybsjg == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(iobyxmoadgVar.nufgyqmvbu());
                zzanVar.zza = planeArr[0].getRowStride();
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (iEablkybsjg != 842094169) {
                    throw new MlKitException("Unsupported image format: " + iobyxmoadgVar.eablkybsjg(), 3);
                }
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(ne.ppxfxbqfkf.eablkybsjg().ppxfxbqfkf(iobyxmoadgVar, false)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrZzf) {
                arrayList.add(new je.iobyxmoadg(new rgvfuqvkyq(zzuVar), iobyxmoadgVar.wkgbmnqykc()));
            }
            return arrayList;
        } catch (RemoteException e13) {
            throw new MlKitException("Failed to detect with legacy barcode detector", 13, e13);
        }
    }

    @Override // le.wflxmlrfwp
    public final void zzb() {
        zzaj zzajVar = this.f62186eablkybsjg;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e13) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e13);
            }
            this.f62186eablkybsjg = null;
        }
    }

    @Override // le.wflxmlrfwp
    public final boolean zzc() throws MlKitException {
        if (this.f62186eablkybsjg != null) {
            return false;
        }
        try {
            zzaj zzajVarZzd = zzal.zza(DynamiteModule.load(this.f62190zoijcleaow, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(this.f62190zoijcleaow), this.f62188ppxfxbqfkf);
            this.f62186eablkybsjg = zzajVarZzd;
            if (zzajVarZzd == null && !this.f62187iobyxmoadg) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                ge.wflxmlrfwp.ppxfxbqfkf(this.f62190zoijcleaow, "barcode");
                this.f62187iobyxmoadg = true;
                zoijcleaow.eablkybsjg(this.f62189wkgbmnqykc, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            zoijcleaow.eablkybsjg(this.f62189wkgbmnqykc, zzrb.NO_ERROR);
            return false;
        } catch (RemoteException e13) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e13);
        } catch (DynamiteModule.LoadingException e14) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e14);
        }
    }
}

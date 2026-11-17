package pe;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg implements ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f76455iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f76456ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private zzh f76457wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zzp f76458zoijcleaow = new zzp(null);

    lqeggnwhkg(Context context) {
        this.f76455iobyxmoadg = context;
    }

    @Override // pe.ojitshcjhn
    public final oe.iobyxmoadg iobyxmoadg(me.iobyxmoadg iobyxmoadgVar) throws MlKitException {
        Bitmap bitmapWkgbmnqykc;
        int iIobyxmoadg;
        if (this.f76457wkgbmnqykc == null) {
            zzb();
        }
        if (this.f76457wkgbmnqykc == null) {
            throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        if (iobyxmoadgVar.eablkybsjg() == -1) {
            bitmapWkgbmnqykc = iobyxmoadgVar.zoijcleaow();
            iIobyxmoadg = ne.zoijcleaow.iobyxmoadg(iobyxmoadgVar.dxjokdxxww());
        } else {
            bitmapWkgbmnqykc = ne.ppxfxbqfkf.eablkybsjg().wkgbmnqykc(iobyxmoadgVar);
            iIobyxmoadg = 0;
        }
        int i13 = iIobyxmoadg;
        try {
            return wflxmlrfwp.iobyxmoadg(((zzh) Preconditions.checkNotNull(this.f76457wkgbmnqykc)).zze(ObjectWrapper.wrap(bitmapWkgbmnqykc), new zzd(iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo(), 0, 0L, i13)), iobyxmoadgVar.wkgbmnqykc());
        } catch (RemoteException e13) {
            throw new MlKitException("Failed to run legacy text recognizer.", 13, e13);
        }
    }

    @Override // pe.ojitshcjhn
    public final void zzb() throws MlKitException {
        if (this.f76457wkgbmnqykc != null) {
            return;
        }
        try {
            zzh zzhVarZzd = zzj.zza(DynamiteModule.load(this.f76455iobyxmoadg, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(ObjectWrapper.wrap(this.f76455iobyxmoadg), this.f76458zoijcleaow);
            this.f76457wkgbmnqykc = zzhVarZzd;
            if (zzhVarZzd != null || this.f76456ppxfxbqfkf) {
                return;
            }
            Log.d("LegacyTextDelegate", "Request OCR optional module download.");
            ge.wflxmlrfwp.ppxfxbqfkf(this.f76455iobyxmoadg, "ocr");
            this.f76456ppxfxbqfkf = true;
        } catch (RemoteException e13) {
            throw new MlKitException("Failed to create legacy text recognizer.", 13, e13);
        } catch (DynamiteModule.LoadingException e14) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e14);
        }
    }

    @Override // pe.ojitshcjhn
    public final void zzc() {
        zzh zzhVar = this.f76457wkgbmnqykc;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException e13) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e13);
            }
            this.f76457wkgbmnqykc = null;
        }
    }
}

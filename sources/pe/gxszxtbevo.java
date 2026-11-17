package pe;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo implements ojitshcjhn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zzuc f76445eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private zzuv f76446gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f76447iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f76448ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f76449wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oe.wkgbmnqykc f76450zoijcleaow;

    gxszxtbevo(Context context, oe.wkgbmnqykc wkgbmnqykcVar, zzuc zzucVar) {
        this.f76447iobyxmoadg = context;
        this.f76450zoijcleaow = wkgbmnqykcVar;
        this.f76445eablkybsjg = zzucVar;
    }

    private static zzvh zoijcleaow(oe.wkgbmnqykc wkgbmnqykcVar, String str) {
        int i13;
        String strPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        String strDxjokdxxww = wkgbmnqykcVar.dxjokdxxww();
        switch (wkgbmnqykcVar.nufgyqmvbu()) {
            case 1:
                i13 = 2;
                break;
            case 2:
                i13 = 3;
                break;
            case 3:
                i13 = 4;
                break;
            case 4:
                i13 = 5;
                break;
            case 5:
                i13 = 6;
                break;
            case 6:
                i13 = 7;
                break;
            case 7:
                i13 = 8;
                break;
            case 8:
                i13 = 9;
                break;
            default:
                i13 = 1;
                break;
        }
        return new zzvh(strPpxfxbqfkf, strDxjokdxxww, str, true, i13 - 1, wkgbmnqykcVar.lqeggnwhkg(), false);
    }

    @Override // pe.ojitshcjhn
    public final oe.iobyxmoadg iobyxmoadg(me.iobyxmoadg iobyxmoadgVar) throws MlKitException {
        if (this.f76446gxszxtbevo == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) Preconditions.checkNotNull(this.f76446gxszxtbevo);
        if (!this.f76448ppxfxbqfkf) {
            try {
                zzuvVar.zze();
                this.f76448ppxfxbqfkf = true;
            } catch (RemoteException e13) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.f76450zoijcleaow.zoijcleaow())), 13, e13);
            }
        }
        try {
            return new oe.iobyxmoadg(zzuvVar.zzd(ne.wkgbmnqykc.zoijcleaow().iobyxmoadg(iobyxmoadgVar), new zzuq(iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.btonecajqb(), iobyxmoadgVar.gxszxtbevo(), ne.zoijcleaow.iobyxmoadg(iobyxmoadgVar.dxjokdxxww()), SystemClock.elapsedRealtime())), iobyxmoadgVar.wkgbmnqykc());
        } catch (RemoteException e14) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.f76450zoijcleaow.zoijcleaow())), 13, e14);
        }
    }

    @Override // pe.ojitshcjhn
    public final void zzb() throws MlKitException {
        zzuv zzuvVarZzd;
        if (this.f76446gxszxtbevo != null) {
            return;
        }
        try {
            if (this.f76450zoijcleaow.wkgbmnqykc()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                zzuvVarZzd = zzux.zza(DynamiteModule.load(this.f76447iobyxmoadg, DynamiteModule.PREFER_LOCAL, this.f76450zoijcleaow.gxszxtbevo()).instantiate("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(ObjectWrapper.wrap(this.f76447iobyxmoadg), zoijcleaow(this.f76450zoijcleaow, null));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                zzuy zzuyVarZza = zzux.zza(DynamiteModule.load(this.f76447iobyxmoadg, DynamiteModule.PREFER_REMOTE, this.f76450zoijcleaow.gxszxtbevo()).instantiate("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                zzuvVarZzd = this.f76450zoijcleaow.nufgyqmvbu() == 1 ? zzuyVarZza.zzd(ObjectWrapper.wrap(this.f76447iobyxmoadg)) : zzuyVarZza.zze(ObjectWrapper.wrap(this.f76447iobyxmoadg), zoijcleaow(this.f76450zoijcleaow, null));
            }
            this.f76446gxszxtbevo = zzuvVarZzd;
            iobyxmoadg.zoijcleaow(this.f76445eablkybsjg, this.f76450zoijcleaow.wkgbmnqykc(), zzou.NO_ERROR);
        } catch (RemoteException e13) {
            iobyxmoadg.zoijcleaow(this.f76445eablkybsjg, this.f76450zoijcleaow.wkgbmnqykc(), zzou.OPTIONAL_MODULE_INIT_ERROR);
            throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.f76450zoijcleaow.zoijcleaow())), 13, e13);
        } catch (DynamiteModule.LoadingException e14) {
            iobyxmoadg.zoijcleaow(this.f76445eablkybsjg, this.f76450zoijcleaow.wkgbmnqykc(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE);
            if (this.f76450zoijcleaow.wkgbmnqykc()) {
                throw new MlKitException(String.format("Failed to load text module %s. %s", this.f76450zoijcleaow.zoijcleaow(), e14.getMessage()), 13, e14);
            }
            if (!this.f76449wkgbmnqykc) {
                ge.wflxmlrfwp.eablkybsjg(this.f76447iobyxmoadg, zoijcleaow.iobyxmoadg(this.f76450zoijcleaow));
                this.f76449wkgbmnqykc = true;
            }
            throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // pe.ojitshcjhn
    public final void zzc() {
        zzuv zzuvVar = this.f76446gxszxtbevo;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException e13) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.f76450zoijcleaow.zoijcleaow())), e13);
            }
            this.f76446gxszxtbevo = null;
        }
        this.f76448ppxfxbqfkf = false;
    }
}

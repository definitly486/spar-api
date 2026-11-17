package pe;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq extends ne.eablkybsjg implements oe.ppxfxbqfkf {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final oe.wkgbmnqykc f76460pmvmpeiblj;

    rgvfuqvkyq(wkgbmnqykc wkgbmnqykcVar, Executor executor, zzuc zzucVar, oe.wkgbmnqykc wkgbmnqykcVar2) {
        super(wkgbmnqykcVar, executor);
        this.f76460pmvmpeiblj = wkgbmnqykcVar2;
        zzow zzowVar = new zzow();
        zzowVar.zze(wkgbmnqykcVar2.wkgbmnqykc() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzrx zzrxVar = new zzrx();
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(iobyxmoadg.iobyxmoadg(wkgbmnqykcVar2.nufgyqmvbu()));
        zzrxVar.zze(zzsaVar.zzc());
        zzowVar.zzh(zzrxVar.zzf());
        zzucVar.zzd(zzuf.zzg(zzowVar, 1), zzov.ON_DEVICE_TEXT_CREATE);
    }

    @Override // oe.ppxfxbqfkf
    public final Task eablkybsjg(me.iobyxmoadg iobyxmoadgVar) {
        return super.iobyxmoadg(iobyxmoadgVar);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return zoijcleaow.iobyxmoadg(this.f76460pmvmpeiblj);
    }
}

package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import fe.zoijcleaow;
import ge.agtfadlqog;
import ge.draadjrbmk;
import ge.lqeggnwhkg;
import ge.ppxfxbqfkf;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import q1.eablkybsjg;
import q1.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsh {
    private static zzaf zza;
    private static final zzai zzb = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrz zze;
    private final agtfadlqog zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;

    public zzsh(Context context, final agtfadlqog agtfadlqogVar, zzrz zzrzVar, String str) {
        new HashMap();
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = ppxfxbqfkf.iobyxmoadg(context);
        this.zzf = agtfadlqogVar;
        this.zze = zzrzVar;
        zzsv.zza();
        this.zzi = str;
        this.zzg = lqeggnwhkg.iobyxmoadg().zoijcleaow(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = lqeggnwhkg.iobyxmoadg();
        Objects.requireNonNull(agtfadlqogVar);
        this.zzh = lqeggnwhkgVarIobyxmoadg.zoijcleaow(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agtfadlqogVar.iobyxmoadg();
            }
        });
        zzai zzaiVar = zzb;
        this.zzj = zzaiVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzaiVar.get(str)) : -1;
    }

    private static synchronized zzaf zzh() {
        try {
            zzaf zzafVar = zza;
            if (zzafVar != null) {
                return zzafVar;
            }
            nufgyqmvbu nufgyqmvbuVarIobyxmoadg = eablkybsjg.iobyxmoadg(Resources.getSystem().getConfiguration());
            zzac zzacVar = new zzac();
            for (int i13 = 0; i13 < nufgyqmvbuVarIobyxmoadg.gxszxtbevo(); i13++) {
                zzacVar.zzb(ppxfxbqfkf.zoijcleaow(nufgyqmvbuVarIobyxmoadg.ppxfxbqfkf(i13)));
            }
            zzaf zzafVarZzc = zzacVar.zzc();
            zza = zzafVarZzc;
            return zzafVarZzc;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final zzqt zzi(String str, String str2) {
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(this.zzc);
        zzqtVar.zzc(this.zzd);
        zzqtVar.zzh(zzh());
        zzqtVar.zzg(Boolean.TRUE);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        zzqtVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.iobyxmoadg());
        zzqtVar.zzd(10);
        zzqtVar.zzk(Integer.valueOf(this.zzj));
        return zzqtVar;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzb(zzry zzryVar, zzmv zzmvVar, String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(zzi(zzryVar.zzd(), str));
        this.zze.zza(zzryVar);
    }

    final /* synthetic */ void zzc(zzry zzryVar, zzsj zzsjVar, zoijcleaow zoijcleaowVar) {
        zzryVar.zza(zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(zzi(zzsjVar.zze(), zzj()));
        zzryVar.zzb(zzst.zza(zoijcleaowVar, this.zzf, zzsjVar));
        this.zze.zza(zzryVar);
    }

    public final void zzd(final zzry zzryVar, final zzmv zzmvVar) {
        final String strZzj = zzj();
        lqeggnwhkg.wkgbmnqykc().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzryVar, zzmvVar, strZzj);
            }
        });
    }

    public final void zze(zzry zzryVar, zoijcleaow zoijcleaowVar, boolean z13, int i13) {
        zzsj.zzh().zzf(false);
        throw null;
    }

    public final void zzf(zzry zzryVar, zoijcleaow zoijcleaowVar, zzmu zzmuVar, boolean z13, draadjrbmk draadjrbmkVar, zzna zznaVar) {
        zzsi zzsiVarZzh = zzsj.zzh();
        zzsiVarZzh.zzf(z13);
        zzsiVarZzh.zzd(draadjrbmkVar);
        zzsiVarZzh.zzb(zzmuVar);
        zzsiVarZzh.zza(zznaVar);
        zzg(zzryVar, zoijcleaowVar, zzsiVarZzh.zzh());
    }

    public final void zzg(final zzry zzryVar, final zoijcleaow zoijcleaowVar, final zzsj zzsjVar) {
        lqeggnwhkg.wkgbmnqykc().execute(new Runnable(zzryVar, zzsjVar, zoijcleaowVar) { // from class: com.google.android.gms.internal.mlkit_common.zzsg
            public final /* synthetic */ zzry zzb;
            public final /* synthetic */ zzsj zzc;
            public final /* synthetic */ zoijcleaow zzd;

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(this.zzb, this.zzc, null);
            }
        });
    }
}

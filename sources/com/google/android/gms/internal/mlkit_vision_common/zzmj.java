package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import ge.agtfadlqog;
import ge.lqeggnwhkg;
import ge.ppxfxbqfkf;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import q1.eablkybsjg;
import q1.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmj {
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzmc zze;
    private final agtfadlqog zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzmj(Context context, final agtfadlqog agtfadlqogVar, zzmc zzmcVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = ppxfxbqfkf.iobyxmoadg(context);
        this.zzf = agtfadlqogVar;
        this.zze = zzmcVar;
        zzmw.zza();
        this.zzi = str;
        this.zzg = lqeggnwhkg.iobyxmoadg().zoijcleaow(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = lqeggnwhkg.iobyxmoadg();
        agtfadlqogVar.getClass();
        this.zzh = lqeggnwhkgVarIobyxmoadg.zoijcleaow(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agtfadlqogVar.iobyxmoadg();
            }
        });
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzrVar.get(str)) : -1;
    }

    private static synchronized zzp zzd() {
        try {
            zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            nufgyqmvbu nufgyqmvbuVarIobyxmoadg = eablkybsjg.iobyxmoadg(Resources.getSystem().getConfiguration());
            zzm zzmVar = new zzm();
            for (int i13 = 0; i13 < nufgyqmvbuVarIobyxmoadg.gxszxtbevo(); i13++) {
                zzmVar.zzb(ppxfxbqfkf.zoijcleaow(nufgyqmvbuVarIobyxmoadg.ppxfxbqfkf(i13)));
            }
            zzp zzpVarZzc = zzmVar.zzc();
            zza = zzpVarZzc;
            return zzpVarZzc;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzb(zzmb zzmbVar, zziv zzivVar, String str) {
        zzmbVar.zza(zzivVar);
        String strZzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.zzc);
        zzkyVar.zzc(this.zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(strZzc);
        zzkyVar.zzj(str);
        zzkyVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.iobyxmoadg());
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.zzj));
        zzmbVar.zzb(zzkyVar);
        this.zze.zza(zzmbVar);
    }

    public final void zzc(zzmt zzmtVar, final zziv zzivVar) {
        zzii zziiVar;
        zzio zzioVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzivVar) != null && jElapsedRealtime - ((Long) this.zzk.get(zzivVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzivVar, Long.valueOf(jElapsedRealtime));
        int i13 = zzmtVar.zza;
        int i14 = zzmtVar.zzb;
        int i15 = zzmtVar.zzc;
        int i16 = zzmtVar.zzd;
        int i17 = zzmtVar.zze;
        long j13 = zzmtVar.zzf;
        int i18 = zzmtVar.zzg;
        zzin zzinVar = new zzin();
        if (i13 == -1) {
            zziiVar = zzii.BITMAP;
        } else if (i13 == 35) {
            zziiVar = zzii.YUV_420_888;
        } else if (i13 == 842094169) {
            zziiVar = zzii.YV12;
        } else if (i13 != 16) {
            zziiVar = i13 != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21;
        } else {
            zziiVar = zzii.NV16;
        }
        zzinVar.zzd(zziiVar);
        if (i14 == 1) {
            zzioVar = zzio.BITMAP;
        } else if (i14 == 2) {
            zzioVar = zzio.BYTEARRAY;
        } else if (i14 != 3) {
            zzioVar = i14 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH;
        } else {
            zzioVar = zzio.BYTEBUFFER;
        }
        zzinVar.zzf(zzioVar);
        zzinVar.zzc(Integer.valueOf(i15));
        zzinVar.zze(Integer.valueOf(i16));
        zzinVar.zzg(Integer.valueOf(i17));
        zzinVar.zzb(Long.valueOf(j13));
        zzinVar.zzh(Integer.valueOf(i18));
        zziq zziqVarZzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zziqVarZzj);
        final zzmb zzmbVarZze = zzmk.zze(zziwVar);
        final String version = this.zzg.isSuccessful() ? (String) this.zzg.getResult() : LibraryVersion.getInstance().getVersion(this.zzi);
        lqeggnwhkg.wkgbmnqykc().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzmbVarZze, zzivVar, version);
            }
        });
    }
}

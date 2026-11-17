package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import ge.agtfadlqog;
import ge.lqeggnwhkg;
import ge.ppxfxbqfkf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import pe.zdlpuopuiu;
import q1.eablkybsjg;
import q1.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuc {
    private static zzbk zza;
    private static final zzbm zzb = zzbm.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzts zze;
    private final agtfadlqog zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzuc(Context context, final agtfadlqog agtfadlqogVar, zzts zztsVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = ppxfxbqfkf.iobyxmoadg(context);
        this.zzf = agtfadlqogVar;
        this.zze = zztsVar;
        zzuo.zza();
        this.zzi = str;
        this.zzg = lqeggnwhkg.iobyxmoadg().zoijcleaow(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzty
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = lqeggnwhkg.iobyxmoadg();
        Objects.requireNonNull(agtfadlqogVar);
        this.zzh = lqeggnwhkgVarIobyxmoadg.zoijcleaow(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return agtfadlqogVar.iobyxmoadg();
            }
        });
        zzbm zzbmVar = zzb;
        this.zzj = zzbmVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzbmVar.get(str)) : -1;
    }

    static long zza(List list, double d13) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d13 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized zzbk zzi() {
        try {
            zzbk zzbkVar = zza;
            if (zzbkVar != null) {
                return zzbkVar;
            }
            nufgyqmvbu nufgyqmvbuVarIobyxmoadg = eablkybsjg.iobyxmoadg(Resources.getSystem().getConfiguration());
            zzbh zzbhVar = new zzbh();
            for (int i13 = 0; i13 < nufgyqmvbuVarIobyxmoadg.gxszxtbevo(); i13++) {
                zzbhVar.zza(ppxfxbqfkf.zoijcleaow(nufgyqmvbuVarIobyxmoadg.ppxfxbqfkf(i13)));
            }
            zzbk zzbkVarZzb = zzbhVar.zzb();
            zza = zzbkVarZzb;
            return zzbkVarZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzov zzovVar, long j13, long j14) {
        return this.zzk.get(zzovVar) == null || j13 - ((Long) this.zzk.get(zzovVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzc(zztr zztrVar, zzov zzovVar, String str) {
        zztrVar.zzb(zzovVar);
        String strZzd = zztrVar.zzd();
        zzsr zzsrVar = new zzsr();
        zzsrVar.zzb(this.zzc);
        zzsrVar.zzc(this.zzd);
        zzsrVar.zzh(zzi());
        zzsrVar.zzg(Boolean.TRUE);
        zzsrVar.zzl(strZzd);
        zzsrVar.zzj(str);
        zzsrVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.iobyxmoadg());
        zzsrVar.zzd(10);
        zzsrVar.zzk(Integer.valueOf(this.zzj));
        zztrVar.zzc(zzsrVar);
        this.zze.zza(zztrVar);
    }

    public final void zzd(zztr zztrVar, zzov zzovVar) {
        zze(zztrVar, zzovVar, zzj());
    }

    public final void zze(final zztr zztrVar, final zzov zzovVar, final String str) {
        lqeggnwhkg.wkgbmnqykc().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zztrVar, zzovVar, str);
            }
        });
    }

    public final void zzf(zzub zzubVar, zzov zzovVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzovVar, Long.valueOf(jElapsedRealtime));
            zze(zzubVar.zza(), zzovVar, zzj());
        }
    }

    final /* synthetic */ void zzg(zzov zzovVar, zdlpuopuiu zdlpuopuiuVar) {
        zzbp zzbpVar = (zzbp) this.zzl.get(zzovVar);
        if (zzbpVar != null) {
            for (Object obj : zzbpVar.zzo()) {
                ArrayList arrayList = new ArrayList(zzbpVar.zzc(obj));
                Collections.sort(arrayList);
                zznu zznuVar = new zznu();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                zznuVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zznuVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zznuVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zznuVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zznuVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zznuVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(zdlpuopuiuVar.iobyxmoadg(obj, arrayList.size(), zznuVar.zzg()), zzovVar, zzj());
            }
            this.zzl.remove(zzovVar);
        }
    }

    final /* synthetic */ void zzh(final zzov zzovVar, Object obj, long j13, final zdlpuopuiu zdlpuopuiuVar) {
        if (!this.zzl.containsKey(zzovVar)) {
            this.zzl.put(zzovVar, zzao.zzp());
        }
        ((zzbp) this.zzl.get(zzovVar)).zzm(obj, Long.valueOf(j13));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzovVar, Long.valueOf(jElapsedRealtime));
            lqeggnwhkg.wkgbmnqykc().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(zzovVar, zdlpuopuiuVar);
                }
            });
        }
    }
}

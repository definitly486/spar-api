package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import com.google.android.gms.common.internal.GmsLogger;
import ge.agtfadlqog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import le.eablkybsjg;
import le.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxk {
    private static final GmsLogger zzf = new GmsLogger("AutoZoom");
    final zzxm zza;
    final zzbw zzb;
    ScheduledFuture zzc;
    String zzd;
    int zze;
    private final AtomicBoolean zzg;
    private final Object zzh;
    private final ScheduledExecutorService zzi;
    private final zzbb zzj;
    private final zzwp zzk;
    private final String zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private eablkybsjg zzs;

    private zzxk(Context context, zzxm zzxmVar, String str) {
        zzg.zza();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbb zzbbVarZza = zzar.zza();
        zzwp zzwpVar = new zzwp(context, new agtfadlqog(context), new zzwi(context, zzwh.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzxmVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = zzbw.zzz();
        this.zzi = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.zzj = zzbbVarZza;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zzbbVarZza.zza();
    }

    public static zzxk zzd(Context context, String str) {
        return new zzxk(context, zzxm.zza, str);
    }

    public static /* synthetic */ void zzf(zzxk zzxkVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzxkVar.zzh) {
            try {
                if (zzxkVar.zze == 2 && !zzxkVar.zzg.get() && (scheduledFuture = zzxkVar.zzc) != null && !scheduledFuture.isCancelled()) {
                    if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzi()) {
                        zzf.i("AutoZoom", "Reset zoom = 1");
                        zzxkVar.zzl(1.0f, zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzg(zzxk zzxkVar, float f13) {
        synchronized (zzxkVar.zzh) {
            zzxkVar.zzn = f13;
            zzxkVar.zzr(false);
        }
    }

    private final float zzp(float f13) {
        float f14 = this.zzo;
        if (f13 < 1.0f) {
            f13 = 1.0f;
        }
        return (f14 <= 0.0f || f13 <= f14) ? f13 : f14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzrc zzrcVar, float f13, float f14, zzxn zzxnVar) {
        long jConvert;
        if (this.zzd != null) {
            zzuo zzuoVar = new zzuo();
            zzuoVar.zza(this.zzl);
            String str = this.zzd;
            str.getClass();
            zzuoVar.zze(str);
            zzuoVar.zzf(Float.valueOf(f13));
            zzuoVar.zzc(Float.valueOf(f14));
            synchronized (this.zzh) {
                jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzuoVar.zzb(Long.valueOf(jConvert));
            if (zzxnVar != null) {
                zzup zzupVar = new zzup();
                zzupVar.zzc(Float.valueOf(zzxnVar.zzc()));
                zzupVar.zze(Float.valueOf(zzxnVar.zze()));
                zzupVar.zzb(Float.valueOf(zzxnVar.zzb()));
                zzupVar.zzd(Float.valueOf(zzxnVar.zzd()));
                zzupVar.zza(Float.valueOf(0.0f));
                zzuoVar.zzd(zzupVar.zzf());
            }
            zzwp zzwpVar = this.zzk;
            zzrd zzrdVar = new zzrd();
            zzrdVar.zzi(zzuoVar.zzh());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrcVar);
        }
    }

    private final void zzr(boolean z13) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            try {
                this.zzb.zzs();
                this.zzp = this.zzj.zza();
                if (z13 && (scheduledFuture = this.zzc) != null) {
                    scheduledFuture.cancel(false);
                    this.zzc = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long zza() {
        long jConvert;
        synchronized (this.zzh) {
            jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return jConvert;
    }

    final /* synthetic */ zzet zzc(float f13) throws Exception {
        eablkybsjg eablkybsjgVar = this.zzs;
        zzp(f13);
        eablkybsjgVar.getClass();
        int i13 = nufgyqmvbu.f62171lmojexxdyd;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0249 A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:51:0x018a, B:53:0x0198, B:57:0x019e, B:58:0x01ca, B:60:0x01d0, B:63:0x01f9, B:65:0x0208, B:67:0x0217, B:69:0x0222, B:70:0x0247, B:72:0x0249, B:73:0x0266), top: B:82:0x018a, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0249, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(int i13, zzxn zzxnVar) {
        float fZzf;
        synchronized (this.zzh) {
            try {
                if (this.zze != 2) {
                    return;
                }
                if (zzxnVar.zzh() && (!this.zza.zzl() || this.zza.zzb() <= 0.0f)) {
                    if (!this.zzr) {
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f13 = this.zzn;
                        zzq(zzrcVar, f13, f13, zzxnVar);
                        this.zzr = true;
                    }
                    GmsLogger gmsLogger = zzf;
                    Locale locale = Locale.getDefault();
                    Float fValueOf = Float.valueOf(zzxnVar.zzc());
                    Float fValueOf2 = Float.valueOf(zzxnVar.zze());
                    Float fValueOf3 = Float.valueOf(zzxnVar.zzb());
                    Float fValueOf4 = Float.valueOf(zzxnVar.zzd());
                    Float fValueOf5 = Float.valueOf(0.0f);
                    Integer numValueOf = Integer.valueOf(i13);
                    gmsLogger.i("AutoZoom", String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, numValueOf));
                    this.zzb.zzt(numValueOf, zzxnVar);
                    Set setZzw = this.zzb.zzw();
                    if (setZzw.size() - 1 > this.zza.zzh()) {
                        Iterator it = setZzw.iterator();
                        int i14 = i13;
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            if (i14 > iIntValue) {
                                i14 = iIntValue;
                            }
                        }
                        zzf.i("AutoZoom", "Removing recent frameIndex = " + i14);
                        this.zzb.zzf(Integer.valueOf(i14));
                    }
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : this.zzb.zzu()) {
                        if (((Integer) entry.getKey()).intValue() != i13) {
                            zzxn zzxnVar2 = (zzxn) entry.getValue();
                            if (zzxnVar2.zzh() && zzxnVar.zzh()) {
                                zzxg zzxgVar = new zzxg(Math.max(zzxnVar2.zzc(), zzxnVar.zzc()), Math.max(zzxnVar2.zze(), zzxnVar.zze()), Math.min(zzxnVar2.zzb(), zzxnVar.zzb()), Math.min(zzxnVar2.zzd(), zzxnVar.zzd()), 0.0f);
                                fZzf = zzxgVar.zzf() / ((zzxnVar2.zzf() + zzxnVar.zzf()) - zzxgVar.zzf());
                            } else {
                                fZzf = 0.0f;
                            }
                            if (fZzf >= this.zza.zzd()) {
                                hashSet.add((Integer) entry.getKey());
                            }
                        }
                    }
                    if (hashSet.size() >= this.zza.zzg() || (this.zza.zzl() && this.zza.zza() <= 0.0f)) {
                        synchronized (this.zzh) {
                            try {
                                if (zza() >= this.zza.zzj()) {
                                    zzdv zzdvVarListIterator = zzcs.zzi(Float.valueOf(zzxnVar.zzc()), Float.valueOf(zzxnVar.zze()), Float.valueOf(zzxnVar.zzb()), Float.valueOf(zzxnVar.zzd())).listIterator(0);
                                    float f14 = 1.0E9f;
                                    while (zzdvVarListIterator.hasNext()) {
                                        float fZzc = (this.zza.zzc() / 2.0f) / Math.max(Math.abs(((Float) zzdvVarListIterator.next()).floatValue() - 0.5f), 0.001f);
                                        if (f14 > fZzc) {
                                            f14 = fZzc;
                                        }
                                    }
                                    float fZzp = zzp(this.zzn * f14);
                                    if (this.zza.zzk()) {
                                        float f15 = this.zzn;
                                        float f16 = (fZzp - f15) / f15;
                                        if (f16 > this.zza.zze() || f16 < (-this.zza.zzf())) {
                                            zzf.i("AutoZoom", "Going to set zoom = " + fZzp);
                                            zzl(fZzp, zzrc.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzxnVar);
                                        } else {
                                            zzf.i("AutoZoom", "Auto zoom to " + fZzp + " is filtered by threshold");
                                            this.zzp = this.zzj.zza();
                                        }
                                    } else {
                                        zzf.i("AutoZoom", "Going to set zoom = " + fZzp);
                                        zzl(fZzp, zzrc.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzxnVar);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzh) {
            try {
                if (this.zze == 4) {
                    return;
                }
                zzn(false);
                this.zzi.shutdown();
                this.zze = 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzk(float f13) {
        synchronized (this.zzh) {
            zzaz.zzd(f13 >= 1.0f);
            this.zzo = f13;
        }
    }

    final void zzl(float f13, zzrc zzrcVar, zzxn zzxnVar) {
        synchronized (this.zzh) {
        }
    }

    public final void zzm() {
        synchronized (this.zzh) {
            try {
                int i13 = this.zze;
                if (i13 != 2 && i13 != 4) {
                    zzr(true);
                    this.zzc = this.zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzxi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzxk.zzf(this.zza);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.zze == 1) {
                        this.zzd = UUID.randomUUID().toString();
                        this.zzq = this.zzj.zza();
                        this.zzr = false;
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_START;
                        float f13 = this.zzn;
                        zzq(zzrcVar, f13, f13, null);
                    } else {
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_RESUME;
                        float f14 = this.zzn;
                        zzq(zzrcVar2, f14, f14, null);
                    }
                    this.zze = 2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzn(boolean z13) {
        synchronized (this.zzh) {
            try {
                int i13 = this.zze;
                if (i13 != 1 && i13 != 4) {
                    zzr(true);
                    if (z13) {
                        if (!this.zzr) {
                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f13 = this.zzn;
                            zzq(zzrcVar, f13, f13, null);
                        }
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f14 = this.zzn;
                        zzq(zzrcVar2, f14, f14, null);
                    } else {
                        zzrc zzrcVar3 = zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f15 = this.zzn;
                        zzq(zzrcVar3, f15, f15, null);
                    }
                    this.zzr = false;
                    this.zze = 1;
                    this.zzd = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzo(eablkybsjg eablkybsjgVar, Executor executor) {
        this.zzm = executor;
    }
}

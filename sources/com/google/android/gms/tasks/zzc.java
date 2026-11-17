package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.isCanceled()) {
            this.zzb.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(this.zzb.zzb.then(this.zza));
        } catch (RuntimeExecutionException e13) {
            if (e13.getCause() instanceof Exception) {
                this.zzb.zzc.zza((Exception) e13.getCause());
            } else {
                this.zzb.zzc.zza(e13);
            }
        } catch (Exception e14) {
            this.zzb.zzc.zza(e14);
        }
    }
}

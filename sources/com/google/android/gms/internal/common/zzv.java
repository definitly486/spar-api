package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzv implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzx zzb;

    zzv(zzx zzxVar, CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb3.append(zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb3.append((CharSequence) ", ");
                    sb3.append(zzq.zza(it.next(), ", "));
                }
            }
            sb3.append(']');
            return sb3.toString();
        } catch (IOException e13) {
            throw new AssertionError(e13);
        }
    }
}

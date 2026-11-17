package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzeq {
    private static final zzeq zzb = new zzeq(true);
    final zzgv zza = new zzgl(16);
    private boolean zzc;
    private boolean zzd;

    private zzeq() {
    }

    public static zzeq zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzd(zzep zzepVar, Object obj) {
        boolean z13;
        zzepVar.zzb();
        byte[] bArr = zzfa.zzd;
        obj.getClass();
        zzho zzhoVar = zzho.zza;
        zzhp zzhpVar = zzhp.INT;
        switch (r0.zza()) {
            case INT:
                z13 = obj instanceof Integer;
                if (z13) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z13 = obj instanceof Long;
                if (z13) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z13 = obj instanceof Float;
                if (z13) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z13 = obj instanceof Double;
                if (z13) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z13 = obj instanceof Boolean;
                if (z13) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z13 = obj instanceof String;
                if (z13) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzef) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzex)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzfx) || (obj instanceof zzfc)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzeq zzeqVar = new zzeq();
        for (int i13 = 0; i13 < this.zza.zzb(); i13++) {
            Map.Entry entryZzg = this.zza.zzg(i13);
            zzeqVar.zzc((zzep) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzeqVar.zzc((zzep) entry.getKey(), entry.getValue());
        }
        zzeqVar.zzd = this.zzd;
        return zzeqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeq) {
            return this.zza.equals(((zzeq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i13 = 0; i13 < this.zza.zzb(); i13++) {
            Map.Entry entryZzg = this.zza.zzg(i13);
            if (entryZzg.getValue() instanceof zzev) {
                ((zzev) entryZzg.getValue()).zzi();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzep zzepVar, Object obj) {
        if (!zzepVar.zzc()) {
            zzd(zzepVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                zzd(zzepVar, arrayList.get(i13));
            }
            obj = arrayList;
        }
        if (obj instanceof zzfc) {
            this.zzd = true;
        }
        this.zza.put(zzepVar, obj);
    }

    private zzeq(boolean z13) {
        zzb();
        zzb();
    }
}

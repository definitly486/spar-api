package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import mc.ppxfxbqfkf;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfj {
    private final Map zza;
    private final Map zzb;
    private final ppxfxbqfkf zzc;

    zzfj(Map map, Map map2, ppxfxbqfkf ppxfxbqfkfVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = ppxfxbqfkfVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzfg(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}

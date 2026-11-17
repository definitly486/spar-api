package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import mc.eablkybsjg;
import mc.ppxfxbqfkf;
import nc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdb implements zoijcleaow {
    public static final /* synthetic */ int zza = 0;
    private static final ppxfxbqfkf zzb = new ppxfxbqfkf() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzda
        @Override // mc.ppxfxbqfkf
        public final void encode(Object obj, Object obj2) {
            int i13 = zzdb.zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final ppxfxbqfkf zze = zzb;

    @Override // nc.zoijcleaow
    public final /* bridge */ /* synthetic */ zoijcleaow registerEncoder(Class cls, ppxfxbqfkf ppxfxbqfkfVar) {
        this.zzc.put(cls, ppxfxbqfkfVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzdc zza() {
        return new zzdc(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    public final /* bridge */ /* synthetic */ zoijcleaow registerEncoder(Class cls, eablkybsjg eablkybsjgVar) {
        this.zzd.put(cls, eablkybsjgVar);
        this.zzc.remove(cls);
        return this;
    }
}

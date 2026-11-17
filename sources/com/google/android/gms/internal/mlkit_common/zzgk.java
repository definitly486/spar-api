package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzgk implements ppxfxbqfkf {
    static final zzgk zza = new zzgk();
    private static final zoijcleaow zzb;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("api");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzayVar.zzb()).iobyxmoadg();
    }

    private zzgk() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((wkgbmnqykc) obj2).add(zzb, ((zzmp) obj).zza());
    }
}

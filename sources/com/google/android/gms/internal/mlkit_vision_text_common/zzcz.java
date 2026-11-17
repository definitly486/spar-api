package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import mc.eablkybsjg;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzcz implements wkgbmnqykc {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final ppxfxbqfkf zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ppxfxbqfkf zzh;
    private final zzdd zzi = new zzdd(this);

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("key");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzctVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("value");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzctVar2.zzb()).iobyxmoadg();
        zzd = new ppxfxbqfkf() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzcy
            @Override // mc.ppxfxbqfkf
            public final void encode(Object obj, Object obj2) throws IOException {
                zzcz.zzg((Map.Entry) obj, (wkgbmnqykc) obj2);
            }
        };
    }

    zzcz(OutputStream outputStream, Map map, Map map2, ppxfxbqfkf ppxfxbqfkfVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = ppxfxbqfkfVar;
    }

    static /* synthetic */ void zzg(Map.Entry entry, wkgbmnqykc wkgbmnqykcVar) throws IOException {
        wkgbmnqykcVar.add(zzb, entry.getKey());
        wkgbmnqykcVar.add(zzc, entry.getValue());
    }

    private static int zzh(zoijcleaow zoijcleaowVar) {
        zzcx zzcxVar = (zzcx) zoijcleaowVar.ppxfxbqfkf(zzcx.class);
        if (zzcxVar != null) {
            return zzcxVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IOException {
        zzcu zzcuVar = new zzcu();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzcuVar;
            try {
                ppxfxbqfkfVar.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzcuVar.zza();
                zzcuVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzcuVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static zzcx zzj(zoijcleaow zoijcleaowVar) {
        zzcx zzcxVar = (zzcx) zoijcleaowVar.ppxfxbqfkf(zzcx.class);
        if (zzcxVar != null) {
            return zzcxVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzcz zzk(ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar, Object obj, boolean z13) throws IOException {
        long jZzi = zzi(ppxfxbqfkfVar, obj);
        if (z13 && jZzi == 0) {
            return this;
        }
        zzn((zzh(zoijcleaowVar) << 3) | 2);
        zzo(jZzi);
        ppxfxbqfkfVar.encode(obj, this);
        return this;
    }

    private final zzcz zzl(eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, Object obj, boolean z13) throws IOException {
        this.zzi.zza(zoijcleaowVar, z13);
        eablkybsjgVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i13) {
        return ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i13) throws IOException {
        while (true) {
            int i14 = i13 & 127;
            if ((i13 & (-128)) == 0) {
                this.zze.write(i14);
                return;
            } else {
                this.zze.write(i14 | UserVerificationMethods.USER_VERIFY_PATTERN);
                i13 >>>= 7;
            }
        }
    }

    private final void zzo(long j13) throws IOException {
        while (true) {
            int i13 = ((int) j13) & 127;
            if (((-128) & j13) == 0) {
                this.zze.write(i13);
                return;
            } else {
                this.zze.write(i13 | UserVerificationMethods.USER_VERIFY_PATTERN);
                j13 >>>= 7;
            }
        }
    }

    @Override // mc.wkgbmnqykc
    public final wkgbmnqykc add(zoijcleaow zoijcleaowVar, double d13) throws IOException {
        zza(zoijcleaowVar, d13, true);
        return this;
    }

    public final wkgbmnqykc inline(Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    public final wkgbmnqykc nested(zoijcleaow zoijcleaowVar) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    final wkgbmnqykc zza(zoijcleaow zoijcleaowVar, double d13, boolean z13) throws IOException {
        if (z13 && d13 == 0.0d) {
            return this;
        }
        zzn((zzh(zoijcleaowVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d13).array());
        return this;
    }

    final wkgbmnqykc zzb(zoijcleaow zoijcleaowVar, float f13, boolean z13) throws IOException {
        if (z13 && f13 == 0.0f) {
            return this;
        }
        zzn((zzh(zoijcleaowVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f13).array());
        return this;
    }

    final wkgbmnqykc zzc(zoijcleaow zoijcleaowVar, Object obj, boolean z13) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z13 || charSequence.length() != 0) {
                    zzn((zzh(zoijcleaowVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(zoijcleaowVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, zoijcleaowVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(zoijcleaowVar, ((Double) obj).doubleValue(), z13);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(zoijcleaowVar, ((Float) obj).floatValue(), z13);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(zoijcleaowVar, ((Number) obj).longValue(), z13);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(zoijcleaowVar, ((Boolean) obj).booleanValue() ? 1 : 0, z13);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.zzf.get(obj.getClass());
                    if (ppxfxbqfkfVar != null) {
                        zzk(ppxfxbqfkfVar, zoijcleaowVar, obj, z13);
                        return this;
                    }
                    eablkybsjg eablkybsjgVar = (eablkybsjg) this.zzg.get(obj.getClass());
                    if (eablkybsjgVar != null) {
                        zzl(eablkybsjgVar, zoijcleaowVar, obj, z13);
                        return this;
                    }
                    if (obj instanceof zzcv) {
                        zzd(zoijcleaowVar, ((zzcv) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(zoijcleaowVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, zoijcleaowVar, obj, z13);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z13 || bArr.length != 0) {
                    zzn((zzh(zoijcleaowVar) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final zzcz zzd(zoijcleaow zoijcleaowVar, int i13, boolean z13) throws IOException {
        if (!z13 || i13 != 0) {
            zzcx zzcxVarZzj = zzj(zoijcleaowVar);
            int iOrdinal = zzcxVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzcxVarZzj.zza() << 3);
                zzn(i13);
            } else if (iOrdinal == 1) {
                zzn(zzcxVarZzj.zza() << 3);
                zzn((i13 + i13) ^ (i13 >> 31));
            } else if (iOrdinal == 2) {
                zzn((zzcxVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i13).array());
            }
        }
        return this;
    }

    final zzcz zze(zoijcleaow zoijcleaowVar, long j13, boolean z13) throws IOException {
        if (!z13 || j13 != 0) {
            zzcx zzcxVarZzj = zzj(zoijcleaowVar);
            int iOrdinal = zzcxVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzcxVarZzj.zza() << 3);
                zzo(j13);
            } else if (iOrdinal == 1) {
                zzn(zzcxVarZzj.zza() << 3);
                zzo((j13 >> 63) ^ (j13 + j13));
            } else if (iOrdinal == 2) {
                zzn((zzcxVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j13).array());
            }
        }
        return this;
    }

    final zzcz zzf(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.zzf.get(obj.getClass());
        if (ppxfxbqfkfVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        ppxfxbqfkfVar.encode(obj, this);
        return this;
    }

    public final wkgbmnqykc add(zoijcleaow zoijcleaowVar, float f13) throws IOException {
        zzb(zoijcleaowVar, f13, true);
        return this;
    }

    public final wkgbmnqykc nested(String str) throws IOException {
        return nested(zoijcleaow.wkgbmnqykc(str));
    }

    @Override // mc.wkgbmnqykc
    public final /* synthetic */ wkgbmnqykc add(zoijcleaow zoijcleaowVar, int i13) throws IOException {
        zzd(zoijcleaowVar, i13, true);
        return this;
    }

    @Override // mc.wkgbmnqykc
    public final /* synthetic */ wkgbmnqykc add(zoijcleaow zoijcleaowVar, long j13) throws IOException {
        zze(zoijcleaowVar, j13, true);
        return this;
    }

    @Override // mc.wkgbmnqykc
    public final wkgbmnqykc add(zoijcleaow zoijcleaowVar, Object obj) throws IOException {
        zzc(zoijcleaowVar, obj, true);
        return this;
    }

    @Override // mc.wkgbmnqykc
    public final /* synthetic */ wkgbmnqykc add(zoijcleaow zoijcleaowVar, boolean z13) throws IOException {
        zzd(zoijcleaowVar, z13 ? 1 : 0, true);
        return this;
    }

    public final wkgbmnqykc add(String str, double d13) throws IOException {
        zza(zoijcleaow.wkgbmnqykc(str), d13, true);
        return this;
    }

    public final wkgbmnqykc add(String str, int i13) throws IOException {
        zzd(zoijcleaow.wkgbmnqykc(str), i13, true);
        return this;
    }

    public final wkgbmnqykc add(String str, long j13) throws IOException {
        zze(zoijcleaow.wkgbmnqykc(str), j13, true);
        return this;
    }

    public final wkgbmnqykc add(String str, Object obj) throws IOException {
        zzc(zoijcleaow.wkgbmnqykc(str), obj, true);
        return this;
    }

    public final wkgbmnqykc add(String str, boolean z13) throws IOException {
        zzd(zoijcleaow.wkgbmnqykc(str), z13 ? 1 : 0, true);
        return this;
    }
}

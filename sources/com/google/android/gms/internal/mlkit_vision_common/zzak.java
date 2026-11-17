package com.google.android.gms.internal.mlkit_vision_common;

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
final class zzak implements wkgbmnqykc {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final ppxfxbqfkf zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ppxfxbqfkf zzh;
    private final zzao zzi = new zzao(this);

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("key");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzaeVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("value");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzaeVar2.zzb()).iobyxmoadg();
        zzd = new ppxfxbqfkf() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzaj
            @Override // mc.ppxfxbqfkf
            public final void encode(Object obj, Object obj2) throws IOException {
                zzak.zzg((Map.Entry) obj, (wkgbmnqykc) obj2);
            }
        };
    }

    zzak(OutputStream outputStream, Map map, Map map2, ppxfxbqfkf ppxfxbqfkfVar) {
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
        zzai zzaiVar = (zzai) zoijcleaowVar.ppxfxbqfkf(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IOException {
        zzaf zzafVar = new zzaf();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzafVar;
            try {
                ppxfxbqfkfVar.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzafVar.zza();
                zzafVar.close();
                return jZza;
            } catch (Throwable th2) {
                this.zze = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zzafVar.close();
            } catch (Throwable th4) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                } catch (Exception unused) {
                }
            }
            throw th3;
        }
    }

    private static zzai zzj(zoijcleaow zoijcleaowVar) {
        zzai zzaiVar = (zzai) zoijcleaowVar.ppxfxbqfkf(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzak zzk(ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar, Object obj, boolean z13) throws IOException {
        long jZzi = zzi(ppxfxbqfkfVar, obj);
        if (z13 && jZzi == 0) {
            return this;
        }
        zzn((zzh(zoijcleaowVar) << 3) | 2);
        zzo(jZzi);
        ppxfxbqfkfVar.encode(obj, this);
        return this;
    }

    private final zzak zzl(eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, Object obj, boolean z13) throws IOException {
        this.zzi.zza(zoijcleaowVar, z13);
        eablkybsjgVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i13) {
        return ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i13) throws IOException {
        while ((i13 & (-128)) != 0) {
            this.zze.write((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i13 >>>= 7;
        }
        this.zze.write(i13 & 127);
    }

    private final void zzo(long j13) throws IOException {
        while (((-128) & j13) != 0) {
            this.zze.write((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j13 >>>= 7;
        }
        this.zze.write(((int) j13) & 127);
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
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z13 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(zoijcleaowVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                zzc(zoijcleaowVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzk(zzd, zoijcleaowVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
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
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z13 && bArr.length == 0) {
                return this;
            }
            zzn((zzh(zoijcleaowVar) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        }
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
        if (obj instanceof zzag) {
            zzd(zoijcleaowVar, ((zzag) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            zzd(zoijcleaowVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        zzk(this.zzh, zoijcleaowVar, obj, z13);
        return this;
    }

    final zzak zzd(zoijcleaow zoijcleaowVar, int i13, boolean z13) throws IOException {
        if (z13 && i13 == 0) {
            return this;
        }
        zzai zzaiVarZzj = zzj(zoijcleaowVar);
        zzah zzahVar = zzah.DEFAULT;
        int iOrdinal = zzaiVarZzj.zzb().ordinal();
        if (iOrdinal == 0) {
            zzn(zzaiVarZzj.zza() << 3);
            zzn(i13);
        } else if (iOrdinal == 1) {
            zzn(zzaiVarZzj.zza() << 3);
            zzn((i13 + i13) ^ (i13 >> 31));
        } else if (iOrdinal == 2) {
            zzn((zzaiVarZzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i13).array());
        }
        return this;
    }

    final zzak zze(zoijcleaow zoijcleaowVar, long j13, boolean z13) throws IOException {
        if (z13 && j13 == 0) {
            return this;
        }
        zzai zzaiVarZzj = zzj(zoijcleaowVar);
        zzah zzahVar = zzah.DEFAULT;
        int iOrdinal = zzaiVarZzj.zzb().ordinal();
        if (iOrdinal == 0) {
            zzn(zzaiVarZzj.zza() << 3);
            zzo(j13);
        } else if (iOrdinal == 1) {
            zzn(zzaiVarZzj.zza() << 3);
            zzo((j13 >> 63) ^ (j13 + j13));
        } else if (iOrdinal == 2) {
            zzn((zzaiVarZzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j13).array());
        }
        return this;
    }

    final zzak zzf(Object obj) throws IOException {
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

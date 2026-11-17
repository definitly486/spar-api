package pc;

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

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo implements mc.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dxjokdxxww f76359eablkybsjg = new dxjokdxxww(this);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private OutputStream f76360iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f76361ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final mc.ppxfxbqfkf f76362wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f76363zoijcleaow;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Charset f76356gxszxtbevo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final mc.zoijcleaow f76357lqeggnwhkg = mc.zoijcleaow.iobyxmoadg("key").zoijcleaow(pc.iobyxmoadg.zoijcleaow().ppxfxbqfkf(1).iobyxmoadg()).iobyxmoadg();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final mc.zoijcleaow f76358nufgyqmvbu = mc.zoijcleaow.iobyxmoadg("value").zoijcleaow(pc.iobyxmoadg.zoijcleaow().ppxfxbqfkf(2).iobyxmoadg()).iobyxmoadg();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final mc.ppxfxbqfkf f76355dxjokdxxww = new mc.ppxfxbqfkf() { // from class: pc.eablkybsjg
        @Override // mc.ppxfxbqfkf
        public final void encode(Object obj, Object obj2) {
            gxszxtbevo.oxmwwwfdhm((Map.Entry) obj, (mc.wkgbmnqykc) obj2);
        }
    };

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f76364iobyxmoadg;

        static {
            int[] iArr = new int[wkgbmnqykc.iobyxmoadg.values().length];
            f76364iobyxmoadg = iArr;
            try {
                iArr[wkgbmnqykc.iobyxmoadg.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76364iobyxmoadg[wkgbmnqykc.iobyxmoadg.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76364iobyxmoadg[wkgbmnqykc.iobyxmoadg.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    gxszxtbevo(OutputStream outputStream, Map map, Map map2, mc.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f76360iobyxmoadg = outputStream;
        this.f76363zoijcleaow = map;
        this.f76361ppxfxbqfkf = map2;
        this.f76362wkgbmnqykc = ppxfxbqfkfVar;
    }

    private gxszxtbevo agtfadlqog(mc.eablkybsjg eablkybsjgVar, mc.zoijcleaow zoijcleaowVar, Object obj, boolean z13) {
        this.f76359eablkybsjg.zoijcleaow(zoijcleaowVar, z13);
        eablkybsjgVar.encode(obj, this.f76359eablkybsjg);
        return this;
    }

    private long draadjrbmk(mc.ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IOException {
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        try {
            OutputStream outputStream = this.f76360iobyxmoadg;
            this.f76360iobyxmoadg = zoijcleaowVar;
            try {
                ppxfxbqfkfVar.encode(obj, this);
                this.f76360iobyxmoadg = outputStream;
                long jIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                zoijcleaowVar.close();
                return jIobyxmoadg;
            } catch (Throwable th2) {
                this.f76360iobyxmoadg = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                zoijcleaowVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static ByteBuffer gtknphoqwx(int i13) {
        return ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
    }

    private void kcexrzcfyt(int i13) throws IOException {
        while ((i13 & (-128)) != 0) {
            this.f76360iobyxmoadg.write((i13 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i13 >>>= 7;
        }
        this.f76360iobyxmoadg.write(i13 & 127);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void oxmwwwfdhm(Map.Entry entry, mc.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.add(f76357lqeggnwhkg, entry.getKey());
        wkgbmnqykcVar.add(f76358nufgyqmvbu, entry.getValue());
    }

    private static wkgbmnqykc rgvfuqvkyq(mc.zoijcleaow zoijcleaowVar) {
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) zoijcleaowVar.ppxfxbqfkf(wkgbmnqykc.class);
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int vdvldrhtss(mc.zoijcleaow zoijcleaowVar) {
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) zoijcleaowVar.ppxfxbqfkf(wkgbmnqykc.class);
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private gxszxtbevo wflxmlrfwp(mc.ppxfxbqfkf ppxfxbqfkfVar, mc.zoijcleaow zoijcleaowVar, Object obj, boolean z13) throws IOException {
        long jDraadjrbmk = draadjrbmk(ppxfxbqfkfVar, obj);
        if (z13 && jDraadjrbmk == 0) {
            return this;
        }
        kcexrzcfyt((vdvldrhtss(zoijcleaowVar) << 3) | 2);
        zdlpuopuiu(jDraadjrbmk);
        ppxfxbqfkfVar.encode(obj, this);
        return this;
    }

    private void zdlpuopuiu(long j13) throws IOException {
        while (((-128) & j13) != 0) {
            this.f76360iobyxmoadg.write((((int) j13) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j13 >>>= 7;
        }
        this.f76360iobyxmoadg.write(((int) j13) & 127);
    }

    gxszxtbevo btonecajqb(mc.zoijcleaow zoijcleaowVar, boolean z13, boolean z14) {
        return gxszxtbevo(zoijcleaowVar, z13 ? 1 : 0, z14);
    }

    @Override // mc.wkgbmnqykc
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo add(mc.zoijcleaow zoijcleaowVar, boolean z13) {
        return btonecajqb(zoijcleaowVar, z13, true);
    }

    @Override // mc.wkgbmnqykc
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo add(mc.zoijcleaow zoijcleaowVar, int i13) {
        return gxszxtbevo(zoijcleaowVar, i13, true);
    }

    gxszxtbevo gxszxtbevo(mc.zoijcleaow zoijcleaowVar, int i13, boolean z13) throws IOException {
        if (z13 && i13 == 0) {
            return this;
        }
        wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = rgvfuqvkyq(zoijcleaowVar);
        int i14 = iobyxmoadg.f76364iobyxmoadg[wkgbmnqykcVarRgvfuqvkyq.intEncoding().ordinal()];
        if (i14 == 1) {
            kcexrzcfyt(wkgbmnqykcVarRgvfuqvkyq.tag() << 3);
            kcexrzcfyt(i13);
        } else if (i14 == 2) {
            kcexrzcfyt(wkgbmnqykcVarRgvfuqvkyq.tag() << 3);
            kcexrzcfyt((i13 << 1) ^ (i13 >> 31));
        } else if (i14 == 3) {
            kcexrzcfyt((wkgbmnqykcVarRgvfuqvkyq.tag() << 3) | 5);
            this.f76360iobyxmoadg.write(gtknphoqwx(4).putInt(i13).array());
        }
        return this;
    }

    @Override // mc.wkgbmnqykc
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public gxszxtbevo add(mc.zoijcleaow zoijcleaowVar, long j13) {
        return nufgyqmvbu(zoijcleaowVar, j13, true);
    }

    gxszxtbevo nufgyqmvbu(mc.zoijcleaow zoijcleaowVar, long j13, boolean z13) throws IOException {
        if (z13 && j13 == 0) {
            return this;
        }
        wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = rgvfuqvkyq(zoijcleaowVar);
        int i13 = iobyxmoadg.f76364iobyxmoadg[wkgbmnqykcVarRgvfuqvkyq.intEncoding().ordinal()];
        if (i13 == 1) {
            kcexrzcfyt(wkgbmnqykcVarRgvfuqvkyq.tag() << 3);
            zdlpuopuiu(j13);
        } else if (i13 == 2) {
            kcexrzcfyt(wkgbmnqykcVarRgvfuqvkyq.tag() << 3);
            zdlpuopuiu((j13 >> 63) ^ (j13 << 1));
        } else if (i13 == 3) {
            kcexrzcfyt((wkgbmnqykcVarRgvfuqvkyq.tag() << 3) | 1);
            this.f76360iobyxmoadg.write(gtknphoqwx(8).putLong(j13).array());
        }
        return this;
    }

    gxszxtbevo ojitshcjhn(Object obj) {
        if (obj == null) {
            return this;
        }
        mc.ppxfxbqfkf ppxfxbqfkfVar = (mc.ppxfxbqfkf) this.f76363zoijcleaow.get(obj.getClass());
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    mc.wkgbmnqykc ppxfxbqfkf(mc.zoijcleaow zoijcleaowVar, float f13, boolean z13) throws IOException {
        if (z13 && f13 == 0.0f) {
            return this;
        }
        kcexrzcfyt((vdvldrhtss(zoijcleaowVar) << 3) | 5);
        this.f76360iobyxmoadg.write(gtknphoqwx(4).putFloat(f13).array());
        return this;
    }

    mc.wkgbmnqykc wkgbmnqykc(mc.zoijcleaow zoijcleaowVar, Object obj, boolean z13) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z13 && charSequence.length() == 0) {
                return this;
            }
            kcexrzcfyt((vdvldrhtss(zoijcleaowVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f76356gxszxtbevo);
            kcexrzcfyt(bytes.length);
            this.f76360iobyxmoadg.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                wkgbmnqykc(zoijcleaowVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                wflxmlrfwp(f76355dxjokdxxww, zoijcleaowVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return zoijcleaow(zoijcleaowVar, ((Double) obj).doubleValue(), z13);
        }
        if (obj instanceof Float) {
            return ppxfxbqfkf(zoijcleaowVar, ((Float) obj).floatValue(), z13);
        }
        if (obj instanceof Number) {
            return nufgyqmvbu(zoijcleaowVar, ((Number) obj).longValue(), z13);
        }
        if (obj instanceof Boolean) {
            return btonecajqb(zoijcleaowVar, ((Boolean) obj).booleanValue(), z13);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z13 && bArr.length == 0) {
                return this;
            }
            kcexrzcfyt((vdvldrhtss(zoijcleaowVar) << 3) | 2);
            kcexrzcfyt(bArr.length);
            this.f76360iobyxmoadg.write(bArr);
            return this;
        }
        mc.ppxfxbqfkf ppxfxbqfkfVar = (mc.ppxfxbqfkf) this.f76363zoijcleaow.get(obj.getClass());
        if (ppxfxbqfkfVar != null) {
            return wflxmlrfwp(ppxfxbqfkfVar, zoijcleaowVar, obj, z13);
        }
        mc.eablkybsjg eablkybsjgVar = (mc.eablkybsjg) this.f76361ppxfxbqfkf.get(obj.getClass());
        if (eablkybsjgVar != null) {
            return agtfadlqog(eablkybsjgVar, zoijcleaowVar, obj, z13);
        }
        if (obj instanceof ppxfxbqfkf) {
            return add(zoijcleaowVar, ((ppxfxbqfkf) obj).getNumber());
        }
        return obj instanceof Enum ? add(zoijcleaowVar, ((Enum) obj).ordinal()) : wflxmlrfwp(this.f76362wkgbmnqykc, zoijcleaowVar, obj, z13);
    }

    mc.wkgbmnqykc zoijcleaow(mc.zoijcleaow zoijcleaowVar, double d13, boolean z13) throws IOException {
        if (z13 && d13 == 0.0d) {
            return this;
        }
        kcexrzcfyt((vdvldrhtss(zoijcleaowVar) << 3) | 1);
        this.f76360iobyxmoadg.write(gtknphoqwx(8).putDouble(d13).array());
        return this;
    }

    @Override // mc.wkgbmnqykc
    public mc.wkgbmnqykc add(mc.zoijcleaow zoijcleaowVar, Object obj) {
        return wkgbmnqykc(zoijcleaowVar, obj, true);
    }

    @Override // mc.wkgbmnqykc
    public mc.wkgbmnqykc add(mc.zoijcleaow zoijcleaowVar, double d13) {
        return zoijcleaow(zoijcleaowVar, d13, true);
    }
}

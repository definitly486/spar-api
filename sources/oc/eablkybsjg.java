package oc;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg implements mc.wkgbmnqykc, mc.gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Map f72574eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final mc.ppxfxbqfkf f72575gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f72577lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final JsonWriter f72578ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f72579wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private eablkybsjg f72576iobyxmoadg = null;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f72580zoijcleaow = true;

    eablkybsjg(Writer writer, Map map, Map map2, mc.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        this.f72578ppxfxbqfkf = new JsonWriter(writer);
        this.f72579wkgbmnqykc = map;
        this.f72574eablkybsjg = map2;
        this.f72575gxszxtbevo = ppxfxbqfkfVar;
        this.f72577lqeggnwhkg = z13;
    }

    private void oxmwwwfdhm() throws IOException {
        if (!this.f72580zoijcleaow) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        eablkybsjg eablkybsjgVar = this.f72576iobyxmoadg;
        if (eablkybsjgVar != null) {
            eablkybsjgVar.oxmwwwfdhm();
            this.f72576iobyxmoadg.f72580zoijcleaow = false;
            this.f72576iobyxmoadg = null;
            this.f72578ppxfxbqfkf.endObject();
        }
    }

    private eablkybsjg rgvfuqvkyq(String str, Object obj) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.name(str);
        if (obj != null) {
            return wkgbmnqykc(obj, false);
        }
        this.f72578ppxfxbqfkf.nullValue();
        return this;
    }

    private eablkybsjg vdvldrhtss(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.name(str);
        return wkgbmnqykc(obj, false);
    }

    private boolean wflxmlrfwp(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    void agtfadlqog() {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.flush();
    }

    public eablkybsjg btonecajqb(String str, boolean z13) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.name(str);
        return add(z13);
    }

    public eablkybsjg draadjrbmk(byte[] bArr) throws IOException {
        oxmwwwfdhm();
        if (bArr == null) {
            this.f72578ppxfxbqfkf.nullValue();
        } else {
            this.f72578ppxfxbqfkf.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public eablkybsjg dxjokdxxww(String str, Object obj) {
        return this.f72577lqeggnwhkg ? vdvldrhtss(str, obj) : rgvfuqvkyq(str, obj);
    }

    @Override // mc.gxszxtbevo
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public eablkybsjg add(String str) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.value(str);
        return this;
    }

    @Override // mc.gxszxtbevo
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public eablkybsjg add(boolean z13) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.value(z13);
        return this;
    }

    public eablkybsjg gxszxtbevo(String str, double d13) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.name(str);
        return iobyxmoadg(d13);
    }

    public eablkybsjg iobyxmoadg(double d13) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.value(d13);
        return this;
    }

    public eablkybsjg lqeggnwhkg(String str, int i13) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.name(str);
        return zoijcleaow(i13);
    }

    public eablkybsjg nufgyqmvbu(String str, long j13) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.name(str);
        return ppxfxbqfkf(j13);
    }

    eablkybsjg ojitshcjhn(mc.ppxfxbqfkf ppxfxbqfkfVar, Object obj, boolean z13) throws IOException {
        if (!z13) {
            this.f72578ppxfxbqfkf.beginObject();
        }
        ppxfxbqfkfVar.encode(obj, this);
        if (!z13) {
            this.f72578ppxfxbqfkf.endObject();
        }
        return this;
    }

    public eablkybsjg ppxfxbqfkf(long j13) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.value(j13);
        return this;
    }

    eablkybsjg wkgbmnqykc(Object obj, boolean z13) {
        if (z13 && wflxmlrfwp(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f72578ppxfxbqfkf.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f72578ppxfxbqfkf.value((Number) obj);
            return this;
        }
        int i13 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f72578ppxfxbqfkf.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    wkgbmnqykc(it.next(), false);
                }
                this.f72578ppxfxbqfkf.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f72578ppxfxbqfkf.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        dxjokdxxww((String) key, entry.getValue());
                    } catch (ClassCastException e13) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e13);
                    }
                }
                this.f72578ppxfxbqfkf.endObject();
                return this;
            }
            mc.ppxfxbqfkf ppxfxbqfkfVar = (mc.ppxfxbqfkf) this.f72579wkgbmnqykc.get(obj.getClass());
            if (ppxfxbqfkfVar != null) {
                return ojitshcjhn(ppxfxbqfkfVar, obj, z13);
            }
            mc.eablkybsjg eablkybsjgVar = (mc.eablkybsjg) this.f72574eablkybsjg.get(obj.getClass());
            if (eablkybsjgVar != null) {
                eablkybsjgVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return ojitshcjhn(this.f72575gxszxtbevo, obj, z13);
            }
            if (obj instanceof gxszxtbevo) {
                zoijcleaow(((gxszxtbevo) obj).getNumber());
            } else {
                add(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return draadjrbmk((byte[]) obj);
        }
        this.f72578ppxfxbqfkf.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i13 < length) {
                this.f72578ppxfxbqfkf.value(iArr[i13]);
                i13++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i13 < length2) {
                ppxfxbqfkf(jArr[i13]);
                i13++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i13 < length3) {
                this.f72578ppxfxbqfkf.value(dArr[i13]);
                i13++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i13 < length4) {
                this.f72578ppxfxbqfkf.value(zArr[i13]);
                i13++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                wkgbmnqykc(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                wkgbmnqykc(obj2, false);
            }
        }
        this.f72578ppxfxbqfkf.endArray();
        return this;
    }

    public eablkybsjg zoijcleaow(int i13) throws IOException {
        oxmwwwfdhm();
        this.f72578ppxfxbqfkf.value(i13);
        return this;
    }

    @Override // mc.wkgbmnqykc
    public mc.wkgbmnqykc add(mc.zoijcleaow zoijcleaowVar, Object obj) {
        return dxjokdxxww(zoijcleaowVar.zoijcleaow(), obj);
    }

    @Override // mc.wkgbmnqykc
    public mc.wkgbmnqykc add(mc.zoijcleaow zoijcleaowVar, double d13) {
        return gxszxtbevo(zoijcleaowVar.zoijcleaow(), d13);
    }

    @Override // mc.wkgbmnqykc
    public mc.wkgbmnqykc add(mc.zoijcleaow zoijcleaowVar, int i13) {
        return lqeggnwhkg(zoijcleaowVar.zoijcleaow(), i13);
    }

    @Override // mc.wkgbmnqykc
    public mc.wkgbmnqykc add(mc.zoijcleaow zoijcleaowVar, long j13) {
        return nufgyqmvbu(zoijcleaowVar.zoijcleaow(), j13);
    }

    @Override // mc.wkgbmnqykc
    public mc.wkgbmnqykc add(mc.zoijcleaow zoijcleaowVar, boolean z13) {
        return btonecajqb(zoijcleaowVar.zoijcleaow(), z13);
    }
}

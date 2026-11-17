package t5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import bb.agtfadlqog;
import bb.draadjrbmk;
import bb.wflxmlrfwp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements SharedPreferences {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final bb.iobyxmoadg f109706eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final bb.eablkybsjg f109707gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final SharedPreferences f109708iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final String f109709ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final String f109710wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final CopyOnWriteArrayList f109711zoijcleaow = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t5.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class SharedPreferencesEditorC2694iobyxmoadg implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg f109712iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final SharedPreferences.Editor f109715zoijcleaow;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final AtomicBoolean f109714wkgbmnqykc = new AtomicBoolean(false);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f109713ppxfxbqfkf = new CopyOnWriteArrayList();

        SharedPreferencesEditorC2694iobyxmoadg(iobyxmoadg iobyxmoadgVar, SharedPreferences.Editor editor) {
            this.f109712iobyxmoadg = iobyxmoadgVar;
            this.f109715zoijcleaow = editor;
        }

        private void iobyxmoadg() {
            if (this.f109714wkgbmnqykc.getAndSet(false)) {
                for (String str : this.f109712iobyxmoadg.getAll().keySet()) {
                    if (!this.f109713ppxfxbqfkf.contains(str) && !this.f109712iobyxmoadg.lqeggnwhkg(str)) {
                        this.f109715zoijcleaow.remove(this.f109712iobyxmoadg.wkgbmnqykc(str));
                    }
                }
            }
        }

        private void ppxfxbqfkf(String str, byte[] bArr) {
            if (this.f109712iobyxmoadg.lqeggnwhkg(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f109713ppxfxbqfkf.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair pairEablkybsjg = this.f109712iobyxmoadg.eablkybsjg(str, bArr);
                this.f109715zoijcleaow.putString((String) pairEablkybsjg.first, (String) pairEablkybsjg.second);
            } catch (GeneralSecurityException e13) {
                throw new SecurityException("Could not encrypt data: " + e13.getMessage(), e13);
            }
        }

        private void zoijcleaow() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f109712iobyxmoadg.f109711zoijcleaow) {
                Iterator it = this.f109713ppxfxbqfkf.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f109712iobyxmoadg, (String) it.next());
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            iobyxmoadg();
            this.f109715zoijcleaow.apply();
            zoijcleaow();
            this.f109713ppxfxbqfkf.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f109714wkgbmnqykc.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            iobyxmoadg();
            try {
                return this.f109715zoijcleaow.commit();
            } finally {
                zoijcleaow();
                this.f109713ppxfxbqfkf.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z13) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(zoijcleaow.BOOLEAN.lqeggnwhkg());
            byteBufferAllocate.put(z13 ? (byte) 1 : (byte) 0);
            ppxfxbqfkf(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f13) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(zoijcleaow.FLOAT.lqeggnwhkg());
            byteBufferAllocate.putFloat(f13);
            ppxfxbqfkf(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i13) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(zoijcleaow.INT.lqeggnwhkg());
            byteBufferAllocate.putInt(i13);
            ppxfxbqfkf(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j13) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(zoijcleaow.LONG.lqeggnwhkg());
            byteBufferAllocate.putLong(j13);
            ppxfxbqfkf(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(zoijcleaow.STRING.lqeggnwhkg());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            ppxfxbqfkf(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new androidx.collection.zoijcleaow();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(zoijcleaow.STRING_SET.lqeggnwhkg());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            ppxfxbqfkf(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f109712iobyxmoadg.lqeggnwhkg(str)) {
                this.f109715zoijcleaow.remove(this.f109712iobyxmoadg.wkgbmnqykc(str));
                this.f109713ppxfxbqfkf.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    public enum ppxfxbqfkf {
        AES256_SIV("AES256_SIV");


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f109718zdlpuopuiu;

        ppxfxbqfkf(String str) {
            this.f109718zdlpuopuiu = str;
        }

        draadjrbmk wkgbmnqykc() {
            return wflxmlrfwp.iobyxmoadg(this.f109718zdlpuopuiu);
        }
    }

    public enum wkgbmnqykc {
        AES256_GCM("AES256_GCM");


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f109721zdlpuopuiu;

        wkgbmnqykc(String str) {
            this.f109721zdlpuopuiu = str;
        }

        draadjrbmk wkgbmnqykc() {
            return wflxmlrfwp.iobyxmoadg(this.f109721zdlpuopuiu);
        }
    }

    private enum zoijcleaow {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f109729zdlpuopuiu;

        zoijcleaow(int i13) {
            this.f109729zdlpuopuiu = i13;
        }

        public static zoijcleaow wkgbmnqykc(int i13) {
            if (i13 == 0) {
                return STRING;
            }
            if (i13 == 1) {
                return STRING_SET;
            }
            if (i13 == 2) {
                return INT;
            }
            if (i13 == 3) {
                return LONG;
            }
            if (i13 == 4) {
                return FLOAT;
            }
            if (i13 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int lqeggnwhkg() {
            return this.f109729zdlpuopuiu;
        }
    }

    iobyxmoadg(String str, String str2, SharedPreferences sharedPreferences, bb.iobyxmoadg iobyxmoadgVar, bb.eablkybsjg eablkybsjgVar) {
        this.f109709ppxfxbqfkf = str;
        this.f109708iobyxmoadg = sharedPreferences;
        this.f109710wkgbmnqykc = str2;
        this.f109706eablkybsjg = iobyxmoadgVar;
        this.f109707gxszxtbevo = eablkybsjgVar;
    }

    private Object gxszxtbevo(String str) {
        if (lqeggnwhkg(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strWkgbmnqykc = wkgbmnqykc(str);
            String string = this.f109708iobyxmoadg.getString(strWkgbmnqykc, null);
            if (string == null) {
                return null;
            }
            byte[] bArrIobyxmoadg = ob.eablkybsjg.iobyxmoadg(string, 0);
            bb.iobyxmoadg iobyxmoadgVar = this.f109706eablkybsjg;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(iobyxmoadgVar.zoijcleaow(bArrIobyxmoadg, strWkgbmnqykc.getBytes(charset)));
            byteBufferWrap.position(0);
            int i13 = byteBufferWrap.getInt();
            zoijcleaow zoijcleaowVarWkgbmnqykc = zoijcleaow.wkgbmnqykc(i13);
            if (zoijcleaowVarWkgbmnqykc == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i13);
            }
            int iOrdinal = zoijcleaowVarWkgbmnqykc.ordinal();
            if (iOrdinal == 0) {
                int i14 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i14);
                String string2 = charset.decode(byteBufferSlice).toString();
                if (string2.equals("__NULL__")) {
                    return null;
                }
                return string2;
            }
            if (iOrdinal == 1) {
                androidx.collection.zoijcleaow zoijcleaowVar = new androidx.collection.zoijcleaow();
                while (byteBufferWrap.hasRemaining()) {
                    int i15 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferSlice2.limit(i15);
                    byteBufferWrap.position(byteBufferWrap.position() + i15);
                    zoijcleaowVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                }
                if (zoijcleaowVar.size() == 1 && "__NULL__".equals(zoijcleaowVar.draadjrbmk(0))) {
                    return null;
                }
                return zoijcleaowVar;
            }
            if (iOrdinal == 2) {
                return Integer.valueOf(byteBufferWrap.getInt());
            }
            if (iOrdinal == 3) {
                return Long.valueOf(byteBufferWrap.getLong());
            }
            if (iOrdinal == 4) {
                return Float.valueOf(byteBufferWrap.getFloat());
            }
            if (iOrdinal == 5) {
                return Boolean.valueOf(byteBufferWrap.get() != 0);
            }
            throw new SecurityException("Unhandled type for encrypted pref value: " + zoijcleaowVarWkgbmnqykc);
        } catch (GeneralSecurityException e13) {
            throw new SecurityException("Could not decrypt value. " + e13.getMessage(), e13);
        }
    }

    public static SharedPreferences iobyxmoadg(Context context, String str, t5.ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf ppxfxbqfkfVar2, wkgbmnqykc wkgbmnqykcVar) {
        return zoijcleaow(str, ppxfxbqfkfVar.iobyxmoadg(), context, ppxfxbqfkfVar2, wkgbmnqykcVar);
    }

    public static SharedPreferences zoijcleaow(String str, String str2, Context context, ppxfxbqfkf ppxfxbqfkfVar, wkgbmnqykc wkgbmnqykcVar) {
        hb.zoijcleaow.iobyxmoadg();
        cb.iobyxmoadg.zoijcleaow();
        Context applicationContext = context.getApplicationContext();
        agtfadlqog agtfadlqogVarWkgbmnqykc = new ib.iobyxmoadg.zoijcleaow().draadjrbmk(ppxfxbqfkfVar.wkgbmnqykc()).agtfadlqog(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).wflxmlrfwp("android-keystore://" + str2).gxszxtbevo().wkgbmnqykc();
        agtfadlqog agtfadlqogVarWkgbmnqykc2 = new ib.iobyxmoadg.zoijcleaow().draadjrbmk(wkgbmnqykcVar.wkgbmnqykc()).agtfadlqog(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).wflxmlrfwp("android-keystore://" + str2).gxszxtbevo().wkgbmnqykc();
        return new iobyxmoadg(str, str2, applicationContext.getSharedPreferences(str, 0), (bb.iobyxmoadg) agtfadlqogVarWkgbmnqykc2.gtknphoqwx(bb.iobyxmoadg.class), (bb.eablkybsjg) agtfadlqogVarWkgbmnqykc.gtknphoqwx(bb.eablkybsjg.class));
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!lqeggnwhkg(str)) {
            return this.f109708iobyxmoadg.contains(wkgbmnqykc(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    Pair eablkybsjg(String str, byte[] bArr) {
        String strWkgbmnqykc = wkgbmnqykc(str);
        return new Pair(strWkgbmnqykc, ob.eablkybsjg.wkgbmnqykc(this.f109706eablkybsjg.iobyxmoadg(bArr, strWkgbmnqykc.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC2694iobyxmoadg(this, this.f109708iobyxmoadg.edit());
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f109708iobyxmoadg.getAll().entrySet()) {
            if (!lqeggnwhkg(entry.getKey())) {
                String strPpxfxbqfkf = ppxfxbqfkf(entry.getKey());
                map.put(strPpxfxbqfkf, gxszxtbevo(strPpxfxbqfkf));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z13) {
        Object objGxszxtbevo = gxszxtbevo(str);
        return objGxszxtbevo instanceof Boolean ? ((Boolean) objGxszxtbevo).booleanValue() : z13;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f13) {
        Object objGxszxtbevo = gxszxtbevo(str);
        return objGxszxtbevo instanceof Float ? ((Float) objGxszxtbevo).floatValue() : f13;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i13) {
        Object objGxszxtbevo = gxszxtbevo(str);
        return objGxszxtbevo instanceof Integer ? ((Integer) objGxszxtbevo).intValue() : i13;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j13) {
        Object objGxszxtbevo = gxszxtbevo(str);
        return objGxszxtbevo instanceof Long ? ((Long) objGxszxtbevo).longValue() : j13;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objGxszxtbevo = gxszxtbevo(str);
        return objGxszxtbevo instanceof String ? (String) objGxszxtbevo : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object objGxszxtbevo = gxszxtbevo(str);
        Set zoijcleaowVar = objGxszxtbevo instanceof Set ? (Set) objGxszxtbevo : new androidx.collection.zoijcleaow();
        return zoijcleaowVar.size() > 0 ? zoijcleaowVar : set;
    }

    boolean lqeggnwhkg(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    String ppxfxbqfkf(String str) {
        try {
            String str2 = new String(this.f109707gxszxtbevo.zoijcleaow(ob.eablkybsjg.iobyxmoadg(str, 0), this.f109709ppxfxbqfkf.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e13) {
            throw new SecurityException("Could not decrypt key. " + e13.getMessage(), e13);
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f109711zoijcleaow.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f109711zoijcleaow.remove(onSharedPreferenceChangeListener);
    }

    String wkgbmnqykc(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return ob.eablkybsjg.wkgbmnqykc(this.f109707gxszxtbevo.iobyxmoadg(str.getBytes(StandardCharsets.UTF_8), this.f109709ppxfxbqfkf.getBytes()));
        } catch (GeneralSecurityException e13) {
            throw new SecurityException("Could not encrypt key. " + e13.getMessage(), e13);
        }
    }
}

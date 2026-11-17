package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import hg.tzroggbefp;
import i7.gtknphoqwx;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public interface MemoryCache {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f20269iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f20270ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private double f20272zoijcleaow;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f20271wkgbmnqykc = true;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f20268eablkybsjg = true;

        public iobyxmoadg(Context context) {
            this.f20269iobyxmoadg = context;
            this.f20272zoijcleaow = gtknphoqwx.eablkybsjg(context);
        }

        public final MemoryCache iobyxmoadg() {
            lqeggnwhkg iobyxmoadgVar;
            nufgyqmvbu gxszxtbevoVar = this.f20268eablkybsjg ? new gxszxtbevo() : new coil.memory.zoijcleaow();
            if (this.f20271wkgbmnqykc) {
                double d13 = this.f20272zoijcleaow;
                int iPpxfxbqfkf = d13 > 0.0d ? gtknphoqwx.ppxfxbqfkf(this.f20269iobyxmoadg, d13) : this.f20270ppxfxbqfkf;
                iobyxmoadgVar = iPpxfxbqfkf > 0 ? new eablkybsjg(iPpxfxbqfkf, gxszxtbevoVar) : new coil.memory.iobyxmoadg(gxszxtbevoVar);
            } else {
                iobyxmoadgVar = new coil.memory.iobyxmoadg(gxszxtbevoVar);
            }
            return new wkgbmnqykc(iobyxmoadgVar, gxszxtbevoVar);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Bitmap f20273iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f20274zoijcleaow;

        public zoijcleaow(Bitmap bitmap, Map map) {
            this.f20273iobyxmoadg = bitmap;
            this.f20274zoijcleaow = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof zoijcleaow) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                if (zdlpuopuiu.eablkybsjg(this.f20273iobyxmoadg, zoijcleaowVar.f20273iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f20274zoijcleaow, zoijcleaowVar.f20274zoijcleaow)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f20273iobyxmoadg.hashCode() * 31) + this.f20274zoijcleaow.hashCode();
        }

        public final Bitmap iobyxmoadg() {
            return this.f20273iobyxmoadg;
        }

        public String toString() {
            return "Value(bitmap=" + this.f20273iobyxmoadg + ", extras=" + this.f20274zoijcleaow + ')';
        }

        public final Map zoijcleaow() {
            return this.f20274zoijcleaow;
        }
    }

    void iobyxmoadg(int i13);

    void ppxfxbqfkf(Key key, zoijcleaow zoijcleaowVar);

    zoijcleaow zoijcleaow(Key key);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "zoijcleaow", "(Ljava/lang/String;Ljava/util/Map;)Lcoil/memory/MemoryCache$Key;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "zdlpuopuiu", "Ljava/lang/String;", "getKey", "yggfygwlhe", "Ljava/util/Map;", "eablkybsjg", "()Ljava/util/Map;", "jyumaefscl", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Key implements Parcelable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map extras;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final zoijcleaow f20265jyumaefscl = new zoijcleaow(null);

        @Deprecated
        public static final Parcelable.Creator<Key> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                zdlpuopuiu.lqeggnwhkg(string);
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    String string2 = parcel.readString();
                    zdlpuopuiu.lqeggnwhkg(string2);
                    String string3 = parcel.readString();
                    zdlpuopuiu.lqeggnwhkg(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public Key[] newArray(int i13) {
                return new Key[i13];
            }
        }

        private static final class zoijcleaow {
            public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private zoijcleaow() {
            }
        }

        public Key(String str, Map map) {
            this.key = str;
            this.extras = map;
        }

        public static /* synthetic */ Key ppxfxbqfkf(Key key, String str, Map map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = key.key;
            }
            if ((i13 & 2) != 0) {
                map = key.extras;
            }
            return key.zoijcleaow(str, map);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final Map getExtras() {
            return this.extras;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Key) {
                Key key = (Key) other;
                if (zdlpuopuiu.eablkybsjg(this.key, key.key) && zdlpuopuiu.eablkybsjg(this.extras, key.extras)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.key);
            parcel.writeInt(this.extras.size());
            for (Map.Entry entry : this.extras.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                parcel.writeString(str);
                parcel.writeString(str2);
            }
        }

        public final Key zoijcleaow(String key, Map extras) {
            return new Key(key, extras);
        }

        public /* synthetic */ Key(String str, Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? tzroggbefp.dxjokdxxww() : map);
        }
    }
}

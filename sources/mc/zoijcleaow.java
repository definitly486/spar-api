package mc;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66788iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f66789zoijcleaow;

    /* JADX INFO: renamed from: mc.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1380zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f66790iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Map f66791zoijcleaow = null;

        C1380zoijcleaow(String str) {
            this.f66790iobyxmoadg = str;
        }

        public zoijcleaow iobyxmoadg() {
            return new zoijcleaow(this.f66790iobyxmoadg, this.f66791zoijcleaow == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f66791zoijcleaow)));
        }

        public C1380zoijcleaow zoijcleaow(Annotation annotation) {
            if (this.f66791zoijcleaow == null) {
                this.f66791zoijcleaow = new HashMap();
            }
            this.f66791zoijcleaow.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static C1380zoijcleaow iobyxmoadg(String str) {
        return new C1380zoijcleaow(str);
    }

    public static zoijcleaow wkgbmnqykc(String str) {
        return new zoijcleaow(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f66788iobyxmoadg.equals(zoijcleaowVar.f66788iobyxmoadg) && this.f66789zoijcleaow.equals(zoijcleaowVar.f66789zoijcleaow);
    }

    public int hashCode() {
        return (this.f66788iobyxmoadg.hashCode() * 31) + this.f66789zoijcleaow.hashCode();
    }

    public Annotation ppxfxbqfkf(Class cls) {
        return (Annotation) this.f66789zoijcleaow.get(cls);
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f66788iobyxmoadg + ", properties=" + this.f66789zoijcleaow.values() + "}";
    }

    public String zoijcleaow() {
        return this.f66788iobyxmoadg;
    }

    private zoijcleaow(String str, Map map) {
        this.f66788iobyxmoadg = str;
        this.f66789zoijcleaow = map;
    }
}

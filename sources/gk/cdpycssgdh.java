package gk;

import hk.hcddaimhww;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@bk.wflxmlrfwp(with = yadqdtsiqt.class)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001+B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001e0\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lgk/cdpycssgdh;", "Lgk/btonecajqb;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "key", "zoijcleaow", "(Ljava/lang/String;)Z", "value", "ppxfxbqfkf", "(Lgk/btonecajqb;)Z", "wkgbmnqykc", "(Ljava/lang/String;)Lgk/btonecajqb;", "isEmpty", "()Z", "zdlpuopuiu", "Ljava/util/Map;", "", "", "eablkybsjg", "()Ljava/util/Set;", "entries", "gxszxtbevo", "keys", "dxjokdxxww", "size", "", "btonecajqb", "()Ljava/util/Collection;", ExternalMetricsManagerImpl.VALUES, "Companion", "iobyxmoadg", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cdpycssgdh extends btonecajqb implements Map<String, btonecajqb>, ug.iobyxmoadg {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final Map content;

    /* JADX INFO: renamed from: gk.cdpycssgdh$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return yadqdtsiqt.f37746iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdpycssgdh(Map content) {
        super(null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
        this.content = content;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence draadjrbmk(Map.Entry entry) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(entry, "<destruct>");
        String str = (String) entry.getKey();
        btonecajqb btonecajqbVar = (btonecajqb) entry.getValue();
        StringBuilder sb3 = new StringBuilder();
        hcddaimhww.ppxfxbqfkf(sb3, str);
        sb3.append(':');
        sb3.append(btonecajqbVar);
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public Collection btonecajqb() {
        return this.content.values();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ btonecajqb compute(String str, BiFunction<? super String, ? super btonecajqb, ? extends btonecajqb> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ btonecajqb computeIfAbsent(String str, Function<? super String, ? extends btonecajqb> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ btonecajqb computeIfPresent(String str, BiFunction<? super String, ? super btonecajqb, ? extends btonecajqb> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return zoijcleaow((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof btonecajqb) {
            return ppxfxbqfkf((btonecajqb) obj);
        }
        return false;
    }

    public int dxjokdxxww() {
        return this.content.size();
    }

    public Set eablkybsjg() {
        return this.content.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, btonecajqb>> entrySet() {
        return eablkybsjg();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.content, other);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ btonecajqb get(Object obj) {
        if (obj instanceof String) {
            return wkgbmnqykc((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public btonecajqb remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set gxszxtbevo() {
        return this.content.keySet();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return gxszxtbevo();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ btonecajqb merge(String str, btonecajqb btonecajqbVar, BiFunction<? super btonecajqb, ? super btonecajqb, ? extends btonecajqb> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean ppxfxbqfkf(btonecajqb value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        return this.content.containsValue(value);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ btonecajqb put(String str, btonecajqb btonecajqbVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends btonecajqb> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ btonecajqb putIfAbsent(String str, btonecajqb btonecajqbVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ btonecajqb replace(String str, btonecajqb btonecajqbVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super btonecajqb, ? extends btonecajqb> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return dxjokdxxww();
    }

    public String toString() {
        return hg.jyumaefscl.iwxlajgraz(this.content.entrySet(), StringUtils.COMMA, "{", "}", 0, null, new tg.draadjrbmk() { // from class: gk.istkbnxepw
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cdpycssgdh.draadjrbmk((Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<btonecajqb> values() {
        return btonecajqb();
    }

    public btonecajqb wkgbmnqykc(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        return (btonecajqb) this.content.get(key);
    }

    public boolean zoijcleaow(String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        return this.content.containsKey(key);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, btonecajqb btonecajqbVar, btonecajqb btonecajqbVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

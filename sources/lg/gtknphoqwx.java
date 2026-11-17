package lg;

import java.io.Serializable;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class gtknphoqwx implements btonecajqb, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final gtknphoqwx f62507zdlpuopuiu = new gtknphoqwx();

    private gtknphoqwx() {
    }

    private final Object readResolve() {
        return f62507zdlpuopuiu;
    }

    @Override // lg.btonecajqb
    public Object fold(Object obj, rgvfuqvkyq operation) {
        zdlpuopuiu.btonecajqb(operation, "operation");
        return obj;
    }

    @Override // lg.btonecajqb
    public btonecajqb.zoijcleaow get(btonecajqb.ppxfxbqfkf key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // lg.btonecajqb
    public btonecajqb minusKey(btonecajqb.ppxfxbqfkf key) {
        zdlpuopuiu.btonecajqb(key, "key");
        return this;
    }

    @Override // lg.btonecajqb
    public btonecajqb plus(btonecajqb context) {
        zdlpuopuiu.btonecajqb(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}

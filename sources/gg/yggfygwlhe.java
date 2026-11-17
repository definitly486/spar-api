package gg;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class yggfygwlhe implements gtknphoqwx, Serializable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f37144jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile Object f37145yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile tg.iobyxmoadg f37146zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f37143iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f37142cqumvgiudr = AtomicReferenceFieldUpdater.newUpdater(yggfygwlhe.class, Object.class, "yggfygwlhe");

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public yggfygwlhe(tg.iobyxmoadg initializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initializer, "initializer");
        this.f37146zdlpuopuiu = initializer;
        yadqdtsiqt yadqdtsiqtVar = yadqdtsiqt.f37141iobyxmoadg;
        this.f37145yggfygwlhe = yadqdtsiqtVar;
        this.f37144jyumaefscl = yadqdtsiqtVar;
    }

    private final Object writeReplace() {
        return new btonecajqb(getValue());
    }

    @Override // gg.gtknphoqwx
    public Object getValue() {
        Object obj = this.f37145yggfygwlhe;
        yadqdtsiqt yadqdtsiqtVar = yadqdtsiqt.f37141iobyxmoadg;
        if (obj != yadqdtsiqtVar) {
            return obj;
        }
        tg.iobyxmoadg iobyxmoadgVar = this.f37146zdlpuopuiu;
        if (iobyxmoadgVar != null) {
            Object objInvoke = iobyxmoadgVar.invoke();
            if (androidx.concurrent.futures.zoijcleaow.iobyxmoadg(f37142cqumvgiudr, this, yadqdtsiqtVar, objInvoke)) {
                this.f37146zdlpuopuiu = null;
                return objInvoke;
            }
        }
        return this.f37145yggfygwlhe;
    }

    @Override // gg.gtknphoqwx
    public boolean isInitialized() {
        return this.f37145yggfygwlhe != yadqdtsiqt.f37141iobyxmoadg;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

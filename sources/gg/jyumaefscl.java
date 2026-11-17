package gg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class jyumaefscl implements gtknphoqwx, Serializable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f37114jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile Object f37115yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private tg.iobyxmoadg f37116zdlpuopuiu;

    public jyumaefscl(tg.iobyxmoadg initializer, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initializer, "initializer");
        this.f37116zdlpuopuiu = initializer;
        this.f37115yggfygwlhe = yadqdtsiqt.f37141iobyxmoadg;
        this.f37114jyumaefscl = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new btonecajqb(getValue());
    }

    @Override // gg.gtknphoqwx
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f37115yggfygwlhe;
        yadqdtsiqt yadqdtsiqtVar = yadqdtsiqt.f37141iobyxmoadg;
        if (obj != yadqdtsiqtVar) {
            return obj;
        }
        synchronized (this.f37114jyumaefscl) {
            objInvoke = this.f37115yggfygwlhe;
            if (objInvoke == yadqdtsiqtVar) {
                tg.iobyxmoadg iobyxmoadgVar = this.f37116zdlpuopuiu;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
                objInvoke = iobyxmoadgVar.invoke();
                this.f37115yggfygwlhe = objInvoke;
                this.f37116zdlpuopuiu = null;
            }
        }
        return objInvoke;
    }

    @Override // gg.gtknphoqwx
    public boolean isInitialized() {
        return this.f37115yggfygwlhe != yadqdtsiqt.f37141iobyxmoadg;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ jyumaefscl(tg.iobyxmoadg iobyxmoadgVar, Object obj, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, (i13 & 2) != 0 ? null : obj);
    }
}

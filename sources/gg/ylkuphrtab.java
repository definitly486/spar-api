package gg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ylkuphrtab implements gtknphoqwx, Serializable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object f37147yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private tg.iobyxmoadg f37148zdlpuopuiu;

    public ylkuphrtab(tg.iobyxmoadg initializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(initializer, "initializer");
        this.f37148zdlpuopuiu = initializer;
        this.f37147yggfygwlhe = yadqdtsiqt.f37141iobyxmoadg;
    }

    private final Object writeReplace() {
        return new btonecajqb(getValue());
    }

    @Override // gg.gtknphoqwx
    public Object getValue() {
        if (this.f37147yggfygwlhe == yadqdtsiqt.f37141iobyxmoadg) {
            tg.iobyxmoadg iobyxmoadgVar = this.f37148zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
            this.f37147yggfygwlhe = iobyxmoadgVar.invoke();
            this.f37148zdlpuopuiu = null;
        }
        return this.f37147yggfygwlhe;
    }

    @Override // gg.gtknphoqwx
    public boolean isInitialized() {
        return this.f37147yggfygwlhe != yadqdtsiqt.f37141iobyxmoadg;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

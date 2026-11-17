package androidx.compose.ui;

import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f6405ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f6406zoijcleaow;

    /* JADX INFO: renamed from: androidx.compose.ui.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0110iobyxmoadg extends jyumaefscl implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C0110iobyxmoadg f6407zdlpuopuiu = new C0110iobyxmoadg();

        C0110iobyxmoadg() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, wkgbmnqykc.zoijcleaow zoijcleaowVar) {
            if (str.length() == 0) {
                return zoijcleaowVar.toString();
            }
            return str + ", " + zoijcleaowVar;
        }
    }

    public iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2) {
        this.f6406zoijcleaow = wkgbmnqykcVar;
        this.f6405ppxfxbqfkf = wkgbmnqykcVar2;
    }

    public final wkgbmnqykc btonecajqb() {
        return this.f6405ppxfxbqfkf;
    }

    public final wkgbmnqykc draadjrbmk() {
        return this.f6406zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (obj instanceof iobyxmoadg) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            if (zdlpuopuiu.eablkybsjg(this.f6406zoijcleaow, iobyxmoadgVar.f6406zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f6405ppxfxbqfkf, iobyxmoadgVar.f6405ppxfxbqfkf)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6406zoijcleaow.hashCode() + (this.f6405ppxfxbqfkf.hashCode() * 31);
    }

    @Override // androidx.compose.ui.wkgbmnqykc
    public Object iobyxmoadg(Object obj, rgvfuqvkyq rgvfuqvkyqVar) {
        return this.f6405ppxfxbqfkf.iobyxmoadg(this.f6406zoijcleaow.iobyxmoadg(obj, rgvfuqvkyqVar), rgvfuqvkyqVar);
    }

    public String toString() {
        return '[' + ((String) iobyxmoadg("", C0110iobyxmoadg.f6407zdlpuopuiu)) + ']';
    }

    @Override // androidx.compose.ui.wkgbmnqykc
    public boolean zoijcleaow(draadjrbmk draadjrbmkVar) {
        return this.f6406zoijcleaow.zoijcleaow(draadjrbmkVar) && this.f6405ppxfxbqfkf.zoijcleaow(draadjrbmkVar);
    }
}

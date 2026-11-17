package skhdrjzrfn;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
final class lrnfpwlwnk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f107504iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final TextClassification f107505ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f107506zoijcleaow;

    public /* synthetic */ lrnfpwlwnk(CharSequence charSequence, long j13, TextClassification textClassification, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(charSequence, j13, textClassification);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrnfpwlwnk)) {
            return false;
        }
        lrnfpwlwnk lrnfpwlwnkVar = (lrnfpwlwnk) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f107504iobyxmoadg, lrnfpwlwnkVar.f107504iobyxmoadg) && j0.l.lqeggnwhkg(this.f107506zoijcleaow, lrnfpwlwnkVar.f107506zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f107505ppxfxbqfkf, lrnfpwlwnkVar.f107505ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f107504iobyxmoadg.hashCode() * 31) + j0.l.ojitshcjhn(this.f107506zoijcleaow)) * 31) + this.f107505ppxfxbqfkf.hashCode();
    }

    public final long iobyxmoadg() {
        return this.f107506zoijcleaow;
    }

    public final TextClassification ppxfxbqfkf() {
        return this.f107505ppxfxbqfkf;
    }

    public String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f107504iobyxmoadg) + ", selection=" + ((Object) j0.l.vdvldrhtss(this.f107506zoijcleaow)) + ", textClassification=" + this.f107505ppxfxbqfkf + ')';
    }

    public final CharSequence zoijcleaow() {
        return this.f107504iobyxmoadg;
    }

    private lrnfpwlwnk(CharSequence charSequence, long j13, TextClassification textClassification) {
        this.f107504iobyxmoadg = charSequence;
        this.f107506zoijcleaow = j13;
        this.f107505ppxfxbqfkf = textClassification;
    }
}

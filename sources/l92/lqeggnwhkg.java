package l92;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61988iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f61989zoijcleaow;

    public lqeggnwhkg(String question, String answer) {
        zdlpuopuiu.btonecajqb(question, "question");
        zdlpuopuiu.btonecajqb(answer, "answer");
        this.f61988iobyxmoadg = question;
        this.f61989zoijcleaow = answer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f61988iobyxmoadg, lqeggnwhkgVar.f61988iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61989zoijcleaow, lqeggnwhkgVar.f61989zoijcleaow);
    }

    public int hashCode() {
        return (this.f61988iobyxmoadg.hashCode() * 31) + this.f61989zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f61989zoijcleaow;
    }

    public String toString() {
        return "QuestionItemUiModel(question=" + this.f61988iobyxmoadg + ", answer=" + this.f61989zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f61988iobyxmoadg;
    }
}

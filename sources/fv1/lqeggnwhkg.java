package fv1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f35192iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f35193zoijcleaow;

    public lqeggnwhkg(String question, String answer) {
        zdlpuopuiu.btonecajqb(question, "question");
        zdlpuopuiu.btonecajqb(answer, "answer");
        this.f35192iobyxmoadg = question;
        this.f35193zoijcleaow = answer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f35192iobyxmoadg, lqeggnwhkgVar.f35192iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35193zoijcleaow, lqeggnwhkgVar.f35193zoijcleaow);
    }

    public int hashCode() {
        return (this.f35192iobyxmoadg.hashCode() * 31) + this.f35193zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f35193zoijcleaow;
    }

    public String toString() {
        return "QuestionItemUiModel(question=" + this.f35192iobyxmoadg + ", answer=" + this.f35193zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f35192iobyxmoadg;
    }
}

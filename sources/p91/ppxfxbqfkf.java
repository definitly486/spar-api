package p91;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements a21.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final boolean f76230cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f76231cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f76232esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Integer f76233istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f76234iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f76235jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f76236lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final float f76237pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final ColorsUiModel f76238yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f76239yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f76240zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final float f76241zynmafqrjb;

    public ppxfxbqfkf(String itemId, String user, String str, int i13, String comment, String answer, boolean z13, float f13, float f14, Integer num, boolean z14, ColorsUiModel colorsModel) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(user, "user");
        zdlpuopuiu.btonecajqb(comment, "comment");
        zdlpuopuiu.btonecajqb(answer, "answer");
        zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        this.f76240zdlpuopuiu = itemId;
        this.f76239yggfygwlhe = user;
        this.f76235jyumaefscl = str;
        this.f76234iwizpuwonk = i13;
        this.f76231cqumvgiudr = comment;
        this.f76232esjtqupxsv = answer;
        this.f76236lereixgezr = z13;
        this.f76237pmvmpeiblj = f13;
        this.f76241zynmafqrjb = f14;
        this.f76233istkbnxepw = num;
        this.f76230cdpycssgdh = z14;
        this.f76238yadqdtsiqt = colorsModel;
    }

    public final int btonecajqb() {
        return this.f76234iwizpuwonk;
    }

    public final String draadjrbmk() {
        return this.f76239yggfygwlhe;
    }

    public final float dxjokdxxww() {
        return this.f76237pmvmpeiblj;
    }

    public final ColorsUiModel eablkybsjg() {
        return this.f76238yadqdtsiqt;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f76240zdlpuopuiu, ppxfxbqfkfVar.f76240zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f76239yggfygwlhe, ppxfxbqfkfVar.f76239yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f76235jyumaefscl, ppxfxbqfkfVar.f76235jyumaefscl) && this.f76234iwizpuwonk == ppxfxbqfkfVar.f76234iwizpuwonk && zdlpuopuiu.eablkybsjg(this.f76231cqumvgiudr, ppxfxbqfkfVar.f76231cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f76232esjtqupxsv, ppxfxbqfkfVar.f76232esjtqupxsv) && this.f76236lereixgezr == ppxfxbqfkfVar.f76236lereixgezr && Float.compare(this.f76237pmvmpeiblj, ppxfxbqfkfVar.f76237pmvmpeiblj) == 0 && Float.compare(this.f76241zynmafqrjb, ppxfxbqfkfVar.f76241zynmafqrjb) == 0 && zdlpuopuiu.eablkybsjg(this.f76233istkbnxepw, ppxfxbqfkfVar.f76233istkbnxepw) && this.f76230cdpycssgdh == ppxfxbqfkfVar.f76230cdpycssgdh && zdlpuopuiu.eablkybsjg(this.f76238yadqdtsiqt, ppxfxbqfkfVar.f76238yadqdtsiqt);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f76240zdlpuopuiu;
    }

    public final float gtknphoqwx() {
        return this.f76241zynmafqrjb;
    }

    public int hashCode() {
        int iHashCode = ((this.f76240zdlpuopuiu.hashCode() * 31) + this.f76239yggfygwlhe.hashCode()) * 31;
        String str = this.f76235jyumaefscl;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f76234iwizpuwonk)) * 31) + this.f76231cqumvgiudr.hashCode()) * 31) + this.f76232esjtqupxsv.hashCode()) * 31) + Boolean.hashCode(this.f76236lereixgezr)) * 31) + Float.hashCode(this.f76237pmvmpeiblj)) * 31) + Float.hashCode(this.f76241zynmafqrjb)) * 31;
        Integer num = this.f76233istkbnxepw;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.f76230cdpycssgdh)) * 31) + this.f76238yadqdtsiqt.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f76232esjtqupxsv;
    }

    public final String lqeggnwhkg() {
        return this.f76231cqumvgiudr;
    }

    public final String nufgyqmvbu() {
        return this.f76235jyumaefscl;
    }

    public final boolean ojitshcjhn() {
        return this.f76230cdpycssgdh;
    }

    public String toString() {
        return "ReviewItemUiModel(itemId=" + this.f76240zdlpuopuiu + ", user=" + this.f76239yggfygwlhe + ", date=" + this.f76235jyumaefscl + ", rating=" + this.f76234iwizpuwonk + ", comment=" + this.f76231cqumvgiudr + ", answer=" + this.f76232esjtqupxsv + ", isCollapsed=" + this.f76236lereixgezr + ", fromDegrees=" + this.f76237pmvmpeiblj + ", toDegrees=" + this.f76241zynmafqrjb + ", answerTitleRes=" + this.f76233istkbnxepw + ", isNeedToAnimate=" + this.f76230cdpycssgdh + ", colorsModel=" + this.f76238yadqdtsiqt + ")";
    }

    public final boolean wflxmlrfwp() {
        return this.f76236lereixgezr;
    }

    public final Integer wkgbmnqykc() {
        return this.f76233istkbnxepw;
    }
}
